package com.core_java.exception;

class Demo {
    public int division() {
        int num1 = 10, num2 = 0;

        // Check for division by zero explicitly and throw an exception
        /*if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }*/

        int num3 = num1 / num2;
        System.out.println("ans: " + num3);
        return num3;
        /*try {
            int num3 = num1 / num2;
            System.out.println("ans: " + num3);
            return num3;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("no");

        }*/
    }
}

    public class ThrowDemo {
        public static void main(String[] args) {
            Demo demo = new Demo();
            demo.division();

        }
    }

