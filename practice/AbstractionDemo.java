package practice;

/* 🟤 6. Abstraction

Q6. Create an abstract class Vehicle with an abstract method startEngine().

Subclasses: Car and Bike that implement startEngine().

Write a main class to demonstrate abstraction using these classes. */

abstract class Vehicle {

    abstract void startEngine();

    void fuleType() {
        System.out.println("Mostly vehicle run on petrol or disel");
    }
}

class Car extends Vehicle {
    void startEngine() {
        System.out.println("Car engine starts with a key or push button.");
    }
}

class Bike extends Vehicle {
    void startEngine() {
        System.out.println("Bike engine starts with a Self-button or kick.");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.startEngine();
        bike.startEngine();

        car.fuleType();
    }
}
