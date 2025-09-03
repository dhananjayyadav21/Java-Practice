package practice;

/* Q4. Create a class Shape with a method draw().

Subclasses: Circle, Rectangle, Triangle, each override draw().

Write a program to demonstrate runtime polymorphism by calling draw() on a Shape reference pointing to different subclass objects. */

public class Shape {

    void draw() {
        System.out.println("Shaps");
    }

    public static void main(String[] args) {
        Shape triangle = new Triangle();
        triangle.draw();
        Shape rectangle = new Rectanglle();
        rectangle.draw();
        Shape circle = new Circle();
        circle.draw();
    }

}

class Circle extends Shape {

    void draw() {
        System.out.println("Shaps : circle");

        int r = 2;

        for (int i = 0; i <= 2 * r; i++) {
            for (int j = 0; j <= 2 * r; j++) {
                int x = i - r;
                int y = j - r;

                if (x * x + y * y <= r * r + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("I am circle");
    }

}

class Rectanglle extends Shape {

    void draw() {
        System.out.println("Shaps : rectangle");

        int rows = 3;
        int cols = 20;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        System.out.println("I am rectangle");
    }

}

class Triangle extends Shape {

    void draw() {
        System.out.println("Shaps : triangle");

        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("I am triangle");
    }

}
