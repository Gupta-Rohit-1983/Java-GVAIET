package com.gvacharya.main;

import com.gvacharya.FirstProgram;

public class MainFirstProgram {
    public static void main(String[] args) {
        FirstProgram obj = new FirstProgram(100, 1233455748, "Ola");
        
        // obj.setPrice(100);
        // obj.setBarcode(123456789);
        // obj.setBrandname("Ola");

        System.out.println(obj.getPrice());
        System.out.println(obj.getBarcode());
        System.out.println(obj.getBrandname());
    }
}

