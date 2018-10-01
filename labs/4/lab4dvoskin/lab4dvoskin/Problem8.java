package lab4dvoskin;

import java.util.Arrays;
import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		// prompts the user to input a string of numbers with spaces between them and ending with 0
		Scanner input = new Scanner(System.in);
		System.out.println("Enter positive real numbers ending with 0: ");
		String myInput = input.nextLine();
		// splits up the numbers every time a space is encountered and make a string array
		String[] stringArray = myInput.split(" ");
		// make an integer array that holds 1 less than how many values the user entered. It is one less
		// because the last input is 0 and shouldn't count
		int[] intArray = new int[stringArray.length - 1];
		// makes a for loop that goes up to 1 less than length because of the 0
		for (int i = 0; i < stringArray.length - 1; i++) {
			// converts all the string numbers into integer numbers within the array stringArray
			intArray[i] = Integer.parseInt(stringArray[i]);
		}
		// sorts the numbers from smallest to largest
		Arrays.sort(intArray);
		System.out.print(Arrays.toString(intArray));
		

	}

}
