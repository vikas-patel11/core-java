package com.core_java.java8.DateAndTime;

import javax.swing.text.html.parser.Parser;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class Demo {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println("date : "+ date);

        LocalDate customDate = LocalDate.of(1997, 1, 1);
        System.out.println("customDate : " + customDate);

        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getMonth());


        System.out.println(date.getYear());
        System.out.println(date.getDayOfYear());

        System.out.println(date.minusWeeks(1));

        boolean leapYear = date.isLeapYear();
        System.out.println(leapYear);

        System.out.println(Year.isLeap(2024));

        int year = 2024;
        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println(" leap year.");
        }else {
            System.out.println("Not leap year.");
        }

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String format = LocalDate.now().format(dateTimeFormatter);
        System.out.println(format);


    }
}
