package SetDemo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;


public class HashSetDemo {

	public static void main(String[] args) {
		// creating a hashSet object with String as genric type
		HashSet<String> hashSet = new HashSet<String>();

		// adding elements into set
		hashSet.add("hi");
		hashSet.add("hello");
		hashSet.add("this");
		hashSet.add("is");
		hashSet.add("HashSet");
		hashSet.add("Demo");

		System.out.println("HashSet:" + hashSet);

		System.out.println("Looping through HashSet using iterator:");
		Iterator<String> itr = hashSet.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();

		System.out.println("Copying a HashSet into another Set:");
		HashSet<String> copyHashSet = (HashSet<String>) hashSet.clone();
		System.out.println(copyHashSet);

		System.out.println("Deleting all elememts from CopyHashSet: " + copyHashSet);
		copyHashSet.removeAll((Collection<String>) copyHashSet);
		System.out.println("CopyHashSet: " + copyHashSet);

		System.out.println("Converting HashSet into Array:");
		Object[] arr_Elements = hashSet.toArray();
		for (Object element : arr_Elements) {
			System.out.print(element + "\t");
		}
		System.out.println();


		HashSet<String> hashSetToCompare = new HashSet<String>();
		hashSetToCompare.add("hello");
		hashSetToCompare.add("hi");
		System.out.println("Set 1 : " + hashSet);
		System.out.println("Set 2 : " + hashSetToCompare);
		hashSet.retainAll(hashSetToCompare);
		System.out.println("Comparing two sets and retaining elements present on both Sets:");
		System.out.println("Set 1 : " + hashSet);

		System.out.println("Entering Student Object into HashSet:");
		HashSet<Student> studentSet = new HashSet<Student>();
		studentSet.add(new Student(10, "sneha"));
		studentSet.add(new Student(20, "harsha"));
		studentSet.add(new Student(30, "praveen"));

		System.out.println("Student Set: " + studentSet);
		Student duplicate = new Student(10, "sneha");
		System.out.println("Adding duplicate " + duplicate + " now Student Set :" + studentSet);

		System.out.println("Does " + duplicate + " present in Student Set " + studentSet.contains(duplicate));
		System.out.println("Removing " + duplicate + " from Student Set");
		studentSet.remove(duplicate);
		System.out.println("Student Set: " + studentSet);

	}

}
