package com.wrapperclasses;

public class WrapperClassesExample {

    public static void main(String[] args) {
        Integer number = Integer.valueOf(10);

        StringBuilder strValue = new StringBuilder(number.toString());
        System.out.println(strValue.reverse());
        


    }



}
