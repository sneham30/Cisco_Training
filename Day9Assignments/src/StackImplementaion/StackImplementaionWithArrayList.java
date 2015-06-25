package StackImplementaion;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * class to implement StackImplementation using ArrayList
 */

public class StackImplementaionWithArrayList implements StackImplementation {

	ArrayList<Object> arrList = new ArrayList<Object>(); // creating an Object
															// Of ArrayList
	int index = -1; // index to point to top of stack

	/* method to implement push of stack */
	@Override
	public void push(Object obj) {
		arrList.add(obj);

		index++;
	}

	/* method to implement pop of stack */
	@Override
	public Object pop() {
		Object element = null;
		if (!isEmpty()) {
			element = arrList.get(index);
			index--;
			arrList.remove(element);

		}
		return element;
	}

	/* method to implement peek() of stack */
	@Override
	public Object peek() {
		Object element = null;
		if (!isEmpty()) {
			element = arrList.get(index);


		}
		return element;
	}

	/* method to search an element in stack */
	@Override
	public int search(Object obj) {
		if (arrList.contains(obj)) { return arrList.indexOf(obj); }
		return -1;
	}

	/* method implementation for isEmpty() */
	@Override
	public boolean isEmpty() {
		return arrList.isEmpty();
	}

	/* method implementation for display */
	@Override
	public void display() {
		System.out.println("Elements in Stack:");
		Iterator<Object> itr = arrList.iterator(); // using Iterator to traverse
													// through arrayList
		while (itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();
	}



}
