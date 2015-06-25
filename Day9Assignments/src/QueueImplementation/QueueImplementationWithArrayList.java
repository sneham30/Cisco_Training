package QueueImplementation;

import java.util.ArrayList;
import java.util.Iterator;


public class QueueImplementationWithArrayList implements QueueImplementation {

	ArrayList<Object> arrList = new ArrayList<Object>();// arrayList Object
														// creation
	int head = -1;// index to insert
	int rear = 0;// index to remove

	/* method to implement insert of Queue */
	@Override
	public void insert(Object obj) {
		head++;
		arrList.add(obj);

	}

	/* method to implement delete of Queue */
	@Override
	public Object delete() {
		Object element = peek();
		rear++;
		arrList.remove(element);
		return element;
	}

	/* method to implement peek of Queue */
	@Override
	public Object peek() {
		Object element = arrList.get(rear);
		return element;
	}

	/* method to implement isEmpty of Queue */
	@Override
	public boolean isEmpty() {
		return arrList.isEmpty();

	}

	/* method to implement display of Queue */
	@Override
	public void display() {
		System.out.println("Elements in Queue: ");
		Iterator<Object> itr = arrList.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();
	}



}
