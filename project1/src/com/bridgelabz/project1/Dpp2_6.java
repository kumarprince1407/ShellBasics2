package com.bridgelabz.project1;

import java.util.Scanner;

//Write a Program to reverse the integer number using 'for loop'. eg. Input n=231 reverse is 132
public class Dpp2_6 {
    public static void main(String args[]) {
        System.out.println("Please enter a digit: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse=0;
        int originalNumber=n;
        for (n=originalNumber; n != 0; n /= 10){
            int lastDigit= n%10;
            reverse = reverse*10 + lastDigit;

        }
        System.out.println("The reverse of the digit is: "+ reverse);
    }
}
