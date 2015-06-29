package Assignments;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Class to instantiate Student class and perform sorting on it using set
 */
public class SetMainClass {


	public static void main(String[] args) {

		// HashSet for Storing unique Student names/Student Objects
		Set<Student> studentSet = new HashSet<Student>();

		// adding objects into TreeSet
		studentSet.add(new Student("harsha"));
		studentSet.add(new Student("sneha"));
		studentSet.add(new Student("neha"));
		studentSet.add(new Student("anil"));
		studentSet.add(new Student("anil"));// considers it as a new object
											// because hashcode is different so
											// does not identified as duplicate


		System.out.println("StudentSet :" + studentSet);

		// TreeSet for Storing unique Student names/Student Objects in
		// alphabetical order
		Set<Student> studentSet1 = new TreeSet<Student>();

		// adding objects into TreeSet
		studentSet1.add(new Student("harsha"));
		studentSet1.add(new Student("sneha"));
		studentSet1.add(new Student("neha"));
		studentSet1.add(new Student("anil"));
		studentSet1.add(new Student("badal"));
		studentSet1.add(new Student("anil"));// identified as duplicate because
												// TreeSet implements Comparator

		System.out.println("StudentSet sorted in alphabetical order :" + studentSet1);

		// TreeSet for Storing unique Student names/Student Objects in
		// alphabetical order
		Set<Student> studentSet2 = new TreeSet<Student>(
				new Comparator<Student>() {

					@Override
					public int compare(Student o1, Student o2) {

						if (o1.getStudentName().length() < o2.getStudentName().length())
							return -o1.compareTo(o2);
						else if (o1.getStudentName().length() > o2.getStudentName().length())
							return o1.compareTo(o2);
						else
							return o1.compareTo(o2);

					}

				});


		// adding objects into TreeSet

		studentSet2.add(new Student("anil"));
		studentSet2.add(new Student("anilb"));
		studentSet2.add(new Student("anila"));
		studentSet2.add(new Student("harsha"));
		studentSet2.add(new Student("sanjay"));


		System.out.println("StudentSet sorted in alphabetical order and nameLength :" + studentSet2);

		// TreeSet for Storing unique Student names/Student Objects in reverse
		// alphabetical order
		Set<Student> studentSet3 = new TreeSet<Student>(
				new Comparator<Student>() {

					@Override
					public int compare(Student o1, Student o2) {
						return -o1.compareTo(o2);
					}
				});

		// adding objects into TreeSet
		studentSet3.add(new Student("harsha"));
		studentSet3.add(new Student("sneha"));
		studentSet3.add(new Student("neha"));
		studentSet3.add(new Student("anil"));
		studentSet3.add(new Student("badal"));


		System.out.println("StudentSet sorted in reverse alphabetical order :" + studentSet3);

	}
}
