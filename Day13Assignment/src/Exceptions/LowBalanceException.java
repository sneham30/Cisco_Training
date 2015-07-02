package Exceptions;


public class LowBalanceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LowBalanceException() {
		System.out.println("Your balance is Low to withDraw this Amount!!!");
	}



}
