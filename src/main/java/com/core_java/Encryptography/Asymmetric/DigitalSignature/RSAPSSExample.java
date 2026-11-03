package com.core_java.Encryptography.Asymmetric.DigitalSignature;

import java.security.*;
import java.security.spec.*;
import java.util.Base64;

public class RSAPSSExample {
    public static void main(String[] args) throws Exception {
        String message = "Hello RSA-PSS Digital Signature!";

        // 1. Generate RSA key pair (2048 bits)
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
        keyPairGen.initialize(2048); // 256 byte
        KeyPair keyPair = keyPairGen.generateKeyPair();

        // 2. Create Signature object with RSA-PSS
        Signature signature = Signature.getInstance("RSASSA-PSS");

        // Configure PSS parameters (SHA-256, salt length 32 bytes, etc.)
        PSSParameterSpec pssSpec = new PSSParameterSpec(
                "SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1
        );
        signature.setParameter(pssSpec);

        // 3. Sign with private key
        signature.initSign(keyPair.getPrivate(), new SecureRandom());
        signature.update(message.getBytes());
        byte[] sigBytes = signature.sign();
        String sigBase64 = Base64.getEncoder().encodeToString(sigBytes);

        System.out.println("RSA-PSS Signature (Base64): " + sigBase64);

        // 4. Verify with public key
        signature.initVerify(keyPair.getPublic());
        signature.setParameter(pssSpec);
        signature.update(message.getBytes());
        boolean verified = signature.verify(Base64.getDecoder().decode(sigBase64));

        System.out.println("Signature Verified? " + verified);
    }
}


