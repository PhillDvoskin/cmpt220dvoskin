package lab9dvoskin;

public class Triangle 
extends GeometricObject {
private double side1;
private double side2;
private double side3;

// make a default triangle object
public Triangle() {
side1 = side2 = side3 = 1.0;
}

// make a specified object with the sides as the parameters
public Triangle(double side1, double side2, double side3) 
throws IllegalTriangleException {
	// if side 1 and 2 are less than or equal to 3, 1 and 3 to 2 or 2 and 3 to 1 then throw an IllegalTriangleException with
	// the specified sides
if (side1 + side2 <= side3 || 
	 side1 + side3 <= side2 || 
	 side2 + side3 <= side1) 
	throw new IllegalTriangleException(side1, side2, side3);
this.side1 = side1;
this.side2 = side2;
this.side3 = side3;
}

// return side1
public double getSide1() {
return side1;
}

// return side2
public double getSide2() {
return side2;
}

// return side3
public double getSide3() {
return side3;
}

// return area of the triangle
public double getArea() {
double s = (side1 + side2 + side3) / 2;
return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
}

// return the perimeter of the triangle
public double getPerimeter() {
return side1 + side2 + side3;
}

// write a string that says what each side of the triangle is
@Override
public String toString() {
return "Triangle: side1 = " + side1 + " side2 = " + side2 +
	" side3 = " + side3;
}
}