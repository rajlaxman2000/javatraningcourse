package inheritance;

public class CustHouse {
public static void main(String[] args) {
	IndependantHouse house= new IndependantHouse();
	house.noOfRooms=7;
	house.buildBasement();
	house.buildRooms();
	house.fixDoors();
	
	}
}

