package com.ss.day.three;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Jobe Samuel
 *
 */
public class CharacterCountExample {

	/**
	 * Counts the number of times a particular character appears in a file.
	 * @param args
	 */
	public static void main(String[] args) {
		// Scanner to read input
		Scanner scan = new Scanner(System.in);
		// Get path to file
		System.out.print("File path: ");
		String path = scan.nextLine().trim();
		// File from path
		File file = new File(path);
		
		// Scanner to read file
		try (Scanner fileScan = new Scanner(file)) {
			// Number of occurrences in file
			int count = 0;

			// Get the character to count
			System.out.print("Enter character: ");
			char checkChar = scan.next().trim().charAt(0);

			// Scan each line of text in file
			while (fileScan.hasNextLine()) {
				String text = fileScan.nextLine();
				// Count the number of times char appears in string
				for (char c : text.toCharArray()) {
					if (c == checkChar) {
						count++;
					}
				}
			}
			System.out.println("Count: " + count);
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
		scan.close();
	}
}
