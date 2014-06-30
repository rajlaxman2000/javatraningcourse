package interfaceinheritence.bank;

public class Test {
	
	public static void main(String[] args) {
		
		int amt = 1000;
		
		SavingsAccount savingsAccount = new SavingsAccount();
		double interest1 = savingsAccount.calculateInterest(amt);
		System.out.println(interest1);
		
		TermDepositAccount termDepositAccount = new TermDepositAccount();
		double interest2 = termDepositAccount.calculateInterest(amt);
		System.out.println(interest2);
	}
}
