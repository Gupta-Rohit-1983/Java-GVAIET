package com.exception.arithmeticutility;

public enum Menu {
    ADD(1, "Add Two Numbers"),
    SUBSTRAC(2, "Substact Two Number"),
    MULTIPLY(3, "Multiply Two Number"),
    DIVIDE(4, "Divide Two Number");

    private int srNo;
    private String info;

    private Menu() {
    }

    private Menu(int srNo, String info) {
        this.info = info;
        this.srNo = srNo;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getSrNo() {
        return srNo;
    }

    public void setSrNo(int srNo) {
        this.srNo = srNo;
    }

}
