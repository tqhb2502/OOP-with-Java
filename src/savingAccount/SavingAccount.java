package savingAccount;

import account.Account;
import account.HasInterest;

public class SavingAccount extends Account implements HasInterest{
	private int creationDate;
	
	private static double interest = 0.1;
	
	// GETTER AND SETTER
	public int getCreationDate() {
		return creationDate;
	}
	
	public static double getInterest() {
		return interest;
	}
	
	public static void setInterest(double interest) {
		SavingAccount.interest = interest;
	}
	
	// CONSTRUCTOR
	public SavingAccount(String owner, String accountNumber, double balance, int creationDate) {
		super(owner, accountNumber, balance);
		this.creationDate = creationDate;
	}

	@Override
	public void getDetails() {
		System.out.println("Owner: " + super.getOwner());
		System.out.println("Account number: " + super.getAccountNumber());
		System.out.println("Balance: " + super.getBalance());
		System.out.println("Date created: " + creationDate);
		System.out.println("Interest: " + interest);
		System.out.println("----------------------------------");
	}

	@Override
	public boolean withdraw(double amount) {
		return false;
	}

	@Override
	public void deposit(double amount) {
		super.setBalance(super.getBalance() + amount);
	}

	@Override
	public void updateBalance() {
		super.setBalance(super.getBalance() + super.getBalance() * interest);
	}
}
