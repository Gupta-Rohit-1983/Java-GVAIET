package com.generic.number;

import java.util.Optional;

public class MainNumber {

    public static void main(String[] args) {
        NumberBox<Integer> intBox = new NumberBox<>();

        intBox.setTArray(10,20,30,40);
        intBox.getStream().sorted().forEach(System.out::println);

        NumberBox<Float> floatBox = new NumberBox<>();

        Float[] floatArray = {12.1f,124f,12.25f,22.5f};
        floatBox.setTArray(floatArray);

        Optional<Float> max =floatBox.getStream().max(Float::compare);

        if (!max.isEmpty()) {
            System.out.println(max.get());
        }
    }
}
