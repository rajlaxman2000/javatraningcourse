package compositeinterfaceimplementation;

public class SavingsAccountImpl implements Account{
	
	AccountHelper helper;
	
	//AccountHelper helper2 = new AccountHelperImpl();	
	
	public SavingsAccountImpl(AccountHelper helper) {	
		//this.helper =  new AccountHelperImpl();
		//this.helper =  new EfficientAccountHelperImpl();
		this.helper = helper;
	}

	@Override
	public void deposit(double amount) {
		helper.deposit(amount);
		
	}

	@Override
	public void withdraw(double amount) {
		helper.withdraw(amount);
		
	}

	@Override
	public double calculateInterest(double amount) {
		return amount * 0.03;
	}
	
	

}
