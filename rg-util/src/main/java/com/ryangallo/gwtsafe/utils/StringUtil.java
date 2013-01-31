package com.ryangallo.gwtsafe.utils;

public class StringUtil {

	private StringUtil() {
	}

	public static boolean isBlank(String str) {
		return str == null || str.trim().length() == 0;
	}

	public static boolean isNotBlank(String str) {
		return !isBlank(str);
	}

}
