package com.core_java.java8.functional_Interface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

        // for Consumer functionalInterface
        Consumer<Integer> consumer = (Integer age)->{
            if(age<19) {
                System.out.println("Minor!!");
            } else if (age>19 && age<60) {
                System.out.println("Young!!");
            }else {
                System.out.println("Sr. Citizen!!");
            }
        };
//        consumer.accept(5);
//        consumer.accept(25);

        // Create another Consumer to add more behavior after the first one
        Consumer<Integer> additionalAction = (age) -> {
            System.out.println("Age provided: " + age);
        };

        // Using andThen to chain two consumers
        consumer.andThen(additionalAction).accept(5);




        Consumer<Integer> num1 = (num)->{
            //loop
            for (int i = 0; i < 5; i++) {
                System.out.println("num : "+i);
            }
        };

        //
        consumer.andThen(num1).andThen(additionalAction).accept(55);



        consumer.accept(10);
        num1.accept(10);
        additionalAction.accept(10);


        BiConsumer<Integer,Integer> add = (num11,num12)->{
            //loop
            System.out.println(num11+num12);
        };

        BiConsumer<Integer,Integer> multi = (num11,num12)->{
            //loop
            System.out.println(num11*num12);
        };
        add.andThen(multi).accept(25,100);
    }

}
