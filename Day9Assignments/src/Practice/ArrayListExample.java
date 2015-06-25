package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList arrList = new ArrayList(); // creating an object of ArrayList
		arrList.add("hello");
		arrList.add(1);
		arrList.add('a');
		arrList.add(4.8);
		System.out.println("ArrayList:" + arrList);

		System.out.println("Copying / cloning arrayList");
		ArrayList copyList = (ArrayList) arrList.clone();
		System.out.println("Cloned ArrayList:" + copyList);

		List<String> list = new ArrayList<String>();
		list.add("hi");
		list.add("hello");
		System.out.println("List:" + list);
		System.out.println("Adding all elements of list to ArrayList");
		arrList.addAll(list);
		System.out.println("ArrayList:" + arrList);

		System.out.println("Deleting all Elements of copyList");
		copyList.removeAll(copyList);
		System.out.println("copyList:" + copyList);

		System.out.println("Copying ArrayList to array");
		Object[] array = arrList.toArray();
		System.out.println("Array:");
		for (Object obj : array) {
			System.out.print(obj + "\t");
		}
		System.out.println();

		System.out.println("Does arrList contains all list elements?? " + arrList.containsAll(list));

		System.out.println("Sublist from ArrayList 3 to 5:" + arrList.subList(3, 5));

		list.add("a");
		list.add("sneha");
		list.add("zebra");


		System.out.println("Sorted ArrayList:");
		Collections.sort(list);
		System.out.println(list);

		System.out.println("Reversed ArrayList:");
		Collections.reverse(list);
		System.out.println(list);

		System.out.println("Shuffling ArrayList:");
		Collections.shuffle(list);
		System.out.println(list);

		System.out.println("Swapping 2nd and 4th elements of ArrayList:");
		Collections.swap(list, 2, 4);
		System.out.println(list);

		System.out.println("Comma separated String of list:");
		String csv = list.toString().replace("[", "").replace("]", "").replace(", ", ",");
		System.out.println(csv);

		System.out.println("Reading all elements using iterator():");
		Iterator itr = arrList.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}

	}

}
