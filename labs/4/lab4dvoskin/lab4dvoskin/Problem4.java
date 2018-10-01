package lab4dvoskin;

import java.util.Scanner;

public class Problem4 {
	
	static void charTypeCount(String myString) {
		// make an integer array of size 256
		int intArray[] = new int[256];
		// make a loop to iterate through each character of the array
		for (int i = 0; i < myString.length(); i++) {
			intArray[myString.charAt(i)]++;
		}
		// make a string array that will be the length of myString
		char stringArray[] = new char[myString.length()];
		// make a loop that will pass each character to stringArray
		for (int i = 0; i < myString.length(); i++) {
			stringArray[i] = myString.charAt(i);
			int charCheck = 0;
			// if the character iteration is the same as the element of stringArray then iterate charCheck by 1
			for (int j = 0; j <= i; j++) {
				if (myString.charAt(i) == stringArray[j]) {
					charCheck++;
				}
			}
			// if charCheck is 1 then print out how many times each character appears
			if (charCheck == 1) {
				System.out.println("The character " + myString.charAt(i) + " appears " + intArray[myString.charAt(i)] + " times");
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string of text: ");
		String myString = input.nextLine();
		charTypeCount(myString);
		

	}

}