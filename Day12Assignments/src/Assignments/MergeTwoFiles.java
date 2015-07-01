package Assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Program to merge to file contents into new file
 */

public class MergeTwoFiles {

	/**
	 * Method to write a File with contents passed to it.
	 * Uses FileWriter Object to write content into file and to close the file
	 *
	 * @param file
	 *            a File Object
	 * @param content
	 *            String content to be written into File
	 * @throws IOException
	 *             if the named file exists but is a directory rather
	 *             than a regular file, does not exist but cannot be
	 *             created, or cannot be opened for any other reason
	 */
	private static void writeFile(File file, String content) {

		try {
			FileWriter filewriter = new FileWriter(file);
			/*
			 * filewriter.write(file.getName() + " contents!!!");
			 * filewriter.write("\n");
			 */
			filewriter.write(content);
			filewriter.flush();
			filewriter.close();
		}
		catch (IOException e) {
			System.out.println("Exception occcured while writing to " + file.getName());
			e.printStackTrace();
		}

	}

	/**
	 * Method to read a File.
	 * Uses FileReader Object to read contents from file and to close the file
	 *
	 * @param file
	 *            a File Object
	 * 
	 * @throws IOException
	 *             if the named file exists but is a directory rather
	 *             than a regular file, does not exist but cannot be
	 *             created, or cannot be opened for any other reason
	 * @return content
	 *         - String content read from File
	 */
	private static String readFile(File file) {
		String content = "";
		try {
			FileReader fileReader = new FileReader(file);
			int i = 0;
			while (i != -1) {
				content = content + (char) i;
				i = fileReader.read();
			}
			fileReader.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("Exception occcured while reading from " + file.getName());
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("Exception occcured while reading from " + file.getName());
			e.printStackTrace();
		}

		return content;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		File file1 = new File("file1.txt");
		File file2 = new File("file2.txt");
		File mergeFile = new File("mergeFile.txt");


		writeFile(file1, "hii " + file1.getName());// writes into File1
		// writeFile(file1, file1.getName());// writes into File1
		writeFile(file2, "hii " + file2.getName());// writes into File2
		// writeFile(file2, file2.getName());// writes into File2

		String contentFile1 = readFile(file1);// reads from File1
		String contentFile2 = readFile(file2);// reads from File2

		// writes contents Of File1 & file2 into merge File
		writeFile(mergeFile, contentFile1 + "\n" + contentFile2);

		String mergeContent = readFile(mergeFile);
		System.out.println("File1 contents:" + contentFile1);
		System.out.println("File2 contents:" + contentFile2);
		System.out.println("MergeFile contents:" + mergeContent);



	}



}
