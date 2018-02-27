import static org.junit.Assert.*;
import org.junit.Test;

public class CalcTestCases {
	
	@Test
	public void testSum() {
		int result = Calc.add(2, 2);
		assertTrue(result == 4);
	}

	@Test
	public void testDifference() {
		int result = Calc.subtract(4, 2);
		assertTrue(result == 2);
	}
	
	@Test
	public void testMultiply() {
		int result = Calc.multiply(5, 2);
		assertTrue(result == 10);
	}
	
	@Test
	public void testDivision() {
		int result = Calc.divide(10, 5);
		assertTrue(result == 2);
	}

}
