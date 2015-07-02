package CustomerAccountDetails;

import java.io.Serializable;

import Exceptions.LowBalanceException;


/*
 * Class for Account Details
 */

public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int accountNumber;
	private String accountHolderName;
	private String accountType;
	private double balance;
	private static int count = 0;

	public Account(String accountHolderName, String accountType) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = generateNewAccountNumber();
		this.accountType = accountType;
		this.balance = intialBalance(accountType);

	}

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

	private int generateNewAccountNumber() {

		int numb = 10000;
		numb = numb + count++;
		return numb;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getbalance() {
		return balance;
	}

	public void setbalance(double balance) {
		this.balance = balance;
	}

	public double Checkbalance() {
		return this.balance;
	}

	public void deposit(double amount) {
		this.balance = this.balance + amount;
		System.out.println("Deposit successfull!!! Your balance : " + this.balance);
	}

	public void withDraw(double amount) throws LowBalanceException {
		if (!isNil()) {
			double bal = Checkbalance();
			if (amount <= bal) {
				this.balance = this.balance - amount;
				System.out.println("withDrawal Successfull!!! Your curent balance:" + this.balance);
			}
		} else {
			throw new LowBalanceException();
		}
	}

	private boolean isNil() {
		if (this.balance == 0)
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "CustomerName: " + accountHolderName + "\n" + "AccountNumber:" + accountNumber + " \n" + "Type:" + accountType + "\n" + "Balance:" + balance;
	}
}
