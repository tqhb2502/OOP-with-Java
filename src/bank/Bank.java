package bank;

import account.Account;
import savingAccount.SavingAccount;

public class Bank {
	private Account account[];
	private int numberOfAccount;
	private SavingAccount savingAccount[];
	private int numberOfSavingAccount;
	
	public Bank() {
		account = new Account[10];
		numberOfAccount = 0;
		savingAccount = new SavingAccount[10];
		numberOfSavingAccount = 0;
	}
	
	public void add(Account acc) {
		account[numberOfAccount] = acc;
		numberOfAccount++;
	}
	
	public void add(SavingAccount sAcc) {
		savingAccount[numberOfSavingAccount] = sAcc;
		numberOfSavingAccount++;
	}
	
	public void printAllAccounts() {
		System.out.println(numberOfAccount + " accounts:");
		System.out.println("------------------");
		for (int i = 0; i < numberOfAccount; i++) {
			account[i].getDetails();
		}
		
		System.out.println(numberOfSavingAccount + " saving accounts:");
		System.out.println("------------------");
		for (int i = 0; i < numberOfSavingAccount; i++) {
			savingAccount[i].getDetails();
		}
	}
	
	public double calculateTotalBalance() {
		double total = 0;
		
		for (int i = 0; i < numberOfAccount; i++) {
			total += account[i].getBalance();
		}
		
		for (int i = 0; i < numberOfSavingAccount; i++) {
			total += savingAccount[i].getBalance();
		}
		
		return total;
	}
}
