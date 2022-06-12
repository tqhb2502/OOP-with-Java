package savingAccount;

public class Main {
	public static void main(String args[]) {
		SavingAccount sAcc = new SavingAccount("Tran Quang Huy", "123", 100000D, 2);
		
		sAcc.getDetails();
		
		sAcc.withdraw(1000D);
		sAcc.getDetails();
		
		sAcc.deposit(100000D);;
		sAcc.getDetails();
		
		sAcc.updateBalance();
		sAcc.getDetails();
	}
}
