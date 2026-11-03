package com.core_java.design_pattern.creational.prototype.ShallowCopy;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Address address = new Address("mumbai","india");
        Person person1 = new Person("vikas",29 ,address);

        Person person2 = (Person) person1.clone();
        person2.setName("patil");
        person2.getAddress().setCity("Thane");

        System.out.println("Person1 :: "+person1);
        System.out.println("Person2 :: "+person2);





    }
}
