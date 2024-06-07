package com.practice;

public class UnaryOperator {
    private int variable1;

    public UnaryOperator(){

    }

    public UnaryOperator(int variable1){
        this.variable1 = variable1;
    }

    public void setVariable1(int variable1){
        this.variable1 = variable1;
    }

    public int getVariable(){
        return variable1;
    }

    public int incrementOperation(){
        return variable1++;
    }

    public int decrementOperation(){
        return variable1--;     
    }

}
