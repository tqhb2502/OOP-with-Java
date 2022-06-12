package account;

public abstract class Account {
	private String owner;
	private String accountNumber;
	private double balance;
	
	// GETTER AND SETTER
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	// CONSTRUCTOR
	public Account() {
		this.owner = "No name";
		this.accountNumber = "TBD";
		this.balance = 0D;
	}
	
	public Account(String owner, String accountNumber, double balance) {
		this.owner = owner;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public abstract boolean withdraw(double amount);
	
	public boolean withdraw(double amount, String currency) {
		switch (currency) {
		case "VND":
			return withdraw(amount);
		case "USD":
			return withdraw(amount * 22000D);
		case "GBP":
			return withdraw(amount * 29000D);
		default:
			return false;
		}
	}
	
	public abstract void deposit(double amount);
	
	public void diposit(double amount, String currency) {
		switch (currency) {
		case "VND":
			deposit(amount);
			break;
		case "USD":
			deposit(amount * 22000D);
			break;
		case "GBP":
			deposit(amount * 29000D);
			break;
		}
	}
	
	public abstract void getDetails();
}
