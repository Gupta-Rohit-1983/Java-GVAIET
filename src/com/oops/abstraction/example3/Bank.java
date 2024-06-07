package com.oops.abstraction.example3;

public abstract class Bank {

    private String name;
    private int age;
    private int accNo;

    public Bank() {
    }

    public Bank(String name, int age, int accNo) {
        this.name = name;
        this.age = age;
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public abstract void printAccDetails();

    @Override
    public String toString() {
        return "Bank [name=" + name + ", age=" + age + ", accNo=" + accNo + "]";
    }

}
