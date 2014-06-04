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

	}

}
