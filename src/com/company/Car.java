package com.company;

public class Car {
    private String Model;
    private boolean engineRunning;
    private float speed;
    private int gear;

    public Car(String modelGiven, boolean engineRunningGiven, int gearGiven, float speedGiven) {
        Model = modelGiven;
        engineRunning = engineRunningGiven;
        gear = gearGiven;
        speed = speedGiven;
        System.out.print(modelGiven);

        if (engineRunning) {
            engineRunning = true;
            System.out.print(" engine running");
            if (speed > 200) {
                speed = 200;
            }
            if (gear > 4) {
                gear = 4;
            }
            if (speed < 40) {
                gear = 1;
            } else if (speed < 90) {
                gear = 2;
            } else if (speed < 150) {
                gear = 3;
            } else {
                gear = 4;
            }
            if (speed > 0 & gear > 0) {
                System.out.println(". You drive with speed " + speed + " km/h. in " + gear + " gear.");
            } else {
                System.out.println(". You not drive.");
            }
        } else {
            System.out.println(" engine not running. You not drive.");
        }

    }

    public static void main(String[] args) {
        Car car1 = new Car("Mazda", true, 1, 20.5f);
    }

}