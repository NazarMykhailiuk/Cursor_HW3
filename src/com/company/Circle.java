package com.company;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    private double calculateArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "The area of the circle [radius = " + radius + "]: " + calculateArea();
    }


    public static void main(String[] args) {
        Circle circle = new Circle(7);
        System.out.print(circle);
    }
}