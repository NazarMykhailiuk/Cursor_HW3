package com.company;

public class Car {
    private boolean engineRunning;
    private float speed;

    public void startEngine() {
        if (!engineRunning) {
            engineRunning = true;
            System.out.println("Engine has been started");
        } else
            System.out.println("The engine is already running");
    }

    public void stopEngine() {
        if (engineRunning) {
            engineRunning = false;
            speed = 0.0f;
            System.out.println("The engine has been turned off");
        }
    }
    public void accelerating (float increaseSpeed) {
        if (!engineRunning)
            System.out.println("Can't increase speed. The engine is turned off");
        if (speed <= 0)
            System.out.println("Can't increase speed by zero or negative value. Please provide a valid value");
        this.speed += increaseSpeed;
    }

    public void breaking (float decreaseSpeed) {
        if (!engineRunning)
            System.out.println("Can't decrease speed. The engine is turned off");
        if (decreaseSpeed <= 0)
            System.out.println("Can't decrease speed by zero or negative value. Please provide a valid value");
        if (speed != 0.0f)
            this.speed -= decreaseSpeed;
        if (speed < 0) {
            speed = 0.0f;
        }
    }

    public void stopCar() {
        if (engineRunning) {
            if (speed != 0.0f) {
                speed = 0.0f;
            } else {
                System.out.println("Can't stop. The car is stopped now");
            }
        } else {
            System.out.println("Can't stop. The engine is turned off");
        }
    }
    public void showCarStatus() {
        if (engineRunning) {
            if (speed == 0.0f) {
                System.out.println("Car is stopped");
                return;
            }
            System.out.println("The car is moving now with speed "+ speed + " km/h");
        } else
            System.out.println("The car is not started now");
    }
}
