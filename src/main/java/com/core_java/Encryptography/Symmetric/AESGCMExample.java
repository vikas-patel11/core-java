package com.core_java.Encryptography.Symmetric;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import java.util.Base64;

public class AESGCMExample {
    public static void main(String[] args) throws Exception {
        // Generate AES key (256-bit)
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256); // Can be 128 or 256
        SecretKey secretKey = keyGen.generateKey();

        // Plain text
        String plainText = "This is a secret message!";

        // AES-GCM parameters
        byte[] iv = new byte[12]; // 96-bit IV recommended
        java.security.SecureRandom random = new java.security.SecureRandom();
        random.nextBytes(iv);

        GCMParameterSpec gcmSpec = new GCMParameterSpec(128, iv); // 128-bit authentication tag

        // Encrypt
        Cipher encryptCipher = Cipher.getInstance("AES/GCM/NoPadding");
        encryptCipher.init(Cipher.ENCRYPT_MODE, secretKey, gcmSpec);
        byte[] encrypted = encryptCipher.doFinal(plainText.getBytes());
        System.out.println("Encrypted: " + Base64.getEncoder().encodeToString(encrypted));

        // Decrypt
        Cipher decryptCipher = Cipher.getInstance("AES/GCM/NoPadding");
        decryptCipher.init(Cipher.DECRYPT_MODE, secretKey, gcmSpec);
        byte[] decrypted = decryptCipher.doFinal(encrypted);
        System.out.println("Decrypted: " + new String(decrypted));
    }
}

