package HomeWork5t.HomeWork5t;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class unit_test_Power_calculator {
	Multiplier multiplier = Mockito.mock(Multiplier.class);
	Power_calculator power_calculator = new Power_calculator(multiplier);

	
	@Test
	public void unitest_multiplier_1() {
		
		   Mockito.when(multiplier.multiply(Mockito.anyDouble(), Mockito.anyDouble()))
           .thenAnswer(invocation -> {
               double a = invocation.getArgument(0);
               double b = invocation.getArgument(1);
               return a * b; 
           });
		double a = 4.0, b = 2.0;
		double expected_result = 16.0;
		double actual_result = power_calculator.power(a, b);
		
		assertEquals(expected_result, actual_result);
		System.out.println(actual_result);

	}
}
