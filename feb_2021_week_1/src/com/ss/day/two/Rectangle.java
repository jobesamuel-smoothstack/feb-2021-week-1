package com.ss.day.two;

/**
 * @author Jobe Samuel
 *
 */
public class Rectangle implements Shape {

	private Double length = 0.0;
	private Double width = 0.0;

	public Rectangle(Double length, Double width) {
		this.length = length;
		this.width = width;
	}

	/**
	 * @return area or rectangle
	 */
	@Override
	public Double calculateArea() {
		return this.length * this.width;
	}

	@Override
	public void display() {
		System.out.println("This is a rectangle.");
	}

	/**
	 * @return the length
	 */
	public Double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(Double length) {
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public Double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(Double width) {
		this.width = width;
	}

}
