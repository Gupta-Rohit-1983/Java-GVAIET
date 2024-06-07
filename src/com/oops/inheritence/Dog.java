package com.oops.inheritence;

public class Dog extends Animal {

    int legsNumber;

    public Dog() {}

    public Dog(int legsNumber) {
        this.legsNumber = legsNumber;
    }

    public Dog(float height, String color, String voice, float weight, int legsNumber) {
        super(height, color, voice, weight);
        this.legsNumber = legsNumber;
    }

    public int getLegsNumber() {
        return legsNumber;
    }

    public void setLegsNumber(int legsNumber) {
        this.legsNumber = legsNumber;
    }

    @Override
    public String toString() {
        return "Dog [legsNumber=" + legsNumber + ", toString()=" + super.toString() + "]";
    }

    
    
}
