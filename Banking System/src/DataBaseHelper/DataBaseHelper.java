package DataBaseHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * class databaseHelper helps us to connect to the database
 */

public class DataBaseHelper {

	// final variable to hold database url
	public final String DBURL = "jdbc:derby:D:\\Users\\sneham\\MyDB;create=true;";

	/**
	 * Method to create a connection
	 * Creates an object of Driver and calls DriverManager.getConnection() with
	 * dbURl
	 * 
	 * @return Connection
	 *         - Connection Object if connected successfully else null
	 * 
	 */
	public Connection createConnection() {
		Connection conn = null;

		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			conn = DriverManager.getConnection(DBURL);
		}
		catch (ClassNotFoundException e) {
			System.out.println("Exception occured during finding Driver Class");
			e.printStackTrace();
		}
		catch (SQLException e) {
			System.out.println("Exception occured while trying to connect to database");
			e.printStackTrace();
		}

		return conn;
	}



}
