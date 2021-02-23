/**
 * 
 */
package com.ss.day1;

/**
 * @author Jobe Samuel
 *
 */
public class Pattern {

	/**
	 * Week 1 Assignment 1 - Print patterns from slide
	 * @param args
	 */
	public static void main(String[] args) {
		// Number of rows in all patterns
		int rows = 4;
		
		// Pattern #1
		System.out.println("1)");
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Pattern #2
		System.out.println("2)");
		for (int i = rows; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Pattern #3
		// Used for creating space 
		int forwardSpace = rows - 1;
		System.out.println("3)");
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= forwardSpace; j++) {
				System.out.print(" ");
			}
			forwardSpace--;
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Pattern #4
		int backwardSpace = 0;
		System.out.println("4)");
		for (int i = rows; i >= 1; i--) {
			for (int j = 1; j <= backwardSpace; j++) {
				System.out.print(" ");
			}
			backwardSpace++;
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
