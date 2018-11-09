package lab9dvoskin;

public class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	// make a standard GeometicObject object 
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}

	// make a GeometricObject with the specified filled value
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	// return color
	public String getColor() {
		return color;
	}

	// set a new color with the parameter
	public void setColor(String color) {
		this.color = color;
	}

	// return filled since the isFilled boolean method is true
	public boolean isFilled() {
		return filled;
	}

	// set a new filled value based on the parameter
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	// get date created
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	// return a string saying when the object was created, the color and whether it is filled
	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + 
			" and filled: " + filled;
	}
}
