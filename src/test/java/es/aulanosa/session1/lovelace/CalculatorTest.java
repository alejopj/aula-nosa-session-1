package es.aulanosa.session1.lovelace;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
	
	/* Happy path */

	/**
	 * Given two positive numbers
	 * When adding them
	 * Then their addition is returned
	 */
	@Test
	public void addTwoPositiveNumbers() {
		
		Calculator calculator = new Calculator();
		Double a = 5.0;
		Double b = 3.0;
		Double addition = calculator.add(a, b);
		Assert.assertTrue(addition == 8.0);
	}
	
	/**
	 * Given two positive numbers
	 * When subtracting them
	 * Then their subtraction is returned
	 */
	@Test
	public void subtractTwoPositiveNumbers() {
		
		Calculator calculator = new Calculator();
		Double a = 5.0;
		Double b = 3.0;
		Double subtraction = calculator.subtract(a, b);
		Assert.assertTrue(subtraction == 2.0);
	}
	
	/**
	 * Given two positive numbers
	 * When multiplying them
	 * Then their multiplication is returned
	 */
	@Test
	public void multiplyTwoPositiveNumbers() {
		
		Calculator calculator = new Calculator();
		Double a = 5.0;
		Double b = 3.0;
		Double multiplication = calculator.multiply(a, b);
		Assert.assertTrue(multiplication == 15.0);
	}
	
	/**
	 * Given two positive numbers
	 * When dividing one by the other
	 * Then their division is returned
	 */
	@Test
	public void divideTwoPositiveNumbers() {
		
		Calculator calculator = new Calculator();
		Double a = 12.0;
		Double b = 3.0;
		Double division = calculator.divide(a, b);
		Assert.assertTrue(division == 4.0);
	}
	
	/**
	 * Given two lists of positive numbers
	 * When adding them
	 * Then their addition is returned
	 */
	@Test
	public void addTwoListsOfPositiveNumbers() {
		
		Calculator calculator = new Calculator();
		List<Double> a = Arrays.asList(13.0, 21.0, 34.0, 55.0, 89.0);
		List<Double> b = Arrays.asList(1.0, 2.0, 3.0, 5.0, 8.0);
		List<Double> addition = calculator.add(a, b);
		Assert.assertEquals(Arrays.asList(14.0, 23.0, 37.0, 60.0, 97.0), addition);
	}
	
	/**
	 * Given two lists of positive numbers
	 * When subtracting them
	 * Then their subtraction is returned
	 */
	@Test
	public void subtractTwoListsOfPositiveNumbers() {
		
		Calculator calculator = new Calculator();
		List<Double> a = Arrays.asList(13.0, 21.0, 34.0, 55.0, 89.0);
		List<Double> b = Arrays.asList(1.0, 2.0, 3.0, 5.0, 8.0);
		List<Double> subtraction = calculator.subtract(a, b);
		Assert.assertEquals(Arrays.asList(12.0, 19.0, 31.0, 50.0, 81.0), subtraction);
	}
	
	/**
	 * Given two lists of positive numbers
	 * When multiplying them
	 * Then their multiplication is returned
	 */
	@Test
	public void multiplyTwoListsOfPositiveNumbers() {
		
		Calculator calculator = new Calculator();
		List<Double> a = Arrays.asList(13.0, 21.0, 34.0, 55.0, 89.0);
		List<Double> b = Arrays.asList(1.0, 2.0, 3.0, 5.0, 8.0);
		List<Double> multiplication = calculator.multiply(a, b);
		Assert.assertEquals(Arrays.asList(13.0, 42.0, 102.0, 275.0, 712.0), multiplication);
	}
	
	/**
	 * Given two lists of positive numbers
	 * When dividing one by the other
	 * Then their division is returned
	 */
	@Test
	public void divideTwoListOfPositiveNumbers() {
		
		Calculator calculator = new Calculator();
		List<Double> a = Arrays.asList(2.0, 6.0, 12.0, 25.0, 48.0);
		List<Double> b = Arrays.asList(1.0, 2.0, 3.0, 5.0, 8.0);
		List<Double> division = calculator.divide(a, b);
		Assert.assertEquals(Arrays.asList(2.0, 3.0, 4.0, 5.0, 6.0), division);
	}
	
	/* Unhappy path */
	
	/**
	 * Given two null numbers
	 * When adding them
	 * Then their addition is zero
	 */
	@Test
	public void addTwoNullNumbers() {
		
		Calculator calculator = new Calculator();
		Double a = null;
		Double b = null;
		Double addition = calculator.add(a, b);
		Assert.assertTrue(addition == 0.0);
	}
	
	/**
	 * Given two null numbers
	 * When subtracting them
	 * Then their subtraction is zero
	 */
	@Test
	public void subtractTwoNullNumbers() {
		
		Calculator calculator = new Calculator();
		Double a = null;
		Double b = null;
		Double subtraction = calculator.subtract(a, b);
		Assert.assertTrue(subtraction == 0.0);
	}
	
	/**
	 * Given two null numbers
	 * When multiplying them
	 * Then their multiplication is zero
	 */
	@Test
	public void multiplyTwoNullNumbers() {
		
		Calculator calculator = new Calculator();
		Double a = null;
		Double b = null;
		Double multiplication = calculator.multiply(a, b);
		Assert.assertTrue(multiplication == 0.0);
	}
	
	/**
	 * Given two null numbers
	 * When dividing one by the other
	 * Then their division is undefined
	 */
	@Test
	public void divideTwoNullNumbers() {
		
		Calculator calculator = new Calculator();
		Double a = null;
		Double b = null;
		Double division = calculator.divide(a, b);
		Assert.assertNull(division);
	}
	
	/**
	 * Given two numbers
	 * And one of them is null
	 * And the other is not null
	 * When adding them
	 * Then their addition is equals to the non-null number
	 */
	@Test
	public void addTwoNumbersBeingOneNull() {
		
		Calculator calculator = new Calculator();
		Double a = null;
		Double b = 3.0;
		Double addition = calculator.add(a, b);
		Assert.assertTrue(addition == b);
	}
	
	/**
	 * Given two numbers
	 * And the first one is not null
	 * And the second one is null
	 * When subtracting them
	 * Then their subtraction is equals to the non-null number
	 */
	@Test
	public void subtractTwoNumbersBeingTheSecondOneNull() {
		
		Calculator calculator = new Calculator();
		Double a = 5.0;
		Double b = null;
		Double subtraction = calculator.subtract(a, b);
		Assert.assertTrue(subtraction == 5.0);
	}
	
	/**
	 * Given two numbers
	 * And the first one is null
	 * And the second one is not null
	 * When subtracting them
	 * Then their subtraction is equals to the non-null number multiplied by -1
	 */
	@Test
	public void subtractTwoNumbersBeingTheFirstOneNull() {
		
		Calculator calculator = new Calculator();
		Double a = null;
		Double b = 3.0;
		Double subtraction = calculator.subtract(a, b);
		Assert.assertTrue(subtraction == -3.0);
	}
	
	/**
	 * Given two numbers
	 * And one of them is null
	 * And the other is not null
	 * When multiplying them
	 * Then their multiplication is zero
	 */
	@Test
	public void multiplyTwoNumbersBeingOneNull() {
		
		Calculator calculator = new Calculator();
		Double a = null;
		Double b = 3.0;
		Double multiplication = calculator.multiply(a, b);
		Assert.assertTrue(multiplication == 0.0);
	}
	
	/**
	 * Given two numbers
	 * And the first one is null
	 * And the second one is not null
	 * When dividing them
	 * Then their division is zero
	 */
	@Test
	public void divideTwoNumbersBeingTheFirstOneNull() {
		
		Calculator calculator = new Calculator();
		Double a = null;
		Double b = 3.0;
		Double division = calculator.divide(a, b);
		Assert.assertTrue(division == 0.0);
	}
	
	/**
	 * Given two numbers
	 * And first one is null
	 * And the second one is not null
	 * When dividing them
	 * Then their division tends to infinity
	 */
	@Test
	public void divideTwoNumbersBeingTheSecondOneNull() {
		
		Calculator calculator = new Calculator();
		Double a = 12.0;
		Double b = null;
		Double division = calculator.divide(a, b);
		Assert.assertTrue(division == Double.MAX_VALUE);
	}
	
	/**
	 * Given two numbers
	 * And the second one is zero
	 * When dividing them
	 * Then their division tends to infinity
	 */
	@Test
	public void divideByZero() {
		
		Calculator calculator = new Calculator();
		Double a = 12.0;
		Double b = 0.0;
		Double division = calculator.divide(a, b);
		Assert.assertTrue(division == Double.MAX_VALUE);
	}
	
}
