package com.practice;

public class ArithmeticOperator {

    private float operand1;
    private float operand2;

    public ArithmeticOperator(){

    }

    public ArithmeticOperator(float operand1, float operand2){
        // variable shadowing
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public float getOperand1(){
        return  operand1;
    }

    public void setOperand1(float operand1){
        this.operand1 = operand1;
    }
    public float getOperand2(){
        return  operand2;
    }

    public void setOperand2(float operand2){
        this.operand2 = operand2;
    }

    public float addTwoOperand(){
        return operand1 + operand2;
    }

public float substractTwoOperands(){
    return operand1 - operand2;
}

public float multiTwoOperand(){
    return operand1*operand2;
}

public float divTwoOperand(){
    return operand1/operand2;
}

public float moduleTwoOperand(){
    return operand1%operand2;
}







}
