package io;

import java.util.Date;

public class Printf_Test {
    public static void main(String[] args) {
        System.out.println("---------------------打印字符串---------------------------------------------------------------");
        System.out.printf("%s %s %n","hello", "world");
        System.out.printf("%S %s %n","hello", "world");
        System.out.printf("%2$S %1$s %n","hello", "world");
        System.out.printf("%s %s? %b %n","hello", "world", true);
        System.out.println("----------------------打印数字----------------------------------------------------------------");
        System.out.printf("%s %s %d days %n","hello", "world", 16);
        System.out.printf("%s %s %o days %n","hello", "world", 16);
        System.out.printf("%s %s %x days %n","hello", "world", 16);
        System.out.println("----------------------打印日期----------------------------------------------------------------");
        Date date = new Date();
        System.out.printf("%1$tF %1$tA%n", date);
    }
}