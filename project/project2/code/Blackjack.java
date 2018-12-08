package termProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Blackjack {
	
	static int game() {
		// creates an Array with all card names
		String[] cards = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		// creates an array to hold all the card values
		int[] cardValues = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
		// creates a list that will hold all cards in the deck
		List<String> Deck = new ArrayList<String>();
				// adds all aces to the Deck list
		for (int i = 0; i < 4; i++) {
			Deck.add(cards[0]);
		}
				// adds all 2's to the Deck list
		for (int i = 0; i < 4; i++) {
			Deck.add(cards[1]);
		}
				// adds all 3's to the Deck list
		for (int i = 0; i < 4; i++) {
			Deck.add(cards[2]);
		}
				// adds all 4's to the Deck list
		for (int i = 0; i < 4; i++) {
			Deck.add(cards[3]);
		}
				// adds all 5's to the Deck list
		for (int i = 0; i < 4; i++) {
			Deck.add(cards[4]);
		}
				// adds all 6's to the Deck list
		for (int i = 0; i < 4; i++) {
			Deck.add(cards[5]);
		}
				// adds all 7's to the Deck list
		for (int i = 0; i < 4; i++) {
			Deck.add(cards[6]);
		}
				// adds all 8's to the Deck list
		for (int i = 0; i < 4; i++) {
			Deck.add(cards[7]);
		}
				// adds all 9's to the Deck list
		for (int i = 0; i < 4; i++) {
			Deck.add(cards[8]);
		}
				// adds all 10's to the Deck list
		for (int i = 0; i < 4; i++) {
			Deck.add(cards[9]);
		}
				// adds all Jacks to the Deck list
		for (int i = 0; i < 4; i++) {
			Deck.add(cards[10]);
		}
				// adds all Queens to the Deck list
		for (int i = 0; i < 4; i++) {
			Deck.add(cards[11]);
		}
				// adds all Kings to the Deck list
		for (int i = 0; i < 4; i++) {
			Deck.add(cards[12]);
		}
		
				// smallest number that can be randomly drawn from
		int min = 0;
				// largest number that can be randomly drawn from
		int max = 12;
		int[] storeFirst = {(int) (Math.random() * (max - min + 1))};
		//int[] storeFirst = {0};
		int[] storeSecond = {(int) (Math.random() * (max - min + 1))};
		//int[] storeSecond = {0};

		int[] Alfirst = {(int) (Math.random() * (max - min + 1))};
		int[] Alsecond = {(int) (Math.random() * (max - min + 1))};
		
		/* Makes an list that stores the user's current cards and them removes them from the Deck */
		List<String> currentCards = new ArrayList<String>();
		currentCards.add(cards[storeFirst[0]]);
				// removes user's first card from the deck
		Deck.remove(cards[storeFirst[0]]);
		currentCards.add(cards[storeSecond[0]]);
				// removes user's second card from the deck
		Deck.remove(cards[storeSecond[0]]);
		/* Makes a list that stores the current values of the user's cards */
		List<Integer> currentValues = new ArrayList<Integer>();
		currentValues.add(cardValues[storeFirst[0]]);
		currentValues.add(cardValues[storeSecond[0]]);
		int sum = cardValues[storeFirst[0]] + cardValues[storeSecond[0]];
				// prints out current cards
		System.out.println("Current Cards: " + currentCards);

		List<String> AlcurrentCards = new ArrayList<String>();
		AlcurrentCards.add(cards[Alfirst[0]]);
		Deck.remove(cards[Alfirst[0]]);
		AlcurrentCards.add(cards[Alsecond[0]]);
		Deck.remove(cards[Alsecond[0]]);
		
		
/* ------------------------------------------------------------------------------------------------------------
 * This next portion of the code deals only with the logic of the code
 * ------------------------------------------------------------------------------------------------------------ */
		Scanner input = new Scanner(System.in);
		boolean t = true;
		
		while (t) {
			if (currentCards.get(0).equals("Ace") & currentCards.get(1).equals("Ace")) {
				currentValues.set(0, 1);
				sum = 1 + 11;
			}
			t = false;
		}
				// prints out current card values
		System.out.println("Current Sum: " + sum);
		
		int Alsum = cardValues[Alfirst[0]] + cardValues[Alsecond[0]];
		
		while (Alsum < 14) {
			int AlrNum = (int) (Math.random() * (max - min + 1));
			Alsum += cardValues[AlrNum];
			AlcurrentCards.add(cards[AlrNum]);
			Deck.remove(cards[AlrNum]);
		}

/* --------------------------------------------------------------------------------------------------------------
 *  User's inputs
 * -------------------------------------------------------------------------------------------------------------- */
		System.out.println("\nAl player's card: " + AlcurrentCards.get(0));
		int p = 1;
		outerloop:
			while (p == 1) {
				System.out.println("Do you want to hit or stay? ");
				String uInput = input.nextLine();
				String test = uInput.toLowerCase();
				if (test.equals("hit")) {
					int rNum = (int) (Math.random() * (max - min + 1));
					sum += cardValues[rNum];
					currentCards.add(cards[rNum]);
					currentValues.add(cardValues[rNum]);
					Deck.remove(cards[rNum]);
					System.out.println(Deck);
					System.out.println(currentCards);
					System.out.println("Sum: " + sum);
				}
				else {
					p = 0;
					break outerloop;
				}
			}

		System.out.println("\nAl sum: " + Alsum);
		System.out.println(AlcurrentCards);
		
		if (sum < 22 && sum > Alsum) {
			System.out.println();
			System.out.println("========================================================================================"
						   + "\n=======================================USER WINS!======================================="
						   + "\n========================================================================================");
			p = 1;
			return 1;
		}
		else if (sum < 22 && Alsum > 21) {
			System.out.println();
			System.out.println("========================================================================================"
					   	   + "\n=======================================USER WINS!======================================="
					   	   + "\n========================================================================================");
			p = 1;
			return 1;
		}
		else if (sum == Alsum) {
			System.out.println();
			System.out.println("========================================================================================"
					   	   + "\n======================================IT'S A TIE!======================================="
					   	   + "\n========================================================================================");
			p = 0;
			return 0;
		}
		else if (sum > 21 && Alsum > 21) {
			System.out.println();
			System.out.println("========================================================================================"
						   + "\n======================================IT'S A TIE!======================================="
						   + "\n========================================================================================");
			p = 0;
			return 0;
		}
		else if (sum < 22 && Alsum < 22 && sum < Alsum) {
			System.out.println();
			System.out.println("========================================================================================"
				   	   	   + "\n====================================Al PLAYER WINS!====================================="
				   	   	   + "\n========================================================================================");
			p = 2;
			return 2;
		}
		else if (sum > 21 && Alsum < 22) {
			System.out.println();
			System.out.println("========================================================================================"
				   	   	   + "\n====================================Al PLAYER WINS!====================================="
				   	   	   + "\n========================================================================================");
			p = 2;
			return 2;
			
		}
		//System.out.println(Deck);
		return p;
		} // end of method

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean b = true;
		int count = 0;
		while (b) {
			if (game() == 1) {
				count += 1;
				continue;
			}
			else {
				b = false;
			}
		}
		String sValue = String.valueOf(count);
		System.out.println("Enter your first and last name: ");
		boolean k = true;
		while (k) {
			String name = input.nextLine();
			System.out.println("|====================|=====|");
			System.out.println("|     PLAYER NAME    |SCORE|"); 
			System.out.println("|====================|=====|");
			if (name.length() == 1) {
				System.out.print("|");
				System.out.printf("%21.20s", name + "|");
				if (sValue.length() == 1) {
					System.out.printf("%5d", count);
				}
				else if (sValue.length() == 2) {
					System.out.printf("%4d", count);
				}
				else if (sValue.length() == 3) {
					System.out.printf("%3d", count);
				}
				System.out.println("|");
				k = false;
			}
			else if (name.length() == 2) {
				System.out.print("|");
				System.out.printf("%21.20s", name + "|");
				if (sValue.length() == 1) {
					System.out.printf("%5d", count);
				}
				else if (sValue.length() == 2) {
					System.out.printf("%4d", count);
				}
				else if (sValue.length() == 3) {
					System.out.printf("%3d", count);
				}
				System.out.println("|");
				k = false;
			}
			else if (name.length() == 3) {
				System.out.print("|");
				System.out.printf("%21.20s", name + "|");
				if (sValue.length() == 1) {
					System.out.printf("%5d", count);
				}
				else if (sValue.length() == 2) {
					System.out.printf("%4d", count);
				}
				else if (sValue.length() == 3) {
					System.out.printf("%3d", count);
				}
				System.out.println("|");
				k = false;
			}
			else if (name.length() == 4) {
				System.out.print("|");
				System.out.printf("%21.20s", name + "|");
				if (sValue.length() == 1) {
					System.out.printf("%5d", count);
				}
				else if (sValue.length() == 2) {
					System.out.printf("%4d", count);
				}
				else if (sValue.length() == 3) {
					System.out.printf("%3d", count);
				}
				System.out.println("|");
				k = false;
			}
			else if (name.length() == 5) {
				System.out.print("|");
				System.out.printf("%21.20s", name + "|");
				if (sValue.length() == 1) {
					System.out.printf("%5d", count);
				}
				else if (sValue.length() == 2) {
					System.out.printf("%4d", count);
				}
				else if (sValue.length() == 3) {
					System.out.printf("%3d", count);
				}
				System.out.println("|");
				k = false;
			}
			else if (name.length() == 6) {
				System.out.print("|");
				System.out.printf("%21.20s", name + "|");
				if (sValue.length() == 1) {
					System.out.printf("%5d", count);
				}
				else if (sValue.length() == 2) {
					System.out.printf("%4d", count);
				}
				else if (sValue.length() == 3) {
					System.out.printf("%3d", count);
				}
				System.out.println("|");
				k = false;
			}
			else if (name.length() == 7) {
				System.out.print("|");
				System.out.printf("%21.20s", name + "|");
				if (sValue.length() == 1) {
					System.out.printf("%5d", count);
				}
				else if (sValue.length() == 2) {
					System.out.printf("%4d", count);
				}
				else if (sValue.length() == 3) {
					System.out.printf("%3d", count);
				}
				System.out.println("|");
				k = false;
			}
			else if (name.length() == 8) {
				System.out.print("|");
				System.out.printf("%21.20s", name + "|");
				if (sValue.length() == 1) {
					System.out.printf("%5d", count);
				}
				else if (sValue.length() == 2) {
					System.out.printf("%4d", count);
				}
				else if (sValue.length() == 3) {
					System.out.printf("%3d", count);
				}
				System.out.println("|");
				k = false;
			}
			else if (name.length() == 9) {
				System.out.print("|");
				System.out.printf("%21.20s", name + "|");
				if (sValue.length() == 1) {
					System.out.printf("%5d", count);
				}
				else if (sValue.length() == 2) {
					System.out.printf("%4d", count);
				}
				else if (sValue.length() == 3) {
					System.out.printf("%3d", count);
				}
				System.out.println("|");
				k = false;
			}
			else if (name.length() == 10) {
				System.out.print("|");
				System.out.printf("%21.20s", name + "|");
				if (sValue.length() == 1) {
					System.out.printf("%5d", count);
				}
				else if (sValue.length() == 2) {
					System.out.printf("%4d", count);
				}
				else if (sValue.length() == 3) {
					System.out.printf("%3d", count);
				}
				System.out.println("|");
				k = false;
			}
			else if (name.length() == 11) {
				System.out.print("|");
				System.out.printf("%21.20s", name + "|");
				if (sValue.length() == 1) {
					System.out.printf("%5d", count);
				}
				else if (sValue.length() == 2) {
					System.out.printf("%4d", count);
				}
				else if (sValue.length() == 3) {
					System.out.printf("%3d", count);
				}
				System.out.println("|");
				k = false;
			}
			else if (name.length() == 12) {
				System.out.print("|");
				System.out.printf("%21.20s", name + "|");
				if (sValue.length() == 1) {
					System.out.printf("%5d", count);
				}
				else if (sValue.length() == 2) {
					System.out.printf("%4d", count);
				}
				else if (sValue.length() == 3) {
					System.out.printf("%3d", count);
				}
				System.out.println("|");
				k = false;
			}
			else if (name.length() == 13) {
				System.out.print("|");
				System.out.printf("%21.20s", name + "|");
				if (sValue.length() == 1) {
					System.out.printf("%5d", count);
				}
				else if (sValue.length() == 2) {
					System.out.printf("%4d", count);
				}
				else if (sValue.length() == 3) {
					System.out.printf("%3d", count);
				}
				System.out.println("|");
				k = false;
			}
			else if (name.length() == 14) {
				System.out.print("|");
				System.out.printf("%21.20s", name + "|");
				if (sValue.length() == 1) {
					System.out.printf("%5d", count);
				}
				else if (sValue.length() == 2) {
					System.out.printf("%4d", count);
				}
				else if (sValue.length() == 3) {
					System.out.printf("%3d", count);
				}
				System.out.println("|");
				k = false;
			}
			else if (name.length() == 15) {
				System.out.print("|");
				System.out.printf("%21.20s", name + "|");
				if (sValue.length() == 1) {
					System.out.printf("%5d", count);
				}
				else if (sValue.length() == 2) {
					System.out.printf("%4d", count);
				}
				else if (sValue.length() == 3) {
					System.out.printf("%3d", count);
				}
				System.out.println("|");
				k = false;
			}
			else if (name.length() == 16) {
				System.out.print("|");
				System.out.printf("%21.20s", name + "|");
				if (sValue.length() == 1) {
					System.out.printf("%5d", count);
				}
				else if (sValue.length() == 2) {
					System.out.printf("%4d", count);
				}
				else if (sValue.length() == 3) {
					System.out.printf("%3d", count);
				}
				System.out.println("|");
				k = false;
			}
			else if (name.length() == 17) {
				System.out.print("|");
				System.out.printf("%21.20s", name + "|");
				if (sValue.length() == 1) {
					System.out.printf("%5d", count);
				}
				else if (sValue.length() == 2) {
					System.out.printf("%4d", count);
				}
				else if (sValue.length() == 3) {
					System.out.printf("%3d", count);
				}
				System.out.println("|");
				k = false;
			}
			else if (name.length() == 18) {
				System.out.print("|");
				System.out.printf("%21.20s", name + "|");
				if (sValue.length() == 1) {
					System.out.printf("%5d", count);
				}
				else if (sValue.length() == 2) {
					System.out.printf("%4d", count);
				}
				else if (sValue.length() == 3) {
					System.out.printf("%3d", count);
				}
				System.out.println("|");
				k = false;
			}
			else if (name.length() == 19) {
				System.out.printf("%22.20s", name + "|");
				if (sValue.length() == 1) {
					System.out.printf("%5d", count);
				}
				else if (sValue.length() == 2) {
					System.out.printf("%4d", count);
				}
				else if (sValue.length() == 3) {
					System.out.printf("%3d", count);
				}
				System.out.println("|");
				k = false;
			}
			else {
				System.out.println("The name you entered is too long please enter a shorter name: ");				
			}
			System.out.println("|--------------------|-----|");
		}
	}
}
