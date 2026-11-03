package com.core_java.Encryptography.Symmetric;

import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import java.security.NoSuchAlgorithmException;

public class DemoGCM {

    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException {

        // Plain text
        String plainText = "This is a secret message!";

        // AES-GCM parameters
        byte[] iv = new byte[12]; // 96-bit IV recommended
        java.security.SecureRandom random = new java.security.SecureRandom();
        random.nextBytes(iv);

        GCMParameterSpec gcmSpec = new GCMParameterSpec(128, iv); // 128-bit authentication tag



        // Encrypt
//        Cipher encryptCipher = Cipher.getInstance("AES/GCM/NoPadding");
//        encryptCipher.init(Cipher.ENCRYPT_MODE, secretKey, gcmSpec);
    }
}
