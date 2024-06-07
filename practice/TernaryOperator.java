package com.practice;

public class TernaryOperator {
    private int variable1;
    private int variable2;

    public TernaryOperator() {

    }

    public TernaryOperator(int variable1, int variable2) {
        this.variable1 = variable1;
        this.variable2 = variable2;
    }

    public void setVariable(int variable1, int variable2) {

        this.variable1 = variable1;
        this.variable2 = variable2;
    }

    public int getVariable1() {
        return variable1;
    }

    public int getVariable2() {
        return variable2;
    }

    public int ternaryOperation() {
        return (variable1 > variable2) ? variable1 : variable2;
    }

}
