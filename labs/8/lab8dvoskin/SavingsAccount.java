package lab8dvoskin;

public class SavingsAccount
extends Account {

// construct a savings account
public SavingsAccount() {
	// call the super class
	super();
}

// make a savings account with the parameterized id and balance
public SavingsAccount(int id, double balance) {
	// call the superclass
	super(id, balance);
}

// make a withdraw method
public void withdraw(double amount) {
	// if the amount is less than the amount in the account, proceed with teh transaction
	if (amount < getBalance()) {
		// set new balance
	setBalance(getBalance() - amount);
	}
	else {
	System.out.println(
		"ERROR! Insufficient funds!");
	}
	}
}