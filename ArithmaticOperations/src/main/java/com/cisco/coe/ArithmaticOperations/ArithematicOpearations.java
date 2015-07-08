package com.cisco.coe.ArithmaticOperations;

/*
 * class for arithematic operations
 */
public class ArithematicOpearations {

	/**
	 * Method to add number of integers
	 *
	 * @param num
	 *            integer variable arguments num
	 * 
	 * @return sum
	 *         - integer sum of integers
	 * 
	 */
	public static int addition(int... num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		return sum;
	}

	/**
	 * Method to subtract two integers
	 *
	 * @param m
	 *            integer to subtract from
	 * @param n
	 *            integer to subtract
	 * 
	 * @return diff
	 *         - difference of 2 integers
	 * 
	 */
	public static int subtraction(int m, int n) {
		return m - n;
	}

	/**
	 * Method to multiply number of integers
	 *
	 * @param num
	 *            integer variable arguments num
	 * 
	 * @return prod
	 *         - integer product of integers
	 * 
	 */
	public static int mutiply(int... num) {
		int prod = 1;
		for (int i = 0; i < num.length; i++) {
			prod = prod * num[i];
		}
		return prod;

	}

	/**
	 * Method to divide two integers
	 *
	 * @param m
	 *            integer dividend
	 * @param n
	 *            integer divident
	 * 
	 * @return quotient
	 *         - integer result of two number's division
	 * 
	 */
	public static int division(int m, int n) {
		int quotient = 0;
		if (m > n && n != 0) {
			quotient = m / n;
		}
		return quotient;
	}

}
