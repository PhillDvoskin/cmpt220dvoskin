package lab11dvoskin;

import java.util.Scanner;

public class Problem18_15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// prompt the user to enter a string, a space and then a character
		System.out.print("Enter a string and a character: ");
		// make a string array that holds the user's input split up with spaces
		String[] str = input.nextLine().split("[ ]");

		// display the number of times the character appears in the string
		System.out.println("The character \'" + str[1] + "\' occurs " +
			count(str[0], str[1].charAt(0)) + " times in \"" + str[0] + "\".");
	}

	// a method that takes the parameters string and character and returns the string, character and then string length minus 1
	public static int count(String str, char a) {
		return count(str, a, str.length() - 1);
	}

	// helper string that uses the high index
	private static int count(String str, char a, int high) {
		// if the high is less than 0 then return 0
		if (high < 0) 
			return 0;
		// else if the character at the high point is the same as character the user entered then return 1 plus the count of string, character and 
		else if (str.charAt(high) ==  a) {
			return 1 + count(str, a, high - 1); 
		}
		else
			// return count with paramters string, character and high minus 1
			return count(str, a, high - 1); 
	}
}