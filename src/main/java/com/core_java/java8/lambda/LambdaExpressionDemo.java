package com.core_java.java8.lambda;


public class LambdaExpressionDemo {
    public static void main(String[] args) {

//        FuctionalInterfaceDemo f = new FuctionalInterfaceDemo() {
//            @Override
//            public void show() {
//                System.out.println(" Anonymous class !!");
//
//            }
//        };
//        f.show();


//        FuctionalInterfaceDemo runnable = () -> System.out.println("lambda expression !!");
//        runnable.show();

//        FuctionalInterfaceDemo interfaceDemo = (a, b) -> a + b;
//        System.out.println(interfaceDemo.add(5, 8));

        FuctionalInterfaceDemo interfaceDemo = string-> string.length();

        System.out.println(interfaceDemo.showData("vikas"));


        // create thread

        Runnable thread = ()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("thread "+i);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread th =new Thread(thread);
        th.setName("vikas");
        th.start();


    }
}


