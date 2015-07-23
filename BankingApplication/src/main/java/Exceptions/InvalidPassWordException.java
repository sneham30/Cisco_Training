package Exceptions;

/*
 * Exception Class for InvalidPassword
 */

public class InvalidPassWordException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/* constrcutor for InvalidPasswordException */
	public InvalidPassWordException() {
		super();
		System.out.println("Your Password doesn't satisfy Password Laws!!!");
		System.out.println("Please enter Valid Password!!");
	}

}
