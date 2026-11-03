package com.core_java.Encryptography.Base64;

import java.util.Base64;

public class DemoBase64 {

    public static void main(String[] args) {


        String msg= "hello! vikas dakncbhusuavcghsvcjb sacjbvascfxsa";

        String enc = Base64.getEncoder().encodeToString(msg.getBytes());
        System.out.println("enc : "+enc);

        byte[] decode = Base64.getDecoder().decode(enc.getBytes());
        String dec = new String(decode);
        System.out.println("dec : "+dec);

//        enc : aGVsbG8hIHZpa2FzIGRha25jYmh1c3VhdmNnaHN2Y2piIHNhY2pidmFzY2Z4c2E=
//                dec : hello! vikas dakncbhusuavcghsvcjb sacjbvascfxsa
    }
}
