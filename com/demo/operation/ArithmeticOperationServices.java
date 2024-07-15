package com.demo.operation;

public class ArithmeticOperationServices{

ArithmeticOperation newAdd = new ArithmeticOperation(10, 20);

public int additionServices(){
    return newAdd.getAddition();
}

public int substractionServices(){
    return newAdd.getSubstraction();
}

public int multiplicationServices(){
    return newAdd.getMultiplication();
}

    }
