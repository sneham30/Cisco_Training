package DataBaseHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import CustomerAccountDetails.Customer;


public class CustomersHelper {

	Customer customer;
	DataBaseHelper dbhelper = new DataBaseHelper();
	Connection conn = dbhelper.createConnection();


	public CustomersHelper(Customer customer) {
		this.customer = customer;
	}

	public CustomersHelper() {
		System.out.println("this is default Constructor for CustomersHelper");
	}

	public void insertIntoTable() {
		if (conn != null) {

			try {
				String sql = "insert into Customers values(?,?,?,?)";
				PreparedStatement statement = conn.prepareStatement(sql);
				statement.setInt(1, customer.getCustomerNumber());
				statement.setString(2, customer.getCustomerName());
				statement.setString(3, customer.getAddress());
				statement.setString(4, customer.getPassWord());
				statement.execute();

				statement.close();
				conn.close();
			}


			catch (SQLException e) {
				System.out.println("Exception during inserting into Customers table");
				e.printStackTrace();
			}

		}

	}


	public ArrayList<Customer> fetchRecords() {
		ArrayList<Customer> list = new ArrayList<Customer>();
		if (conn != null) {

			try {
				String sql = "select * from Customers";
				Statement statement = conn.createStatement();
				ResultSet results = statement.executeQuery(sql);
				while (results.next()) {

					int custNumber = results.getInt("CUSTOMERNUMBER");
					String custName = results.getString("CUSTOMERNAME");
					String address = results.getString("ADDRESS");
					String password = results.getString("PASSWORD");
					Customer cust = new Customer(custNumber, custName, address,
							password);
					list.add(cust);

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

	public ArrayList<Customer> fetchRecords(String name) {
		ArrayList<Customer> list = new ArrayList<Customer>();
		if (conn != null) {

			try {
				String sql = "select * from Customers where CUSTOMERNAME=?";
				PreparedStatement statement = conn.prepareStatement(sql);
				statement.setString(1, name);
				ResultSet results = statement.executeQuery();
				while (results.next()) {

					int custNumber = results.getInt("CUSTOMERNUMBER");
					String custName = results.getString("CUSTOMERNAME");
					String address = results.getString("ADDRESS");
					String password = results.getString("PASSWORD");
					Customer cust = new Customer(custNumber, custName, address,
							password);
					list.add(cust);

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


}
