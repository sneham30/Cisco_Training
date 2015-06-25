package QueueImplementation;



public class Main {

	public static void main(String args[]) {
		/*
		 * creating object of Queue with arrayLsit
		 */
		QueueImplementationWithArrayList queue = new QueueImplementationWithArrayList();

		queue.insert("a");
		queue.insert("b");
		queue.insert("c");


		queue.display();

		System.out.println("peeking the element in queue:" + queue.peek());
		queue.display();
		System.out.println("deleteing the element in queue:" + queue.delete());
		queue.display();
		System.out.println("Is queue Empty?? " + queue.isEmpty());


		/*
		 * creating object of lqueue with LinkedLsit
		 */
		QueueImplementationWithLinkedList lqueue = new QueueImplementationWithLinkedList();
		lqueue.insert("x");
		lqueue.insert("y");
		lqueue.insert("z");


		lqueue.display();

		System.out.println("peeking the element in lqueue:" + lqueue.peek());
		lqueue.display();
		System.out.println("deleteing the element in lqueue:" + lqueue.delete());
		lqueue.display();
		System.out.println("Is lqueue Empty?? " + lqueue.isEmpty());


	}

}
