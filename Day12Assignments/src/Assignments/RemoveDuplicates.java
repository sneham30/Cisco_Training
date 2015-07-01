package Assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashSet;
import java.util.Scanner;


public class RemoveDuplicates {

	/**
	 * Method to write a File with contents passed to it.
	 * Uses PrintWriter Object to write content into file and to close the file
	 *
	 * @param file
	 *            a File Object
	 * @param contents
	 *            []
	 *            String array of contents to be written into File
	 * @throws IOException
	 *             if the named file exists but is a directory rather
	 *             than a regular file, does not exist but cannot be
	 *             created, or cannot be opened for any other reason
	 */
	private static void writeFile(File file, Object[] contents) {

		try {
			PrintWriter printwriter = new PrintWriter(file);
			for (Object content : contents) {
				printwriter.println(content);
			}
			printwriter.flush();
			printwriter.close();
		}
		catch (IOException e) {
			System.out.println("Exception occcured while writing to " + file.getName());
			e.printStackTrace();
		}

	}

	/**
	 * Method to Merge 2 files such that merge file has no duplicates lines of
	 * two files.
	 * Uses LinkedHashSet to avoid duplicates itno the mergeFile
	 * 
	 * @param file1
	 *            a File Object to be merged
	 * @param file2
	 *            a File Object to be merged
	 * @param mergeFile
	 *            a File Object into which merged contents are written
	 * 
	 * @throws IOException
	 *             if the named file exists but is a directory rather
	 *             than a regular file, does not exist but cannot be
	 *             created, or cannot be opened for any other reason
	 * 
	 */
	@SuppressWarnings({ "resource", "unchecked" })
	private static void mergeFiles(File file1, File file2, File mergeFile) {

		try {

			@SuppressWarnings("rawtypes")
			LinkedHashSet set = new LinkedHashSet();
			Scanner list1 = new Scanner(file1);
			Scanner list2 = new Scanner(file2);

			String line1 = null;
			String line2 = null;
			while (list1.hasNext() || list2.hasNext()) {
				if (list1.hasNext()) {
					line1 = list1.nextLine();
				}
				if (list2.hasNext()) {
					line2 = list2.nextLine();
				}
				set.add(line1);
				set.add(line2);

			}
			Object[] lines = set.toArray();
			writeFile(mergeFile, lines);

		}
		catch (FileNotFoundException e) {
			System.out.println("Exception occcured while merging!!");
			e.printStackTrace();
		}


	}

	/**
	 * Method to read a File.
	 * Uses BufferReader Object to read contents from file and to close the file
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
			BufferedReader buffer = new BufferedReader(fileReader);
			int i = 0;
			while (i != -1) {
				content = content + (char) i;
				i = buffer.read();
			}
			buffer.close();
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

	public static void main(String[] args) {


		File file1 = new File("text.txt");
		File file2 = new File("text1.txt");
		File mergeFile = new File("noDuplicate.txt");

		String file1Contents[] = { "hi", "hello", "over!!" };
		String file2Contents[] = { "hi", "hello", "over!!", "namaste" };

		writeFile(file1, file1Contents);// writes into File1
		// writeFile(file1, file1.getName());// writes into File1
		writeFile(file2, file2Contents);// writes into File2
		// writeFile(file2, file2.getName());// writes into File2
		mergeFiles(file1, file2, mergeFile);

		System.out.println("File1 contents:" + readFile(file1));
		System.out.println("File2 contents:" + readFile(file2));
		System.out.println("MergeFile contents:" + readFile(mergeFile));


	}
}
