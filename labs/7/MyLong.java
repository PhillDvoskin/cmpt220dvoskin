package lab7dvoskin;

public class MyLong {
	// define a private long value
	private long value;
	// initialize the value
	public MyLong(long value) {
		this.value = value;
	}
	// make a getter method getLong that returns value
	public long getLong() {
		return value;
	}
	// make a method isEven that checks if value is even
	public boolean isEven() {
		return (value % 2) == 0;			
	}
	// make a method isOdd that checks if value is odd
	public boolean isOdd() {
		return (value % 2) == 1;
	}
	// make a method isPrime that checks if value is prime
	public boolean isPrime() {
		// make a for look that iterates while long i is greater than i and i decreases each time
		for (long i = value - 1; i > 1; i--) {
			// if value divided by i returns no remainder return false
			if (value % i == 0) {
				return false;
			}
		// else return true
		}
		return true;	
	}
	// make a method isEven with parameter value
	public static boolean isEven(long value) {
		return (value % 2) == 0;
		
	}
	// make a method isOdd with parameter value
	public static boolean isOdd(long value ) {
		return (value % 2) == 1;
	}
	// make a method isPrime with parameter long that is the same code as other isPrime
	public static boolean isPrime(long value) {
		for (long i = value - 1; i > 1; i--) {
			if (value % i == 0) {
				return false;
			}	
		}
		return true;
	}
	// make a static method isEven that accesses the class's value and returns if that value is even
	public static boolean isEven(MyLong value) {
		return value.isEven();	
	}
	// make a static method isOdd that accesses the class's value and returns if that value is odd
	public static boolean isOdd(MyLong value ) {
		return value.isOdd();
	}
	// make a static method isPrime that accesses the class's value and returns if that value is Prime
	public static boolean isPrime(MyLong value) {
		return value.isPrime();
	}
	// make a method equals that returns if the value defined at the start equals the parameter value
	public boolean equals(long value) {
		return this.value == value;
	}
	// make a method equals that returns if the value defined at the start equals the class's long value by calling getLong
	public boolean equals(MyLong value) {
		return this.value == value.getLong();
	}
	// make a static parse method that parses through the character array with parameter value
	public static long parseLong(char[] value) {
		long out = 0;
		// iterates through as many times as i is less than the parameter
		for (int i = 0; i < value.length; i++) {
			// makes a long called temp that is the value of i at that moment casted to be a long and a 0 right after
			long temp = (long)(value[i] + '0');
			// makes a out that is the value of 0 times 10 and then temp is added
			out = (out * 10) + temp;
		}
		// returns out which is temp
			return out;
	}
	// make a static parse method that parses through the String array
	public static long parseLong(String value) {
		// make a character array from before of length value.length
		char[] temp = new char[value.length()];
		// iterates through as many times as i is less than the temp length
		for(int i=0;i<temp.length;i++) {
			// makes i value of temp array the same value that i has in char array
			temp[i] = value.charAt(i);
		}
		// returns parseLong that parses through temp value i
		return parseLong(temp);
		
	}
	
}