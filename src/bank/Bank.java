package bank;

import account.Account;

public class Bank {
	private Account account[];
	private int numberOfAccount;
	
	public Bank() {
		account = new Account[10];
		numberOfAccount = 0;
	}
	
	public void addAccount(Account acc) {
		account[numberOfAccount] = acc;
		numberOfAccount++;
	}
	
	public void printAllAccounts() {
		System.out.println("Huy's bank");
		System.out.println("So 1 Dai Co Viet");
		System.out.println("------------------");
		System.out.println(numberOfAccount + " accounts:");
		System.out.println("------------------");
		for (int i = 0; i < numberOfAccount; i++) {
			account[i].getDetails();
		}
	}
	
	public double calculateTotalBalance() {
		double total = 0;
		
		for (int i = 0; i < numberOfAccount; i++) {
			total += account[i].getBalance();
		}
		
		return total;
	}
}
