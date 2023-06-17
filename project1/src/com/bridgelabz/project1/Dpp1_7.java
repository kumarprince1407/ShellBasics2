package com.bridgelabz.project1;

import java.util.Scanner;

//1.7 Write a LeapYear.java program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.
public class Dpp1_7 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year>=1582){
            if(year%4==0 && year%100 !=0 || year%400 ==0){
                System.out.println("The year "+year+" is a leap year.");
            }
            else{
                System.out.println("The "+year+" is not a leap year.");
            }
        }
        else{
            System.out.println("Please select a year 1582 onwards.");
        }
    }
}
