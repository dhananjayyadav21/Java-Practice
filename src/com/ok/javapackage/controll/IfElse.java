package com.ok.javapackage.controll;

import java.util.Scanner;

public class IfElse {
    public static  void  main(String args[])
    {
        System.out.println("Enter You Day No :");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        String dayName ;

        if(day==1)
        {
            dayName="Monday";
        } else if (day==2) {
            dayName="Tuesday";
        } else if (day==3) {
            dayName="Wednesday";
        }else if (day==4) {
            dayName="Thursday";
        } else if (day==5) {
            dayName="Friday";
        } else if (day==6) {
            dayName="Saturday";
        }else if (day==7) {
            dayName="Sunday";
        }else{
            dayName="Invalid Day, please try again";
        }

        System.out.println("Day is a : "+dayName);
    }
}
