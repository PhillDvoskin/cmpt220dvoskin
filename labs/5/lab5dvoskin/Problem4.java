package lab5dvoskin;

import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {
	
	public static boolean equal(int[] x, int[] y) {
		// if array x is equal to array y then print the arrays are identical and return true
		if (Arrays.equals(x, y)) {
			System.out.println("The two arrays are identical");
			return true;
		}
		// if the arrays are not identical print that they are not and return false
		else {
			System.out.println("The two arrays are not identical");
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		// prompt the user to enter the number of values in the first array and then the numbers
		System.out.println("Enter the number of values in the first array and then the values separated "
				+ "with spaces: ");
		String first = input.nextLine();
		// makes a string array for the first set of values
		String[] firstArray = first.split(" ");
		// makes an integer array for the first set of values
		int[] intFirstArray = new int[firstArray.length];
		// fills in the first integer array with the values from the first string array
		for (int i = 0; i < firstArray.length; i++) {
			intFirstArray[i] = Integer.parseInt(firstArray[i]);
		}
			//System.out.println(Arrays.toString(intFirstArray));
		// makes an integer value for 1 less than length of the first integer array
		int smallerFirst = intFirstArray.length - 1;
		// make an int array called newFirst that holds x values where x = smallerFirst
		int[] newFirst = new int[smallerFirst];
		// copy the all elements from first int array to newFirst except the first element
		System.arraycopy(intFirstArray, 1, newFirst, 0, smallerFirst);
			//System.out.println(Arrays.toString(newFirst));
		// sorts the elements from least to greatest
		Arrays.sort(newFirst);
		//System.out.println(Arrays.toString(newFirst));
		// prompt the user to enter the number of values in the second array and then the numbers
		System.out.println("Enter the number of values in the second array and then the values separated "
				+ "with spaces: ");
		String second = input.nextLine();
		// makes a string array for the second set of values
		String[] secondArray = second.split(" ");
		// makes an integer array for the second set of values
		int[] intSecondArray = new int[secondArray.length];
		// fills in the second integer array with the values from the second string array
		for(int j = 0; j < secondArray.length; j++) {
			intSecondArray[j] = Integer.parseInt(secondArray[j]);
		}
			//System.out.println(Arrays.toString(intSecondArray));
		// get a value for smallerSecond which is equal to number of elements in second int Array but 1 less
		int smallerSecond = intSecondArray.length - 1;
		// make a newSecond array that holds x values where x is equal to smallerSecond
		int[] newSecond = new int[smallerSecond];
		// copies all the elements from the second int array into newSecond array except the first one
		System.arraycopy(intSecondArray, 1, newSecond, 0, smallerSecond);
			//System.out.println(Arrays.toString(newSecond));
		// sort the elements from least to greatest
		Arrays.sort(newSecond);
		//System.out.println(Arrays.toString(newSecond));
		equal(newFirst,newSecond);
	}
	

}
