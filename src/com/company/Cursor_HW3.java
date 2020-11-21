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
        System.out.println("Task 3");
        Car car1 = new Car();
        car1.engineRunning = true;
        car1.going = true;
        car1.speed = 0.0f;
        car1.startEngine();
        car1.accelerating();
        car1.breaking();
        car1.stopCar();
    }
}

