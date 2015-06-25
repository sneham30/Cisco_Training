package Practice;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList(); // creating an object of
													// LinkedList
		linkedList.add("hello");
		linkedList.add(1);
		linkedList.add('a');
		linkedList.add(4.8);
		System.out.println("LinkedList:" + linkedList);

		System.out.println("Copying / cloning LinkedList");
		LinkedList copyList = (LinkedList) linkedList.clone();
		System.out.println("Cloned LinkedList:" + copyList);

		List<String> list = new LinkedList<String>();
		list.add("hi");
		list.add("hello");
		System.out.println("List:" + list);
		System.out.println("Adding all elements of list to LinkedList");
		linkedList.addAll(list);
		System.out.println("LinkedList:" + linkedList);

		System.out.println("Deleting all Elements of copyList");
		copyList.removeAll(copyList);
		System.out.println("copyList:" + copyList);

		System.out.println("Copying LinkedList to array");
		Object[] array = linkedList.toArray();
		System.out.println("Array:");
		for (Object obj : array) {
			System.out.print(obj + "\t");
		}
		System.out.println();

		System.out.println("Does linkedList contains all list elements?? " + linkedList.containsAll(list));

		System.out.println("Sublist from LinkedList 3 to 5:" + linkedList.subList(3, 5));

		list.add("a");
		list.add("sneha");
		list.add("zebra");


		System.out.println("Sorted LinkedList:");
		Collections.sort(list);
		System.out.println(list);

		System.out.println("Reversed LinkedList:");
		Collections.reverse(list);
		System.out.println(list);

		System.out.println("Shuffling LinkedList:");
		Collections.shuffle(list);
		System.out.println(list);

		System.out.println("Swapping 2nd and 4th elements of LinkedList:");
		Collections.swap(list, 2, 4);
		System.out.println(list);

		System.out.println("Comma separated String of list:");
		String csv = list.toString().replace("[", "").replace("]", "").replace(", ", ",");
		System.out.println(csv);

		System.out.println("Reading all elements using iterator():");
		Iterator itr = linkedList.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();

		System.out.println(linkedList);
		System.out.println("Adding element at first Position of LinkedList:");
		linkedList.addFirst("first");
		System.out.println(linkedList);

		System.out.println("Adding element at last Position of LinkedList:");
		linkedList.addLast("last");
		System.out.println(linkedList);

		System.out.println("First element of Linked List:" + linkedList.getFirst());

		System.out.println("Last element of Linked List:" + linkedList.getLast());

		System.out.println("Linked List :");
		ListIterator lItr = linkedList.listIterator();
		while (lItr.hasNext()) {
			System.out.print(lItr.next() + "\t");
		}
		System.out.println();

		System.out.println("Linked List in Reverse order:");
		while (lItr.hasPrevious()) {
			System.out.print(lItr.previous() + "\t");
		}
		System.out.println();

		System.out.println("Linked list push() && pop() :");
		linkedList.push("pushedObj");
		System.out.println(linkedList);

		System.out.println("Peek() of LinkedList: " + linkedList.peek());
		System.out.println("Pop() of LinkedList: " + linkedList.pop());
		System.out.println(linkedList);

		System.out.println("PeekFirst() of LinkedList: " + linkedList.peekFirst());
		System.out.println("PeekLast() of LinkedList: " + linkedList.peekLast());
		System.out.println(linkedList);

		System.out.println("Poll() of LinkedList: " + linkedList.poll());
		System.out.println(linkedList);
		System.out.println("PollFirst() of LinkedList: " + linkedList.pollFirst());
		System.out.println("PollLast() of LinkedList: " + linkedList.pollLast());
		System.out.println(linkedList);

		System.out.println("Remove 3rd element of LinkedList");
		linkedList.remove(2);
		System.out.println(linkedList);
	}

}
