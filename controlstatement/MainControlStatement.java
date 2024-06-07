package com.controlstatement;

import java.util.Scanner;

public class MainControlStatement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter Your First Variable :");
        int variable1 = s.nextInt();
        System.out.println("Enter Your Second Variable :");
        int variable2 = s.nextInt();

        ControlStatement condition = new ControlStatement(variable1 > variable2);
        condition.conditionIf();

        System.out.println("Result :"+condition.testIfElseLadder(90));
        

    }

}
