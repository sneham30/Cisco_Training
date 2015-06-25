package Practice;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;


public class VectorExample {

	public static void main(String[] args) {
		Vector vector = new Vector(); // creating an object of Vector
		vector.add("hello");
		vector.add(1);
		vector.add('a');
		vector.add(4.8);
		System.out.println("Vector:" + vector);

		System.out.println("Copying / cloning Vector");
		Vector copyVector = (Vector) vector.clone();
		System.out.println("Cloned Vector:" + copyVector);

		List<String> list = new Vector<String>();
		list.add("hi");
		list.add("hello");
		System.out.println("List:" + list);
		System.out.println("Adding all elements of list to Vector");
		vector.addAll(list);
		System.out.println("Vector:" + vector);

		System.out.println("Deleting all Elements of copyVector");
		copyVector.removeAll(copyVector);
		System.out.println("copyVector:" + copyVector);

		System.out.println("Copying Vector to array");
		Object[] array = vector.toArray();
		System.out.println("Array:");
		for (Object obj : array) {
			System.out.print(obj + "\t");
		}
		System.out.println();

		System.out.println("Does vector contains all list elements?? " + vector.containsAll(list));

		System.out.println("Sublist from Vector 3 to 5:" + vector.subList(3, 5));

		list.add("a");
		list.add("sneha");
		list.add("zebra");


		System.out.println("Sorted Vector:");
		Collections.sort(list);
		System.out.println(list);

		System.out.println("Reversed Vector:");
		Collections.reverse(list);
		System.out.println(list);

		System.out.println("Shuffling Vector:");
		Collections.shuffle(list);
		System.out.println(list);

		System.out.println("Swapping 2nd and 4th elements of Vector:");
		Collections.swap(list, 2, 4);
		System.out.println(list);

		System.out.println("Comma separated String of list:");
		String csv = list.toString().replace("[", "").replace("]", "").replace(", ", ",");
		System.out.println(csv);

		System.out.println("Reading all elements using iterator():");
		Iterator itr = vector.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();

		System.out.println("Reading all elements using enumeration:");
		Enumeration en = vector.elements();
		while (en.hasMoreElements()) {
			System.out.print(en.nextElement() + "\t");
		}

	}
}
