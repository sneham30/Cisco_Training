package CustomerAccountDetails;

import java.io.Serializable;
import java.util.ArrayList;

/*
 * Class for Customer Details which implements Serializable interface, thus
 * making its objects to get stored on a file
 */


public class Customer implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String customerName;// String for Customer Name
	private int customerNumber;// int for holding unique customerNumber
	private String address;// String for address of the Customer
	private String passWord;// String for holding passWord of the customer

	// list of accounts the customer holds
	private ArrayList<Account> accounts = new ArrayList<Account>();

	static int count;// count used for generating unique customerNumber


	/**
	 * Parameterized Constructor for Customer
	 * takes in three String
	 *
	 * @param customerName
	 *            String for Customer name
	 * @param address
	 *            String for Customer Address
	 * @param passWord
	 *            String for Customer's Password
	 * 
	 */
	public Customer(String customerName, String address, String passWord) {
		this.customerName = customerName;
		this.address = address;
		this.passWord = passWord;
		this.accounts = getAccounts();
		this.customerNumber = generateNewCustomerNumber(count++);
		System.out.println("Customer Created!!!");

	}

	public Customer(int custNumber, String custName, String address,
			String password) {
		this.customerName = custName;
		this.address = address;
		this.passWord = password;
		this.accounts = getAccounts();
		this.customerNumber = custNumber;
		System.out.println("Customer Created!!!");

	}

	/**
	 * Method to generate Unique CustomerNumber
	 * Every Customer has an unique number
	 * 
	 * @param count
	 *
	 */
	private int generateNewCustomerNumber(int count) {

		int numb = this.hashCode();
		numb = numb + count;
		return numb;
	}

	/**
	 * Method to get CustomerNumber
	 * returns customerNumber
	 * 
	 * @return customerNumber
	 *         - int unique customerNumber
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * Method to set CustomerNumber
	 * 
	 * @param int
	 *        unique customerNumber
	 * 
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * Method to get CustomerName
	 * returns customerName
	 *
	 * @return customerName
	 *         - String customerName
	 *
	 */
	public int getCustomerNumber() {
		return customerNumber;
	}

	/**
	 * Method to set CustomerName
	 * 
	 * @param String
	 *            customerName
	 * 
	 */
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	/**
	 * Method to get Address
	 * returns address
	 *
	 * @return address
	 *         - String address of customer
	 *
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Method to set Address
	 * 
	 * @param String
	 *            address of customer
	 * 
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Method to get Password
	 * returns password
	 *
	 * @return password
	 *         - String password of customer
	 *
	 */
	public String getPassWord() {
		return passWord;
	}

	/**
	 * Method to set Password
	 * 
	 * @param String
	 *            password of customer
	 * 
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	/**
	 * Method to get Accounts
	 * returns ArrayList of Accounts
	 *
	 * @return accounts
	 *         - ArrayList of Accounts of the Customer
	 *
	 */
	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	/**
	 * Method to set Accounts
	 * 
	 * @param ArrayList
	 *            <Account>
	 *            List of Accounts of the Customer
	 * 
	 */
	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}

	/**
	 * Method to add an amount
	 * Creates an object of Account with customerName and accountType as params
	 * Adds new Account to list of accounts of the customer
	 * 
	 * 
	 * @param String
	 *            type of account to be added
	 * 
	 */
	public void addAccount(String accountType) {
		Account account = new Account(this.customerName, accountType);
		this.accounts.add(account);
		setAccounts(accounts);
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * toString overriden to print customer details
	 */
	@Override
	public String toString() {
		return "CustomerName: " + customerName + "\n" + "CustomerNumber:" + customerNumber + " \n" + "Address:" + address;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Customer) {
			Customer cust = (Customer) obj;
			if (cust.getCustomerNumber() == this.customerNumber) { return true; }
		}
		return false;
	}


}
