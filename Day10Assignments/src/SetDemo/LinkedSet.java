package SetDemo;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedSet {

	public static void main(String[] args) {
		// creating a linkSet object with String as genric type
		LinkedHashSet<String> linkSet = new LinkedHashSet<String>();

		// adding elements into set
		linkSet.add("hi");
		linkSet.add("hello");
		linkSet.add("this");
		linkSet.add("is");
		linkSet.add("linkSet");
		linkSet.add("Demo");

		System.out.println("linkSet:" + linkSet);

		System.out.println("Looping through linkSet using iterator:");
		Iterator<String> itr = linkSet.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();

		System.out.println("Copying a linkSet into another Set:");
		LinkedHashSet<String> copylinkSet = (LinkedHashSet<String>) linkSet.clone();
		System.out.println(copylinkSet);

		System.out.println("Deleting all elememts from CopylinkSet: " + copylinkSet);
		copylinkSet.removeAll((Collection<String>) copylinkSet);
		System.out.println("CopylinkSet: " + copylinkSet);

		System.out.println("Converting linkSet into Array:");
		Object[] arr_Elements = linkSet.toArray();
		for (Object element : arr_Elements) {
			System.out.print(element + "\t");
		}
		System.out.println();


		LinkedHashSet<String> linkSetToCompare = new LinkedHashSet<String>();
		linkSetToCompare.add("hello");
		linkSetToCompare.add("hi");
		System.out.println("Set 1 : " + linkSet);
		System.out.println("Set 2 : " + linkSetToCompare);
		linkSet.retainAll(linkSetToCompare);
		System.out.println("Comparing two sets and retaining elements present on both Sets:");
		System.out.println("Set 1 : " + linkSet);

		System.out.println("Entering Student Object into linkedHashSet:");
		LinkedHashSet<Student> studentSet = new LinkedHashSet<Student>();
		studentSet.add(new Student(10, "sneha"));
		studentSet.add(new Student(20, "harsha"));
		studentSet.add(new Student(30, "praveen"));

		System.out.println("Student Set: " + studentSet);
		Student duplicate = new Student(10, "sneha");
		System.out.println("Adding duplicate " + duplicate + " now Student Set :" + studentSet);

		System.out.println("Does " + duplicate + " present in Student Set ?? " + studentSet.contains(duplicate));
		System.out.println("Removing " + duplicate + " from Student Set");
		studentSet.remove(duplicate);
		System.out.println("Student Set: " + studentSet);

	}

}
