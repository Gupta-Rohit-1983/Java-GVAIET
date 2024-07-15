package com.practice;

public class UsingRecursionPrintExpression {

    public void printExpression(String expression, int number) {
        if (number <= 0) {
            System.out.println(expression);
            return;
        }
        if (expression.equals(" ")) {
            expression = number + " ";
        } else {
            expression = expression + " + " + number;
        }
        switch (number) {
            case 1:
                printExpression(expression, number - 1);
                break;

            default: {
                printExpression(expression, number - 1);
                printExpression(expression, number - 2);
            }
                break;
        }
    }

    public static void main(String[] args) {
        UsingRecursionPrintExpression pe = new UsingRecursionPrintExpression();
        pe.printExpression(" ", 3);
        
    }

}
