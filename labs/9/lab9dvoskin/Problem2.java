package lab9dvoskin;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// prompt the user to enter a color
		System.out.print("Enter a color: ");
		String color = input.next();

		// prompt the user to enter whether the triangle is filled
		System.out.print("Is the triangle filled (true / false)? ");
		boolean filled = input.nextBoolean();
		// set variable repeatSidesInput to true to be able to run the code
		boolean repeatSidesInput = true;
		do {
			// prompt the user to enter three sides of the triangle
			System.out.print("Enter three side of the triangle: ");
			double side1 = input.nextDouble();		
			double side2 = input.nextDouble();		
			double side3 = input.nextDouble();
	
			try {
				// using the user's input make a triangle with the given sides
				Triangle triangle = new Triangle(side1, side2, side3);
				// amek sure they don't repeat
				repeatSidesInput = false;	
				// call the setColor and setFilled methods for the user's triangle
				triangle.setColor(color);
				triangle.setFilled(filled);
				// write the area, perimeter, color and whether the triangle is filled or not using strings
				System.out.println(triangle.toString());
				System.out.println("Area: " + triangle.getArea());
				System.out.println("Perimeter: " + triangle.getPerimeter());
				System.out.println("Color: " + triangle.getColor());
				System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ") 
					+ "filled");
			}
			// run the code prior and catch any IllegalTriangleExceptions if any two sides are less than or equal to the
			// third one
			catch (IllegalTriangleException ex) {
				System.out.println(ex.getMessage());
			}
		// do the prior code while sides repeat
		} while (repeatSidesInput);
	}
}

