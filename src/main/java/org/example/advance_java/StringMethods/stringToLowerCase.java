package org.example.advance_java.StringMethods;

import java.util.Scanner;

public class stringToLowerCase {
    static void main(String[] args) {
        System.out.println("Enter any sentence it will convert all the letters from uppercase to lowercase");
        try(Scanner s = new Scanner(System.in)){
            String str = s.nextLine();
            String value = str.toLowerCase();
            System.out.println(value);
        }
    }
}
