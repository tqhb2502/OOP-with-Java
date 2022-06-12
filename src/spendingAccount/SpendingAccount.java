package spendingAccount;

import account.Account;

public class SpendingAccount extends Account{
	public SpendingAccount(String owner, String accountNumber, double balance) {
		super(owner, accountNumber, balance);
	}

	@Override
	public void getDetails() {
		System.out.println("Owner: " + super.getOwner());
		System.out.println("Account number: " + super.getAccountNumber());
		System.out.println("Balance: " + super.getBalance());
		System.out.println("----------------------------------");
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount <= super.getBalance()) {
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

}
