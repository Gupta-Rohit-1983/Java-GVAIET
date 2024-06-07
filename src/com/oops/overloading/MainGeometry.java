package com.oops.overloading;

public class MainGeometry {

    public static void main(String[] args) {
        Geometry rectangle = new Geometry();
        rectangle.area(10,20);

        Geometry circle =  new Geometry();
        circle.area(2.5f);

        Geometry square  =new Geometry();
        square.area(5);
    }

}
