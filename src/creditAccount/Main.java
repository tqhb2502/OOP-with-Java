package creditAccount;

public class Main {
	public static void main(String args[]) {
		CreditAccount cAcc = new CreditAccount("Tran Quang Huy", "123", 100000D, 1000000D, 25);
		
		cAcc.getDetails();
		
		cAcc.withdraw(200000D);
		cAcc.getDetails();
		
		cAcc.withdraw(1000000D);
		cAcc.getDetails();
		
		cAcc.withdraw(900000D);
		cAcc.getDetails();
		
		cAcc.updateBalance();
		cAcc.getDetails();
		
		cAcc.deposit(2000000D);
		cAcc.getDetails();
		
		cAcc.updateBalance();
		cAcc.getDetails();
	}
}
