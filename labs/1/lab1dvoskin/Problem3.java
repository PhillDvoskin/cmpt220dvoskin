package lab1dvoskin;
// Import a Scanner
import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		// Allow for the user to input later in the program
		Scanner input = new Scanner(System.in);
		// Print out the statement below
		System.out.print("Enter a value for ounces: ");
		// Define ounces and ask user to input a value for ounces, making the input a double
		double ounces = input.nextDouble();
		/* Print out the conversion of input ounces to grams by multiplying the input by
		 * 28.3495
		 */
		System.out.println(ounces + " ounces is " + (ounces * 28.3495) + " grams");
		
		
	}

}
