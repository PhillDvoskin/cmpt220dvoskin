package lab4dvoskin;

import java.util.Scanner;

public class MyString {
	
	public static String reverse(String s) {
		// make a blank string called reverse
		String reverse = "";
		// make a loop that will check the each part of the string
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		return reverse;
	}
	// if the string length is not 1 or 0 return true
	public static boolean isPalindrome(String s) {
		if (s.length() == 0 || s.length() == 1) {
			return true;
		}
		// if the first character is 1 less than length return false
		if (s.charAt(0) == s.charAt(s.length() - 1)) 
			return isPalindrome(s.substring(1, s.length() - 1));
			return false;
		
	}
	public static void main(String[] args) {
		// get the user to enter a string
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string to test if it's a palindrome: ");
		// make the user's input a string
		String myString = input.nextLine();
		// call isPalindrome and depending on whether it is or not it returns different outputs
		if (isPalindrome(myString)) {
			System.out.print("It is a palindrome");
		}
		else {
			System.out.print("It is not a palindrome");
		}

	}

}
