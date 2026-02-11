package tdd_with_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
	@Test
	public void testAdd() {

		Calculator calculator = new Calculator();

		int result = calculator.add(2, 3);

		Assert.assertEquals(result, 5);

	}

	@Test
	public void testSubtract() {

		Calculator calculator = new Calculator();

		int result = calculator.subtract(5, 2);

		Assert.assertEquals(result, 3);

	}

	@Test
	public void testMultiply() {

		Calculator calculator = new Calculator();

		int result = calculator.multiply(2, 3);

		Assert.assertEquals(result, 6);

	}

	@Test
	public void testDivide() {

		Calculator calculator = new Calculator();

		int result = calculator.divide(6, 3);

		Assert.assertEquals(result, 2);

	}

	@Test(expectedExceptions = IllegalArgumentException.class)

	public void testDivideByZero() {

		Calculator calculator = new Calculator();

		calculator.divide(6, 0);

	}
}
