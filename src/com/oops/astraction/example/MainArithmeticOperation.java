package com.oops.astraction.example;

public class MainArithmeticOperation {

   public static void main(String[] args) {
    
   //  ArithmeticOperation add = new Addition();
   //  add.operation(10, 20);

   //  ArithmeticOperation sub = new Substraction();
   //  sub.operation(20, 10);
    
   //  ArithmeticOperation multi = new Multiplication();
   //  multi.operation(2, 5);

   //  ArithmeticOperation div = new Division();
   //  div.operation(10, 2);

   //  ArithmeticOperation mod = new Modulo();
   //  mod.operation(50, 2);


   //  Anomynous Class Example(Invoking the counstructor of Abstract Class)
    ArithmeticOperation add = new ArithmeticOperation() {
      @Override
      public void operation(int a, int b){
         System.out.println(a+b);
      }
    };

    ArithmeticOperation sub = new ArithmeticOperation() {
      @Override 
      public void operation(int a, int b){
         System.out.println(a-b);
      }
    };

    ArithmeticOperation multi = new ArithmeticOperation() {
      @Override 
      public void operation(int a, int b){
         System.out.println(a*b);
      }
    };

    add.operation(10, 20);
    sub.operation(20, 10);
    multi.operation(2, 5);

    
    
   }

}
