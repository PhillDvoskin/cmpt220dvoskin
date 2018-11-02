package lab8dvoskin;

import java.util.Scanner;
import java.util.ArrayList;

public class Problem11_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// create an ArrayList of integer
		ArrayList<Integer> list = new ArrayList<Integer>();

		// get 5 numbers from the user
		System.out.print("Enter 5 numbers: ");
		// iterate through each number and add it to the array
		for (int i = 0; i < 5; i++) {
			list.add(input.nextInt());
		}

		// sort the numbers
		sort(list);

		// display in increasing order
		System.out.println(list.toString());
	}

	// sorts the ArrayList of Integers
	public static void sort(ArrayList<Integer> list) {
		java.util.Collections.sort(list);		
	}
}
