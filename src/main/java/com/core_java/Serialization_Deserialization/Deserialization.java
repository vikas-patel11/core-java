package com.core_java.Serialization_Deserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("student.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s = (Student) ois.readObject();

        ois.close();
        fis.close();

        System.out.println(s.id);
        System.out.println(s.name);
    }
}
