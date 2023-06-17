package com.bridgelabz.project1;
import java.util.*;
/*
Enter two numbers and do the following arithmetic Operations find max and min.
i) a+b*c ii) c+a/b
iii) a%b+c iV) a*b+c
*/
public class Dpp2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter the third number: ");
        double c = sc.nextDouble();

        // Perform arithmetic operations
        double result1 = a + b * c;
        double result2 = c + a / b;
        double result3 = a % b + c;
        double result4 = a * b + c;

        // Find maximum and minimum
        double max = Math.max(Math.max(result1, result2), Math.max(result3, result4));
        double min = Math.min(Math.min(result1, result2), Math.min(result3, result4));

        System.out.println("Result of a + b * c: " + result1);
        System.out.println("Result of c + a / b: " + result2);
        System.out.println("Result of a % b + c: " + result3);
        System.out.println("Result of a * b + c: " + result4);
        System.out.println("Maximum result: " + max);
        System.out.println("Minimum result: " + min);
    }
}
