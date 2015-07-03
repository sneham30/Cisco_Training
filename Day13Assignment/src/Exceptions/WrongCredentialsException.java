package Exceptions;

/*
 * Exception Class for WrongCredentials Thrown during Login
 */

public class WrongCredentialsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/* constrcutor for WrongCredentialsException */
	public WrongCredentialsException() {
		super();
		System.out.println("Your Credentials are InVaild!!! ");
	}



}
