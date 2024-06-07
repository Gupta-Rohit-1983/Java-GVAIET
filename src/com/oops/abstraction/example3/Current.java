package com.oops.abstraction.example3;

public class Current extends Bank {

    static int interestRate;
    static int minimumDeposit;


public Current(int interestRate, int minimumDeposit){
    Current.interestRate=interestRate;
    Current.minimumDeposit= minimumDeposit;
}
    public static int getInterestRate() {
        return interestRate;
    }
    public static void setInterestRate(int interestRate) {
        Current.interestRate = interestRate;
    }
    public static int getMinimumDeposit() {
        return minimumDeposit;
    }
    public static void setMinimumDeposit(int minimumDeposit) {
        Current.minimumDeposit = minimumDeposit;
    }

    @Override
    public void printAccDetails(){
        System.out.println("Name :" + getName());
        System.out.println("Age :" + getAge());
        System.out.println("Acccout Number :" + getAccNo());
        System.out.println("Intrest Rate :" + getInterestRate());
        System.out.println("Minimum Deposit Amout :" + getMinimumDeposit());
        
    }

}
