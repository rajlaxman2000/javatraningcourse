package com.java.iterface.inheritence;

public class BedRoom implements Room,LookAndFeel {

	@Override
	public void getFlooringTilesDetails() {
		System.out.println("Tiles will be at groud level only with speficaiton accrodgin to customer");
		
	}

	@Override
	public void getNoOfWindows() {
		System.out.println("We will be having 2 windows in Bed room on both walls dide by Side");
		
	}

	@Override
	public void getPaintingDetails() {
		System.out.println("According to cistomer need");
		
	}

	@Override
	public void getRoomSizes() {
		System.out.println("10 X 12");
		
	}

	@Override
	public void getElectricalFittings() {
		System.out.println("We will have 1 fan, 1 Tube light, 1 bed Lamp");
		
	}
	
	

}
