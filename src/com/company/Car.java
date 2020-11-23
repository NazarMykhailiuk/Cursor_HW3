package com.company;

public class Car {
    public boolean engineRunning;
    public float speed;
    public float increaseSpeed;
    public float decreaseSpeed;

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
            System.out.println("Engine is turn off");
        }
    }

    public void stopEngine() {
        if (!engineRunning)
            System.out.println("Engine have bee stopped");
        else if (speed > 0 | ((increaseSpeed - decreaseSpeed) > 0)) {
            System.out.println("Engine can't been stopped, the speed is largest than zero");
        }
    }

    public void driving() {
        if (engineRunning & speed > 0)
            System.out.println("Car is driving with speed: " + speed + " km/h.");
        if (!engineRunning)
            System.out.println("Can't driving. The engine is turned off");
        if (speed <= 0)
            System.out.println("Speed can't bee zero or negative value. Please provide a valid value");
    }

    public void accelerating() {
        if (increaseSpeed < 0)
            System.out.println("Speed increased can't bee negative value. Please provide a valid value");
        else if (engineRunning & speed > 0)
            System.out.println("Car accelerating by: " + increaseSpeed + " km/h.");
        if (!engineRunning)
            System.out.println("Can't accelerating. The engine is turned off");
        if (speed > 200) {
            System.out.println("Maximum speed exceeded!");
            speed = 200;
        }
    }

    public void breaking() {
        if (decreaseSpeed < 0)
            System.out.println("Speed decreased can't bee negative value. Please provide a valid value");
        else if (engineRunning & speed > 0 & ((speed + increaseSpeed - decreaseSpeed) >= 0))
            System.out.println("Car breaking by: " + decreaseSpeed + " km/h.");
        else if (!engineRunning)
            System.out.println("Can't breaking. The engine is turned off");
        if (decreaseSpeed > 180)
            System.out.println("Maximum speed exceeded!! The speed value must be <= 180");
    }

    public void stopCar() {
        if (!engineRunning)
            System.out.println("Car is stopped");
        else if (speed > 0 | ((increaseSpeed - decreaseSpeed) > 0)) {
            System.out.println("Car can't bee stopped, the speed is largest than zero");
        }
    }
}
