package lab2dvoskin;

import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {
		// ask the user to input 2 words or strings 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word: ");
		System.out.println("Enter a word: ");
		// name a variable string1 that takes the next user input and makes it a string
		String string1 = input.next();
		// name a variable string2 that takes the next user input and makes it a string
		String string2 = input.next();
		/* make an if else if else statement with the following conditions. If string1 comes first in the 
		 * alphabet then the program prints that string1 comes first. If string2 comes first then the 
		 * program prints that string2 comes first. Finally if the 2 strings are identical, the program
		 * will print out that the strings are identical
		 */
		if (string1.compareTo(string2) < 0)
			System.out.println("Out of " + string1 + " and " + string2 + ", " + string1 + " comes first" +
			" in the lexicographical order");
		else if (string1.compareTo(string2) > 0)
				System.out.println("Out of " + string1 + " and " + string2 + ", " + string2 + " comes first"
				+ " in the lexicographical order");
		else 
			System.out.println("Both of the strings are identical");
	}
}
