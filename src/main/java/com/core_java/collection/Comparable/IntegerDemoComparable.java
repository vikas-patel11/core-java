package com.core_java.collection.Comparable;

public class IntegerDemoComparable implements Comparable<Student>{

    @Override
    public int compareTo(Student o) {

        return o.getAge();
    }


    public static void main(String[] args) {

    }
}
