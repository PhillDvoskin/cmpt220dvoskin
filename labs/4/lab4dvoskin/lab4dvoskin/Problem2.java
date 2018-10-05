package lab4dvoskin;

import java.util.Random;

public class Problem2 {

	public static void main(String[] args) {
		// make a character array and type out each letter of the alphabet
		char[] alphabet = new char[27];
		alphabet[0] = 'a';
		alphabet[1] = 'b';
		alphabet[2] = 'c';
		alphabet[3] = 'd';
		alphabet[4] = 'e';
		alphabet[5] = 'f';
		alphabet[6] = 'g';
		alphabet[7] = 'h';
		alphabet[8] = 'i';
		alphabet[9] = 'j';
		alphabet[10] = 'k';
		alphabet[11] = 'l';
		alphabet[12] = 'm';
		alphabet[13] = 'n';
		alphabet[14] = 'o';
		alphabet[15] = 'p';
		alphabet[16] = 'q';
		alphabet[17] = 'r';
		alphabet[18] = 's';
		alphabet[19] = 't';
		alphabet[20] = 'u';
		alphabet[21] = 'v';
		alphabet[22] = 'w';
		alphabet[23] = 'x';
		alphabet[24] = 'y';
		alphabet[25] = 'z';
		// make a random number 
		Random r = new Random();
		// use the random number to get a random number in the array length corresponding to a random letter
		for (int j = 0; j < 5; j++) {
			// do the same thing as above but now for columns
			for (int i = 0; i < 4; i++) {
				int x = r.nextInt(26);
				System.out.print(alphabet[x]);
			}
			int x = r.nextInt(26);
			System.out.println(alphabet[x]);
		}

	}

}
