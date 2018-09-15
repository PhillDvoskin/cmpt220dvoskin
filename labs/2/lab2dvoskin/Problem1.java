package lab2dvoskin;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		// have the user input a number
		System.out.print("Enter 2 numbers: ");
		Scanner input = new Scanner(System.in);
		// make the two next numbers the user enters integers and call them num1 and num2
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		// return whether num1 is less than num2
		System.out.println(num1 + " is LESS THAN " + num2 + "? " + (num1 < num2));
		// return whether num1 is less than or equal to num2
		System.out.println(num1 + " is LESS THAN OR EQUAL TO " + num2 + "? " + (num1 <= num2));
		// return whether num1 is equal num2 
		System.out.println(num1 + " is EQUAL TO " + num2 + "? " + (num1 == num2));
		// return whether num1 is not equal to num2
		System.out.println(num1 + " is NOT EQUAL TO " + num2 + "? " + (num1 != num2));
		// return whether num1 is greater than num2
		System.out.println(num1 + " is GREATER THAN " + num2 + "? " + (num1 > num2));
		// return whether num1 is greater than or equal to num2
		System.out.println(num1 + " is GREATER THAN OR EQUAL TO " + num2 + "? " + (num1 >= num2));
	}

}
