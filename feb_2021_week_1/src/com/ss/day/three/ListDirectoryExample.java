package com.ss.day.three;

import java.io.File;
import java.util.Scanner;

/**
 * @author Jobe Samuel
 *
 */
public class ListDirectoryExample {

	/**
	 * Get a list of all file/directory names under a given directory.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Get path to file
		System.out.print("File path: ");
		String path = scan.nextLine().trim();

		scan.close();

		// Directory from given path
		File directory = new File(path);

		// If directory does not exist or if file is not a directory prompt user.
		if (!directory.exists()) {
			System.out.println("Directory does not exist.");
		} else if (!directory.isDirectory()) {
			System.out.println("Is not a directory");
		} else {
			printFileNames(directory);
		}
	}

	/**
	 * Print out files/directory names. Recursive to print out sub directories.
	 * 
	 * @param files
	 */
	public static void printFileNames(File file) {
		// Print file name
		System.out.println(file.getName());
		
		// If file is a directory print contents
		if (file.isDirectory()) {
			// List files in directory
			File[] directory = file.listFiles();
			// If file is not empty print file names
			if (directory != null) {
				for (File f : directory) {
					// Rerun method to print contents of a directory
					if (f.isDirectory()) {
						printFileNames(f);
					} else {
						// Print name of the file
						System.out.println(f.getName());
					}
				}
			}
		} 
	}
}
