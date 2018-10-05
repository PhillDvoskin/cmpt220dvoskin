package lab5dvoskin;

import java.util.Arrays;

public class Problem6 {
	
	public static double averageRow(double[][] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				sum += array[i][j];
			}
		}
		System.out.println(sum);
		return sum;
		
	}
	
	public static void main(String[] args) {
		int[][] a = {	
				{1,2,3},
				{1,2,3}
		};
		System.out.println(Arrays.deepToString(a));
		averageRow(a);
	}

}
