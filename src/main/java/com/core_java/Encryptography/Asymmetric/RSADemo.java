package com.core_java.Encryptography.Asymmetric;

import javax.crypto.*;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.util.Base64;
import java.util.Map;

public class RSADemo {

    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, SignatureException {

        KeyPairGenerator rsa = KeyPairGenerator.getInstance("RSA");
        rsa.initialize(2048);
        KeyPair keyPair = rsa.generateKeyPair();
        PrivateKey privateKey = keyPair.getPrivate();
        PublicKey publicKey = keyPair.getPublic();

        System.out.println("Public Key: " + Base64.getEncoder().encodeToString(publicKey.getEncoded()));
        System.out.println("Private Key: " + Base64.getEncoder().encodeToString(privateKey.getEncoded()));

        String message = "Hello RSA!";
        String encrypt = encrypt(publicKey,message);
        decrypt(privateKey,encrypt);

        digitalSig(privateKey,publicKey,message);






    }

    public static String encrypt(PublicKey publicKey,String message) throws NoSuchPaddingException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);


        byte[] encrypted = cipher.doFinal(message.getBytes(StandardCharsets.UTF_8));

        String encryptedBase64 = Base64.getEncoder().encodeToString(encrypted);
        System.out.println("Encrypted: " + encryptedBase64);

        return encryptedBase64;

    }

    public static void decrypt(PrivateKey privateKey,String encryptedBase64) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);

        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedBase64));
        String decryptedMessage = new String(decryptedBytes, StandardCharsets.UTF_8);

        System.out.println("Decrypted: " + decryptedMessage);
    }

    public static void digitalSig(PrivateKey privateKey,PublicKey publicKey, String message) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        Signature signature = Signature.getInstance("SHA256withRSA");
//        Mac mac  = Mac.getInstance("SHA256withRSA"); //use for symmetric
        signature.initSign(privateKey);
        signature.update(message.getBytes());
        byte[] signBytes = signature.sign();

        // Verification
        Signature verify = Signature.getInstance("SHA256withRSA");
        verify.initVerify(publicKey);
        verify.update(message.getBytes());
        boolean valid = verify.verify(signBytes);

        System.out.println("Signature valid? " + valid);
    }



}
