package Main;

import java.util.ArrayList;
import java.util.Scanner;

import CustomerAccountDetails.Account;
import CustomerAccountDetails.Bank;
import CustomerAccountDetails.Customer;
import Exceptions.InvalidPassWordException;
import Exceptions.LowBalanceException;
import Exceptions.WrongCredentialsException;
import Storage.CustomerFile;


public class MainClass {

	static Scanner custInput = new Scanner(System.in);// Scanner Object for
														// fetching input
	String pwd;// to hold password
	ArrayList<Customer> customers = new ArrayList<Customer>();// list of
																// customers
	Customer newcustomer;
	CustomerFile store = new CustomerFile();// creating Object of customer file
											// to store customer
	Bank bank;

	/**
	 * Method to take details of Customer for user and verifing the Password
	 * and create a new customer
	 */
	public void enterDetails() {

		System.out.println("Enter your First Name:");
		String fname = custInput.next();
		System.out.println("Enter your Last Name:");
		String lname = custInput.next();

		System.out.println("Enter Customer Address:");
		String address = custInput.next();
		System.out.println("Enter a valid PassWord:");
		this.pwd = custInput.next();
		if (verify(this.pwd)) {

			newcustomer = new Customer(fname + lname, address, pwd);
			customers.add(newcustomer);
			bank = new Bank(customers);
			saveCustomer(newcustomer);
			// store.addRecords(bank);
			/*
			 * for (Customer customer : customers) {
			 * saveCustomer(customer);
			 * }
			 */
		} else {
			System.out.println("Unable to create customer");
		}



	}


	/**
	 * Method to verify password
	 * 
	 * @return boolean
	 *         true if it satisfy password laws else false
	 * @throws InvalidPassWordException
	 * 
	 */
	private boolean verify(String pwd) {
		if (pwd == null || pwd.length() < 4) {
			try {
				throw new InvalidPassWordException();
			}
			catch (InvalidPassWordException e) {

				System.out.println("Enter a valid PassWord that is atleast 4 characters:");
				pwd = custInput.next();
			}


		}

		return true;
	}

	/**
	 * Method to Login
	 * takes in customer name and Password
	 * if its valid credential user is logged
	 *
	 * @throws WrongCredentialsException
	 *             if credentials dont match
	 * 
	 */
	private void Login() throws WrongCredentialsException {
		System.out.println("Enter your Full Name:");
		String name = custInput.next();
		System.out.println("Enter your Password:");
		String pws = custInput.next();
		Bank bank = store.readRecords();
		ArrayList<Customer> customers = bank.getCustomers();

		for (Customer customer : customers) {

			if (customers.contains(customer)) {
				if (customer.getCustomerName().equalsIgnoreCase(name) && customer.getPassWord().equals(pws)) {
					System.out.println("Login SuccessFull!!");

					showSecondMenu(customer);
					break;
				} else {
					System.out.println("Unable to Login!! Invalid Credentials");
				}

			}
		}


	}

	/**
	 * Method to showSecondMenu
	 * displays menu for creating an account and fetching account the details
	 * 
	 * @param Customer
	 *            logged in customer object from whom the menu should be
	 *            displayed
	 * 
	 */
	private void showSecondMenu(Customer customer) {
		System.out.println("Welcome " + customer.getCustomerName() + "!!!");
		System.out.println("Select an Option");
		System.out.println("Enter 1 to createNewAccount!!");
		System.out.println("Enter 2 for AccountDetails!!");

		int option = custInput.nextInt();
		switch (option) {
			case 1:
				createNewAccount(customer);
				showAccountDetails(customer);

				break;
			case 2:

				showAccountDetails(customer);
				break;

		}

		System.out.println("Do you Wanna Continue with Second Menu!!!!");
		String reply = custInput.next();
		if (reply.equalsIgnoreCase("yes")) {
			showSecondMenu(customer);
		} else {
			showLastMenu(customer);
		}

	}

