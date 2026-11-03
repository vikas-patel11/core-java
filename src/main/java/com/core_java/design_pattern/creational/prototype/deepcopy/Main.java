package com.core_java.design_pattern.creational.prototype.deepcopy;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Delhi", "India");
        Person original = new Person("Alice", 25, address);

        Person cloned = (Person) original.clone();

        // Change in cloned object
        cloned.name = "Bob";
        cloned.address.city = "Mumbai";  // Modifying inner object

        // Display both objects
        original.display();  // ❗ Should still show Delhi
        cloned.display();    // ✅ Shows Mumbai
    }
}

