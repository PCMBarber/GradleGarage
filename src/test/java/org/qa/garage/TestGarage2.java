package org.qa.garage;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.qa.automotives.Car;
import org.qa.automotives.Vehicle;

public class TestGarage2 {
	Garage testGarage = Garage.getInstance();
	
	@Test
	public void testGetGarage() {
		assertEquals(new ArrayList<Vehicle>(), testGarage.getGarage());
	}
	
	@Test
	public void testAddVehihle() {
		Car myCar = new Car("bmw", "blue", 4, 5);
		ArrayList<Vehicle> expected = new ArrayList<Vehicle>();
		expected.add(myCar);
		
		assertEquals(new ArrayList<Vehicle>(), testGarage.getGarage());
		testGarage.addVehicle(myCar);
		assertEquals(expected, testGarage.getGarage());
	}
}
