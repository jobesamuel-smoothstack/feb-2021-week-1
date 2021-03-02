package com.ss.day.weekend.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ss.day.weekend.LambdasExample;

public class LambdaExampleTest {
	
	LambdasExample example = new LambdasExample();
	
	@Test
	public void testIsOddTest() {
		int testOdd = 3;
		assertTrue(example.isOdd().perform(testOdd));
	}
	
	@Test
	public void testIsOddTestEven() {
		int testEven = 4;
		assertFalse(example.isOdd().perform(testEven));
	}

	@Test
	public void testIsPrimeTest() {
		int testPrime = 5;
		assertTrue(example.isPrime().perform(testPrime));
	}
	
	@Test
	public void testIsPrimeTestComposite() {
		int testComposite = 4;
		assertFalse(example.isPrime().perform(testComposite));
	}
	
	@Test
	public void testIsPrimeTestZero() {
		int testZeroPrime = 0;
		assertFalse(example.isPrime().perform(testZeroPrime));
		
	}

	@Test
	public void testIsPalindrome() {
		int testPalindrome = 5441445;
		assertTrue(example.isPalindrome().perform(testPalindrome));
	}
	
	@Test
	public void testIsNotPalindrome() {
		int testNotPalindrome = 12345;
		assertFalse(example.isPalindrome().perform(testNotPalindrome));
	}
}
