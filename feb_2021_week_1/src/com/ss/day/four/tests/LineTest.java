package com.ss.day.four.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ss.day.four.Line;

/**
 * @author Jobe Samuel
 *
 */
public class LineTest {

	@Test
	public void getSlopeTest() {
		// Test Slope
		assertEquals(1.0, new Line(0, 0, 2, 2).getSlope(), .0001);
		// Not Equals
		assertNotEquals(2.0, new Line(0, 0, 2, 2).getSlope(), .0001);
	}
	
	// Test ArithmeticException when dividing by zero in get slope
	@Test(expected = ArithmeticException.class)
	public void testArithmeticExceptionGetSlope() {
		Line line = new Line(0, 0, 0, 0);
		line.getSlope();
	}

	@Test
	public void getDistanceTest() {
		// Test Distance
		assertEquals(2.8284, new Line(0, 0, 2, 2).getDistance(), .0001);
		// Not Equals
		assertNotEquals(2.0, new Line(0, 0, 2, 2).getDistance(), .0001);
	}

	@Test
	public void parallelToTest() {
		Line l1 = new Line(-3, 0, 0, 2);
		Line l2 = new Line(-3, -3, 0, -1);
		// Test Parallel Lines
		assertTrue(l1.parallelTo(l2));
		// Not Equals
		Line l3 = new Line(-3, 1, 0, 2);
		Line l4 = new Line(-3, -3, 0, -1);
		assertFalse(l3.parallelTo(l4));
	}
}
