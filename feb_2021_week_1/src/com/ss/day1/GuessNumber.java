/**
 * 
 */
package com.ss.day1;

import java.util.Scanner;

/**
 * @author Jobe Samuel
 *
 */
public class GuessNumber {

	/**
	 * Week 1 Assignment 2 - User has 5 tries to guess a random number. Answer must
	 * be within 10 numbers plus or minus.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Generate random number 1-100
		int answer = 1 + (int) (Math.random() * 100);
		// Number of tries user has used
		int attempts = 0;

		Scanner scan = new Scanner(System.in);

		boolean correct = false;
		while (!correct) {
			// If the user has guessed wrong 5 times exit and print answer.
			if (attempts == 5) {
				System.out.print("Sorry, Answer: " + answer);
				break;
			}

			// Prompt user to guess a number between 1-100
			System.out.print("Guess number bewtween 1-100: ");
			int guess = scan.nextInt();

			// Guess must be within 1-100 and 10 plus or minus the answer to be correct
			if ((guess <= 100 && guess >= 1) && (guess >= (answer - 10) && guess <= answer + 10)) {
				correct = true;
				System.out.print("Correct! Answer: " + answer);
			} else {
				System.out.println("Incorrect, Guess Again.");
				attempts++;
			}
		}

		scan.close();
	}

}
