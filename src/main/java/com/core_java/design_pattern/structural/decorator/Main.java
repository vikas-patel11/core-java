package com.core_java.design_pattern.structural.decorator;

public class Main {
    public static void main(String[] args) {


        // 🔹 Decorator Pattern

        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getDescription());
        System.out.println(simpleCoffee.getPrice());


        System.out.println("\n=== Decorator Pattern ===");
        Coffee coffee = new MilkDecorator(new SimpleCoffee());

//        Coffee coffee = new MilkDecorator(
//                new MilkDecorator(
//                        new SimpleCoffee())); // add 2 time milk
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getPrice());






//        // 🔹 Adapter Pattern
//        System.out.println("=== Adapter Pattern ===");
//        MediaPlayer player = new Adapter();
//        player.play("video.vlc");
//
//
//        // 🔹 Facade Pattern
//        System.out.println("\n=== Facade Pattern ===");
//        ComputerFacade computer = new ComputerFacade();
//        computer.startComputer();
//
//        // 🔹 Proxy Pattern
//        System.out.println("\n=== Proxy Pattern ===");
//        Image image = new ProxyImage();
//        image.display();
//
//        // 🔹 Composite Pattern
//        System.out.println("\n=== Composite Pattern ===");
//        Composite composite = new Composite();
//        composite.add(new Leaf());
//        composite.add(new Leaf());
//        composite.show();
//
//        // 🔹 Bridge Pattern
//        System.out.println("\n=== Bridge Pattern ===");
//        Shape shape = new Circle(new Red());
//        shape.draw();
//
//        // 🔹 Flyweight Pattern
//        System.out.println("\n=== Flyweight Pattern ===");
//        Circle c1 = ShapeFactory.getCircle("Red");
//        Circle c2 = ShapeFactory.getCircle("Red");
//        c1.draw();
//        c2.draw(); // reused object
    }
}
