package lab2dvoskin;

import java.util.Random;
import java.util.Scanner;

public class Problem6 {
	// make a function that will print out a random integer 0-9 every time it is called
	public static int getNumber(int a) {
		// define the minimum number allowed to be randomly called as 2
		int min = 0;
		// define the maximum number allowed to be randomly called as 9
		int max = 9;
		// print out a random number from 2-9
		System.out.print(new Random().nextInt(max - 1) + min);
		
		return a;
		
	}
	// make a function that will print out a random number 2-9 every time it is called
	public static int getStartingNumber(int b) {
		// define the minimum start number as 2
		int minStart = 2;
		// define the maximum start number as 9
		int maxStart = 9;
		// print out a random number from 2-9
		System.out.print(new Random().nextInt(maxStart - 1) + minStart);
		
		return b;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/* print out the opening parentheses and then call the getNumber function to get three numbers
		 * print out the closing parentheses, followed by calling the getNumber function an additional
		 * 3 times. print out a dash and call the getNumber function three more times
		 */
		System.out.print("Following these words a random phone number will be generated: ");
		System.out.print("(");
		getStartingNumber(0);
		getNumber(0);
		getNumber(0);
		System.out.print(")");
		getNumber(0);
		getNumber(0);
		getNumber(0);
		System.out.print("-");
		getNumber(0);
		getNumber(0);
		getNumber(0);
		// define the int min and int max and then use problem 3 to get random numbers and use 
		// while numbers are less than str.length then keep printing
		
	}

}
