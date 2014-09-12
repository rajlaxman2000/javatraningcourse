package com.java.iterface.inheritence;

public class Kitchen implements Room, LookAndFeel {

	@Override
	public void getFlooringTilesDetails() {
		System.out.println("Tiles will be at groud as well and on teh walls till 6 feet");
		
	}

	@Override
	public void getNoOfWindows() {
		System.out.println("We will be having 1 main main window and 1 top level window for fan ventilation");
		
	}

	@Override
	public void getPaintingDetails() {
		System.out.println("According to customer need, we prefer to have oil prrof painting for Kitchen ");
		
	}

	@Override
	public void getRoomSizes() {
		System.out.println("6 X 12");
		
	}

	@Override
	public void getElectricalFittings() {
		System.out.println("We will have 1 Tube light, 1 bed Lamp, 1 exhaust fan");
		
	}

}
