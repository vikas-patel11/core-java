package com.core_java.Encryptography.Asymmetric.DigitalSignature;

import java.security.*;
import java.util.Base64;

public class ECDSAExample {
    public static void main(String[] args) throws Exception {
        String message = "Hello ECDSA Digital Signature!";

        // 1. Generate EC key pair using NIST P-256 curve
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("EC");
        keyPairGen.initialize(256);
        KeyPair keyPair = keyPairGen.generateKeyPair();

        // 2. Create Signature with SHA256withECDSA
        Signature signature = Signature.getInstance("SHA256withECDSA");

        // 3. Sign with private key
        signature.initSign(keyPair.getPrivate(), new SecureRandom());
        signature.update(message.getBytes());
        byte[] sigBytes = signature.sign();
        String enc = Base64.getEncoder().encodeToString(sigBytes);

        System.out.println("ECDSA Signature (Base64): " +enc);

        // 4. Verify with public key
        signature.initVerify(keyPair.getPublic());
        signature.update(message.getBytes());
        boolean verified = signature.verify(Base64.getDecoder().decode(enc.getBytes()));

        System.out.println("Signature Verified? " + verified);
    }
}

