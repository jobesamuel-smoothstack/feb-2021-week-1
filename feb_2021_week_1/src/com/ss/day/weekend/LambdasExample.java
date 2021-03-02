package com.ss.day.weekend;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LambdasExample {

	public static void main(String[] args) {

		LambdasExample example = new LambdasExample();
		Scanner scan = new Scanner(System.in);
		// number of times to ask for input
		System.out.print("Number of test cases: ");
		try {
			int count = scan.nextInt();

			for (int i = 1; i <= count; i++) {
				System.out.print("Operation: ");
				int selection = scan.nextInt();

				System.out.print("Number: ");
				int num = scan.nextInt();

				// perform operation based on selected number
				switch (selection) {
				case 1:
					if (example.isOdd().perform(num)) {
						System.out.println("ODD");
					} else {
						System.out.println("EVEN");
					}
					break;
				case 2:
					if (example.isPrime().perform(num)) {
						System.out.println("PRIME");
					} else {
						System.out.println("COMPOSITE");
					}
					break;
				case 3:
					if (example.isPalindrome().perform(num)) {
						System.out.println("PALINDROME");
					} else {
						System.out.println("(NOT PALINDROME)");
					}
					break;
				default:
					System.out.println("Invalid Selection");
				}
			}
		} catch (InputMismatchException ime) {
			System.out.println("Invalid Integer");
		}
		scan.close();
	}

	/**
	 * The lambda expression must return if a number is odd or if it is even.
	 * 
	 * @return
	 */
	public PerformOperation isOdd() {
		return (num) -> {
			if (num % 2 == 0) {
				return false;
			}
			return true;

		};

	}

	/**
	 * The lambda expression must return if a number is prime or if it is composite.
	 * 
	 * @return
	 */
	public PerformOperation isPrime() {
		return (num) -> {
			if (num <= 1) {
				return false;
			}

			// check from 2 to n-1
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					return false;
				}
			}

			return true;
		};
	}

	/**
	 * The lambda expression must return if a number is a palindrome or if it is
	 * not.
	 * 
	 * @return
	 */
	public PerformOperation isPalindrome() {
		return (num) -> {
			int reversedNum = 0, remainder, temp;
			temp = num;

			// reverse integer
			while (num > 0) {
				remainder = num % 10;
				reversedNum = reversedNum * 10 + remainder;
				num /= 10;
			}

			// palindrome if original and reversed are equal
			if (temp == reversedNum) {
				return true;
			} else {
				return false;
			}
		};
	}

}
