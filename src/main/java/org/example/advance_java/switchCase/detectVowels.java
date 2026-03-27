package org.example.advance_java.switchCase;

import java.util.Scanner;

public class detectVowels {
    static void main() {
        System.out.print ("Enter any Alphabet: ");
        Scanner s = new Scanner(System.in);
        char letter = s.next().charAt(0);
        switch (letter){
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("This is a Vowel");
            default -> System.out.println("This letter is a Consonant ");
        }
    }
}