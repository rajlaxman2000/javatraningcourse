/**
 * 
 */
package inheritence;

/**
 * @author Rajesh_Duvvi
 *
 */
public class VehicleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TwoWheelerWithGear heroHondaCbz  = new TwoWheelerWithGear();
		
		//GenericVechile vechile = new GenericVechile();
		
		heroHondaCbz.manufacturerName="Honda";
		
		heroHondaCbz.noOfgears = 5;
		
		heroHondaCbz.noOfLights=2;
		
		heroHondaCbz.milage=50;
		
		Car car = new Car();
		
		Truck truck = new Truck();
		
		FourWheeler fourWheeler ;
		
		fourWheeler	= car ;			
			
		fourWheeler.methodVechile();
			 
		fourWheeler= truck;
			 
		fourWheeler.methodVechile();
		
		FourWheeler secondFourWheeler = new FourWheeler();
		
		car = (Car) secondFourWheeler;
		
		
		 
			
			
		
		
		
		
		

	}

}
