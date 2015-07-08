package com.cisco.coe.ArithmaticOperations;

/**
 * class to perform arithematic operations
 *
 */
public class App {

	public static void main(String[] args) {
		int sum = ArithematicOpearations.addition(12, 23, 14);
		System.out.println("sum(12,23,14) :" + sum);

		int prod = ArithematicOpearations.mutiply(2, 3, 8);
		System.out.println("Prod(2,3,8) :" + prod);

		int diff = ArithematicOpearations.subtraction(102, 96);
		System.out.println("diff(102,96) :" + diff);

		int quotient = ArithematicOpearations.division(25, 0);
		System.out.println("div(25,5) :" + quotient);
	}
}
