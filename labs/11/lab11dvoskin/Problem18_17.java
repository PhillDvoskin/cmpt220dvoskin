package lab11dvoskin;

import java.util.Scanner;

public class Problem18_17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// prompt the user to enter a list of characters
		System.out.print("Enter a list of characters in one line: ");
		String str = input.nextLine();
		// make a character array that takes the elements from str
		char[] chars = new char[str.length() - 1];
		// sort through the characters and assign them values 
		for (int i = 0; i < chars.length; i++)
			chars[i] = str.charAt(i);
		// assign the the character ch the values at charAt the length of str
		char ch = str.charAt(str.length() - 1);

		// display the number of occurrences of ch and print out how many times it occurs
		System.out.println("The character \"" + ch + "\" occurs " 
			+ count(chars, ch) + " times in the list \"" + 
			str.substring(0, str.length() - 1) + "\".");
	}

	
	// method that counts the occurrences of a specified string in an array
	public static int count(char[] chars, char ch) {
		return count(chars, ch, chars.length - 1);
	}

	// recursive helper method
	public static int count(char[] chars, char ch, int high) {
		// if high is less than 0 then return 0
		if (high < 0) // Base case
			return 0;
		// else if the high element of array chars is the same as ch, return 1 plus count with chars, ch, high minus 1
		else if (chars[high] == ch) 
			return 1 + count(chars, ch, high - 1);
		else
			// else return count, chars, ch, high minus 1
			return count(chars, ch, high - 1);
	}
}