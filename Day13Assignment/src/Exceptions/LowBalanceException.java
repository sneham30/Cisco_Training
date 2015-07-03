package Exceptions;

/*
 * Exception Class for LowBalance
 */
public class LowBalanceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/* constrcutor for LowBalanceException */
	public LowBalanceException() {
		super();
		System.out.println("Your balance is Low to withDraw this Amount!!!");
	}



}
