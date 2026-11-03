package com.core_java.Encryptography.Symmetric;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class AesExample {
    // Encrypt a string
    public static String encrypt(String plainText, String secretKey) throws Exception {
        // Create AES key from given string
        byte[] keyBytes = secretKey.getBytes("UTF-8");
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");

        // Create cipher
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, keySpec);

        // Encrypt
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes("UTF-8"));

        // Escape / encode to Base64 so it's safe as text
        byte[] encode = Base64.getEncoder().encode(encryptedBytes);
        String s = new String(encode);
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    // Decrypt a Base64 encoded string
    public static String decrypt(String encryptedText, String secretKey) throws Exception {
        // Create AES key
        byte[] keyBytes = secretKey.getBytes("UTF-8");
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");

        // Create cipher
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, keySpec);

        // Decode Base64 and decrypt
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedText);
        byte[] decryptedBytes = cipher.doFinal(decodedBytes);

        return new String(decryptedBytes, "UTF-8");
    }

    public static void main(String[] args) {
        try {
            String secretKey = "nkcbvejvckgecghvewcgvecf"; // Must be 16, 24, or 32 bytes
            String textToEncrypt = "Hello, AES encryption!";

            String encrypted = encrypt(textToEncrypt, secretKey);
            System.out.println("Encrypted (Base64 escaped): " + encrypted);

            String decrypted = decrypt(encrypted, secretKey);
            System.out.println("Decrypted: " + decrypted);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

