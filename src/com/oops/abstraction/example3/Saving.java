package com.oops.abstraction.example3;

public class Saving extends Bank {

    static int interestRate;
    static int minimumDeposit;

    

    
    public Saving(int interestRate, int minimumDeposit) {
        Saving.interestRate = interestRate;
        Saving.minimumDeposit = minimumDeposit;
    }

    public Saving(String name, int age, int accNo, int interestRate, int minimumDeposit) {
        super(name, age, accNo);
        Saving.interestRate = interestRate;
        Saving.minimumDeposit = minimumDeposit;
    }

    public int getInterestRate() {
        return interestRate;
    }
    
    public void setInterestRate(int interestRate) {
        Saving.interestRate = interestRate;
    }
    
    public int getMinimumDeposit() {
        return minimumDeposit;
    }
    
    public void setMinimumDeposit(int minimumDeposit) {
        Saving.minimumDeposit = minimumDeposit;
    }
    
    @Override
    public void printAccDetails() {
        System.out.println("Name :" + getName());
        System.out.println("Age :" + getAge());
        System.out.println("Acccout Number :" + getAccNo());
        System.out.println("Intrest Rate :" + getInterestRate());
        System.out.println("Minimum Deposit :" + getMinimumDeposit());

    }
}
