package com.core_java.Encryptography.Symmetric.DigitalSign;


import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class HMACExample {
    public static void main(String[] args) throws Exception {
        String message = "Hello Vikas, this is HMAC Demo!";
        String secretKey = "SuperSecretKey123"; // shared key (should be random & strong in real use)

        // 1. Create SecretKeySpec from the key
        SecretKeySpec keySpec = new SecretKeySpec(secretKey.getBytes(), "HmacSHA256");

        // 2. Get Mac instance for HmacSHA256
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(keySpec);

        // 3. Compute the MAC (HMAC)
        byte[] macBytes = mac.doFinal(message.getBytes());

        // 4. Convert to Base64 or Hex for transmission/storage
        String macBase64 = Base64.getEncoder().encodeToString(macBytes);

        // Print results
        System.out.println("Message: " + message);
        System.out.println("HMAC (Base64): " + macBase64);

        // --- Verification (recompute & compare) ---
        Mac macVerify = Mac.getInstance("HmacSHA256");
        macVerify.init(keySpec);
        byte[] recomputed = macVerify.doFinal(message.getBytes());

        boolean isValid = Base64.getEncoder().encodeToString(recomputed).equals(macBase64);
        System.out.println("MAC Verified? " + isValid);
    }
}

