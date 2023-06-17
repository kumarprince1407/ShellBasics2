package com.bridgelabz.project1;

import java.util.Scanner;

//Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
public class Dpp2_5 {
    public static void main(String args[]) {
        System.out.println("Please enter a digit: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=1; i<=n;i++){
            sum +=i;
        }
        System.out.println("The sum of digits until "+ n + " is: " + sum);
    }
}