	/**
	 * Method to showLastMenu
	 * displays menu for operating on account
	 * 
	 * @param Customer
	 *            logged in customer object from whom the menu should be
	 *            displayed
	 * 
	 */
	private void showLastMenu(Customer customer) {
		System.out.println("Select an Option");
		System.out.println("Enter 1 to deposit");
		System.out.println("Enter 2 for balanceEnquiry");
		System.out.println("Enter 3 for withDrawal");
		int option = custInput.nextInt();

		switch (option) {
			case 1:
				// fetch account number and takes amount to be deposited and
				// deposits the amount
				System.out.println("Enter account to deposit from : " + customer.getAccounts());

				int accountNumber = custInput.nextInt();
				for (Account acc : customer.getAccounts()) {
					if (acc.getAccountNumber() == accountNumber) {
						System.out.println("Enter Amount to deposit:");
						double amount = custInput.nextDouble();
						acc.deposit(amount);
						saveCustomer(customer);
						break;
					}
				}

				break;
			case 2:
				// fetch account number and displays its balance

				System.out.println("Enter account for BalanceEnquiry from: " + customer.getAccounts());
				int accountNumber1 = custInput.nextInt();
				for (Account acc : customer.getAccounts()) {
					if (acc.getAccountNumber() == accountNumber1) {
						System.out.println("Your Balance For AccountNumer:" + acc.getAccountNumber() + " is:" + acc.getbalance());
						break;
					}
				}

				break;
			case 3:
				// fetch account number and takes amount to be withdrawn and
				// withdraws the amount
				System.out.println("Enter account for WithDrawal from:" + customer.getAccounts());
				int accountNumber2 = custInput.nextInt();
				for (Account acc : customer.getAccounts()) {
					if (acc.getAccountNumber() == accountNumber2) {
						System.out.println("Enter Amount to withdraw:");
						double amount = custInput.nextDouble();
						try {
							acc.withDraw(amount);
						}
						catch (LowBalanceException e) {
							System.out.println("Failed!!!");
							e.printStackTrace();
						}
						saveCustomer(customer);
						break;
					}
				}

				break;
			default:
				System.out.println("Invalid Input!!");
		}


		System.out.println("Do you Wanna Continue Transactions !!!!");
		String reply = custInput.next();
		if (reply.equalsIgnoreCase("yes")) {
			showLastMenu(customer);
		} else {

			Logout(customer);
		}
	}

	/**
	 * Method to Logout
	 *
	 * @param Customer
	 *            logged in customer object who has to logout
	 * 
	 */
	private void Logout(Customer customer) {
		showAccountDetails(customer);
		saveCustomer(customer);
		System.out.println("You are Logged out!! Thank you");

	}

	/**
	 * Method to CreateNewAccount
	 *
	 * @param Customer
	 *            logged in customer object who has to create new Account
	 * 
	 */
	private void createNewAccount(Customer customer) {
		System.out.println("Enter Account Type");
		String type = custInput.next();

		customer.addAccount(type);
		saveCustomer(customer);


	}

	/**
	 * Method to showAccountDetails
	 *
	 * @param Customer
	 *            logged in customer object who wants accountDetails
	 * 
	 */
	private void showAccountDetails(Customer customer) {
		System.out.println("Your Account Details are:");
		ArrayList<Account> accounts = customer.getAccounts();
		for (Account acc : accounts) {
			System.out.println(acc);

		}

	}

	/**
	 * Method to saveCustomer
	 * updates the customer details
	 *
	 * @param Customer
	 *            logged in customer object
	 */
	private void saveCustomer(Customer customer) {
		Bank bank = store.readRecords();
		customers = bank.getCustomers();
		if (customers.contains(customer)) {
			int index = customers.indexOf(customer);
			customers.remove(index);
		}
		customers.add(customer);
		Bank bank1 = new Bank(customers);
		store.addRecords(bank1);

	}

	public static void main(String args[]) {

		// MainClass object1 = new MainClass();

		/*
		 * object1.customers.add(new Customer("sneha", "mysore", "1234"));
		 * object1.customers.add(new Customer("snehashree", "mysore", "1234"));
		 * object1.customers.add(new Customer("rahul", "mysore", "1234"));
		 * object1.bank = new Bank(object1.customers);
		 * object1.store.addRecords(object1.bank);
		 */


		Scanner input = new Scanner(System.in);
		System.out.println("Select an Option:");
		System.out.println("Enter 1 for NewCustomer");
		System.out.println("Enter 2 for Login");
		int selectOption = input.nextInt();

		MainClass object = new MainClass();

		switch (selectOption) {
			case 1:

				System.out.println("You have selected NEW Customer");
				object.enterDetails();
				System.out.println("Do you want to Login!!");
				if (custInput.next().equalsIgnoreCase("yes"))
					try {
						object.Login();
					}
					catch (WrongCredentialsException e) {
						System.out.println("Please Login Again!!!");
						e.printStackTrace();

					}
				break;
			case 2:

				System.out.println("You have selected to Login");
				try {
					object.Login();
				}
				catch (WrongCredentialsException e) {
					System.out.println("Please Login Again!!!");
					e.printStackTrace();
				}
				break;
			default:
				System.out.println("Invalid option");
		}

	}


}
