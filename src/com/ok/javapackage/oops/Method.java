package com.ok.javapackage.oops;

public class Method {
    public static void main(String[] args) {
        multiplicationTable(5);
        pattern(3);
        int sum = sumOfNatural(10);
        System.out.println(sum);
    }

    public static void multiplicationTable(int a) {
       for (int i = 1; i < 11; i++) {
           System.out.printf("%d x %d = %d%n",a,i,a*i);
       }
    }

    public static void pattern(int a) {
        for (int i = 1; i < a+1; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.printf("*\t");
            }
            System.out.printf("%n");
        }
    }

    public static int sumOfNatural(int a) {
        int sum = 0;
        if(a > 0) {
            sum = a + sumOfNatural(a - 1);
        }
        return sum;
    }
}
