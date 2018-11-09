package lab9dvoskin;

import java.util.Scanner;

public class Problem3 {
	public static int bin2Dec(String binaryString) throws NumberFormatException {
		// make an decimal integer equal to 0
		int decimal = 0;
		// run a loop starting with i = 0, make j equal to binary string length - 1 and if that is less than j, iterate by 1
		for (int i = 0, j = binaryString.length() - 1; i < binaryString.length(); i++, j--) {
			// if j at i is less than string 0 or j at 1 is greater than 1
			if (binaryString.charAt(i) < '0' || binaryString.charAt(i) > '1')
				// throw a NumberFormatException saying that the string is not a binary string if it doesn't contain 1s and 
				// 0s
				throw new NumberFormatException("The string is not a binary string");
			// iterate decimal by j at i with 2 raised to the power of j, make that a string and make that string an integr
			// ^ makes the input into a number from binary ^
			decimal += (Integer.parseInt(String.valueOf(binaryString.charAt(i)))) * Math.pow(2, j);
		}
		// return the new number from binary
		return decimal;
		
	}
	public static void main(String[] args) {
		try {
		// prompt the user to enter a binary string
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your binary string: ");
		// make the next input set to the variable binary
		String binary = input.nextLine();
		// print out the binary input from the bin2Dec function
        System.out.println(bin2Dec(binary));
        input.close();
		}
		// try the prior code and catch the NumberFormatException and print it out instead of throwing an error
        catch (NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}
    }
}
