package org.example.advance_java.StringMethods;

import java.util.Scanner;

public class replaceSpacesToUnderscore {
    static void main() {
        System.out.println("Enter any sentence, it will convert the spaces to underscore");
        try(Scanner s = new Scanner(System.in)){
            String Str = s.nextLine();
            String value = Str.replace(' ','_');
            System.out.println(value);
        }
    }
}
