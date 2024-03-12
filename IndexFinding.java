package com.kn.findingchararacter;

import java.util.Scanner;

public class IndexFinding {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = scan.next(); // Read the input string from the user

        char[] characters = input.toCharArray(); // Convert the string to a character array

        // Loop through each character in the array
        for (int i = 0; i < characters.length; i++) {
            // Print the character and its corresponding ASCII value
            System.out.println(characters[i] + " - " + (int) characters[i]);
        }

        scan.close(); // Close the Scanner object to prevent resource leak
    }
}
