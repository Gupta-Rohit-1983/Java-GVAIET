package com.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeApiDemo {

    public static void main(String[] args) {
        
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalTime timeNow = LocalTime.parse("01:30:40");
        System.out.println(timeNow);

        System.out.println(timeNow.minus(10,ChronoUnit.HOURS));

        LocalTime localTime = LocalTime.of(02, 30);
        boolean isAfter = localTime.isAfter(LocalTime.parse("22:00"));
        boolean isBefore = localTime.isBefore(LocalTime.parse("22:00"));

        System.out.println(isAfter);
        System.out.println(isBefore);

        LocalDateTime timeStamp = LocalDateTime.now();
        System.out.println(timeStamp);

        Period p = Period.between(LocalDate.now(), today);
        System.out.println(p);
        
    }
}
