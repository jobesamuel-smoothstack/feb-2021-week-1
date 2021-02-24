package com.ss.day.two;

import java.text.DecimalFormat;

/**
 * @author Jobe Samuel
 *
 */
public class ShapeExample {
	public static void main(String[] args) {
		// Rounding up two decimal places
		DecimalFormat df = new DecimalFormat("0.00");
		
		Circle circle = new Circle(4.2);
		System.out.println("Circle Area: " + df.format(circle.calculateArea()));
		circle.display();
		
		System.out.println("----------------------------------------------------------------------------");
		
		Rectangle rectangle = new Rectangle(4.0, 3.0);
		System.out.println("Rectangle Area: " + df.format(rectangle.calculateArea()));
		rectangle.display();
		
		System.out.println("----------------------------------------------------------------------------");
		
		Triangle triangle = new Triangle(4.0, 2.0);
		System.out.println("Triangle Area: " + df.format(triangle.calculateArea()));
		triangle.display();
		
	}

}
