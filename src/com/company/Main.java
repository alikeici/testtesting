package com.company;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        LocalDateTime b = LocalDateTime.parse("2015-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));
        System.out.println(b.getHour());

    }
}
