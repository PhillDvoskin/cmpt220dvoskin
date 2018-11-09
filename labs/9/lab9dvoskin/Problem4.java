package lab9dvoskin;

import java.io.*;
import java.util.*;

public class Problem4 {
	public static void main(String[] args) throws Exception {
		// check command line for the parameter usage
		// if the arguments length is not 2 then print out java removed the text filename
		if (args.length != 2) {
			System.out.println("Removed string hello from the file");
			// exit from printing
			System.exit(1);
		}

		// check if file with parameters exists
		// make a file object of the type File, make that a argument 1
		File file = new File(args[1]);
		// if system exists then print out that the file plus the argument name does not exist
		if (!file.exists()) {
			System.out.println("File " + args[1] + " does not exist");
			// exit from printing again
			System.exit(2);
		}

		// create an array list to hold strings called s2
		ArrayList<String> s2 = new ArrayList<>(); 
		try (
			// make a new input file and try it
			Scanner input = new Scanner(file);
		) {
			// while input has something then s1 is the user's next input
			while (input.hasNext()) {
				String s1 = input.nextLine();
				// add s2 to the list s2 and remove the arguments s1 at index args 0
				s2.add(removeString(args[0], s1));
			}
		}

		try (
			// create output file and try it
			// make a object output of type PrintWriter with argument file
			PrintWriter output = new PrintWriter(file);
		) {
			// iterate starting at 0 and going up by 1 while i is less than list s2 size
			for (int i = 0; i < s2.size(); i++) {
				// print s2 get at index i
				output.println(s2.get(i));
			}
		}
	}

	public static String removeString(String string, String line) {
		StringBuilder stringBuilder = new StringBuilder(line);
		// starting index
		int start = stringBuilder.indexOf(string); 
		// ending index
		int end = string.length();
		// while start is greater than or equal to 0 do the following
		while (start >= 0) {
			// new end is equal to start and end combined
			end = start + end;
			stringBuilder = stringBuilder.delete(start, end);
			start = stringBuilder.indexOf(string, start); 
		}

		return stringBuilder.toString();
	}
}
