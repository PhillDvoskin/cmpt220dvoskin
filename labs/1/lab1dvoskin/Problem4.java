package lab1dvoskin;

import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a value for m: ");
		int m = input.nextInt();
		
		int c = 299972458;
		
		double energy = m * Math.pow(c, 2);
		
		System.out.println("E is " + energy);
		
		
	}

}
