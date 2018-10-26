package lab7dvoskin;

public class Problem1 {

	public static void main(String[] args) {
		MyLong l = new MyLong(0);
		
		System.out.println(l.getLong());
		System.out.println(l.isEven());
		System.out.println(l.isOdd());
		System.out.println(l.isPrime());
		
		long x = 3;
		System.out.println("\n" + x);
		System.out.println(l.isEven(x));
		System.out.println(l.isOdd(x));
		System.out.println(l.isPrime(x));
		
		long y = 0;
		System.out.println("\n" + y);
		System.out.println(l.equals(y));
		
		char [] z = new char[3];
		System.out.println("\n" + l.parseLong(z));
		
		System.out.println(l.parseLong("\n" + z));
		
	}

}
