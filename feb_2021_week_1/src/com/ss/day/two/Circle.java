package com.ss.day.two;

/**
 * @author Jobe Samuel
 *
 */
public class Circle implements Shape {
	
	private Double radius = 0.0;
	
	public Circle(Double radius) {
		this.radius = radius;
	}
	
	/**
	 * @return area or circle
	 */
	@Override
	public Double calculateArea() {
		return 2 * Math.PI * this.radius;
	}

	@Override
	public void display() {
		System.out.println("This is a circle.");
		
	}
	
	/**
	 * @return the radius
	 */
	public Double getRadius() {
		return radius;
	}
	/**
	 * @param radius the radius to set
	 */
	public void setRadius(Double radius) {
		this.radius = radius;
	}
	

}
