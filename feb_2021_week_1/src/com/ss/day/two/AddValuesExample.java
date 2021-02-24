/**
 * 
 */
package com.ss.day.two;

import java.util.Scanner;

/**
 * @author Jobe Samuel
 *
 */
public class AddValuesExample {

	/**
	 * Take multiple values from the command line and show the result of adding all
	 * of them.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Double sum = 0.0;
		
		Scanner scan = new Scanner(System.in);
		
		// Numbers must be separated by single space
		System.out.print("Enter values separated by space: ");
		String input = scan.nextLine();
		
		String[] values = input.split(" ");
		
		// Add values to sum
		try {
			for (String v : values) {
				sum += Double.parseDouble(v);
			}
			System.out.println("Sum: " + sum);
		} catch (NumberFormatException e) {
			System.out.println("Invalid Input");
		}
		
		scan.close();
	}
}
