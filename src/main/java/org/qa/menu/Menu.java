package org.qa.menu;

import org.qa.garage.Garage;
import org.qa.utils.UserInput;

public class Menu {

	UserInput scan = UserInput.getInstance();
	CarMenu carMenu = new CarMenu();
	Garage garage = Garage.getInstance();

	public void start() {
		while (true) {
			System.out.println("What would you like to do?");
			System.out.println("1) Create");
			System.out.println("2) Read");
			System.out.println("3) Delete");
			System.out.println("4) Exit");
			int input = scan.getInt();
			switch (input) {
			case 1:
				create();
				break;
			case 2:
				read();
				break;
			case 3:
				delete();
				break;
			case 4:
				break;
			default:
				start();
			}
		}
	}

	private void create() {
		System.out.println("Create what?");
		System.out.println("1) Car");
		System.out.println("2) Motorbike");
		int input = scan.getInt();
		switch (input) {
		case 1:
			carMenu.create();
			break;
		case 2:

			break;
		default:

		}
	}

	private void delete() {
		System.out.println("Delete what?");
		System.out.println("1) Car");
		System.out.println("2) Motorbike");
		System.out.println("3) All");
		System.out.println("3) By ID");
		int input = scan.getInt();
		switch (input) {
		case 1:
			carMenu.delete();
			break;
		case 2:

			break;
		case 3:
			garage.empty();
		case 4:
			System.out.println("Enter ID?");
			garage.removeByID(scan.getInt());
		default:

		}

	}

	private void read() {
		garage.printGarage();
	}

}
