package practice;

/* 5. Encapsulation

Q5. Create a class Student with private fields: name, rollNo, and marks.

Provide getters and setters for each field.

In main(), create an object, set values using setters, and print them using getters */

public class Student {
    private String name;
    private int rollNo;
    private int marks;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (!name.isEmpty())
            this.name = name;
        else
            System.out.println("Please enterd name not accetable empty");
    }

    public int getRollNo() {
        return this.rollNo;
    }

    public void setRollNo(int rollNo) {
        if (rollNo > 0)
            this.rollNo = rollNo;
        else
            System.out.println("Not accetable negative rollno or zero");
    }

    public int getMarks() {
        return this.marks;
    }

    public void setMarks(int marks) {
        if (marks > 0)
            this.marks = marks;
        else
            System.out.println("Not accetable negative marks");
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        String name;
        s1.setName("Dhananjay");
        name = s1.getName();
        System.out.println("name is " + name);

        int rollNo;
        s1.setRollNo(644);
        rollNo = s1.getRollNo();
        System.out.println("rollNo is " + rollNo);

        int marks;
        s1.setMarks(94);
        marks = s1.getMarks();
        System.out.println("marks is " + marks);
    }

}
