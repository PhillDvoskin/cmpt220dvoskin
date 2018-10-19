package lab6dvoskin;

public class Square {

	private double width = 1;
	
	public Square() {
	}
	
	public Square(double width) {
		this.width = width;
	}
	
	public double getArea() {
		double area = Math.pow(width, 2);
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = width * 4;
		return perimeter;
	}
	
	public double getWidth() {
		return width;
	}
}
