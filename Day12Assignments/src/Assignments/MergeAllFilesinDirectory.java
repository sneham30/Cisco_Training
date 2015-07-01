package Assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * program to print contents of all files in a directory into a new File created
 * under same directory
 */

public class MergeAllFilesinDirectory {

	public static void main(String args[]) throws IOException {

		File dir = new File("directory");// Creating a directory
		// if directory exists then process all the files in it
		if (dir.exists()) {

			// gives list of names of all the files under the given directory
			String files[] = dir.list();

			// creating a new file in the directory to copy contents of all
			// files of directory
			File dirData = new File("dirData.txt");

			// creating printWriter object to write into dirData.txt file
			PrintWriter out = new PrintWriter(new FileWriter(dirData, true));

			/*
			 * for every file in directory create a bufferReader Object and read
			 * line by line and write into new file dirData.txt
			 */

			for (String file : files) {
				try {
					BufferedReader buffer = new BufferedReader(new FileReader(
							file));
					String line = null;
					while ((line = buffer.readLine()) != null) {
						out.println(line);
					}


				}
				catch (FileNotFoundException e) {
					System.out.println("No Such File in Directory");
					e.printStackTrace();
				}
				catch (IOException e) {
					System.out.println("IOException during processing files in directory");
					e.printStackTrace();
				}
			}
			out.flush();
			out.close();
			System.out.println("Contents of dirData.txt");
			BufferedReader buffer = new BufferedReader(new FileReader(dirData));
			String line = null;
			while ((line = buffer.readLine()) != null) {
				System.out.println(line);
			}

		} else {
			System.out.println("Directory " + dir.getName() + " doesn't exists");
		}
	}
}
