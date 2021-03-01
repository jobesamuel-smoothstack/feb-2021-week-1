package com.ss.day.weekend;

public class RecursionExample {

	public static void main(String[] args) {
		// mock data
		int[] nums = { 2, 4, 4, 8};

		if (groupSumClump(0, nums, 14)) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
	}

	/**
	 * Given an array of ints, is it possible to choose a group of some of the ints,
	 * such that the group sums to the given target, with this additional
	 * constraint: if there are numbers in the array that are adjacent and the
	 * identical value, they must either all be chosen, or none of them chosen.
	 * 
	 * @param start
	 * @param nums
	 * @param target
	 * @return
	 * 
	 */
	public static boolean groupSumClump(int start, int[] nums, int target) {
		// if we have iterated through the array
		if (start >= nums.length) {
			// a combination of int in the group were found to equal target
			return target == 0;
		}

		// join adjacent values that are equal
		int end = start;

		// counts the number in a group
		while (end < nums.length && nums[end] == nums[start]) {
			end++;
		}

		// the number of adjacent numbers in a group
		int count = end - start;

		// continue iterating with current number
		// multiple current number by the count or number of adjacent values
		if (groupSumClump(end, nums, target - nums[start] * count)) {
			return true;
		}

		// pass end as start to skip adjacent values in nums array
		// continue iterating without current number
		if (groupSumClump(end, nums, target)) {
			return true;
		}

		return false;
	}

}
