package lab2dvoskin;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		// have the user enter a number
		System.out.print("Enter a number: ");
		Scanner input = new Scanner(System.in);
		// make the user's input an integer with the name month
		int month = input.nextInt();
		// if the input is 1 then the month is January
		if (month == 1)
			System.out.println("The month is January");
		// if the input is not 1 then it will check the next number which would be 2 or < 3 
		else if (month < 3)
				System.out.println("The month is February");
		// continue the process from finding the second month for the remaining months
		else if (month < 4)
				System.out.println("The month is March");
		else if (month < 5)
				System.out.println("The month is April");
		else if (month < 6)
				System.out.println("The month is May");
		else if (month < 7)
				System.out.println("The month is June");
		else if (month < 8)
				System.out.println("The month is July");
		else if (month < 9)
				System.out.println("The month is August");
		else if (month < 10)
				System.out.println("The month is September");
		else if (month < 11)
				System.out.println("The month is October");
		else if (month < 12)
				System.out.println("The month is November");
		else if (month < 13)
				System.out.println("The month is December");
		
		
		
	}

}
