package lab2dvoskin;

import java.util.Scanner;
import java.util.Random;

public class Problem3 {
	public static void main(String[] args) {
		// ask the user to input 2 numbers
		System.out.println("Enter 2 numbers: ");
		Scanner input = new Scanner(System.in);
		// have the 1st number the user entered by a integer for lower range and 2nd number an integer
		// for upper range
		int min = input.nextInt();
		int max = input.nextInt();
		// define a variable to generate random numbers
		Random num = new Random();
		// print out three random numbers from range with minimum min and maxmimum max
		System.out.println(new Random().nextInt(max) + min);
		System.out.println(new Random().nextInt(max) + min);
		System.out.println(new Random().nextInt(max) + min);

		
	}

}
