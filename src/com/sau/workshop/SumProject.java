package com.sau.workshop;

import java.util.Scanner;

public class SumProject {
    public static void main(String[] args) {
        double num1, num2, sum;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter number 1 : ");
            num1 = sc.nextDouble();
            System.out.print("Enter number 2 : ");
            num2 = sc.nextDouble();
            sum = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + sum);
        }while( sum == 500 );
    }
}
