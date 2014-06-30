package interfaceinheritence.bank;

public class SavingsAccount extends Account {
	
	/* (non-Javadoc)
	 * @see compositeinterfaceimplementation.Account#calculateInterest(double)
	 */
	public double calculateInterest(double amount) {
		// calculate interest for SavingsAccount
		return amount * 0.03;
	}

	public void deposit(double amount) {
		super.deposit(amount); // get code reuse
		// do something else
	}

	public void withdraw(double amount) {
		super.withdraw(amount); // get code reuse
		// do something else
	}

}
