package Exceptions;


public class InvalidPassWordException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public InvalidPassWordException() {

		System.out.println("Your Password doesn't satisfy Password Laws!!!");
		System.out.println("Please enter Valid Password!!");
	}

}
