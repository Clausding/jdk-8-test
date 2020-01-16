package com.ding.collection;

/**
 * @Author: dingya
 * @Description: 文本处理工具类
 * @Date: Created in 9:41 2018/6/7
 */
public class StringUtil {

    /**
     * 测试方法
     */
    public static void main(String[] args) {
        System.out.print(",");
    }

    /**
     * String的批量替换
     */
    public static String replace(String string, CharSequence[] oldStrings, CharSequence[] newStrings) throws Exception {
        int length = oldStrings.length;
        for (int i = 0; i < length; i++) {
            string = string.replace(oldStrings[i], newStrings[i]);
        }
        return string;
    }

    /**
     * 获得start和end之间的字符串
     */
    public static String getString(String string, String start, String end) {
        int startIndex = string.indexOf(start) + start.length();
        int endIndex = string.lastIndexOf(end);
        String result = string.substring(startIndex, endIndex);
        return result;
    }

    /**
     * 获得start之后的字符串
     */
    public static String getString(String string, String start) {
        int startIndex = string.indexOf(start) + start.length();
        return string.substring(startIndex);
    }

    /**
     * 找出string中字符char1的数量
     */
    public static int getCharAmount(String string, char char1) {
        int length = 0;
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == char1) {
                length++;
            }
        }
        return length;
    }
}
