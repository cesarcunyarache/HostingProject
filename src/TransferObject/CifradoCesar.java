
package TransferObject;

public class CifradoCesar {
    
    public String encrypt(String plaintext, int shift) {
        StringBuilder ciphertext = new StringBuilder();
        
        for (int i = 0; i < plaintext.length(); i++) {
            char ch = plaintext.charAt(i);
            
            if (Character.isLetter(ch)) {
                char encryptedChar = (char) (((ch - 'A' + shift) % 26) + 'A');
                ciphertext.append(encryptedChar);
            } else {
                ciphertext.append(ch);
            }
        }
        
        return ciphertext.toString();
    }
    
    public String decrypt(String ciphertext, int shift) {
        StringBuilder plaintext = new StringBuilder();
        
        for (int i = 0; i < ciphertext.length(); i++) {
            char ch = ciphertext.charAt(i);
            
            if (Character.isLetter(ch)) {
                char decryptedChar = (char) (((ch - 'A' - shift + 26) % 26) + 'A');
                plaintext.append(decryptedChar);
            } else {
                plaintext.append(ch);
            }
        }
        
        return plaintext.toString();
    }
    
    
}
