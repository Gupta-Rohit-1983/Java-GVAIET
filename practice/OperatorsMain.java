package com.practice;

public class OperatorsMain {

    public static void main(String[] args) {
        // creating constructor for arithmetic operation
        ArithmeticOperator operators = new ArithmeticOperator(20, 3);
        operators.setOperand1(30);
        operators.setOperand2(15);
        System.out.println("Arithmetic Output");
        System.out.println(operators.addTwoOperand());
        System.out.println(operators.substractTwoOperands());
        System.out.println(operators.multiTwoOperand());

        System.out.println(operators.divTwoOperand());
        System.out.println(operators.moduleTwoOperand());

        // System.out.println(operators.addTwoOperand() + "\n" +
        // operators.substractTwoOperands() + "\n"
        // + operators.substractTwoOperands() + "\n" + operators.divTwoOperand() + "\n"
        // + operators.moduleTwoOperand());
        // creating construcor for logical operation
        LogicalOperators logic = new LogicalOperators(10, 20);
        System.out.println("Logical Output");
        System.out.println(logic.isLessThan());

        logic.setOperand1(30);
        System.out.println(logic.isGreaterThan());
        logic.setOperand1(20);
        System.out.println(logic.isEqualToo());

        int result = (int) operators.addTwoOperand();

        System.out.println(result ^ 10);
        // creating constructor for bitwise operation
        BitwiseOperator bitwise = new BitwiseOperator();

        bitwise.setVariable(5, 3);
        System.out.println("Bitwise Output");
        System.out.println(bitwise.andOperation());
        System.out.println(bitwise.orOperation());
        System.out.println(bitwise.xorOperation());
        System.err.println(bitwise.leftShift());
        System.out.println(bitwise.rightShift());
        System.out.println(bitwise.unsignedRightShift());

        // creating constructor for unary operators

        UnaryOperator unary = new UnaryOperator();

        unary.setVariable1(10);
        System.out.println("Unary Output");
        System.out.println(unary.incrementOperation());
        System.out.println(unary.getVariable());
        System.out.println(unary.decrementOperation());
        System.out.println(unary.getVariable());

        int temp = unary.decrementOperation() + unary.incrementOperation() + unary.decrementOperation();

        System.out.println(temp);

        // creating constructor for ternary operators

        TernaryOperator ternary = new TernaryOperator();

        ternary.setVariable(10, 12);
        System.out.println("Ternary Output");
        System.out.println(ternary.ternaryOperation());;

    }

}
