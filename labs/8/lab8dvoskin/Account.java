package lab8dvoskin;

import java.util.Date;

public class Account {
	// private variables
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;

	// create a default account
	Account() {
		this(0, 0); 
	}

	// create an account with a specified, identification, balance, annualInterest and dateCreated
	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		annualInterestRate = 0;
		dateCreated = new Date();
	}

	// set id for the account with the parameter
	public void setId(int id) {
		this.id = id;
	}

	// set balance for the account with the parameter
	public void setBalance(double balance) {
		this.balance = balance;
	}

	// set annualInterest for the account with the parameter
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	// return id
	public int getId() {
		return id;
	}

	// return balance
	public double getBalance() {
		return balance;
	}

	// return annualInterest
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	// return dateCreated
	public String getDateCreated() {
		return dateCreated.toString();
	}

	// return monthly interest
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	// return specific monthly interest
	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}

	// decreased balance by the paramter specified
	public void withdraw(double amount) {
		balance -= amount;
	}

	// increase balance by the parameter specified
	public void deposit(double amount) {
		balance += amount;
	}

	// create the account and define all of its properties
	public String toString() {
		return "\nAccount ID: " + id + "\nDate created: " + getDateCreated()
			+ "\nBalance: $" + String.format("%.2f", balance) + 
			"\nMonthly interest: $" + String.format("%.2f", getMonthlyInterest());
	}
}
