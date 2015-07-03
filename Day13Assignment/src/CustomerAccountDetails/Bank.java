package CustomerAccountDetails;

import java.io.Serializable;
import java.util.ArrayList;

/*
 * class to hold list of customers in the bank
 */
public class Bank implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<Customer> customers;

	public Bank(ArrayList<Customer> customers) {
		this.customers = customers;
	}

	public ArrayList<Customer> getCustomers() {
		return this.customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}
}
