package lab7dvoskin;

public class Problem4 {
	/** Main method */
	public static void main(String[] args) {
		// create a Circle object
		Circle c1 = new Circle(2, 2, 5.5);

		// display results for all specified values
		System.out.println("Circle1 area: " + c1.getArea()); 
		System.out.println("Circle1 perimeter: " + c1.getPerimeter()); 
		System.out.println(
			"Does circle1 contain the point (3, 3)? " + c1.contains(3, 3)); 
		System.out.println(
			"Does circle1 contain the circle centered at (4, 5) and radius 10.5? " 
			+ c1.contains(new Circle(4, 5, 10.5)));
		System.out.println(
			"Does circle1 overlap the circle centered at (3, 5) and radius 2.3? " 
			+ c1.overlaps(new Circle(3, 5, 2.3)));
	}
}
