package com.multithreading.example;

import com.syncronization.PrintMessage;

public class RunnableDemo implements Runnable {

    public RunnableDemo(PrintMessage pmMessage) {
        //TODO Auto-generated constructor stub
    }

    public RunnableDemo() {
        //TODO Auto-generated constructor stub
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(extracted(i));
        }
    }

    private String extracted(int i) {
        return "Runnable "+i;
    }

}
