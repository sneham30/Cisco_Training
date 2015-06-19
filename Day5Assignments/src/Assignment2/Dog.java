package Assignment2;
/*child Class*/
public class Dog extends Mammals {
	private static int count;

	@Override/*abstract method implemented*/
	public void abstractMethod() {

		System.out.println("Abstract method implemented in Dog");
	}

	static String staticVariable;
	/*static Intialisation block */
	static {
		staticVariable = "dog";
        System.out.println("this is SIB of dog");
	}
	/*Instance Intialisation block */
	{
		System.out.println("This is a IIB in Dog");
		count++;
	}
/*dog constructor */
	public Dog() {
		System.out.println("dog() called");
	}

	public static void staticMethod() {
		System.out.println("Static method of Dog");
	}
/*method overriding */
	public void testMethod() {
		System.out.println("This is a method of Dog");
	}

	public static void main(String args[]) {
		Dog d = new Dog();
		Dog d1 = new Dog(); 
		
		System.out.println("count of dog objects:" + Dog.count);
		System.out.println("count of mammals objects:" + Mammals.count);
		System.out.println("count of animal objects:" + Animals.count);

		d.abstractMethod();

		d.testMethod();

		Animals a = new Animals();
		a.testMethod();

		a = new Dog();
		a.testMethod();

		System.out.println("count of dog objects:" + Dog.count);
		System.out.println("count of mammals objects:" + Mammals.count);
		System.out.println("count of animal objects:" + Animals.count);

		System.out.println("static variable of dog:" + Dog.staticVariable);
		System.out.println("static variable of mammals:"
				+ Mammals.staticVariable);
		System.out.println("static variable of animal :"
				+ Animals.staticVariable);

		Dog.staticMethod();
		Mammals.staticMethod();
		Animals.staticMethod();

	}
}
