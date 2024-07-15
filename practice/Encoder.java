package com.practice;

import java.util.Random;
import java.util.Scanner;

public class Encoder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Massage :");
        String msg = sc.nextLine();
        String encodedMsg = encode(msg);
        System.out.println(encodedMsg);

        sc.close();
    }

    public static String encode(String msg) {
        Random random = new Random();
        StringBuilder encoded = new StringBuilder();

        // Append the first character
        encoded.append(msg.charAt(0));

        // Loop through the characters of the input string
        for (int i = 1; i < msg.length(); i++) {
            // Insert a random digit (0-9) between characters
            encoded.append(random.nextInt(10));
            // Append the current character
            encoded.append(msg.charAt(i));
        }
        return encoded.toString();
        
    }
}
