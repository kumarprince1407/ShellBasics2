package com.bridgelabz.project1;


import java.util.Scanner;

public class Dpp1_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1= sc.nextLine();
        String str2=sc.nextLine();

        if(str1.equals(str2)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}
