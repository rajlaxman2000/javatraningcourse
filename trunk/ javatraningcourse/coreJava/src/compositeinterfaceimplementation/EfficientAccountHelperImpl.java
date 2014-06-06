package compositeinterfaceimplementation;

public class EfficientAccountHelperImpl implements AccountHelper{

	@Override
	public void deposit(double amount) {
		System.out.println("I am so efficient way of depostit"+amount);
		
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("I am so efficient way of withdraw"+amount);
		
	}

}
