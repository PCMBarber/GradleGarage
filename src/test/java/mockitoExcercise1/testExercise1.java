package mockitoExcercise1;


import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.anyInt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class testExercise1 {
	
	@Mock
	private NumberCalculator numberCalculator;
	
	@Mock
	private Printer printer;
	
	@InjectMocks
	private excercise1 numPrinter;
	
	@Test
	public void testPrintNumbers() {
		when(numberCalculator.calculate(anyInt())).thenReturn("Test");
		
		numPrinter.printNumbers(2);
		
		verify(numberCalculator, times(2)).calculate(anyInt());
		verify(printer, times(2)).print("Test");
	}
}







