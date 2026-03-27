package org.example.advance_java.If_else_conditions;

import java.util.Scanner;

public class typeOfWebsite {
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the website URl : ");
        String str = s.nextLine();
        if (str.endsWith(".com")){
            System.out.println("The website is for commercial use");
        } else if (str.endsWith(".org")) {
            System.out.println("The website is for Organization use");
        } else if (str.endsWith(".in")) {
            System.out.println("The website is for Indian government");
        }
    }
}
