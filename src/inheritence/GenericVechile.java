package inheritence;

public abstract class GenericVechile implements GenericVechicleInterface {
	
	public int noOfWheels;
	
	public int engineHrsPower;
	
	public int seatingCapacity;
	
	public int milage;
	
	public int speed;
	

	
	public void movement(){
		
	}	
	
	public abstract void findPrice();
	
	public void lookAndFeel(){
		System.out.println("I am look and feel");
	}
	
	

}
