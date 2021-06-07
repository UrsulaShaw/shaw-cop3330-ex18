/*
 * UCF COP3330 Summer 2021 Assignment 1 Solution
 * Copyright 2021 Ursula Shaw
 */

package base;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.");
        String convert = in.nextLine();
        System.out.println("Your choice: "+convert);
        if (convert.equalsIgnoreCase("C")) {
            System.out.println("Please enter the temperature in Fahrenheit: ");
            double f = in.nextDouble();
            double c = (f - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is "+c);
        } else if(convert.equalsIgnoreCase("F")) {
            System.out.println("Please enter the temperature in Celsius: ");
            double c = in.nextDouble();
            double f = ((c*9) / 5) + 32;
            System.out.println("The temperature in Fahrenheit is "+f);
        }
    }
}
