package com.ss.day.weekend.tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.ss.day.weekend.FunctionalExample;

public class FunctionalExampleTest {

	FunctionalExample example = new FunctionalExample();

	@Test
	public void testRightDigitTest() {
		List<Integer> nums = Arrays.asList(1, 22, 93);
		List<Integer> expected = Arrays.asList(1, 2, 3);
		assertEquals(expected, example.rightDigit(nums));
	}

	@Test
	public void testDoubling() {
		List<Integer> nums = Arrays.asList(6, 8, 6, 8, -1);
		List<Integer> expected = Arrays.asList(12, 16, 12, 16, -2);
		assertEquals(expected, example.doubling(nums));
	}

	@Test
	public void testVoidNoX() {
		List<String> str = Arrays.asList("xxax", "xbxbx", "xxcx");
		List<String> expected = Arrays.asList("a", "bb", "c");
		assertEquals(expected, example.noX(str));
	}
}
