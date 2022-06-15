package bank;

import account.Account;
import creditAccount.CreditAccount;
import savingAccount.SavingAccount;
import spendingAccount.SpendingAccount;

public class Main {
	public static void main(String args[]) {
		Account acc = new SavingAccount("Huy", "1", 100, 25);
		SavingAccount sa = new SavingAccount("Huy", "2", 1000, 30);
		CreditAccount ca = new CreditAccount("Huy", "3", 10000, 1000000, 35);
		SpendingAccount spa = new SpendingAccount("Huy", "4", 100000);
		
		Bank bank = new Bank();
		bank.addAccount(acc);
		bank.addAccount(sa);
		bank.addAccount(ca);
		bank.addAccount(spa);
		
		bank.printAllAccounts();
		
		System.out.println("Total balance: " + bank.calculateTotalBalance());
	}
}
