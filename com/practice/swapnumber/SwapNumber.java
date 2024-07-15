package com.practice.swapnumber;

public class SwapNumber {

    private int num1;
    private int num2;

    public SwapNumber(){

    }
    public SwapNumber(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNumber(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNumber1(){
        return num1;
    }
    public int getNumber2(){
        return num2;
    }

    public void usingThirdVariable(){
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1+" "+num2);
        
        
        
    }
    
    public void withoutUsingThirdVariable(){
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 -num2;
        System.out.println(num1+" "+num2);
        
        
    }

}
