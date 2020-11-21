package com.company;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    private double calculateArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "The area of the circle [radius = " + radius + "]: " + calculateArea();
    }
}