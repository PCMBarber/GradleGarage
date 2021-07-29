package org.qa.garage;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.qa.automotives.Vehicle;
import org.qa.automotives.Car;

public class TestGarage {
	
	Garage testGarage = Garage.getInstance();
	
	@Before
	public void init() {
		testGarage.empty();
		System.out.println("This is before a test");

	}

	@Test
	public void testGetGarage() {
		assertEquals(new ArrayList<Vehicle>(), testGarage.getGarage());
	}
	
	@Test
	public void testAddVehicle() {
		Car testCar = new Car("Test", "Testy", 1, 1);
		ArrayList<Vehicle> testArray = new ArrayList<Vehicle>();
		testArray.add(testCar);
		
		testGarage.addVehicle(testCar);
		assertEquals(testGarage.getGarage(), testArray);
	}
	
}
