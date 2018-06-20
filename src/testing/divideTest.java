package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class divideTest {
	
	JunitTesting test = new JunitTesting();
	
	@Test
	public void testDivide() {
		double output = test.divide(100, 10);
		assertEquals(10.0,output,.001);
	}
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void testDivideZero() {
		test.divide(5, 0);
	}

}
