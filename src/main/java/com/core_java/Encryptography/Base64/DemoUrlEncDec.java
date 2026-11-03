package com.core_java.Encryptography.Base64;

import java.util.Base64;

public class DemoUrlEncDec {

    public static void main(String[] args) {

        String msg= "hello! vikas dakncbhusuavcghsvcjb sacjbvascfxsa";

        String enc = Base64.getUrlEncoder().encodeToString(msg.getBytes());
        System.out.println("enc : "+enc);

        byte[] decode = Base64.getUrlDecoder().decode(enc.getBytes());
        String dec = new String(decode);
        System.out.println("dec : "+dec);

    }
}
