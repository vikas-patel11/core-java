package com.core_java.Encryptography.Symmetric;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Base64;



public class AesGcmIndigoEncryption {

//    private static final int KEY_SIZE = 256; // AES-256
    private static final int IV_SIZE = 12; // 96 bits recommended for GCM
    private static final int TAG_SIZE = 128; // 128-bit auth tag

    public static String encrypt(String jsonPayload) throws Exception {

        byte[] decodedKey = Base64.getDecoder().decode("XIm0deRrUkPYmCxkkwrY03EwaLyPsythafeRSB1xLF8=");
        SecretKey key = new SecretKeySpec(decodedKey, 0, decodedKey.length, "AES");

        byte[] iv = new byte[IV_SIZE];
        SecureRandom random = new SecureRandom();
        random.nextBytes(iv);
        GCMParameterSpec gcmSpec = new GCMParameterSpec(TAG_SIZE, iv);

        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(Cipher.ENCRYPT_MODE, key, gcmSpec);
        byte[] encrypted = cipher.doFinal(jsonPayload.getBytes(StandardCharsets.UTF_8));

        // Prepend IV to encrypted payload for use in decryption
        byte[] encryptedWithIv = new byte[iv.length + encrypted.length];
        System.arraycopy(iv, 0, encryptedWithIv, 0, iv.length);
        System.arraycopy(encrypted, 0, encryptedWithIv, iv.length, encrypted.length);
        return Base64.getEncoder().encodeToString(encryptedWithIv);
    }

    public static String decrypt(String base64CipherText) throws Exception {

        byte[] decodedKey = Base64.getDecoder().decode("XIm0deRrUkPYmCxkkwrY03EwaLyPsythafeRSB1xLF8=");
        SecretKey key = new SecretKeySpec(decodedKey, 0, decodedKey.length, "AES");

        byte[] encryptedWithIv = Base64.getDecoder().decode(base64CipherText);

        if (encryptedWithIv.length < IV_SIZE) {
            throw new IllegalArgumentException("Input data too short. Length: " + encryptedWithIv.length);
        }
        // Extract IV from encrypted payload
        byte[] iv = new byte[IV_SIZE];
        byte[] encrypted = new byte[encryptedWithIv.length - IV_SIZE];
        System.arraycopy(encryptedWithIv, 0, iv, 0, IV_SIZE);
        System.arraycopy(encryptedWithIv, IV_SIZE, encrypted, 0, encrypted.length);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        GCMParameterSpec gcmSpec = new GCMParameterSpec(TAG_SIZE, iv);
        cipher.init(Cipher.DECRYPT_MODE, key, gcmSpec);
        byte[] decrypted = cipher.doFinal(encrypted);
        return new String(decrypted, StandardCharsets.UTF_8);
    }

    public static void main(String[] args) throws Exception {

        String enc = AesGcmIndigoEncryption.encrypt("vikas");
        System.out.println("enc : " + enc);
        System.out.println("dec :" + AesGcmIndigoEncryption.decrypt(enc));
    }
}
