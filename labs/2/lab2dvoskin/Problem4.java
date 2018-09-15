package lab2dvoskin;

import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		// ask the user to input 2 characters
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first character: ");
		System.out.println("Enter second character: ");
		// store the user's next input of string in the string variable s1
		String s1 = input.next();
		// make a character variable input1 that will take the user's input and convert the string to a 
		// character
		char input1 = s1.charAt(0);
		// make an integer varaible called input1int that will convert the character input1 to an integer
		int  input1int= (int) input1;
		// everything below is the same as above except that it is for the other input so instead of 1
		// now everything is replaced by 2
		String s2 = input.next();
		char input2 = s2.charAt(0);
		int input2int = (int) input2;
		// print out the result of the 2 user inputs as integers
		System.out.println("Result is: " + (input1int + input2int));
		
		
		
	}

}
