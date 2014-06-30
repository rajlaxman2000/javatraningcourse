package inheritance;

public class IndependantHouse extends GenericHouse {

	@Override
	public void buildBasement() {
		// TODO Auto-generated method stub
		int basementsize=100;
		System.out.println("basementsize in sq.feet"+basementsize);

		
	}

	@Override
	public void fixDoors() {
		// TODO Auto-generated method stub
		int noOfDoors=10;
		System.out.println("doors="+noOfDoors);
		
		
	}

	@Override
	public void buildRooms() {
		// TODO Auto-generated method stub
		int noOfRooms=5;
		System.out.println("rooms="+noOfRooms);
		
	}
	


}
