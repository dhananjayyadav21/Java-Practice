package com.ok.javapackage.controll;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){

        System.out.println("Enter You Day No :");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        String dayName= " ";

        switch(day) {
            case 1:
                dayName="Monday";
                break;

            case 2:
                dayName="Tuesday";
                break;

            case 3:
                dayName="Wednesday";
                break;

            case 4:
                dayName="Thursday";
                break;

            case 5:
                dayName="Friday";
                break;

            case 6:
                dayName="Saturday";
                break;

            case 7:
                dayName="Sunday";
                break;

            default:
                System.out.println("Wrong Day");
                break;

        }

        System.out.println(dayName);

    }
}
