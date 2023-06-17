package com.bridgelabz.project1;

import java.util.Scanner;

// Read a Number 1,10,100,1000 and display unit, ten hundred
public class Dpp2_2 {
    public static void main(String args[]) {
        System.out.println("Please enter a digit: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch(n){
            case 1:
                System.out.println("It is a unit number");
                break;
            case 10:
                System.out.println("The entered number is 10");
                break;
            case 100:
                System.out.println("The entered number is Hundred");
                break;
            case 1000:
                System.out.println("The entered number is 1000");
                break;
            default:
                System.out.println("Invalid input! Please enter a number among 1,10,100, 1000");

        }
    }
}
