package practice;

/* Q2. Create a class Rectangle with overloaded constructors:

One takes no arguments (default 0x0)

One takes two arguments for length and width.

Include a method area() to calculate and return area. */

public class Rectangle {

    int length, width;

    Rectangle() {
        this.length = 10;
        this.width = 5;
    }

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int area() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle R1 = new Rectangle();
        Rectangle R2 = new Rectangle(10, 8);

        int area;
        area = R2.area();
        area = R1.area();

        System.out.printf("The area of rectangle is %d %n", area);
    }

}
