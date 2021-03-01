package com.ss.day.five;

public class Utils {
	public static int compareContainE(Object s1, Object s2) {
		if (((String) s1).contains("e")) {
			return -1; // result is a negative integer if word1 has e
		} else if (((String) s2).contains("e")) {
			return 1; // result is positive if word2 has 2
		}
		return 0; // result is a 0 if both do not contain e
	};
}
