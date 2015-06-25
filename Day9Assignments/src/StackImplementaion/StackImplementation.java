package StackImplementaion;

/*
 * Stack is dataStructure with Last In First Out functionality
 * i.e., first inserted object is the last one to delete
 * Stack has top pointer which points to recent object inserted
 * Interface to define Stack Operations like pop(),push(),peek() & search()
 */
public interface StackImplementation {

	/*
	 * push takes in an Object as argument and inserts it to stack
	 * and increments the top/index
	 * @param : Object element
	 */
	void push(Object obj);

	/*
	 * pop() method returns the top most element of the stack
	 * by return the element at top/index and decrementing to top or index
	 * @return : Object element
	 */
	Object pop();

	/*
	 * peek() method the next element in the stack ie., the element which is
	 * ready to
	 * get popped or removed is returned
	 * @return : Object element
	 */
	Object peek();

	/*
	 * method that takes an Object as parameter and the index of that element if
	 * it is in the stack
	 * traverse through the elements of stack and return top/index of that
	 * element else if its not in
	 * stack return -1
	 * @param : Object element
	 * @return : int index
	 */
	int search(Object obj);

	/*
	 * method to find whether stack is empty or not
	 * return true if top is -1 i.e., no objects are pushed in
	 * else returns false
	 * @return : boolean
	 */
	boolean isEmpty();

	/*
	 * method to display stack elements
	 * displays all the elements in stack
	 */
	void display();

}
