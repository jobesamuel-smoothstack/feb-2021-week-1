package com.ss.day.three;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * @author Jobe Samuel
 */
public class AppendTextExample {

	/**
	 * Append text to an existing file.
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			// Get path to file
			Scanner scan = new Scanner(System.in);

			System.out.print("File path: ");
			String path = scan.nextLine().trim();

			File file = new File(path);
			
			// Check if a file exists in path
			if (file.exists()) {
				// Set to true to not overwrite file text
				FileWriter fileWriter = new FileWriter(path, true);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				// Get text to append to file
				System.out.print("Enter Text: ");
				// Write text to file
				bufferedWriter.write(scan.nextLine());

				System.out.println("Successfully wrote to file.");

				bufferedWriter.close();
			} else {
				System.out.println("File does not exist.");
			}
			
			scan.close();
			
		} catch (Exception e) {
			System.out.println("Something went wrong.");
			e.printStackTrace();
		}
	}
}
