package lab7dvoskin;

public class Circle {
	// make private variables x, y and radius for a circle
	private double x; 
	private double y; 
	private double radius;
	
	// create a Circle with (0,0) where x and y are the 0's and radius is 1
	Circle() {
		this(0, 0, 1);
	}
	// creates a Circle with the specified x, y and radius values
	Circle(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	// make a getter method that returns x
	public double getX() {
		return x;
	}
	// make a getter method that returns y
	public double getY() {
		return y;
	}
	// make a getter method that returns radius
	public double getRadius() {
		return radius;
	}
	// returns the area of the circle
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	// returns the perimeter of the circle
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	// make a boolean contains that returns true if the spcified x and y values are inside circle defined below
	public boolean contains(double x, double y) {
		return Math.sqrt(Math.pow(x - this.x, 2) + 
				 Math.pow(y - this.y, 2)) 
				 < radius;
	}
	// makes another boolean Circle that returns true if the specified circle is inside circle defined below
	public boolean contains(Circle circle) {
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + 
				 Math.pow(circle.getY() - y, 2)) 
				 <= Math.abs(radius - circle.getRadius());
	}
	// makes a final boolean overlaps that returns true if the specified circle overlaps with this circle
	public boolean overlaps(Circle circle) {
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + 
				 Math.pow(circle.getY() - y, 2)) 
				 <= radius + circle.getRadius();
	}
}
