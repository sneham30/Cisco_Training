package DataBaseHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import CustomerAccountDetails.Account;


public class AccountsHelper {

	Account account;
	DataBaseHelper dbhelper = new DataBaseHelper();
	Connection conn = dbhelper.createConnection();

	/*
	 * public AccountsHelper() {
	 * System.out.println("this is the defualt constructor of AccountsHelper");
	 * }
	 */

	public AccountsHelper(Account account) {
		this.account = account;
	}



	public void insertIntoTable() {
		if (conn != null) {

			try {
				String sql = "insert into Accounts values(?,?,?,?)";
				PreparedStatement statement = conn.prepareStatement(sql);
				statement.setInt(1, account.getAccountNumber());
				statement.setString(2, account.getAccountHolderName());
				statement.setString(3, account.getAccountType());
				statement.setDouble(4, account.getbalance());
				statement.execute();

				statement.close();
				conn.close();
			}


			catch (SQLException e) {
				System.out.println("Exception during inserting into Accounts table");
				e.printStackTrace();
			}

		}

	}


	public ArrayList<Account> fetchRecords() {
		ArrayList<Account> list = new ArrayList<Account>();
		if (conn != null) {

			try {
				String sql = "select * from Accounts";
				Statement statement = conn.createStatement();
				ResultSet results = statement.executeQuery(sql);
				while (results.next()) {

					int accNo = results.getInt("ACCOUNTNUMBER");
					String accName = results.getString("ACCOUNTHOLDERNAME");
					String accType = results.getString("ACCOUNTTYPE");
					double balance = results.getDouble("BALANCE");
					Account acc = new Account(accNo, accName, accType, balance);
					list.add(acc);

				}

				statement.close();
				conn.close();
			}


			catch (SQLException e) {
				System.out.println("Exception while fecting from Accounts table");
				e.printStackTrace();
			}

		}


		return list;

	}

	public ArrayList<Account> fetchRecords(String name) {
		ArrayList<Account> list = new ArrayList<Account>();
		if (conn != null) {

			try {
				String sql = "select * from Accounts where ACCOUNTHOLDERNAME=?";
				PreparedStatement statement = conn.prepareStatement(sql);
				statement.setString(1, name);
				ResultSet results = statement.executeQuery();
				while (results.next()) {

					int accNo = results.getInt("ACCOUNTNUMBER");
					String accName = results.getString("ACCOUNTHOLDERNAME");
					String accType = results.getString("ACCOUNTTYPE");
					double balance = results.getDouble("BALANCE");
					Account acc = new Account(accNo, accName, accType, balance);
					list.add(acc);

				}

				statement.close();
				conn.close();
			}


			catch (SQLException e) {
				System.out.println("Exception while fecting from Accounts table");
				e.printStackTrace();
			}

		}


		return list;

	}

	/**
	 * 
	 */
	public AccountsHelper() {
	}


}
