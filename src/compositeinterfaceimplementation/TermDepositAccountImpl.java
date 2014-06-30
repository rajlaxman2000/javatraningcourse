package compositeinterfaceimplementation;

public class TermDepositAccountImpl implements Account{

	AccountHelper helper;
	
	//AccountHelper helper2 = new AccountHelperImpl();

	public TermDepositAccountImpl(AccountHelper helper) {		
		//this.helper =  new AccountHelperImpl();
		//this.helper =  new EfficientAccountHelperImpl();
		this.helper = helper;
	}	
	

	@Override
	public double calculateInterest(double amount) {
		return amount * 0.05;
	}

	@Override
	public void deposit(double amount) {
		helper.deposit(amount);
		
	}

	@Override
	public void withdraw(double amount) {
		helper.withdraw(amount);
		
	}
	
	

}
