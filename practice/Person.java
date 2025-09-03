package practice;

// Q1. Create a class Person with fields: name, age, and a method displayInfo() to print the details. Create objects and call  the method.
public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.printf("name : %s and age : %d %n", name, age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Dhananjay", 21);
        Person person2 = new Person("Neel", 21);

        person1.displayInfo();
        person2.displayInfo();
    }
}
