package compositeinterfaceimplementation;

public class AccountHelperImpl implements AccountHelper{

	@Override
	public void deposit(double amount) {
		System.out.println("depositing " + amount);		
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("withdrawing " + amount);
		
	}

}
