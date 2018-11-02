package lab8dvoskin;

public class Problem11_3 {
	// Main method
	public static void main(String[] args) {
		// create account and test all the methods
		Account account = new Account(1122, 20000);
		SavingsAccount savings = new SavingsAccount(1001, 20000);
		CheckingAccount checking = new CheckingAccount(1004, 20000, -20);
		// set annual interest rate of 4.5%
		account.setAnnualInterestRate(4.0);
		savings.setAnnualInterestRate(4.0);
		checking.setAnnualInterestRate(4.0);

		// withdraw $2,500
		account.withdraw(3000);
		savings.withdraw(3000);
		checking.withdraw(3000);

		// deposit $3,000
		account.deposit(5000);
		savings.deposit(5000);
		checking.deposit(5000);

		// print account descriptions
		System.out.println(account.toString());
		System.out.println(savings.toString());
		System.out.println(checking.toString());
	}
}
