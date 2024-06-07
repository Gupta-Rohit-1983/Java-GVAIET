package com.oops.astraction.example;

public abstract class ArithmeticOperation {

    private int a;
    private int b;
    public ArithmeticOperation() {
    }
    public ArithmeticOperation(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }

    public abstract void operation(int a, int b); 

    @Override
    public String toString() {
        return "ArithmeticOperation [a=" + a + ", b=" + b + "]";
    }

    

}
