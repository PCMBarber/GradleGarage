package org.qa.menu;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.qa.automotives.Car;
import org.qa.garage.Garage;
import org.qa.utils.UserInput;

@RunWith(MockitoJUnitRunner.class)
public class TestCarMenu {

	@Mock
	private UserInput scan;

	@Mock
	private Garage garage;

	@InjectMocks
	private CarMenu carMenu;

	@Test
	public void testCreate() {
		when(scan.getString()).thenReturn("BMW", "Blue");
		when(scan.getInt()).thenReturn(4, 5);
		
		carMenu.create();
		
		Car testCar = new Car("BMW", "Blue", 4, 5);
		testCar.setID(1);
		
		verify(scan, times(2)).getString();
		verify(scan, times(2)).getInt();
		verify(garage, times(1)).addVehicle(testCar);
	}
}
