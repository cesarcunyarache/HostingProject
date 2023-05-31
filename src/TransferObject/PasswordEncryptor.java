package TransferObject;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;
import java.util.Base64;
import javax.crypto.KeyGenerator;

public class PasswordEncryptor {
    private static final int KEY_SIZE = 128;
    private static final int IV_SIZE = 16;

    public static void main(String[] args) {
        String password = "MiContraseñaSecreta";
        System.out.println("Contraseña original: " + password);

        String encryptedPassword = encryptPassword(password);
        System.out.println("Contraseña encriptada: " + encryptedPassword);

        String decryptedPassword = decryptPassword(encryptedPassword);
        System.out.println("Contraseña desencriptada: " + decryptedPassword);
    }

    public static String encryptPassword(String password) {
        try {
            // Generar una clave aleatoria
            byte[] keyBytes = generateRandomBytes(KEY_SIZE / 8);
            SecretKeySpec secretKey = new SecretKeySpec(keyBytes, "AES");

            // Generar un vector de inicialización aleatorio
            byte[] iv = generateRandomBytes(IV_SIZE);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivParameterSpec);

            byte[] encryptedBytes = cipher.doFinal(password.getBytes());

            // Concatenar el IV y los datos encriptados
            byte[] encryptedData = new byte[iv.length + encryptedBytes.length];
            System.arraycopy(iv, 0, encryptedData, 0, iv.length);
            System.arraycopy(encryptedBytes, 0, encryptedData, iv.length, encryptedBytes.length);

            return Base64.getEncoder().encodeToString(encryptedData);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String decryptPassword(String encryptedPassword) {
        try {
            // Decodificar la contraseña encriptada
            byte[] encryptedData = Base64.getDecoder().decode(encryptedPassword);

            // Extraer el IV y los datos encriptados
            byte[] iv = new byte[IV_SIZE];
            byte[] encryptedBytes = new byte[encryptedData.length - IV_SIZE];
            System.arraycopy(encryptedData, 0, iv, 0, IV_SIZE);
            System.arraycopy(encryptedData, IV_SIZE, encryptedBytes, 0, encryptedData.length - IV_SIZE);

            // Generar una clave a partir de la clave aleatoria
            SecretKeySpec secretKey = new SecretKeySpec(generateKey().getEncoded(), "AES");

            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKey, ivParameterSpec);

            byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
            return new String(decryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static byte[] generateRandomBytes(int length) {
        byte[] bytes = new byte[length];
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextBytes(bytes);
        return bytes;
    }

    private static SecretKeySpec generateKey() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(KEY_SIZE);
            return new SecretKeySpec(keyGenerator.generateKey().getEncoded(), "AES");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
