package com.ok.javapackage.string;

public class Main {
    public static void main(String[] args) {

        String greeting = "Hello";
        System.out.println(greeting);

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase());
        System.out.println(txt2.toLowerCase());

        String txt3 = "Please locate where 'locate' occurs!";
        System.out.println(txt3.indexOf("locate"));
    }
}
