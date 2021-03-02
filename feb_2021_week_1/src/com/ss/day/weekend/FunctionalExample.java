package com.ss.day.weekend;

import java.util.Arrays;
import java.util.List;

public class FunctionalExample {

	public static void main(String[] args) {
		
		FunctionalExample example = new FunctionalExample();
		StringBuilder output = new StringBuilder();
		
		// right digit example
		output.append("RIGHT DIGIT EXAMPLE\n");
		List<Integer> rdList = Arrays.asList(16, 8, 886, 8, 1);
		example.rightDigit(rdList).forEach(num -> output.append(num + " "));

		// double example
		output.append("\n\nDOUBLING EXAMPLE\n");
		List<Integer> dList = Arrays.asList(6, 8, 6, 8, -1);
		example.doubling(dList).forEach(num -> output.append(num + " "));

		// no x example
		output.append("\n\nNO X EXAMPLE\n");
		List<String> nxList = Arrays.asList("xxax", "xbxbx", "xxcx");
		example.noX(nxList).forEach(str -> output.append(str + " "));
		
		// display results
		System.out.println(output.toString());
	}

	/**
	 * Given a list of non-negative integers, return an integer list of the
	 * rightmost digits.
	 * 
	 * @param nums
	 * @return list
	 */
	public List<Integer> rightDigit(List<Integer> nums) {
		nums.replaceAll(n -> n % 10);
		return nums;
	}

	/**
	 * Given a list of integers, return a list where each integer is multiplied by
	 * 2.
	 * 
	 * @param nums
	 * @return list
	 */
	public List<Integer> doubling(List<Integer> nums) {
		nums.replaceAll(n -> n * 2);
		return nums;
	}

	/**
	 * Given a list of strings, return a list where each string has all its "x"
	 * removed.
	 * 
	 * @param strings
	 * @return list
	 */
	public List<String> noX(List<String> strings) {
		strings.replaceAll(s -> {
			return s.replace("x", "");
		});
		return strings;
	}

}
