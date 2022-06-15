package account;

import creditAccount.CreditAccount;
import savingAccount.SavingAccount;

public class Main {
	public static void main(String[] args) {
		Account acc1 = new SavingAccount("Huy", "123456", 100000, 25);
		Account acc2 = new CreditAccount("Huy", "654321", 200000, 1000000, 25);
		
		acc1.getDetails();
		acc2.getDetails();
		
		SavingAccount sa;
		CreditAccount ca;
		
		if (acc1 instanceof SavingAccount) {
			sa = (SavingAccount) acc1;
			sa.getDetails();
		}
		
		if (acc1 instanceof CreditAccount) {
			ca = (CreditAccount) acc1;
			ca.getDetails();
		}
		
		if (acc2 instanceof SavingAccount) {
			sa = (SavingAccount) acc2;
			sa.getDetails();
		}
		
		if (acc2 instanceof CreditAccount) {
			ca = (CreditAccount) acc2;
			ca.getDetails();
		}
		
		//zzzzzz
	}
}
