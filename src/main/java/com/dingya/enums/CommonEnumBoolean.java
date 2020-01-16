package com.dingya.enums;

/**
 * 布尔值枚举
 */
public enum CommonEnumBoolean {
	// 枚举
	TRUE(true, 1, "是"),
	FALSE(false, 0, "否");
	// 成员变量
	private int code;
	private boolean value;
	private String message;
	/**
     * 构造方法
	 */
	private CommonEnumBoolean(boolean value, int code, String message) {
		this.value = value;
		this.code = code;
		this.message = message;
	}
	// get方法
	public int getCode() {
		return code;
	}
	public boolean isValue() {
		return value;
	}
	public String getMessage() {
		return message;
	}
}
