package lab5dvoskin;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// prompt the user to enter the size of the array
		System.out.println("Enter the size of the array: ");
		// make an integer size that is the user's input
		int size = input.nextInt();
		
		// make a 2d array called oArray where each row and column is equal to size
		int oArray[][] = new int[size][size];
		System.out.println("Enter the matrix: ");
		// iterates through the rows of the array
		for (int i = 0; i < size; i++) {
			// iterates through the columns of the array
			for (int j = 0; j < size; j++) {
				// fills it in with the user's inputs
				oArray[i][j] = input.nextInt();
				// prints a blank line
				System.out.println("");
			}
		}
		// displays the matrix of the array
		System.out.println("The transpose of the maxtrix");
		// iterates through the rows
		for (int i = 0; i < size; i++) {
			// iterates through the columns
			for (int j = 0; j < size; j++) {
				// prints out spaces for the array and the array
				System.out.print(oArray[i][j] + " ");
			}
			System.out.println(" ");
		}
		// switches the rows and columns of the original array
		System.out.println("is: ");
		// iterates through the rows
		for (int i = 0; i < size; i++) {
			// iterates through the columns
			for (int j = 0; j < size; j++) {
				// prints out the array and spaces
				System.out.print(oArray[j][i] + " ");
			}
			System.out.println(" ");
		}
		
	}

}
