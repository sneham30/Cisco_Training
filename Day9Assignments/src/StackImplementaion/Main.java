package StackImplementaion;



public class Main {

	public static void main(String args[]) {
		/*
		 * creating object of stack with arrayLsit
		 */
		StackImplementaionWithArrayList stack = new StackImplementaionWithArrayList();

		stack.push("a");
		stack.push("b");
		stack.push("c");


		stack.display();

		System.out.println("peeking the element in stack:" + stack.peek());
		stack.display();
		System.out.println("poping the element in stack:" + stack.pop());
		stack.display();
		System.out.println("Is stack Empty?? " + stack.isEmpty());
		System.out.println("Object b is at :" + stack.search("b"));

		/*
		 * creating object of lstack with LinkedLsit
		 */
		StackImplementaionWithLinkedList lstack = new StackImplementaionWithLinkedList();
		lstack.push("x");
		lstack.push("y");
		lstack.push("z");


		lstack.display();

		System.out.println("peeking the element in lstack:" + lstack.peek());
		lstack.display();
		System.out.println("poping the element in lstack:" + lstack.pop());
		lstack.display();
		System.out.println("Is lstack Empty?? " + lstack.isEmpty());
		System.out.println("Object x is at :" + lstack.search("x"));

	}


}
