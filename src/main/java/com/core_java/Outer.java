package com.core_java;

public class Outer {
    private class Inner {
        public void show() {
            System.out.println("Hello from the inner class!");
        }
    }

    public void createInner() {
        Inner inner = new Inner();
        inner.show();
    }
}

class Main1 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.createInner(); // Calls the inner class method



//        String name  = "12345678gcfgyeqfgycqwtfsdctfwqcdtfwdtfucdqwdc";
//        String substring = name.substring(0, 8);

    }
}

