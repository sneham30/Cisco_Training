package QueueImplementation;

/*
 * Queue is dataStructure with First In First Out functionality
 * i.e., first inserted object is the first one to delete
 * queue has two pointers head and rear which helps in implementing FIFO feature
 * Interface to define Queue Operations like
 * insert(),remove(),peek(),display(),isEmpty()
 */
public interface QueueImplementation {

	/*
	 * method to insert element into Queue head/index to insert is incremented
	 * and an element
	 * is added to Queue at head
	 * @param : Object element
	 */
	void insert(Object obj);

	/*
	 * method to remove the element from Queue
	 * Object at rear/index to delete is removed and rear is incremented
	 * returns the element removed
	 * @return : Object element
	 */
	Object delete();

	/*
	 * method to peek the element from Queue
	 * Object at rear/index to delete is return and rear is incremented
	 * returns the element to be deleted next
	 * @return : Object element
	 */
	Object peek();

	/*
	 * method returns true if queue is empty i.e, head and rear are at -1
	 * else returns false
	 * @return : boolean
	 */
	boolean isEmpty();

	/*
	 * method to display all elements in Queue
	 * traverse through the Queue and displays its elements to console
	 */
	void display();
}
