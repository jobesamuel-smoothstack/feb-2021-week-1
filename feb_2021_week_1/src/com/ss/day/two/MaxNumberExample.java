/**
 * 
 */
package com.ss.day.two;

/**
 * @author Jobe Samuel
 *
 */
public class MaxNumberExample {

	/**
	 * Construct a 2D array and find the max number and show it’s position in an
	 * array
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Example 2D Array
		int[][] numbers = { { 16, 2 }, { 17, 6 }, { 3, 14 }, { 9, 4 } };

		// Initialize max values with the first element of the array
		int max = numbers[0][0], maxRow = 0, maxColumn = 0;

		// Iterate through array to find max value
		for (int row = 0; row < numbers.length; row++) {
			for (int column = 0; column < numbers[row].length; column++) {
				// Update max values
				if (numbers[row][column] > max) {
					max = numbers[row][column];
					maxRow = row;
					maxColumn = column;
				}
			}
		}
		System.out.println("Max Value: " + max);
		System.out.println("Position: [" + maxRow + "][" + maxColumn + "]");
	}

}
