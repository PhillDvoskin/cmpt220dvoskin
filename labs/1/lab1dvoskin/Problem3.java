package lab1dvoskin;

import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a value for ounces: ");
		double ounces = input.nextDouble();
		
		System.out.println(ounces + " ounces is " + (ounces * 28.3495) + " grams");
		
		
	}

}
