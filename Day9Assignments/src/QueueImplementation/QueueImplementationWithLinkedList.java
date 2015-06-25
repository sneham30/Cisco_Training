package QueueImplementation;

import java.util.Iterator;
import java.util.LinkedList;


public class QueueImplementationWithLinkedList implements QueueImplementation {

	LinkedList<Object> linkList = new LinkedList<Object>();

	int head = -1;// index to insert
	int rear = 0;// index to remove

	/* method to implement insert of Queue */
	@Override
	public void insert(Object obj) {
		head++;
		linkList.add(obj);

	}

	/* method to implement delete of Queue */
	@Override
	public Object delete() {
		Object element = peek();
		rear++;
		linkList.remove(element);
		return element;
	}

	/* method to implement peek of Queue */
	@Override
	public Object peek() {
		Object element = linkList.get(rear);
		return element;
	}

	/* method to implement isEmpty of Queue */
	@Override
	public boolean isEmpty() {
		return linkList.isEmpty();

	}

	/* method to implement display of Queue */
	@Override
	public void display() {
		System.out.println("Elements in Queue: ");
		Iterator<Object> itr = linkList.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();
	}

}
