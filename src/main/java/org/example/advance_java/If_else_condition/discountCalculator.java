package org.example.advance_java.If_else_condition;

import java.util.Scanner;

public class discountCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the Name, Quantity and the Price per unit of the product");
        try(Scanner S = new Scanner(System.in)){
            String name = S.nextLine(); // name of the product
            int qauntity = S.nextInt(); // no. of qauntity
            int price = S.nextInt(); // price 
            int c = price * qauntity;
            if (c >= 1000){
                System.out.println("Congralation you have got 10% discount");
                int discount = c*10/100;
                int discountAmount = c - discount;
                System.out.println("Your product name is " +name);
                System.out.println("Your total amount is "+qauntity);
                System.out.println("Your Discounted amount is "+discount);
                System.out.println("Your amount is "+discountAmount);
            }else if (c<1000){
                System.out.println("Your product name is " +name);
                System.out.println("Your total amount is "+c);
            }
        }
    }
}
