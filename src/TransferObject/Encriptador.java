package TransferObject;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;
import java.util.Base64;

public class Encriptador {

    public String encriptarClave(String clave) {
        try {
            // Generar una sal aleatoria
            SecureRandom random = new SecureRandom();
            byte[] salt = new byte[16];
            random.nextBytes(salt);

            // Derivar la clave utilizando PBKDF2
            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            PBEKeySpec spec = new PBEKeySpec(clave.toCharArray(), salt, 65536, 256);
            SecretKeySpec secretKey = new SecretKeySpec(factory.generateSecret(spec).getEncoded(), "AES");

            // Generar el vector de inicialización
            byte[] iv = new byte[16];
            random.nextBytes(iv);
            IvParameterSpec ivParamSpec = new IvParameterSpec(iv);

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivParamSpec);

            byte[] claveEncriptadaBytes = cipher.doFinal(clave.getBytes());
            byte[] claveEncriptadaIV = new byte[iv.length + claveEncriptadaBytes.length];
            System.arraycopy(iv, 0, claveEncriptadaIV, 0, iv.length);
            System.arraycopy(claveEncriptadaBytes, 0, claveEncriptadaIV, iv.length, claveEncriptadaBytes.length);

            return Base64.getEncoder().encodeToString(claveEncriptadaIV);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String desencriptarClave(String claveEncriptada) {
        try {
            byte[] claveEncriptadaIV = Base64.getDecoder().decode(claveEncriptada);
            byte[] iv = new byte[16];
            byte[] claveEncriptadaBytes = new byte[claveEncriptadaIV.length - 16];
            System.arraycopy(claveEncriptadaIV, 0, iv, 0, 16);
            System.arraycopy(claveEncriptadaIV, 16, claveEncriptadaBytes, 0, claveEncriptadaIV.length - 16);

            // Derivar la clave utilizando PBKDF2
            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            PBEKeySpec spec = new PBEKeySpec("MiClaveSecreta".toCharArray(), iv, 65536, 256);  // Utiliza la clave original en lugar de claveEncriptada
            SecretKeySpec secretKey = new SecretKeySpec(factory.generateSecret(spec).getEncoded(), "AES");

            IvParameterSpec ivParamSpec = new IvParameterSpec(iv);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKey, ivParamSpec);

            byte[] claveDesencriptadaBytes = cipher.doFinal(claveEncriptadaBytes);

            return new String(claveDesencriptadaBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    
}
