package MapDemo;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import Assignments.Student;


public class LinkedLinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> linkMap = new LinkedHashMap<Integer, String>();
		linkMap.put(1, "one");
		linkMap.put(2, "two");
		linkMap.put(3, "three");
		System.out.println("Map:" + linkMap);

		System.out.println("Replaces the value at key 1 by new value");
		linkMap.put(1, "four");// replaces the value at key by new value
		linkMap.put(null, "value");// takes null value
		System.out.println("Map:" + linkMap);

		System.out.println("Replaces the value at key null by new value");
		linkMap.put(null, "value1");// replaces the value at null by new value
		System.out.println("Map:" + linkMap);
		// linkMap.remove(null);

		System.out.println("Iterationg through LinkedHashMap:");
		Iterator itr = linkMap.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry pair = (Map.Entry) itr.next();
			System.out.println(pair.getKey() + " == " + pair.getValue());

		}

		LinkedHashMap<Integer, String> copyLinkedHashMap = (LinkedHashMap<Integer, String>) linkMap.clone();
		System.out.println("Cloned Map:" + copyLinkedHashMap);

		System.out.println("Does map has key 1 ?? " + linkMap.containsKey(1));
		System.out.println("Does map has value four ?? " + linkMap.containsValue("four"));

		System.out.println("Available keySet: " + linkMap.keySet());
		System.out.println("Available EntrySet: " + linkMap.entrySet());

		System.out.println("Deleting all elemenst from cloned Map: ");
		copyLinkedHashMap.clear();
		System.out.println("Cloned Map:" + copyLinkedHashMap);

		// by overriding hashcode and equals for Student Object we avoid key
		// duplicates
		System.out.println("Entering Student Object into LionkedHashMap:");
		LinkedHashMap<Student, String> studentMap = new LinkedHashMap<Student, String>();



		studentMap.put(new Student(10, "sneha"), "sneha");
		studentMap.put(new Student(20, "neha"), "neha");
		studentMap.put(new Student(30, "eha"), "eha");

		System.out.println("Student map: " + studentMap);
		Student duplicate = new Student(10, "sneha");
		studentMap.put(duplicate, "sneha");
		System.out.println("Adding duplicate " + duplicate + " now Student Map:" + studentMap);

		System.out.println("Does " + duplicate + " present in Student Set " + studentMap.containsKey(duplicate));
		System.out.println("Removing " + duplicate + " from Student Set");
		studentMap.remove(duplicate);
		System.out.println("Student Set: " + studentMap);

	}
}
