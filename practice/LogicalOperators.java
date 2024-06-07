package com.practice;

public class LogicalOperators {

    int operand1;
    int operand2;

    public LogicalOperators(int operand1, int operand2) {
        
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public void setOperand1(int operand1){
        this.operand1 = operand1;
    }
    
    public int getOperand1(){
        return operand1;
    }
    public void setOperand2(int operand2){
        this.operand2 = operand2;
    }
    
    public int getOperand2(){
        return operand2;
    }

    public boolean isLessThan(){
        return operand1 < operand2;
    }

    public boolean isGreaterThan(){
        return operand1 > operand2;
    }

    public boolean isEqualToo(){
        return operand1 == operand2;
    }



}
