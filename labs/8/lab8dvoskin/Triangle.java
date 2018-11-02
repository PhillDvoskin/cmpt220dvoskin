package lab8dvoskin;

public class Triangle 
extends GeometricObject {
private double side1;
private double side2;
private double side3;

// make a default triangle object where side1,2 and 3 are all 1.0
Triangle() {
	side1 = side2 = side3 = 1.0;
}

// make a triangle object where the parameters are the lengths of each side
Triangle(double side1, double side2, double side3) { 
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

// return the area of the triangle
public double getArea() {
// make a double variable s that is equal to the sum of all sides divided by 2
double s = (side1 + side2 + side3) / 2;
return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
}

// return the perimeter of the triangle
public double getPerimeter() {
return side1 + side2 + side3;
}

// return a string statement displaying the lengths of each side of the triangle
public String toString() {
return "Triangle: side1 = " + side1 + "\n side2 = " + side2 +
	"\n side3 = " + side3;
}
}

