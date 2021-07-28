package org.qa.menu;

import org.qa.automotives.Car;
import org.qa.garage.Garage;
import org.qa.utils.UserInput;

public class CarMenu {

	private UserInput scan;
	private Garage garage;
	
	public CarMenu() {
		scan = UserInput.getInstance();
		garage = Garage.getInstance();
	}
	
	public CarMenu(UserInput scan, Garage garage) {
		this.scan = scan;
		this.garage = garage;
	}

	public void create() {
		System.out.println("Manufacturer?");
		String maker = scan.getString();

		System.out.println("Colour?");
		String colour = scan.getString();

		System.out.println("How many wheels?");
		int wheels = scan.getInt();

		System.out.println("How many doors?");
		int doors = scan.getInt();

		Car userCar = new Car(maker, colour, wheels, doors);
		garage.addVehicle(userCar);
	}

	public void delete() {
		garage.removeByType("Car");
	}
}