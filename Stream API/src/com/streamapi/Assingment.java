package com.streamapi;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Assingment {

    public static void main(String[] args) {

        int[] pinArray = { 421302, 45212, 456123, 147852, 987456, 325689 };

        IntStream pinStream = Arrays.stream(pinArray);

        OptionalInt maxPin = pinStream.max();
        System.out.println(maxPin);
    }

}
