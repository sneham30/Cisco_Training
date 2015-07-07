package Main;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import DataBaseHelper.DataBaseHelper;
import Model.Employee;


public class MainClass {


	public static void main(String[] args) {
		// creating an object of databaseHelper class
		DataBaseHelper dbHelper = new DataBaseHelper();

		// calling creat connection of dataBasehelper
		Connection conn = dbHelper.createConnection();

		int month = 1;
		int day = 12;
		int year = 15;

		// Creating an array of employees and adding employee objects to it
		Employee[] employees = new Employee[5];
		for (int loop = 0; loop < 5; loop++) {
			System.out.println("Enter Name:");
			Scanner scan = new Scanner(System.in);
			String name = scan.next();
			System.out.println("Enter Designation:");
			String designation = scan.next();
			employees[loop] = new Employee(loop, name, new Date(year++,
					month++, day++), designation);
		}

		// for every element in employees list insert it into the employee table
		// of database

		for (Employee emp : employees) {
			try {
				String sql = "insert into Employee values(?,?,?,?)";
				java.sql.PreparedStatement statement = conn.prepareStatement(sql);
				statement.setInt(1, emp.getEmpId());
				statement.setString(2, emp.getEmpName());
				statement.setDate(3, (java.sql.Date) emp.getJoiningDate());
				statement.setString(4, emp.getDesignation());
				statement.execute();
				statement.close();
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		showTable(conn);


		try {
			String sql = "Select EMPNAME from Employee where EMPID=1";
			Statement statement = conn.createStatement();
			System.out.println("Employee with empid 1 is:");
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString("EMPNAME"));
			}

		}
		catch (SQLException e1) {

			e1.printStackTrace();
		}
		System.out.println("After deleting:");
		try {
			String sql = "Delete from Employee where joiningdate='1917-04-14'";
			Statement statement = conn.createStatement();


			statement.execute(sql);

		}
		catch (SQLException e1) {

			e1.printStackTrace();
		}

		showTable(conn);

		System.out.println("UPDATING EMPNAME:");
		try {
			String sql = "update Employee set EMPNAME='harsha' where EMPID=?";
			java.sql.PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, 4);

			statement.execute();
			statement.close();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		showTable(conn);
		try {
			conn.close();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void showTable(Connection conn) {
		System.out.println("Employee table:");
		try {
			String sql = "Select * from Employee";
			Statement statement = conn.createStatement();

			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				System.out.print("Name:" + rs.getString("EMPNAME") + "\t");
				System.out.print("ID:" + rs.getInt("EMPID"));
				System.out.println();
			}


		}
		catch (SQLException e1) {

			e1.printStackTrace();
		}


	}
}
