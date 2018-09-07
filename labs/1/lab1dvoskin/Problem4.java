package lab1dvoskin;
// Import a Scanner
import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		// Allow for user to input later in the program
		Scanner input = new Scanner(System.in);
		// Print out the statement below
		System.out.print("Enter a value for m: ");
		// Ask the user to input an integer value for m
		int m = input.nextInt();
		// Define the given value for c
		int c = 299972458;
		// Define the double energy by using m multiplied by c squared
		double energy = m * Math.pow(c, 2);
		// Print out the result of energy
		System.out.println("E is " + energy);
		
		
	}

}
