package lab9dvoskin;

import java.util.*;

public class Problem1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// make an array calling the getArray method
		int[] array = getArray();

		// prompt the user to enter the index of the array
		System.out.print("Enter the index of the array: ");
		try {
			// display the corresponding element value
			System.out.println("The corresponding element value is " + 
				array[input.nextInt()]);
		}
		// if the program would stop to throw an ArrayIndexOutOfBoundsException because the user entered a value that is 
		// not present in the array, catch it and print out of bounds instead
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds.");
		}
	}

	// make an array with 100 random integers
	public static int[] getArray() {
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
		}
		return array;
	}
}