package lab11dvoskin;

import java.util.Scanner;

public class Problem18_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// have the user enter a number
		System.out.print("Enter an integer: ");
		// make a long to hold the user's input
		long n = input.nextLong();

		// display the user's input
		System.out.println("The sum of " + n + " = " + sumDigits(n));
	}

	// call the sumDigits method with parameter long that returns the input
	public static int sumDigits(long n) {
		return sumDigits(n, 0);
	}

	// overload method that has the user's input and the sum of the input
	private static int sumDigits(long n, int sum) {
		// if the input is not n then return sum
		if (n == 0)
			return sum;
		// make a recursion call
		else {
			return sumDigits(n / 10, sum + (int)(n % 10));
		}
	}
}