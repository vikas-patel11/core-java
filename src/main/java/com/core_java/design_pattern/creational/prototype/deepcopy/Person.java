package com.core_java.design_pattern.creational.prototype.deepcopy;

class Person implements Cloneable {
    String name;
    int age;
    Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Deep clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        person.address = (Address) address.clone();  // Deep clone the nested object
        return person;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age +
                ", City: " + address.city + ", Country: " + address.country);
    }
}

