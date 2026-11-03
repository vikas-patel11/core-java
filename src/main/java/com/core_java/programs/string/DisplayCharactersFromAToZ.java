package com.core_java.programs.string;

public class DisplayCharactersFromAToZ {
    public static void main(String[] args) {
        char a='A';
        System.out.println((int)a);
        for(int i=65;i<65+26;i++){
            System.out.println((char) i);
        }
    }
}
