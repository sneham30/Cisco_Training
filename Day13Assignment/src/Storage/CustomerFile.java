package Storage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import CustomerAccountDetails.Bank;

/*
 * Class for performing file write and read operations
 * or for storing customer details
 */

public class CustomerFile {


	// Crerating a File Object
	File file = new File("BankDetails.txt");

	/**
	 * Method to add records into file
	 * Adds arraylist of objects of Customer into file
	 * if file already exists it appends it else a new file is created
	 * Uses ObjectOutputStream to Write Serializable list of objects of Customer
	 * 
	 * @param ArrayList
	 *            <Customer>
	 *            list of customer objects to be added into File
	 * 
	 */
	public void addRecords(Bank bank) {
		FileOutputStream fos;
		try {
			if (file.exists()) {
				fos = new FileOutputStream(file.getAbsolutePath());

			} else {
				fos = new FileOutputStream(file);

			}
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(bank);


			oos.flush();
			oos.close();
		}
		catch (IOException e) {
			System.out.println("Exception while writing to " + file.getName());
			e.printStackTrace();
		}

	}

	/**
	 * Method to read records from file
	 * Reads arraylist of objects of Customer from file
	 * Uses ObjectInputStream to read the Object written into file
	 * 
	 * @returns ArrayList
	 *          <Customer>
	 *          list of customer objects to be added into File
	 * 
	 */
	@SuppressWarnings({ "resource", "unchecked" })
	public Bank readRecords() {
		Bank bank = null;
		try {

			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			bank = (Bank) ois.readObject();
			System.out.println("Customers available: " + bank.getCustomers());

		}
		catch (FileNotFoundException e) {
			System.out.println("Exception while reading " + file.getName());
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("Exception while reading " + file.getName());
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return bank;

	}


}
