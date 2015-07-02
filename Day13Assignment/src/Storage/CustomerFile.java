package Storage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import CustomerAccountDetails.Customer;



public class CustomerFile {

	// static int count = 0;


	File file = new File("CustomerDetails.txt");



	public void addRecords(ArrayList<Customer> customers) {
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);


			oos.writeObject(customers);


			oos.flush();
			oos.close();

		}
		catch (IOException e) {
			System.out.println("Exception while writing to " + file.getName());
			e.printStackTrace();
		}

	}

	@SuppressWarnings({ "resource" })
	public ArrayList<Customer> readRecords() {
		ArrayList<Customer> list = new ArrayList<Customer>();
		try {

			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			list = (ArrayList<Customer>) ois.readObject();
			// System.out.println(list);

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

		return list;

	}
}
