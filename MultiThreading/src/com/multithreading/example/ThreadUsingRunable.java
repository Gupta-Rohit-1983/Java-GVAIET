package com.multithreading.example;

public class ThreadUsingRunable {

    public static void main(String[] args) {
        
        RunnableDemo runnableDemo1 = new RunnableDemo();
        RunnableDemo runnableDemo2 = new RunnableDemo();

        Thread thread1 = new Thread(runnableDemo1);
        Thread thread2 = new Thread(runnableDemo2);
        thread1.start();
        thread2.start();
    }
}
