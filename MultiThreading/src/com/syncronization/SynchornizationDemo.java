package com.syncronization;

import com.multithreading.example.RunnableDemo;

public class SynchornizationDemo {

    public static void main(String[] args) {
        
        PrintMessage pmMessage= new PrintMessage("Hello");

        RunnableDemo rDemo1 = new RunnableDemo(pmMessage);
        RunnableDemo rDemo2 = new RunnableDemo(pmMessage);

        Thread thread1 = new Thread(rDemo1);
        Thread thread2 = new Thread(rDemo2);

        thread1.start();
        thread2.start();
    }
}
