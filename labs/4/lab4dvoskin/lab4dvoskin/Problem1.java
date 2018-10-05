package lab4dvoskin;

public class Problem1 {

	public static void main(String[] args) {
		// make the header
		System.out.println("in       cm | cm       in");
		System.out.println("-------------------------");
		// make arrays for inches and centimeters
		int[] inches = new int[51];
		int[] centimeters = new int[252];
		int x = 1;
		// make a for loop to iterate 50 times for each inch
		for (int i = 1; i < 51; i++) {			
			inches[i] = i;
			// if the inch is less than 10 return 1 space more to compensate for the spacing
			if (i < 10) {
				// convert the current double to a string to check if it is 4 or 5 long
				double currentI = (i * 2.54);
				String currentILength = Double.toString(currentI);
				// if it is 4 long return 1 space more to compensate for spacing
				if (currentILength.length() == 4) {
					System.out.println(inches[i] + "      " + ((i) * 2.54)
							+ " | " + x + "     " + (x * 0.39));
							x += 5;
				}
				else if (currentILength.length() == 5) {
					System.out.println(inches[i] + "     " + ((i) * 2.54)
							+ " | " + x + "     " + (x * 0.39));
							x += 5;
				}
			}
			// if the i is greater than 10 then repeat the above
			else if (i >= 10) {
				double currentI = (i * 2.54);
				String currentILength = Double.toString(currentI);
				if (currentILength.length() == 4) {
					System.out.println(inches[i] + "     " + ((i) * 2.54)
							+ " | " + x + "     " + (x * 0.39));
							x += 5;
				}
				else if (currentILength.length() == 5) {
					System.out.println(inches[i] + "    " + ((i) * 2.54)
							+ " | " + x + "     " + (x * 0.39));
							x += 5;
				}
			}
		}
					

	}

}
