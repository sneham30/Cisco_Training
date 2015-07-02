package CustomerAccountDetails;

import java.io.Serializable;
import java.util.ArrayList;


public class Customer implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String customerName;
	private int customerNumber;
	private String address;
	private String passWord;
	private ArrayList<Account> accounts = new ArrayList<Account>();
	int count = 0;

	public Customer(String customerName, String address, String passWord) {
		this.customerName = customerName;
		this.address = address;
		this.passWord = passWord;
		this.accounts = getAccounts();
		this.customerNumber = generateNewCustomerNumber();
		System.out.println("Customer Created!!!");

	}

	private int generateNewCustomerNumber() {
		/* Random random = new Random(); */
		int numb = 100;
		numb = numb + count++;
		return numb;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}

	public void addAccount(String accountType) {
		Account account = new Account(this.customerName, accountType);
		this.accounts.add(account);
		setAccounts(accounts);
	}

	@Override
	public String toString() {
		return "CustomerName: " + customerName + "\n" + "CustomerNumber:" + customerNumber + " \n" + "Address:" + address;
	}


}
