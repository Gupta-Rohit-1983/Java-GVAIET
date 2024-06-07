package com.oops.overloading;

public class Geometry {
    public void area(int height, int width){
        System.out.println("Area of Rectangle :"+(height*width));

    }

    public void area(int side){
        System.out.println("Area of Square is : "+(side*side));

    }

    public void area(float radius){
        System.out.println("Area of Circle is :"+(3.142*radius*radius));

    }

    

}
