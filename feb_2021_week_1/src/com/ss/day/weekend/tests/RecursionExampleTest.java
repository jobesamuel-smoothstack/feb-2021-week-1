package com.ss.day.weekend.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ss.day.weekend.RecursionExample;

public class RecursionExampleTest {

	RecursionExample example = new RecursionExample();

	@Test
	public void testGroupSumClumpTrue() {
		Integer[] nums = {1,2,4,8,1};
		assertTrue(example.groupSumClump(0,nums ,14));
	}
	
	@Test
	public void testGroupSumClumpFalse() {
		Integer[] nums = {1,2,4,8,1};
		assertFalse(example.groupSumClump(0,nums ,30));
	}
	
	
}
