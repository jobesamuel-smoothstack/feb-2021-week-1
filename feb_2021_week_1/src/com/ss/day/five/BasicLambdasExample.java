package com.ss.day.five;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Comparator;

public class BasicLambdasExample {
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		
		// mock data
		String[] words = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };

		// sort by length
		stringBuilder.append("SORT BY LENGTH\n");
		Arrays.sort(words, Comparator.comparingInt(String::length));
		Arrays.asList(words).stream().forEach(word -> stringBuilder.append(word + " "));
		

		// sort by reverse length
		stringBuilder.append("\n\nSORT BY REVERSE LENGTH\n");
		Arrays.sort(words, Comparator.comparingInt(String::length).reversed());
		Arrays.asList(words).stream().forEach(word -> stringBuilder.append(word+ " "));
		

		// sort alphabetically by the first character only
		stringBuilder.append("\n\nSORT ALPHABETICALLY BY FIRST CHAR\n");
		Arrays.sort(words, (word1, word2) -> Character.compare(word1.charAt(0), word2.charAt(0)));
		Arrays.asList(words).stream().forEach(word -> stringBuilder.append(word + " "));


		// strings that contain "e" first, everything else second
		stringBuilder.append("\n\nSTRINGS THAT CONTAIN E\n");
		Arrays.sort(words, (word1, word2) -> {
			// result is a negative integer if word1 has e
			if (word1.contains("e")) {
				return -1;
				// result is positive if word2 has 2
			} else if (word2.contains("e")) {
				return 1;
			}
			// result is a 0 if both do not contain e
			return 0;
		});
		Arrays.asList(words).stream().forEach(word -> stringBuilder.append(word + " "));

		// redo previous with static helper method
		stringBuilder.append("\n\nPREVIOUS METHOD WITH STAIC HELPER\n");
		Arrays.sort(words, (s1, s2) -> Utils.compareContainE(s1, s2));
		Arrays.asList(words).stream().forEach(word -> stringBuilder.append(word + " "));

		// Using Java 8 features write a method that returns a comma separated string
		// based on a given list of integers
		stringBuilder.append("\n\nODD/EVEN INTEGERS\n");
		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		stringBuilder.append(listNumberType(numberList));

		// returns a list of all strings that start with the letter 'a' (lower case) and
		// have exactly 3 letters
		stringBuilder.append("\n\n3 LETTERS OR LESS, STRINGS START WITH 'a'\n");
		List<String> stringList = Arrays.asList("Apple", "and", "Ant", "ant", "add", "Bug", "Insect");
		listStrings(stringList).stream().forEach(s1 -> stringBuilder.append(s1 + " "));
		
		// print out to console
		System.out.println(stringBuilder.toString());
	}

	/**
	 * Using Java 8 features write a method that returns a comma separated string
	 * based on a given list of integers. Each element should be preceded by the
	 * letter 'e' if the number is even, and preceded by the letter 'o' if the
	 * number is odd. For example, if the input list is (3,44), the output should be
	 * 'o3,e44'.
	 * 
	 * @param numberList
	 * @return
	 */
	public static String listNumberType(List<Integer> numberList) {
		StringBuilder output = new StringBuilder();
		numberList.stream().forEach(num -> {
			// odd append 'o'
			if (num % 2 == 0) {
				output.append("e");
			} else {
				output.append("o");
			}
			output.append(num).append(",");
			// even append 'e'
		});
		return output.toString();
	}

	/**
	 * Given a list of Strings, write a method that returns a list of all strings
	 * that start with the letter 'a' (lower case) and have exactly 3 letters. TIP:
	 * Use Java 8 Lambdas and Streams API's.
	 * 
	 * @param list
	 * @return
	 */
	public static List<String> listStrings(List<String> list) {
		List<String> filteredList = list.stream().filter(s1 -> s1.startsWith("a") && s1.length() == 3)
				.collect(Collectors.toList());
		return filteredList;

	}

}