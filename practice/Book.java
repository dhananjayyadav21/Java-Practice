package practice;

/* 8. Constructor Chaining

Q8. Create a class Book with two constructors:

One with parameters title and author.

One with parameters title, author, and price that calls the first constructor using this().*/

public class Book {
    String title, author;
    int price;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0;
    }

    Book(String title, String author, int price) {
        this(title, author);
        this.price = price;
    }

    void displayInfo() {
        System.out.printf("The book is %s and its author name is %s with minimul price %d %n", title, author, price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("c programing", "neel bhai");
        b1.displayInfo();

        Book b2 = new Book("c programing", "neel singh", 299);
        b2.displayInfo();
    }

}
