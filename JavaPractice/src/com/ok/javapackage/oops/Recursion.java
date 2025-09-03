package com.ok.javapackage.oops;

public class Recursion {
    public static void main(String[] args) {
      float a = sum(2.5f,5);
      System.out.println(a);
    }

     static int sum (int a, int b, int c){
        return a+b+c;
     }

    static int sum (int a, int b){
        return a+b;
     }

     static float sum (float a, float b){
        return a+b;
     }
}
