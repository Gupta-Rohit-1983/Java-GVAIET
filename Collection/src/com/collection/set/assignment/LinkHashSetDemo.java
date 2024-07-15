package com.collection.set.assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHashSetDemo {

    public static void main(String[] args) {
        
        Set<Movie> moviesSet = new LinkedHashSet<>();
        moviesSet.add(new Movie(1,"Khiladi","Akshay Kumar"));
        moviesSet.add(new Movie(2,"Khiladiyo Ka Khiladi","Akshay Kumar"));
        moviesSet.add(new Movie(3,"Khiladi No. 1","Akshay Kumar"));
        moviesSet.add(new Movie(4,"Khiladi 786","Akshay Kumar"));
        moviesSet.add(new Movie(5,"Dangerous Khiladi","Allu Arjun"));


        moviesSet.forEach(System.out::println);

        // System.out.println(moviesSet.equals(new Movie(3,"Khiladi no. 1","akshay kumar")));

        
    }
}   
