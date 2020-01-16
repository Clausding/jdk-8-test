package com.ding.io;

import java.util.Date;

/**
 * 打印类的工具方法
 */
public class PrintUtil {

    /**
     * 测试方法
     */
    public static void main(String[] args) {
        demoPrintf();
    }

    /**
     * 打印byte数组
     */
    public static void printBytes(String desc, byte[] bytes, int lineNum) {
        System.out.println(desc + "    length:" + bytes.length);
        for (int i = 0; i < bytes.length; i++) {
            if (i > 0 && i % lineNum == 0) {
                System.out.println();
            }
            //"%02X "中，"X 表示以十六进制形式输出。02 表示不足两位，前面补0输出；出过两位，不影响
            System.out.printf("%02X ", bytes[i]);
        }
    }

    /**
     * printf的各种用法
     */
    public static void demoPrintf() {
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
