package lab5dvoskin;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Problem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// get the user to enter the number of students
		System.out.println("Enter the number of students: ");
		String numberOfStudents = input.nextLine();
		// make a string array with the values the user entered
		String[] studentAmount = numberOfStudents.split(" ");
		// make an integer array of the same size of the string array
		int[] studentAmountArray = new int[studentAmount.length];
		// fill in the integer array with the values from the string array
		for (int i=0; i < studentAmount.length; i++) {
			studentAmountArray[i] = Integer.parseInt(studentAmount[i]);
		}
		// prompt the user to enter the student's names
		System.out.println("Enter the students: ");
		String studentNames = input.nextLine();
		// make a string array with the names the user entered
		String[] namesArray = studentNames.split(" ");
		// if the user entered more names then there are values, print out that is not valid
		if (studentAmountArray[0] != namesArray.length) { 
			System.out.println("The number of names you entered does not match the number you specified.");
		}
		// else prompt the user to enter the grades
		else {
			System.out.println("Enter the grades of the students respectively: ");
			String grades = input.nextLine();
			// make a string array to hold the grades
			String[] studentGrades = grades.split(" ");
			// make an integer array with the same size as the string array for grades
			int[] studentGradesArray = new int[studentGrades.length];
			// fill in the integer array with the same grades as the string grades array
			for (int j=0; j < studentGrades.length; j++) {
				studentGradesArray[j] = Integer.parseInt(studentGrades[j]);
			}
			// if the number of grades is not how many names there are print that is invalid
			if (studentGradesArray.length != namesArray.length) { 
				System.out.println("The number of names you entered does not match the number you grades entered.");
			}
			// make a final list called namesList that will cahnge the namesArray to a list format
			final List<String> namesList = Arrays.asList(namesArray);
			// go through each of the values of the namesList that you just created and give then the same index
			// as the grades that you entered
		    Collections.sort(namesList, (left, right) -> studentGradesArray[namesList.indexOf(left)] - 
		    		studentGradesArray[namesList.indexOf(right)]);
		    // sort the array for the student grades
		    Arrays.sort(studentGradesArray);
		    // add a space between the grades and the list when printing the final statement
		    for (int k = 0; k < studentGradesArray.length; k++) {
		    	System.out.println(studentGradesArray[k] + " " + namesList.get(k));
		    }
		}
	}
}
