package lab6dvoskin;

public class Bond {

	private double coupon = 500;
	private int payments = 100;
	private double interest = 0.05;
	private double valueMaturity = 10000;
	
	public Bond() {
	
	}
	
	public Bond(double coupon, int payments, double interest, double valueMaturity) {
		this.coupon = coupon;
		this.payments = payments;
		this.interest = interest;
		this.valueMaturity = valueMaturity;
	}
	
	public double getPrice() {
		double price = coupon * (1 - ((1)/Math.pow((1 + interest), payments))) + valueMaturity * (1/Math.pow((1 + interest), payments));
		return price;
	}
	
}
