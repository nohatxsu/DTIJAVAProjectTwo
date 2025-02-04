package com.sau.workshop;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class AreaProject02 {
    public static void main(String[] args) throws IOException {
        int menuselect;
        double width, length, base, high, radius, areasquare, areatriangle, areacircle;

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader render = new BufferedReader(input);
        DecimalFormat of = new DecimalFormat("0.00");

        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("      Shape Area Program    ");
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("1. Square Area");
        System.out.println("2. Triangle Area");
        System.out.println("3. Circle Area");
        System.out.println("++++++++++++++++++++++++++++");
        System.out.print("Select Menu: ");
        menuselect = Integer.parseInt(render.readLine());
        System.out.println("++++++++++++++++++++++++++++");

        if (menuselect == 1) {
            System.out.print("Input width: ");
            width = Double.parseDouble(render.readLine());
            System.out.print("Input length: ");
            length = Double.parseDouble(render.readLine());

            areasquare = width * length;

            System.out.println("Area of Square is: " + of.format(areasquare));
            System.out.print("++++++++++++++++++++++++++++");
        } else if (menuselect == 2) {
            System.out.print("Input base: ");
            base = Double.parseDouble(render.readLine());
            System.out.print("Input height: ");
            high = Double.parseDouble(render.readLine());

            areatriangle = base * high / 2;

            System.out.println("Area of Triangle is: " + of.format(areatriangle));
            System.out.print("++++++++++++++++++++++++++++");
        } else if (menuselect == 3) {
            System.out.print("Input radius: ");
            radius = Double.parseDouble(render.readLine());

            areacircle = Math.PI * Math.pow(radius, 2);

            System.out.println("Area of Circle is: " + of.format(areacircle));
            System.out.print("++++++++++++++++++++++++++++");
        } else {
            System.out.println("Invalid selection. Thank you, bye-bye.");
            System.out.print("++++++++++++++++++++++++++++");
        }
    }
}
