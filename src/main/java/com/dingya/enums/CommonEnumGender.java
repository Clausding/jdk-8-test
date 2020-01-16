package com.dingya.enums;

/**
 * 性别枚举
 */
public enum CommonEnumGender {
	// 枚举
	FEMALE(0, "女"),
	MALE (1, "男");
	// 成员变量
	private int code;
	private String message;
	/**
     * 构造方法
	 */
	private CommonEnumGender(int code, String message) {
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
