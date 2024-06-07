package com.oops.polymorphism;

public class Bank {

    private long accNumber;
    private String accType;

    public Bank() {
    }

    public Bank(long accNumber, String accType) {
        this.accNumber = accNumber;
        this.accType = accType;
    }

    public long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    @Override
    public String toString() {
        return "Bank [accNumber=" + accNumber + ", accType=" + accType + "]";
    }

    public void printAccDetail(){
        System.out.println("Acc Number "+ accNumber + ", Acc Type " + accType);

    }
    

}
