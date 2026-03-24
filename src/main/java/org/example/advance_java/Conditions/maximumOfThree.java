package org.example.advance_java.Conditions;
import java.util.Scanner;

public class maximumOfThree {
    public static void main(String[] args) {
         System.out.println("Enter any Three numbers");
        try(Scanner S = new Scanner(System.in)){ 
        int num1 = S.nextInt();
        int num2 = S.nextInt();
        int num3 = S.nextInt();
        if(num2<num1 && num1>num3){
            System.out.println(num1 +" is the largest number");
        }else if (num1<num2 && num2>num3){
             System.out.println(num2 +" is the largest number");
        }else if (num1<num3 && num3>num2){
             System.out.println(num3 +" is the largest number");
        }
     }
    }
}
