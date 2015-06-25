package StackImplementaion;

import java.util.LinkedList;
import java.util.ListIterator;

/*
 * class to implement StackImplementation using ArrayList
 */

public class StackImplementaionWithLinkedList implements StackImplementation {

	LinkedList<Object> linkList = new LinkedList<Object>(); // creating an
															// Object
	// Of ArrayList
	int index = -1; // index to point to top of stack

	/* method to implement push of stack */
	@Override
	public void push(Object obj) {
		linkList.add(obj);

		index++;
	}

	/* method to implement pop of stack */
	@Override
	public Object pop() {

		Object element = null;
		if (!isEmpty()) {
			element = linkList.get(index);
			index--;
			linkList.remove(element);

		}
		return element;

	}

	/* method to implement peek() of stack */
	@Override
	public Object peek() {
		Object element = null;
		if (!isEmpty()) {
			element = linkList.get(index);


		}
		return element;
	}

	/* method to search an element in stack */
	@Override
	public int search(Object obj) {
		if (linkList.contains(obj)) { return linkList.indexOf(obj); }
		return -1;
	}

	/* method implementation for isEmpty() */
	@Override
	public boolean isEmpty() {
		return linkList.isEmpty();
	}

	/* method implementation for display */
	@Override
	public void display() {
		System.out.println("Elements in Stack:");
		ListIterator<Object> itr = linkList.listIterator(); // using
															// ListIterator to
		// traverse
		// through LinkedList
		while (itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();
	}



}
