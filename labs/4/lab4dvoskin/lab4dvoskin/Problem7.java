package lab4dvoskin;

import java.util.Arrays;
import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// have the user enter how many elements the array will have
		Scanner input = new Scanner(System.in);
		System.out.print("Enter how many elements the array will have: ");
		int arrayLength = input.nextInt();
		// make an integer array of size arrayLength
		int[] inputArray = new int[arrayLength];
		System.out.println("Enter each array element: ");
		for (int i = 0; i < arrayLength; i++) {
			// iterate through each element and add it inputArray
			inputArray[i] = input.nextInt();
		}
		// sort each element from smallest to biggest
		Arrays.sort(inputArray);
		System.out.println("Here is your array: " + Arrays.toString(inputArray));
		
		int noDupe = inputArray[0];
		boolean dupe = false;
		// check to see if any numbers are duplicates and remove them
		for (int i = 0; i < inputArray.length; i++) {
			if (noDupe == inputArray[i] && !dupe) {
				dupe = true;
				System.out.print(noDupe + " ");
			}
			// if the elements are not duplicates print the array out
			else if (noDupe != inputArray[i]) {
				noDupe = inputArray[i];
				System.out.print(noDupe + " ");
			}
		}

	}

}
