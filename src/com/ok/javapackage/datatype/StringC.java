package com.ok.javapackage.datatype;

public class StringC {
    public static void main(String[] args) {
        String newString = "Neel Bhai";

        System.out.println(newString.length());
        System.out.println(newString.toLowerCase());
        System.out.println(newString.toUpperCase());
        System.out.println(newString.trim());
        System.out.println(newString.substring(3));
        System.out.println(newString.substring(2,6));
        System.out.println(newString.replace("Neel", "Dhananjay"));
        System.out.println(newString.startsWith("Neel"));
        System.out.println(newString.endsWith("hai"));
        System.out.println(newString.charAt(5));
        System.out.println(newString.indexOf("Bhai"));
        System.out.println(newString.indexOf("B",3));
        System.out.println(newString.lastIndexOf("e"));
        System.out.println(newString.lastIndexOf("h",4));
        System.out.println(newString.equals("Neel Bhai"));
        System.out.println(newString.equalsIgnoreCase("neel Bhai"));
    }
}
