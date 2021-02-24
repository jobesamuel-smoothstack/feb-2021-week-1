/**
 * 
 */
package com.ss.day.two;

/**
 * @author Jobe Samuel
 *
 */
public class Triangle implements Shape {
	private Double base = 0.0;
	private Double height = 0.0;

	public Triangle(Double base, Double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public Double calculateArea() {
		return (this.height * this.base) * 0.5;
	}

	@Override
	public void display() {
		System.out.println("This is a triangle.");
	}

	/**
	 * @return the base
	 */
	public Double getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(Double base) {
		this.base = base;
	}

	/**
	 * @return the height
	 */
	public Double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(Double height) {
		this.height = height;
	}

}
