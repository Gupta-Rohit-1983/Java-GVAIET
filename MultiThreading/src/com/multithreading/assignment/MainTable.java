package com.multithreading.assignment;

public class MainTable {

    public static void main(String[] args) {

        Table table = new Table();
        Table table2 = new Table();
        table2.setTable(20);
        table.setTable(10);

        RunableTable rTable1 = new RunableTable(table);
        RunableTable rTable2 = new RunableTable(table2);

        Thread thread1 = new Thread(rTable1);
        Thread thread2 = new Thread(rTable2);

        thread1.start();
        thread2.start();
    }
}
