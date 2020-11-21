package com.company;

public class Car {
    private String Model;
    public boolean engineRunning;
    public boolean going;
    public float speed;
    public float increaseSpeed;

    public float getSpeed() {
        return this.speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void startEngine() {
        if (engineRunning) {
            System.out.println("Engine has been started");
        } else {
            System.out.println("Engine is already run");
        }
    }

    public void stopEngine() {
        if (engineRunning) {
            System.out.println("Engine has been stopped");
        } else {
            System.out.println("Engine is already stopped");
        }
    }

    public void accelerating() {
        System.out.println("Accelerating");
        for (int i = 0; i < 5; i++) {
            increaseSpeed += 5;
            System.out.println(increaseSpeed + speed);
        }
        speed = getSpeed();
    }

    public void breaking() {
        System.out.println("Breaking");
        for (int i = 0; i < 5; i++) {
            increaseSpeed -= 5;
            System.out.println(increaseSpeed + speed);
        }
        speed = getSpeed();
    }

    public void stopCar() {
        if (going) {
            going = false;
            speed = 0.0f;
            System.out.println("Car is stopped");
        } else {
            System.out.println("Car is already stopped");
        }
    }
}
