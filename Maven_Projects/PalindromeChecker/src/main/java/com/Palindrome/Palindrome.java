package com.palindrome;

import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        String clean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("'" + input + "' is a Palindrome");

        } else {
            System.out.println("'" + input + "' is NOT a Palindrome");
        }
    }
}