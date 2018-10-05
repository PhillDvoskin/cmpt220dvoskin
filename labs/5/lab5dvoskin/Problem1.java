package lab5dvoskin;

import java.util.Scanner;
import java.util.Arrays;

public class Problem1 {
	
	public static double max(double[] array) {
		// max is set to the value of the first element of the array
		double max = array[0];
		// iterates through an array
		for (int j = 0; j < array.length; j++) {
			// if a number is greater than max, that value is passed to the max double
			if (array[j] > max) {
				max = array[j];
			}
		}
		// returns the maximum double in the array
		return max;
		
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// prompt the user to enter 10 numbers separated with spaces
		System.out.print("Enter 10 numbers separated with spaces: ");
		// makes a string array that holds all the numbers the user input
		String myInput = input.nextLine();
		// makes an double array that holds x elements where x is the size of the string array
		String[] firstInput = myInput.split(" ");
		// iterates through the double array and fills it in with the doubles from the string array
		double[] doubleArray = new double[firstInput.length];
		for (int i = 0; i < firstInput.length; i++) {
			doubleArray[i] = Double.parseDouble(firstInput[i]);
		}
		System.out.println("This is the maximum double: " + max(doubleArray));
	}

}
