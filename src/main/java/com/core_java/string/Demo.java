package com.core_java.string;

public class Demo {
    public static void main(String[] args) {
        String n1 ="vikas";
        String n2 ="vikas";
        String n3 = new String("vikas");
        System.out.println(n3==n2);
        System.out.println(n1==n2);
        System.out.println(n3.equals(n2));

        StringBuilder sb =new StringBuilder();
        for (char c : n1.toCharArray()) {
            sb.append(c );
        }
        System.out.println(sb);


        String a= "vikas";
        System.out.println(a);
        System.out.println(a+"ccb");

        StringBuffer buffer =new StringBuffer("vikas");
        System.out.println(buffer);


        StringBuffer patel = buffer.append("patel");
        System.out.println(patel);

    }
}
