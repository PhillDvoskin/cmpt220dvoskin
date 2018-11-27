package lab10dvoskin;

import lab10dvoskin.ABClass.Output1;
import lab10dvoskin.ABClass.Output2;

public class Problem1 {
	public static void main(String[] args) {
		// make a new object for methods Output1 and Output2
		Output1 obj1 = new Output1();
		Output2 obj2 = new Output2();
		// call the methods printMessage using each object
		obj1.printMessage();
		obj2.printMessage();
	}
}
