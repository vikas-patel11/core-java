package com.core_java.Encryptography.Symmetric;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.security.SecureRandom;
import java.util.Base64;

public class AESCBCExample {

    public static void main(String[] args) throws Exception {
        // 1. Generate AES key (128-bit)
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256); // can also use 192 or 256 (if JCE policy allows)
        SecretKey secretKey = keyGen.generateKey();

        // 2. Generate random IV (16 bytes for AES)
        byte[] iv = new byte[16];
        SecureRandom random = new SecureRandom();
        random.nextBytes(iv);
        IvParameterSpec ivSpec = new IvParameterSpec(iv);

        // 3. Create Cipher (AES/CBC/PKCS5Padding)
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

        // 4. Encrypt
        String plainText = "Hello Vikas, AES-CBC Encryption Demo!";
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivSpec);
        byte[] cipherText = cipher.doFinal(plainText.getBytes());

        // 5. Decrypt
        cipher.init(Cipher.DECRYPT_MODE, secretKey, ivSpec);
        byte[] decryptedText = cipher.doFinal(cipherText);

        // 6. Print results
        System.out.println("Original Text: " + plainText);
        System.out.println("Encrypted (Base64): " + Base64.getEncoder().encodeToString(cipherText));
        System.out.println("Decrypted Text: " + new String(decryptedText));
    }
}

