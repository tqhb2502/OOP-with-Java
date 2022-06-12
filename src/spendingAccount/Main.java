package spendingAccount;

public class Main {
	public static void main(String args[]) {
		SpendingAccount sAcc = new SpendingAccount("Tran Quang Huy", "123", 100000D);
		
		sAcc.getDetails();
		
		sAcc.withdraw(10000D);
		sAcc.getDetails();
		
		sAcc.withdraw(2, "USD");
		sAcc.getDetails();
		
		sAcc.deposit(100000D);
		sAcc.getDetails();
	}
}
