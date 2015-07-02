package Main;

import java.util.ArrayList;
import java.util.Scanner;

import CustomerAccountDetails.Account;
import CustomerAccountDetails.Customer;
import Exceptions.InvalidPassWordException;
import Exceptions.LowBalanceException;
import Exceptions.WrongCredentialsException;
import Storage.CustomerFile;


public class MainClass {

	static Scanner custInput = new Scanner(System.in);
	String pwd;
	ArrayList<Customer> customers = new ArrayList<Customer>();

	CustomerFile store = new CustomerFile();

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

			Customer newcustomer = new Customer(fname + lname, address, pwd);
			customers.add(newcustomer);

			store.addRecords(customers);
			/*
			 * for (Customer customer : customers) {
			 * saveCustomer(customer);
			 * }
			 */
		} else {
			System.out.println("Unable to create customer");
		}



	}

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

	private void Login() throws WrongCredentialsException {
		System.out.println("Enter your Full Name:");
		String name = custInput.next();
		System.out.println("Enter your Password:");
		String pws = custInput.next();

		ArrayList<Customer> customers = store.readRecords();

		for (Customer customer : customers) {
			System.out.println("Customer Details");
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

	private void showLastMenu(Customer customer) {
		System.out.println("Select an Option");
		System.out.println("Enter 1 to deposit");
		System.out.println("Enter 2 for balanceEnquiry");
		System.out.println("Enter 3 for withDrawal");
		int option = custInput.nextInt();
		switch (option) {
			case 1:
				System.out.println("Enter account to deposit:");
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

				System.out.println("Enter account for BalanceEnquiry:");
				int accountNumber1 = custInput.nextInt();
				for (Account acc : customer.getAccounts()) {
					if (acc.getAccountNumber() == accountNumber1) {
						System.out.println("Your Balance For AccountNumer:" + acc.getAccountNumber() + " is:" + acc.Checkbalance());
						break;
					}
				}

				break;
			case 3:

				System.out.println("Enter account for WithDrawal:");
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
			System.out.println("Your Logged out!!");
		}
	}

	private void createNewAccount(Customer customer) {
		System.out.println("Enter Account Type");
		String type = custInput.next();

		customer.addAccount(type);
		saveCustomer(customer);


	}

	private void showAccountDetails(Customer customer) {
		System.out.println("Your Account Details are:");
		ArrayList<Account> accounts = customer.getAccounts();
		for (Account acc : accounts) {
			System.out.println(acc);

		}

	}

	private void saveCustomer(Customer customer) {
		customers.add(customer);
		store.addRecords(customers);

	}

	public static void main(String args[]) {

		MainClass object1 = new MainClass();
		/*
		 * object1.customers.add(new Customer("sneha", "mysore",
		 * "12234").addAccount("credit"));
		 * object1.customers.add(new Customer("rahul", "bangalore", "12234"));
		 * object1.customers.add(new Customer("arun", "tumkur", "12234"));
		 * object1.customers.add(new Customer("krithika", "mysore", "12234"));
		 * object1.store.addRecords(object1.customers);
		 */
		Customer customer1 = new Customer("sneha", "mysore", "12345");
		customer1.addAccount("credit");
		customer1.addAccount("credit");
		Customer customer2 = new Customer("shree", "mysore", "12345");
		customer2.addAccount("debit");
		customer2.addAccount("credit");
		object1.customers.add(customer1);
		object1.customers.add(customer2);
		object1.store.addRecords(object1.customers);

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
