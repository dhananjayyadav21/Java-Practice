package com.ok.javapackage.datatype;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        byte a= 12;
//        short b= 125;
//        int c= 1452;
//        long d= 1452L;
//
//        float f= 1452.25f;
//        double e= 14556.2;
//
//        boolean isAge = true;
//
//        System.out.println("isAge:"+isAge);
//
//        System.out.println(a + b + c + d + e + f  );


        //1) Write a program to sum of three numbers
           System.out.print("Enter number :");
           int num1 = sc.nextInt();
           int num2 = sc.nextInt();
           int num3 = sc.nextInt();

           int sum = num1 + num2 + num3;
           System.out.println("The sum of three numbers :" + sum);


        System.out.println("==================================================");
        // 2) write a program to calculate cgpa using marks of the subjects
           System.out.println("Enter the marks of the all subj  :");
           int subj1 = sc.nextInt();
           int subj2 = sc.nextInt();
           int subj3 = sc.nextInt();
           int subj4 = sc.nextInt();
           int subj5 = sc.nextInt();

           int markObtainedInAll =  subj1 + subj2 + subj3 + subj4 + subj5;
           int totalMarks = 5 * 100;

           float percent =( (float) markObtainedInAll / totalMarks) * 100;
           System.out.println("The marks obtained in all subj :" + markObtainedInAll);
           System.out.println("The percent of the marks obtained in all subj :" + percent + "%");

        System.out.println("==================================================");
        // 3) write a java program to detect whether the number entered by user is int or not
           System.out.print("Enter the number : ");

           if(sc.hasNextInt()){
               System.out.println("This is a integer");
           }else {
               System.out.println("This is not a integer");
           }
    }
}