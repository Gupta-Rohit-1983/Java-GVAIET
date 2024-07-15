package com.multithreading.example;

public class ThreadUsingThreadClass extends Thread {

    @Override
    public void run() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        ThreadUsingThreadClass thread3 = new ThreadUsingThreadClass();
        thread3.start();
        
    }
}
