package org.example.advance_java.StringMethods;


public class stringMethods {
    public static void main(String[] args) {
        String name = "Rohan";
        //name.lenght();
        int value = name.length();
        System.out.println(value);

        //name.toLowerCase();
        String value1 = name.toLowerCase();
        System.out.println(value1);

        //name.toUpperCase();
        String value2 = name.toUpperCase();
        System.out.println(value2);

        //trim();
        String nonTrimedString = "   Rohan    ";
        String trimedString = nonTrimedString.trim();
        System.out.println(trimedString);

         //substring(start);
        System.out.println(name.substring(2));

        //substring(start,end);
        System.out.println(name.substring(1,5));

        //name.replace('char' or "string" , 'char' or "string")
        System.out.println(name.replace('R','P'));
    }
}
