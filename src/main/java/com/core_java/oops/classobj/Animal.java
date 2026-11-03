package com.core_java.oops.classobj;

public abstract class Animal {

     protected  Animal() {
        System.out.println("jhellcjdbjc");
    }

    private String name;
    private int age;



    public static void main(String[] args) {

        Animal animal = new Animal() {
            @Override
            public void run() {

            }
        };

        animal.name="kito";
        animal.age=5;

        System.out.println("name: "+ animal.name);
        System.out.println("age: "+ animal.age);

        animal.show1();
//        animal.show("bitto",10);

    }

    private void show(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("name: "+this.name);
        System.out.println("age: "+this.age);
    }

    public void show1(){
        show("bitto",10);
    }

    public abstract void run();
}
