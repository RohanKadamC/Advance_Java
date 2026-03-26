package org.example.advance_java.switchCase;

import java.util.Scanner;

public class dayOfTheWeek {
    static void main(String[] args) {
        System.out.print("Enter a Number between 1 to 7 : ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        switch (num){
            case 1:
                System.out.println("Today is Sunday");
                break;
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is Tuesday");
                break;
            case 4:
                System.out.println("Today is Wednesday");
                break;
            case 5:
                System.out.println("Today is Thursday");
                break;
            case 6:
                System.out.println("Today is Friday");
                break;
            case 7:
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Invalid Number!!");
        }
    }
}
