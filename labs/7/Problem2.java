package lab7dvoskin;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// prompt the user to enter a positive integer
		System.out.print("Enter a positive integer: ");
		int number = input.nextInt();

		// displays all the input's smallest factors in decreasing order
		System.out.print("The smallest factors of " + number + " are: ");
		// creates a StackOfIntegers
		StackOfIntegers stack = new StackOfIntegers(); 
		// calls smallestFactors with paramters number and stack
		smallestFactors(number, stack);
		// while stack is not calls empty method
		while (!stack.empty()) {
			// print out the stack call pop wth a space
			System.out.print(stack.pop() + " ");
		}
		// print new line
		System.out.println();
	}
	
// find smallestFactors and push to StackOfIntegers
public static void smallestFactors(int number, StackOfIntegers stack) {
	// define i as a prime factor
	int i = 2; 
	// while parameter number divided by i is not even 1
	while (number / i != 1){ 
		// if parameter divided by 1 doesn't have a remainder
		if (number % i == 0) {
			// push i to stack
			stack.push(i);
			// parameter number equals number divided by i
			number /= i;
		}
		// else increment i by 1
		else
			i++;
	}
	// push parameter number to stack
	stack.push(number);
}
}
