package com.kn.reversestring;

public class ReverseString {

    public static void main(String[] args) {
        String a = "hellow";

        // Print the original string
        System.out.println("Original String:");
        for (int i = 0; i < a.length(); i++) {
            System.out.print(a.charAt(i));
        }

        // Print a newline for spacing
        System.out.println();

        // Print the string in reverse using a char array
        System.out.println("Reversed String (Using char array):");
        char crr[] = a.toCharArray();
        for (int i = crr.length - 1; i >= 0; i--) {
            System.out.print(crr[i]);
        }

        // Print a newline for spacing
        System.out.println();

        // Print the string in reverse using charAt method
        System.out.println("Reversed String (Using charAt method):");
        for (int i = crr.length - 1; i >= 0; i--) {
            System.out.println(a.charAt(i));
        }
    }
}
