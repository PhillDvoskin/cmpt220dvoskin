package lab8dvoskin;

public class CheckingAccount
extends Account {
// private variables
private double overdraftLimit;

// make a default checking account
public CheckingAccount() {
	super();
	overdraftLimit = -20;
}

// make a checking account with the specified id, balance and overdraftLimit
public CheckingAccount(int id, double balance, double overdraftLimit) {
	super(id, balance);
	this.overdraftLimit = overdraftLimit;
}

// set a new overdraft limit
public void setOverdraftLimit(double overdraftLimit) {
	this.overdraftLimit = overdraftLimit;
}

// return overdraftLimit
public double getOverdraftLimit() {
return overdraftLimit;
}

// decrease balance by parameter specified
public void withdraw(double amount) {
	// if the withdraw amount would mean the account is greater than the overdraft limit perform the action
	if (getBalance() - amount > overdraftLimit) {
		setBalance(getBalance() - amount);
	}
else
	// else say that an error would occur
	System.out.println("ERROR! Overdraft limit would be exceeded!");
}

// make a checking account and define all of its properties
public String toString() {
	return super.toString() + "\nOverdraft limit: $" + 
			String.format("%.2f", overdraftLimit);
}
}