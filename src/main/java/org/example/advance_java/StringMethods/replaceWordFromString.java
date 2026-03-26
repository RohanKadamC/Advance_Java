package org.example.advance_java.StringMethods;

import java.util.Scanner;

public class replaceWordFromString {
    static void main(String[] args) {
        System.out.println("Enter any sentence");
        try(Scanner s = new Scanner(System.in)){
            String letter = s.nextLine();
            letter = letter.replace("<name>","Rohan");
            System.out.println(letter);
        }
    }
}