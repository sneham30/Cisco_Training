package MapDemo;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import Assignments.Student;


public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(1, "one");
		treeMap.put(2, "two");
		treeMap.put(3, "three");
		System.out.println("Map:" + treeMap);

		System.out.println("Replaces the value at key 1 by new value");
		treeMap.put(1, "four");// replaces the value at key by new value
		// treeMap.put(null, "value");// takes null value
		System.out.println("Map:" + treeMap);


		System.out.println("Iterationg through TreeMap:");
		Iterator itr = treeMap.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry pair = (Map.Entry) itr.next();
			System.out.println(pair.getKey() + " == " + pair.getValue());

		}

		TreeMap<Integer, String> copyTreeMap = (TreeMap<Integer, String>) treeMap.clone();
		System.out.println("Cloned Map:" + copyTreeMap);

		System.out.println("Does map has key 1 ?? " + treeMap.containsKey(1));
		System.out.println("Does map has value four ?? " + treeMap.containsValue("four"));

		System.out.println("Available keySet: " + treeMap.keySet());
		System.out.println("Available EntrySet: " + treeMap.entrySet());

		System.out.println("Deleting all elemenst from cloned Map: ");
		copyTreeMap.clear();
		System.out.println("Cloned Map:" + copyTreeMap);

		// by overriding hashcode and equals for Student Object we avoid key
		// duplicates
		System.out.println("Entering Student Object into HashSet:");
		TreeMap<Integer, String> studentMap = new TreeMap<Integer, String>();



		studentMap.put(10, "A");
		studentMap.put(20, "B");
		studentMap.put(30, "C");

		System.out.println("Student Set: " + studentMap);
		Student duplicate = new Student(10, "D");
		studentMap.put(duplicate.getRollNO(), "D");
		System.out.println("Adding duplicate " + duplicate.getRollNO() + " now Student Map :" + studentMap);

		/*
		 * System.out.println("Does " + duplicate.getRollNO() +
		 * " present in Student Map " +
		 * studentMap.containsKey(duplicate.getClass()));
		 * System.out.println("Removing " + duplicate + " from Student Set");
		 * studentMap.remove(duplicate.getRollNO());
		 * System.out.println("Student Set: " + studentMap);
		 */

		System.out.println("treeMap with comaparator:");
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
		sortedEntries.addAll((Collection<? extends Entry<Integer, String>>) studentMap.entrySet());
		System.out.println("Student Map in reverse order:" + sortedEntries);

	}
}
