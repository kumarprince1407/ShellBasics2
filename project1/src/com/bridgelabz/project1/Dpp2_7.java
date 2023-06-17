package com.bridgelabz.project1;

import java.util.Scanner;

// Write a Program to find Palindrome Number
public class Dpp2_7 {
    public static void main(String args[]) {
        System.out.println("Please enter a digit: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int originalNumber=number;
        int reversedNumber=0;
        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a palindrome number.");
        }
    }
}
