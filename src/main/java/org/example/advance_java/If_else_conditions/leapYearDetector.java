package org.example.advance_java.If_else_conditions;

import java.util.Scanner;

public class leapYearDetector {
    public static void main(String[] args) {
        System.out.println("Enter any year: ");
        try(Scanner Y = new Scanner(System.in)){
        int a = Y.nextInt();
            if(a % 4==0){
                System.out.println("This is a Leap year");
            }else if(a % 400==0){
                System.out.println("This is a Leap year");
            }else {
                System.out.println("This is not a Leap year");
            }
        }
    }
}