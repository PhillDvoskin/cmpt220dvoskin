package lab4dvoskin;

import java.util.Random;

public class Problem5 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		// make an integer array of size 1000
		int[] intArray = new int[1000];
		// make variables for sum, count less and more
		int sum = 0;
		int countLess = 0;
		int countMore = 0;
		// iterate through each of the 1000 elements of the array
		for (int i = 0; i < 1000; i++) {
			int x = rand.nextInt(10 + 1);
			intArray[i] = x;
			// get the sum of all the elements
			sum += x;
			System.out.print(intArray[i]);
			System.out.print(" ");
			
		}
		// get the double
		double average = (double)sum / 1000;
		// count how many integers are less or more than the average
		for (int i = 0; i < 1000; i++) {
			if (intArray[i] < average) {
				countLess++;
			}
			if (intArray[i] > average) {
				countMore++;
			}
		}
		
		System.out.println("");
		// System.out.println("The sum is:" + sum);
		System.out.println("The average is: " + average);
		System.out.println("There are: " + countLess + " less than the average");
		System.out.println("There are: " + countMore + " more than the average");
		
		

	}

}
