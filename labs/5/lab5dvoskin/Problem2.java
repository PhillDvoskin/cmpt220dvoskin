package lab5dvoskin;

import java.util.Scanner;
import java.util.Arrays;

public class Problem2 {
	
	public static double deviation(double[] x) {
		// makes a double standardDev with value 0
		double standardDeviation = 0.0;
		// makes an integer value length where length is the length of the array
		int length = x.length;
		// make an enhanced for loop that iterates from the first to last element of the array
		for(double num: x) {
            standardDeviation += Math.pow(num - mean(x), 2);
        }
		// return the standard Deviation
        return Math.sqrt(standardDeviation/length);
	}
	public static double mean(double[] x) {
		// makes a double sum with the placeholder value of 0
		double sum = 0;
		// iterates through the x elements where x is the length of the array and adds each value to sum
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
			
		}
		// returns average, or sum divided by number of elements
		return sum / x.length;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// prompt the user to enter 10 numbers
		System.out.println("Enter 10 numbers split with spaces: ");
		// makes a string array that holds all the values the user input
		String stringInput = input.nextLine();
		String[] stringArray = stringInput.split(" ");
		// makes a double array that holds x values where x is the number of elements in the string array
		double[] doubleArray = new double[stringArray.length];
		// iterates through each element of the double array and fills it in with a input from string array
		for (int j = 0; j < stringArray.length; j++) {
			doubleArray[j] = Double.parseDouble(stringArray[j]);
		}
		//System.out.println(Arrays.toString(doubleArray));
		System.out.println("Mean: " + mean(doubleArray));
		System.out.println("Standard Deviation: " + deviation(doubleArray));

	}

}
