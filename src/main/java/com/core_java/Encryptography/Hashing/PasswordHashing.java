package com.core_java.Encryptography.Hashing;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.SecureRandom;
import java.util.Base64;

public class PasswordHashing {
    public static void main(String[] args) throws Exception {
        String password = "MySecurePassword123";

        // Generate random salt
        byte[] salt = new byte[16];
        new SecureRandom().nextBytes(salt);

        // Hash with PBKDF2 (100,000 iterations)
        PBEKeySpec spec = new PBEKeySpec(password.toCharArray(), salt, 100000, 256);
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        byte[] hash = factory.generateSecret(spec).getEncoded();

        System.out.println("Salt (Base64): " + Base64.getEncoder().encodeToString(salt));
        System.out.println("Password Hash (Base64): " + Base64.getEncoder().encodeToString(hash));
    }
}

