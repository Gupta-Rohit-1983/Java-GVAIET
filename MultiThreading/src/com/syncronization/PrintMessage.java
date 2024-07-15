package com.syncronization;

public class PrintMessage {

    @SuppressWarnings("unused")
    private String msg;

    public PrintMessage(String msg) {
        this.msg = msg;
    }

    public synchronized void printMessage(String msg){
        System.out.println(msg);
    }
}
