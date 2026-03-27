package org.example.advance_java.If_else_conditions;

import java.util.Scanner;

public class taxCounter {
    static void main() {
        System.out.print("Enter your Annual income in lakhs: ");
        Scanner s = new Scanner(System.in);
        int belowTaxRange = 0;
        int tax = s.nextInt();
        
        if (tax<250000){
            System.out.println("Your tax percentage as per the amount is: "+belowTaxRange);
            System.out.println("Your remaining amount is: "+tax);
        }else if (tax>=250000 && tax<500000){
            int taxPercentage5 = tax*5/100;
            System.out.println("Your tax percentage as per the amount is: "+taxPercentage5);
            int remainingAmount5 = tax-taxPercentage5;
            System.out.println("Your remaining amount is: "+remainingAmount5);
        } else if (tax>=500000 && tax<1000000) {
            int taxPercentage20 = tax*20/100;
            System.out.println("Your tax percentage as per the amount is: "+taxPercentage20);
            int remainingAmount20 = tax-taxPercentage20;
            System.out.println("Your remaining amount is: "+remainingAmount20);
        } else if (tax>=1000000) {
            int taxPercentage30 = tax*30/100;
            System.out.println("Your tax percentage as per the amount is: "+taxPercentage30);
            int remainingAmount30 = tax-taxPercentage30;
            System.out.println("Your remaining amount is: "+remainingAmount30);
        }
    }
}
