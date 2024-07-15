package com.streamapi;

import java.util.Arrays;
// import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.streamapi.entity.Student;

public class App {

    public static void main(String[] args) {
        // int[] intArray = { 1, 5, 6, 4, 8, 52, 5, 4 };

        // IntStream intStream = Arrays.stream(intArray);

        // intStream.filter(no -> no % 2 == 0).filter(num -> num > 5).forEach(no ->
        // System.out.println(no));

        // System.out.println(intStream);

        Student[] arrayStudents = new Student[5];

        arrayStudents[0] = new Student(1, "Rohan", 20);
        arrayStudents[1] = new Student(2, "Krishna", 24);
        arrayStudents[2] = new Student(3, "Jatin", 22);
        arrayStudents[3] = new Student(4, "Rohit", 24);
        arrayStudents[4] = new Student(5, "Kunal", 22);

        Stream<Student> studenStream = Arrays.stream(arrayStudents);

        // studenStream.map(e -> e.getName()).filter(name ->
        // name.startsWith("R")).forEach(str -> System.out.println(str));

        Stream<Student> rollStream = Arrays.stream(arrayStudents);

        rollStream.map(r -> r.getRollNo()).filter(roll -> roll % 2 == 0).forEach(num -> System.out.println(num));

        studenStream.filter(obj-> {return (obj.getRollNo()%2==0);}).forEach(str -> System.out.println(str));
        studenStream.close();

        Stream<Student> disticStream = Arrays.stream(arrayStudents);
        disticStream.map(obj -> obj.getAge()).distinct().forEach(System.out::println);
        disticStream.close();

        



    }

}
