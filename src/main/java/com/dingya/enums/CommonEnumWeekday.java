package com.dingya.enums;

/**
 * 一周枚举
 */
public enum CommonEnumWeekday {
    // 枚举
    SUN(0, "星期天"),
    MON(1, "星期一"),
    TUE(2, "星期二"),
    WEN(3, "星期三"),
    THUR(4, "星期四"),
    FRI(5, "星期五"),
    SAT(6, "星期六");
    // 成员变量
    private int code;
    private String message;
    /**
     * 构造方法
     */
    private CommonEnumWeekday(int code, String message) {
        this.code = code;
        this.message = message;
    }
    // get方法
    public int getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }
}