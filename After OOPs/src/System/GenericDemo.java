package System;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {

    public static void main(String[] args) {
        
        List<Integer> intList = new ArrayList<>();
        ObjectBox<Integer> intBox = new ObjectBox<Integer>();

        boolean result = intBox.addElement(10);
        // boolean result1 = intBox.addElement(20);
        // boolean result2 = intBox.addElement(30);

        System.out.println(result);

        System.out.println(intList);

        List<String> stringsList = new ArrayList<>();
        // ObjectBox<String> stringBox = new ObjectBox<String>();

        // boolean result3 = stringBox.addElement("Abc");
        System.out.println(stringsList);

        ObjectBox<Student> studentBox = new ObjectBox<Student>();

       studentBox.setZlist(new ArrayList<>());

       studentBox.addElement(new Student(1, "Rohit"));


    }
}
