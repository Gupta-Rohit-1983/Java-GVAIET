package com.multithreading.example;

public class MultiThreadingDemo extends Thread {

    private int table;

    public void setTable(int table) {
        this.table = table;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(table * i);
        }
    }

    public static void main(String[] args) {

        MultiThreadingDemo thread1 = new MultiThreadingDemo();
        MultiThreadingDemo thread2 = new MultiThreadingDemo();
        thread1.setTable(1);
        thread1.start();
        thread2.setTable(5);
        thread2.start();
    }


}
