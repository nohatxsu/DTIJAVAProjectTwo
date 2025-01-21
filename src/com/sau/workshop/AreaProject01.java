package com.sau.workshop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaProject01 {
    public static void main(String[] args) {
        int menuselect;
        double width, length, base, high, radius, areasquare, areatriangle, areacircle;

        Scanner sc = new Scanner(System.in);
        DecimalFormat of = new DecimalFormat("0.00");

        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("      Shape Area Program    ");
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("1. Square Area");
        System.out.println("2. Triangle Area");
        System.out.println("3. Circle Area");
        System.out.println("++++++++++++++++++++++++++++");
        System.out.print("Select Menu: ");
        menuselect = sc.nextInt();
        System.out.println("++++++++++++++++++++++++++++");

        if (menuselect == 1) {
            System.out.print("Input width: ");
            width = sc.nextDouble();
            System.out.print("Input length: ");
            length = sc.nextDouble();

            areasquare = width * length;

            System.out.println("Area of Square is: " + of.format(areasquare));
            System.out.print("++++++++++++++++++++++++++++");
        } else if (menuselect == 2) {
            System.out.print("Input base: ");
            base = sc.nextDouble();
            System.out.print("Input height: ");
            high = sc.nextDouble();

            areatriangle = base * high / 2;

            System.out.println("Area of Triangle is: " + of.format(areatriangle));
            System.out.println("++++++++++++++++++++++++++++");
        } else if (menuselect == 3) {
            System.out.print("Input radius: ");
            radius = sc.nextDouble();

            areacircle = Math.PI * Math.pow(radius, 2);

            System.out.println("Area of Circle is: " + of.format(areacircle));
            System.out.println("++++++++++++++++++++++++++++");
        } else {
            System.out.println("Invalid selection. Thank you, bye-bye.");
            System.out.println("++++++++++++++++++++++++++++");
        }
    }
}
