package com.wineaccess.ApplicationUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationUtil {

	public static boolean validateContentFormat(String content, String regEx) {

		Pattern pattern = Pattern.compile(regEx);

		Matcher matcher = pattern.matcher(content);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public static boolean validateContent(String content, String regEx) {

		Pattern pattern = Pattern.compile(regEx);

		Matcher matcher = pattern.matcher(content);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public static void main(String args[]) {
		Long value = 1L;
		System.out.println(validateContent("2012-06-06 00:00:00 ", "(19|20)\\d\\d[-](0[1-9]|1[012])[-](0[1-9]|[12][0-9]|3[01]) ([0-6][0-9]:[0-6][0-9]):[0-6][0-9]"));
	}

}
