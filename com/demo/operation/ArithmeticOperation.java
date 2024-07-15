package com.demo.operation;

class ArithmeticOperation {

    int a;
    int b;
    int result;

    
    ArithmeticOperation(int a, int b) {
        this.a = a;
        this.b = b;


    }
    int getAddition(){
        result = a+b;
        return result;
    }

    int getSubstraction(){
        result = a - b;
        return result;
    }

    int getMultiplication(){
        result = a * b;
        return result;
    }
}
