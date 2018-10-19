package lab6dvoskin;

import java.util.Date;
import java.util.Random;

	// makes a Player class
	class Player {
		// make instance variables for Player class
		private String name;
		private int goals;
		private String team;
		
		// makes a no-argument constructor to initialize the variables
		Player() {
			name = team = "";
			goals = 0;
		} 
		
		// makes a constructor with parameters for the variables initialized above
		Player(String name, int goal, String team) {
			this.name = name;
			this.goals = goal;
			this.team = team;
		} 
		
		// method to set name
		void setName(String name) {
			this.name = name;
		} 
		
		// method to set team name
		void setTeam(String team) {
			this.team = team;
		} 
		
		// method to set number of goals
		void setGoals(int goals) {
			this.goals = goals;
		} 
		
		// method to return name
		String getName() {
			return name;
		} 
		
		// method to return team name
		String getTeam() {
			return team;
		} 
		
		// method to return goals
		int getGoals() {
			return goals;
		} 
		
		// overrides toString() to return Player information
		public String toString() {
			return "\n Player Name: " + name + "\t Team:" + team + "\t Goals:" + goals;
		} 
	} 
	
	class Goal {
		// references the Player class to be able to use methods from there
		Player p = new Player();
		
		// make instance variables for the Goal class
		private int minute;
		private Player player;
		
		// no argument constructor to initialize the instance variables
		Goal() {
			minute = 0;
			player = null;
		} 
		
		// constructor with parameter to assign parameter values to instance variables
		Goal(int min, Player p) {
			minute = min;
			player = p;
		} 
		
		// method to set minute
		void setMinute(int minute) {
			this.minute = minute;
		} 
		
		// method to set Player
		void setPlayer(Player player) {
			this.player = player;
		} 
		
		// method to return minute
		int getMinute() {
			return minute;
		} 
		
		// method to return Player
		Player getPlayer() {
			return player;
		}
		
		// overrides toString() to return player name of who the goal was scored by
		public String toString() {
			return "\n GOAL SCORED BY " + getPlayer();
		} 
	} 
	
	// makes the main class SoccerMatch
	public class SoccerMatch {
	// makes instance variables
		Date startTime;
		Date endTime;
		String location;
		String home;
		String visitor;
		Player homePlayers[];
		Player visitorPlayers[];
		Goal homeGoals[];
		Goal visitorGoals[];
		int homePlayerCounter, visitorPlayerCounter;
		int homeGoalCounter, visitorGoalCounter;
		
		// no-argument constructor to initialize instance variables
		SoccerMatch() {
			startTime = endTime = null;
			location = home = visitor = null;
			
			// defines size to the arrays
			homePlayers = new Player[11];
			visitorPlayers = new Player[11];
			homeGoals = new Goal[10];
			visitorGoals = new Goal[10];
			homePlayerCounter = visitorPlayerCounter = homeGoalCounter = visitorGoalCounter = 0;
			
			// loops 11 times for players to create players
			for (int i = 0; i < 11; i++) {
				homePlayers[i] = new Player();
				visitorPlayers[i] = new Player();
			} // end of loop
			
			// loops 10 times for goals to create goals
			for (int i = 0; i < 10; i++) {
				homeGoals[i] = new Goal();
				visitorGoals[i] = new Goal();
			} 
		} 
		
		// constructor with parameters to assign parameter values to instance variables
		SoccerMatch(Date sTime, Date eTime, String venue, String homeTeam, String visitorTeam) {
			// calls above constructor
			this();
			startTime = sTime;
			endTime = eTime;
			location = venue;
			home = homeTeam;
			visitor = visitorTeam;
		} 
		
		// method to add a Player object to home team
		void addHomePlayer(Player p) {
			homePlayers[homePlayerCounter++] = p;
		} 
		
		// method to add a PLayer object visitor team
		void addVisitorPlayer(Player p) {
			visitorPlayers[visitorPlayerCounter++] = p;
		} 
		
		// method to add Goal object to home team
		void addHomeGoal(Goal g) {
			homeGoals[homeGoalCounter++] = g;
		} 
		
		void addVisitorGoal(Goal g) {
			visitorGoals[visitorGoalCounter++] = g;
		} 
		
		// returns the array of goals made by the home team
		int[] getHomeGoals() {
			// creates an array to store home team goals
			int goals[] = new int[10];
			// loops 10 times to store home team goals
			for (int i = 0; i < 10; i++) {
				goals[i] = homeGoals[i].getPlayer().getGoals();
			} 
			return goals;
		} 
		
		// returns the array of goals made by visitor team
		int[] getVisitorGoals() {
			// creates an array to store visitor team goals
			int goals[] = new int[10];
			// loops 10 times to store visitor team goals
			for (int i = 0; i < 10; i++) {
				goals[i] = visitorGoals[i].getPlayer().getGoals();
			}
			return goals;
		} 
		
		// method to return game winning or tie status
		String getWinner() {
			String winStatus = "";
			int homeGoals[] = getHomeGoals();
			int visitorGoals[] = getVisitorGoals();
			int totalHomeCount = 0, totalVisitorCount = 0;
			
			// loops 10 times for home team goal and visitor team goals
			for (int i = 0; i < 10; i++) {
				// calculates total goals for home team
				totalHomeCount += homeGoals[i];
				// calculates total goals for visitor team
				totalVisitorCount += visitorGoals[i];
			} 
			
			// sets both team's goals to variables to be compared
			winStatus = "\n Home Team Total Goals:" + totalHomeCount + "\n Visitor Team Total Goals:" + totalVisitorCount;
			
			// checks if home team total goals is greater than visitor team team total goals
			if (totalHomeCount > totalVisitorCount) {
				winStatus += "\n Winner: Home Team";
			}
			
			// otherwise checks if visitor team total goals is greater than the home team total goals
			else if (totalVisitorCount > totalHomeCount) {
				winStatus += "\n Winner: Visitor Team";
			}
			
			// if both teams have same number of goals a Tie is returned
			else 
				winStatus += "\n Tie";
			
			return winStatus;
		} 
			
	public static void main(String[] args) {
		//creates a Random class object
		Random rand = new Random();
		
		// creates two Date class object for starting and ending time for game
		@SuppressWarnings("deprecation")
		Date d1 = new Date(2018, 11, 12, 10, 12, 30);
		@SuppressWarnings("deprecation")
		Date d2 = new Date(2018, 11, 12, 12, 40, 30);
		
		// creates an object of SoccerMatch class object using constructor with parameters
		SoccerMatch sm = new SoccerMatch(d1, d2, "Spain", "Barcelona", "Chelsea");
		
		// creates a String array for home player names
		String homePlayerName[] = {"Phill", "Dale", "Jake", "Dillon", "Gabe", "Logan", "Sean", "Pat", "Dave", "Bobby", "Roy"};
		
		// creates a String array for visitor player names
		String visitorPlayerName[] = {"Matt", "Mark", "Mike", "Greg", "Dom", "Steven", "Luke", "Justin", "Nick", "Dennis", "James"};
		
		// loops 11 times to add players
		for (int i = 0; i < 11; i++) {
			// calls the method to add home team players using the Player class and constructors
			sm.addHomePlayer(new Player(homePlayerName[i], rand.nextInt(10), "Barcelona"));
			// calls the method to add visitor team players using the Player class and constructors
			sm.addVisitorPlayer(new Player(visitorPlayerName[i], rand.nextInt(10), "Chelsea"));
		}
		
		// loops 10 times to add goals
		for (int i = 0; i < 10; i++) {
			// calls the method to add home team goals using the Goal class and constructors
			sm.addHomeGoal(new Goal(rand.nextInt(59), sm.homePlayers[i]));
			// calls the method to add visitor team goals using the Goal class and constructors
			sm.addVisitorGoal(new Goal(rand.nextInt(59), sm.visitorPlayers[i]));
		} 
		
		// loops 11 times to display home team players information
		System.out.println("\n\n*************************** Home Team Players *************************** ");
		for (int i = 0; i < 11; i++) {
			System.out.println(sm.homePlayers[i]);
		}
		
		// loops 11 times to display visitor team players information
		System.out.println("\n\n*************************** Visitor Team Players *************************** ");
		for (int i = 0; i < 11; i++) {
			System.out.println(sm.visitorPlayers[i]);
		}
		
		// loops 10 times to display home team goals information
		System.out.println("\n\n*************************** Home Team Goals *************************** ");
		for (int i = 0; i < 10; i++) {
			System.out.println(sm.homeGoals[i]);
		}
		
		// loops 10 times to display visitor team goals information
		System.out.println("\n\n*************************** Visitor Team Goals *************************** ");
		for (int i = 0; i < 10; i++) {
			System.out.println(sm.visitorGoals[i]);
		}
		
		// Displays game status
		System.out.println("\n\n*************************** GAME STATUS *************************** ");
		System.out.println(sm.getWinner());
	} 

}