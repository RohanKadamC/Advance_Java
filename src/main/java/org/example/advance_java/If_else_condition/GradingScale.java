package org.example.advance_java.If_else_condition;
import java.util.Scanner;

public class GradingScale {
    static void main(String[] args) {
        System.out.println("Enter the marks of 1 Subject");
       try( Scanner S = new Scanner(System.in) ){
           int num = S.nextInt();
           if(num>=90 && num<=100){
               System.out.println("Your grade is A");
           }else if(num >= 80 && num <=89){
               System.out.println("Your grade is B");
           } else if (num >= 70 && num <=79) {
               System.out.println("Your grade is C");
           } else if (num <70 && num>=1) {
               System.out.println("Your grade is F");
           }else {
               System.out.println("Invalid Number!!!");
           }
       }

    }
}
