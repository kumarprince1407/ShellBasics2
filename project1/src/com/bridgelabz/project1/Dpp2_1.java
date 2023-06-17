package com.bridgelabz.project1;
import java.util.*;
//1. Read a single Digit Number and write in word
public class Dpp2_1 {
    public static void main(String args[]){
        System.out.println("Please enter a digit between 0 and 9: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println("The entered number is Zero.");
        }
        else if(n==1){
            System.out.println("The entered number is One.");
        }
        else if(n==2){
            System.out.println("The entered number is Two.");
        }
        else if(n==3){
            System.out.println("The entered number is Three.");
        }
        else if(n==4){
            System.out.println("The entered number is Four.");
        }
        else if(n==5){
            System.out.println("The entered number is Five.");
        }
        else if(n==6){
            System.out.println("The entered number is Six.");
        }
        else if(n==7){
            System.out.println("The entered number is Seven.");
        }
        else if(n==8){
            System.out.println("The entered number is Eight.");
        }
        else if(n==9){
            System.out.println("The entered number is Nine.");
        }
        else{
            System.out.println("INVALID NUMBER: Please enter a digit between 0 and 9");
        }
    }
}
