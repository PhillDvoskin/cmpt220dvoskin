package lab5dvoskin;

public class Problem7 {
	
	// make a private final integer N that is always equal to 4
	private static final int N = 4;
	
	public static boolean isUpperTriangular(double[][] array) {
		// iterates through the rows of the array
		for (int i = 0; i < N; i++) { 
			// iterates through the columns of the array but it j is always 1 less than i
			for (int j = 0; j < i; j++) {
				// if the value of j is not equal to 0 return false
				if (array[i][j] != 0) {
					return false;	
				}
			}
		}
		// returns true if the false condition is not met
		return true;
	}
	public static void main(String[] args) {
		// make a 2d array and fill it in with values
		double[][] array = { { 1, 3, 5, 3 }, 
			                 { 0, 4, 6, 2 }, 
			                 { 0, 0, 2, 5 }, 
			                 { 0, 0, 0, 6 } 
		}; 
     /* calls the isUpperTriangular method to test the created array, if it returns true, print it is an upper
      * triangular array
      */
	 if (isUpperTriangular(array)) { 
	     System.out.println("This IS an upper trinagular matrix"); 
	 }
	 // else print it is not
	 else {
	     System.out.println("This IS NOT an upper triangular matrix"); 
	 }
	}

}
