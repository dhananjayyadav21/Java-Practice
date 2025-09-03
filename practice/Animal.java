package practice;

/* 
Q3. Create a base class Animal with a method makeSound().

Inherit classes Dog and Cat from Animal and override makeSound().

Create objects of Dog and Cat and call the makeSound() method. */

public class Animal {

    void makeSound() {
        System.out.println("Animal Sound : Oooo");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();

    }

}

class Dog extends Animal {

    void makeSound() {
        System.out.println("Dog Sound : Bhauu bhau");
    }

    public static void main(String[] args) {
        System.out.println("I am Dog");

    }

}

class Cat extends Animal {

    void makeSound() {
        System.out.println("Cat Sound : Meauuu Meauuu");
    }

    public static void main(String[] args) {
        System.out.println("I am cat");

    }
}
