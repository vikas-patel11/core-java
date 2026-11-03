package com.core_java.oops.NewInheritance;


class Student{

    public void Study(){
        System.out.println("Study!");
    }

    public void play(){
        System.out.println("Playing!");
    }

}



public class Vikas extends Student{

    public void Dance(){
        System.out.println("Dancing!");
    }

   public void play(){
        System.out.println("Vikas Playing!");
    }

    public static void main(String[] args) {

//        Student student = new Vikas();
        Vikas vikas = new Vikas();
        vikas.Dance();
        vikas.play();

        Student s = new Student();
        s.play();
        s.Study();


        Student student = new Vikas();
        student.play();




    }
}
