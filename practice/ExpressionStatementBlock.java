package com.practice;

public class ExpressionStatementBlock {
    public static void main(String[] args) {
        // expression and statement
        int variable1 = 4;

        // block
        {
            int number1 = 10;
            int number2 = number1++;
            System.out.println(number2);
        }

        String msg = "Hello there, " + "\"How are you\"";

        System.out.println(msg);

        
        // string block ot text block
        String msgBlock = """
                Hello there.

                how are you?

                """;

        System.out.println(msgBlock);
    }

}
