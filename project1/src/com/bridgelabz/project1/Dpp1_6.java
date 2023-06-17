package com.bridgelabz.project1;
//1.6 Write a program to demonstrate static variables, methods, and blocks.
public class Dpp1_6 {
    static int k; //Static variable
    static void display(){//static method
        System.out.println("This is a static method");
    }
    // Static block
    static {//static block
        System.out.println("Inside static block");
        k = 10;
        System.out.println("Static variable initialized: " + k);
    }

    public static void main(String args[]){
    display();//Static method
    System.out.println(k);//Static variable
    }
}
