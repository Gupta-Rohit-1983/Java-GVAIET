package com.practice;

import java.util.Scanner;

public class Decoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Encoded Message :");

        String msg = scanner.nextLine();
        // String msg = "h4i6i3 8m1y9 9n5a9m8e6 8i1s9 1k5u1n8a9l";

        for (int i = 0; i < msg.length(); i++) {

            if (msg.charAt(i)>='0' && msg.charAt(i)<='9') {
                continue;
            }
            else {
                System.out.print(msg.charAt(i));
            }
        }
        scanner.close();
    }

}
