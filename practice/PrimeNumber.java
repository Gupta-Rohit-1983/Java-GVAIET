package com.practice;

public class PrimeNumber {

    public static void main(String[] args) {
        boolean isPrime;
        

        for (int i = 2; i <= 100; i++) {
            isPrime = true;

            for (int k = 2; (k * k) <= i; k++) {
                if (i % k == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(" is Prime Number " +i);
            }
        }
    }

}
