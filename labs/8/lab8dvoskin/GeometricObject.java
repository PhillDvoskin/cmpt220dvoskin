package lab8dvoskin;

public class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	// make a default geometric object
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}

	// create a specified geometric object with specified color filled or unfilled property
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	// return color
	public String getColor() {
		return color;
	}

	// set a new color with the parameter specified
	public void setColor(String color) {
		this.color = color;
	}

	// return the filled property, since it is a boolean the name can be isFilled
	public boolean isFilled() {
		return filled;
	}

	// set a new filled property based on the parameter
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	// return when the geometric object was created
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	// return a string representation specifying the object's properties
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + 
			" and filled: " + filled;
	}
}
