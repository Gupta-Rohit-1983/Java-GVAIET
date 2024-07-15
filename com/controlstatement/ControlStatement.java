package com.controlstatement;

public class ControlStatement {
    private boolean expression1;
    

    public ControlStatement(){

    }

    public ControlStatement(boolean expression1){
        this.expression1 = expression1;
    }
    
    public void setExpression(boolean expression1){
        this.expression1 = expression1;  
    }

    public boolean getExpression1(){
        return expression1;
    }

    public void conditionIf(){
        if (expression1) {
            System.out.println("Variable 1 is Greater than Variable 2");
        }
        
        else{
            System.out.println("Variable 2 is Greater than Variable 1");
        }
    }

    public char testIfElseLadder(int marks){
        if (marks >= 90) {
            return 'A';
        }
        else if (marks >= 80) {
            return 'B';
        }
        else if (marks >70) {
            return 'c';
        }
        else if (marks >= 60) {
            return 'D';
        }
        else if (marks >=50) {
            return 'E';
        }
        else {
            return 'F';
        }
    }
    

}
