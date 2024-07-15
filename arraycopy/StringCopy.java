package com.arraycopy;

import java.util.Arrays;

public class StringCopy {

    public static String[] stringCopy(String[] souce, char target){

        int count=0;
        
        for (int i = 0; i < souce.length; i++) {
            if (souce[i].charAt(0) == target) {
                count++;
            }
        }

        String[] destination = new String[count];

        int j= 0;
        for (int i = 0; i < destination.length; i++) {
            if (souce[i].charAt(0) == target) {
                destination[j] = souce[i];
                j++;
            }
        }

        return destination;

    }

    public static void main(String[] args) {
        
        String[] name = {"Jatin","Jhatu","Rohit","Kunal"};

        String[] destination = stringCopy(name, 'J');

        System.out.println(Arrays.toString(destination));
    }




}
