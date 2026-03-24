package org.example.advance_java.If_else_conditions;
import java.util.Scanner;

public class oddEvenSplit {
    static void main(String[]args) {
        System.out.println("Enter any number:");
        try(Scanner S = new Scanner(System.in)){
            int a = S.nextInt();
            if( a %2  ==0){
                System.out.println("This is an Even  number");
            }else {
                System.out.println("This is an Odd number");
            }
        }
    }
}
