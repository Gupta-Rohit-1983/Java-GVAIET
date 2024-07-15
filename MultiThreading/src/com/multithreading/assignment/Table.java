package com.multithreading.assignment;

public class Table {

    private int table;

    public void setTable(int table) {
        this.table = table;
    }

    public void printTable() {
        synchronized (this) {
            for (int i = 1; i < 11; i++) {
                System.out.println(table * i);
            }
        }
    }
}
