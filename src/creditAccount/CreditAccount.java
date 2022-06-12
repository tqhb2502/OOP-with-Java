package creditAccount;

import account.Account;
import account.HasInterest;

public class CreditAccount extends Account implements HasInterest{
	private double limit;	// hạn mức
	private int dateCreated;
	
	static private double creditInterest = 0.1;	// lãi suất vay
	static private double debitInterest = 0.01;	// lãi suất gửi
	
	// GETTER AND SETTER
	public double getLimit() {
		return limit;
	}
	
	public void setLimit(double limit) {
		this.limit = limit;
	}
	
	public int getDateCreated() {
		return dateCreated;
	}
	
	public static double getCreditInterest() {
		return creditInterest;
	}
	
	public static void setCreditInterest(double creditInterest) {
		CreditAccount.creditInterest = creditInterest;
	}
	
	public static double getDebitInterest() {
		return debitInterest;
	}
	
	public static void setDebitInterest(double debitInterest) {
		CreditAccount.debitInterest = debitInterest;
	}
	
	// CONSTRUCTOR
	public CreditAccount(String owner, String accountNumber, double balance, double limit, int dateCreated) {
		super(owner, accountNumber, balance);
		this.limit = limit;
		this.dateCreated = dateCreated;
	}

	@Override
	public void getDetails() {
		System.out.println("Owner: " + super.getOwner());
		System.out.println("Account number: " + super.getAccountNumber());
		System.out.println("Balance: " + super.getBalance());
		System.out.println("Date created: " + dateCreated);
		System.out.println("Withdraw limit: " + limit);
		System.out.println("Credit interest: " + creditInterest);
		System.out.println("Debit interest: " + debitInterest);
		System.out.println("----------------------------------");
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount <= super.getBalance() + limit) {
			super.setBalance(super.getBalance() - amount);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void deposit(double amount) {
		super.setBalance(super.getBalance() + amount);
	}

	@Override
	public void updateBalance() {
		if (super.getBalance() >= 0) {
			super.setBalance(super.getBalance() + super.getBalance() * debitInterest);
		} else {
			super.setBalance(super.getBalance() + super.getBalance() * creditInterest);
		}
	}
}
