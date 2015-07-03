package CustomerAccountDetails;

import java.io.Serializable;

import Exceptions.LowBalanceException;


/*
 * Class for Account Details which implements Serializable interface, thus
 * making its objects to get stored on a file
 */

public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int accountNumber;// int for holding unique accountNumber
	private String accountHolderName;// String accountholderName for account
										// holder's name
	private String accountType;// String accountType for type of account
	private double balance;// Double balance for available/current balance

	int count = 0;// count used for generating unique accountNumber

	/**
	 * Parameterized Constructor for Account
	 * takes in two String
	 *
	 * @param accountHolderName
	 *            String for AccountHolder's name
	 * @param accountType
	 *            String for accountType ( debit / credit)
	 * 
	 */
	public Account(String accountHolderName, String accountType) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = generateNewAccountNumber();
		this.accountType = accountType;
		this.balance = intialBalance(accountType);

	}

	/**
	 * Method to initialize Balance of an account based on the account type
	 * debit account has zero balance and a credit limit would be 15000
	 *
	 * @param accountType
	 *            String for accountType ( debit / credit)
	 * 
	 */
	private double intialBalance(String accountType) {

		switch (accountType) {
			case "debit":
				setbalance(0.0);
				break;
			case "credit":
				setbalance(15000);
				break;
			default:
				System.out.println("Invalid account Type");
		}

		return getbalance();
	}

	/**
	 * Method to generate Unique AccountNumber
	 * Every Account has an unique number
	 *
	 */
	private int generateNewAccountNumber() {

		int numb = 10000;
		numb = numb + count++;
		return numb;
	}

	/**
	 * Method to get AccountNumber
	 * returns accountNumber
	 * 
	 * @return accountNumber
	 *         - int unique accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Method to set AccountNumber
	 * 
	 * @param int
	 *        unique accountNumber
	 * 
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * Method to get AccountHolderName
	 * returns accountHolderName
	 *
	 * @return accountHolderName
	 *         - String accountHolderName name of accountHolder
	 *
	 */
	public String getAccountHolderName() {
		return accountHolderName;
	}

	/**
	 * Method to set AccountHolderName
	 * 
	 * @param String
	 *            accountHolderName name of accountHolder
	 * 
	 */
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	/**
	 * Method to get AccountType
	 * returns accountType
	 *
	 * @return accountType
	 *         - String accountType
	 *
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * Method to set AccountType
	 * 
	 * @param String
	 *            accountType
	 * 
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * Method to get current balance of account
	 * returns balance
	 *
	 * @return balance
	 *         -double current balance
	 *
	 */

	public double getbalance() {
		return balance;
	}

	/**
	 * Method to set balance
	 * 
	 * @param double
	 *        current balance
	 * 
	 */

	public void setbalance(double balance) {
		this.balance = balance;
	}

	/**
	 * Method to deposit an amount
	 * increase the available balance
	 * 
	 * @param double
	 *        amount to be deposited
	 * 
	 */
	public void deposit(double amount) {
		this.balance = this.balance + amount;
		System.out.println("Deposit successfull!!! Your balance : " + this.balance);
	}

	/**
	 * Method to withdraw some amount
	 * Checks is zero balance if not debit the amount from current balance
	 * modify the available balance accordingly
	 * 
	 * @param double
	 *        amount to be withdrawn
	 * @throws LowBalanceException
	 *             if the balance is zero or if the amount specified is more
	 *             than the available balance
	 */
	public void withDraw(double amount) throws LowBalanceException {
		if (!isNil()) {
			double bal = getbalance();
			if (amount <= bal) {
				this.balance = this.balance - amount;
				System.out.println("withDrawal Successfull!!! Your curent balance:" + this.balance);
			} else {
				throw new LowBalanceException();
			}
		} else {
			throw new LowBalanceException();
		}
	}

	/**
	 * Method to check for zero balance
	 * returns true if balance is zero else returns false
	 * 
	 * @return boolean
	 *         true if zero balance else false
	 * 
	 */

	private boolean isNil() {
		if (this.balance == 0)
			return true;
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * toString overriden to print account details
	 */
	@Override
	public String toString() {
		return "CustomerName: " + accountHolderName + "\n" + "AccountNumber:" + accountNumber + " \n" + "Type:" + accountType + "\n" + "Balance:" + balance;
	}
}
