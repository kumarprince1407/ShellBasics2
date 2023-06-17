package com.bridgelabz.project1;
import java.util.*;
public class Dpp2_11 {
    public static void main(String[] args) {
        // Check if the correct number of command line arguments is provided
        if (args.length != 2) {
            System.out.println("Usage: java SpringSeason <month> <day>");
            return;
        }

        // Parse the command line arguments
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        // Check if the date falls within the spring season
        boolean isSpringSeason = (m == 3 && d >= 20 && d <= 31) ||
                (m == 4 && d >= 1 && d <= 30) ||
                (m == 5 && d >= 1 && d <= 31) ||
                (m == 6 && d >= 1 && d <= 20);

        // Print the result
        System.out.println(isSpringSeason);
    }
}
