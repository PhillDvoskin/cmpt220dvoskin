package lab8dvoskin;

import java.util.Scanner;

import java.util.Scanner;

public class Problem11_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// prompt the user to enter the three triangle sides
		System.out.print("Enter three side of the triangle: ");
		double side1 = input.nextDouble();		
		double side2 = input.nextDouble();		
		double side3 = input.nextDouble();

		// prompt the user to enter a color
		System.out.print("Enter a color: ");
		String color = input.next();

		// prompt the user to enter whether the triangle is filled
		System.out.print("Is the triangle filled (true / false)? ");
		boolean filled = input.nextBoolean();

		// create a triangle based on the user's inputs
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);
		
		// make the triangle and state all of its properties
		System.out.println(triangle.toString());
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Color: " + triangle.getColor());
		System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ") 
			+ "filled");
	}
}