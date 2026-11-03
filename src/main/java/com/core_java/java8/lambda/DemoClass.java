package com.core_java.java8.lambda;

public class DemoClass {


    public static void main(String[] args) {

        DemoInterface abc = (str,num) -> str.length()+num;
        int show = abc.show("vikas",10);
        System.out.println(show);






    }
}
