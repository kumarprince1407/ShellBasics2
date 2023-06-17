package com.bridgelabz.project1;

import java.util.*;

//Write a Program to reverse the integer number eg. Input n=231 reverse is 132
public class Dpp2_4 {
    public static void main(String args[]) {
        System.out.println("Please enter a number to reverse: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse=0;
        while(n>0){
            int lastDigit = n%10;
            reverse = reverse*10+ lastDigit;
            n= n/10;
        }
        System.out.println("The reverse of the entered number is: "+ reverse);
    }
}
