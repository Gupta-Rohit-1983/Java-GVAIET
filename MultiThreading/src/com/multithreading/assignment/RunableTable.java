package com.multithreading.assignment;

public class RunableTable implements Runnable {

    private Table table;

    RunableTable(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable();
    }

}
