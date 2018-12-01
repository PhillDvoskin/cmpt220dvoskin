package lab10dvoskin;

public class Problem4 {
	abstract class Appliance {
		double voltage;
		String color;
		String madeIn;
		double price;
		
		public double getVoltage() {
			return voltage;
		}
		public String getColor() {
			return color;
		}
		public String madeIn() {
			return madeIn;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public void compareTo() {
			
		}
		public String toString() {
			return "The appliance with voltage " + voltage + " has a color " + color + " and price " + price;
		}
	}
	
	class Toaster extends Appliance implements Comparable {

		@Override
		public String CompareTo() {
			// TODO Auto-generated method stub
			return null;
		}

	}
		
}
