package com.cisco.coe.ArithmaticOperations;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author sneham
 *
 */
public class ArithematicOperationsTest extends TestCase {

	private int value1;
	private int value2;


	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public ArithematicOperationsTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		value1 = 3;
		value2 = 5;
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		value1 = 0;
		value2 = 0;
	}

	/*
	 * test cases to test addition method
	 */
	public void testAdd() {
		int total = 8;
		int sum = ArithematicOpearations.addition(value1, value2);
		assertEquals(sum, total);
	}

	public void testFailedAdd() {
		int total = 9;
		int sum = ArithematicOpearations.addition(value1, value2);
		assertNotSame(sum, total);
	}

	/*
	 * test cases to test mutplication method
	 */
	public void testMultiplication() {
		int product = 15;
		int prod = ArithematicOpearations.addition(value1, value2);
		assertEquals(prod, product);
	}

	public void testFailedMultiplication() {
		int product = 15;
		int prod = ArithematicOpearations.addition(value1, value2);
		assertNotSame(prod, product);
	}

	/*
	 * test case for subtraction
	 */
	public void testSubtratction() {
		int diff = 0;
		int sub = ArithematicOpearations.subtraction(4, 4);
		assertEquals(sub, diff);
	}


	/*
	 * test cases for division
	 */
	public void testDivision() {
		int expectedQuotient = 1;
		int quotient = ArithematicOpearations.division(4, 4);
		assertEquals(quotient, expectedQuotient);
	}

	public void testFailedDivision() {
		int expectedQuotient = 0;
		int quotient = ArithematicOpearations.division(4, 0);
		assertEquals(quotient, expectedQuotient);
	}
}
