package lab11dvoskin;

import java.util.Scanner;

public class Problem18_13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// prompt the user to enter 8 integers
		System.out.print("Enter eight integers: ");
		// create an array called list that holds 8 integers 
		int[] list = new int[8];
		// make each of the user's integers elements of the array
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
		}

		// display the largest element in the array
		System.out.println("The largest element is " + max(list));
	}

	// method that takes the parameter of an integer list and sorts through it to get the maximum number
	public static int max(int[] list) {
		// make an integer for max that is the element in list that is 1 less than list length since the list starts with element 0
		int max = list[list.length - 1]; 
		// make an integer index for index that is 1 less than list length
		int index = list.length - 1; 
		// return the list, index and max
		return max(list, index, max);
	}

	// overload the method with parameters
	private static int max(int[] list, int index, int max) {
		// if index is less than 0 it should return max
		if (index < 0) 
			return max;
		// else if the index in list is greater than max, then return the list, index minus 1 and the element of index in the list
		else if (list[index] > max) { 
			return max(list, index - 1, list[index]); 
		}
		// otherwise return list, index minus 1 and the max that was already present
		else
			return max(list, index - 1, max); 
		}
}