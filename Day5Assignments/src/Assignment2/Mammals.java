package Assignment2;
/*abstract Class*/
public abstract class Mammals extends Animals {
	private int noOfLegs;//private instance members
	private String name;
	protected static int count;//protected static member to hold no of Objects
	static String staticVariable;
	/*static block initialising static variable */
	static {
		staticVariable = "Mammals";
		 System.out.println("this is SIB of mammals");
	}
	/*Instance Intialisation block */
	{
		System.out.println("This is a IIB in Mammal");
		count++;
	}

	public Mammals() {
		System.out.println("Mammals() called");
	}

	public static void staticMethod() {
		System.out.println("Static method of Mammals");
	}

	public void testMethod() {
		System.out.println("This is a method of Mammals");
	}
/*abstract Method shud be implemented in child Class*/
	public abstract void abstractMethod();

}
