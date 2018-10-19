package lab6dvoskin;

public class Problem1 {
	public static void main(String[] args) {
		Square sq1 = new Square();

		Square sq2 = new Square(40);
		System.out.print("Width: ");
		System.out.println(sq2.getWidth());
		System.out.print("Area: ");
		System.out.println(sq2.getArea());
		System.out.print("Perimeter: ");
		System.out.println(sq2.getPerimeter());
		System.out.println("");
		
		Square sq3 = new Square(39.5);
		System.out.print("Width: ");
		System.out.println(sq3.getWidth());
		System.out.print("Area: ");
		System.out.println(sq3.getArea());
		System.out.print("Perimeter: ");
		System.out.println(sq3.getPerimeter());
		System.out.println("");
		
	}

}
