package Assignments;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * Class to instantiate Student class and perform sorting on it using Map
 */

public class MapMainClass {



	public static void main(String[] args) {

		Student students[] = new Student[2];// Array of Student Objects


		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);// using Scanner to take input

		// for loop to take roll no and name and instantiate the Student objects
		// of students array
		for (int loopCount = 0; loopCount < students.length; loopCount++) {
			System.out.println("Enter student RollNO:");
			int rollNo = scan.nextInt();
			System.out.println("Enter student Name:");
			String name = scan.next();
			// calling parameterized constructor of Student
			students[loopCount] = new Student(rollNo, name);
		}
		// HashMap to store Student Objects as <rollNo,Name> <key ,Value> pair

		Map<Integer, String> studentMap = new HashMap<Integer, String>();

		for (Student student : students) {
			studentMap.put(student.getRollNO(), student.getStudentName());
		}

		System.out.println("Student Map :" + studentMap);

		// TreeMap to store Student Objects as <rollNo,Name> <key ,Value> pair
		// and sorted based on roll no
		Map<Integer, String> studentMap1 = new TreeMap<Integer, String>();

		for (Student student : students) {
			studentMap1.put(student.getRollNO(), student.getStudentName());
		}

		System.out.println("Student Map in rollno order:" + studentMap1);


		// using TreeSet to sort values of Student Map with Map.Entry as the
		// generic
		Set<Map.Entry<Integer, String>> sortedEntries = new TreeSet<Map.Entry<Integer, String>>(
				new Comparator<Map.Entry<Integer, String>>() {

					@Override
					public int compare(Map.Entry<Integer, String> e1,
							Map.Entry<Integer, String> e2) {
						// sorting values is reverse order
						return -e1.getValue().compareTo(e2.getValue());
					}
				});
		sortedEntries.addAll(studentMap1.entrySet());
		System.out.println("Student Map in reverse order:" + sortedEntries);

	}
}
