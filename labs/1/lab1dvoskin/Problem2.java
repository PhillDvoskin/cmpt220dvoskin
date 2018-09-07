package lab1dvoskin;

public class Problem2 {
	public static void main(String[] args) {
		/* Write out everything already in the parentheses making sure every division operation
		 * has its own parentheses. Following this insert a 4 times in front to make sure everything is 
		 * multiplied by 4
		 */
		System.out.println(4 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
		// Copy the line of code above and add the single extra division operation in parentheses
		System.out.println(4 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13)));
	}

}
