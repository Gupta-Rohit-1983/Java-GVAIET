package com.exceptions;

// import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ExceptionExample {


    public static void main(String[] args) {
        //  try {
        //     int number = 10/0;

        //     System.out.println("After line number : 10+");
        //  } catch (ArithmeticException e) {
        //     System.out.println(e);
        //     // TODO: handle exception

        //  }

        //  System.out.println("Hello World!");
        // try {
        //     division(10, 0);
        // } catch (ArithmeticException e) {
        //     System.out.println(e);// TODO: handle exception
        // }

        try {
            getDate("18.06.2024");
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            System.out.println(e);
        }

        // division(10, 0);

        System.out.println("Hii");

        int[] intArray = {1,2};
        IntStream intStream = null;

        try {
            intStream = Arrays.stream(intArray);
            intStream.sorted().forEach(str -> System.out.println(str));
        } catch (Exception e) {
            // System.out.println(e);
            e.printStackTrace();
            // TODO: handle exception
        }finally{
            intStream.close();
        }
    }

    public static void division(int number1,int number2){
        System.out.println(number1/number2);
    }

    public static java.util.Date getDate(String dateString) throws ParseException{
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yy");
        return  dateFormat.parse(dateString);
    }
}
