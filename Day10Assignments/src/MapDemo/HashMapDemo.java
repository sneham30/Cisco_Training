package MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import Assignments.Student;


public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "one");
		hashMap.put(2, "two");
		hashMap.put(3, "three");
		System.out.println("Map:" + hashMap);

		System.out.println("Replaces the value at key 1 by new value");
		hashMap.put(1, "four");// replaces the value at key by new value
		hashMap.put(null, "value");// takes null value
		System.out.println("Map:" + hashMap);

		System.out.println("Replaces the value at key null by new value");
		hashMap.put(null, "value1");// replaces the value at null by new value
		System.out.println("Map:" + hashMap);
		// hashMap.remove(null);

		System.out.println("Iterationg through HashMap:");
		Iterator itr = hashMap.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry pair = (Map.Entry) itr.next();
			System.out.println(pair.getKey() + " == " + pair.getValue());

		}

		HashMap<Integer, String> copyHashMap = (HashMap<Integer, String>) hashMap.clone();
		System.out.println("Cloned Map:" + copyHashMap);

		System.out.println("Does map has key 1 ?? " + hashMap.containsKey(1));
		System.out.println("Does map has value four ?? " + hashMap.containsValue("four"));

		System.out.println("Available keySet: " + hashMap.keySet());
		System.out.println("Available EntrySet: " + hashMap.entrySet());

		System.out.println("Deleting all elemenst from cloned Map: ");
		copyHashMap.clear();
		System.out.println("Cloned Map:" + copyHashMap);

		// by overriding hashcode and equals for Student Object we avoid key
		// duplicates
		System.out.println("Entering Student Object into HashSet:");
		HashMap<Student, String> studentMap = new HashMap<Student, String>();



		studentMap.put(new Student(10, "sneha"), "sneha");
		studentMap.put(new Student(20, "neha"), "neha");
		studentMap.put(new Student(30, "eha"), "eha");

		System.out.println("Student Set: " + studentMap);
		Student duplicate = new Student(10, "sneha");
		studentMap.put(duplicate, "sneha");
		System.out.println("Adding duplicate " + duplicate + " now Student Set :" + studentMap);

		System.out.println("Does " + duplicate + " present in Student Set " + studentMap.containsKey(duplicate));
		System.out.println("Removing " + duplicate + " from Student Set");
		studentMap.remove(duplicate);
		System.out.println("Student Set: " + studentMap);

	}

}
