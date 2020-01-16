package com.ding.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * JDK8重新设计了日期、时间相关的类。优化了之前很差的设计。
 */
public class Runner {
    public static void main(String args[]){
        // 日期和时间
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.printf("日期和时间：%s%n", dateTime);
        // 日期
        LocalDate date = dateTime.toLocalDate();
        System.out.printf("日期：%s%n", date);
        // 时间
        LocalTime time = dateTime.toLocalTime();
        System.out.printf("时间：%s%n", time);
    }
}
