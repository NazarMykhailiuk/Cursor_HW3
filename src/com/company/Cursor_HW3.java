package com.company;

public class Cursor_HW3 {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        Circle circle = new Circle(7);
        circle.setRadius(16.5);
        System.out.println(circle);

        // Task 2
        System.out.println("\nTask 2");
        Count count1 = new Count();
        Count count2 = new Count();
        Count count3 = new Count();

        System.out.println("Created " + Count.count + " objects\n");

        // Task 3
        Car car1 = new Car();
        car1.startEngine();
        car1.accelerating ( 25.5f);
        car1.showCarStatus();
        car1.breaking( 15.5f);
        car1.showCarStatus();
        car1.accelerating ( 10.0f);
        car1.showCarStatus();
        car1.breaking( 5.5f);
        car1.showCarStatus();
        car1.stopCar();
        car1.showCarStatus();
        car1.stopEngine();
    }
}

