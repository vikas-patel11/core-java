package com.core_java;

import java.lang.ref.WeakReference;


class Vikas{
    public void demo(){
        System.out.println("dede");
    }
}

public class GarbageDemo {
    public static void main(String[] args) {
        // Create an object
        String str = new String("Hello, Weak Reference!");

        // Create a weak reference to the object
        WeakReference<String> weakRef = new WeakReference<>(str);


        // Create a weak reference to the object
        WeakReference<GarbageDemo> weakRef1 = new WeakReference<>(new GarbageDemo());
        GarbageDemo garbageDemo = weakRef1.get();


        // Access the object through the weak reference
        System.out.println("Before GC: " + weakRef.get()); // Output: Hello, Weak Reference!

        // Remove the strong reference
        str = null;

        // Suggest garbage collection
        System.gc();

        // Access the object after garbage collection
        System.out.println("After GC: " + weakRef.get()); // Output: null (object may be garbage collected)
    }
}
