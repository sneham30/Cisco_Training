package Assignment2;
/*super class*/
public class Animals {
	private int noOfLegs;//private instance members
	private String name;
	protected static int count;//protected static member to hold no of Objects
	static String staticVariable;//static member
	/*static block initialising static variable */
	static {
		staticVariable = "Animals";
		 System.out.println("this is SIB of animals");
	}
	/*Instance Intialisation block */
	{
		System.out.println("This is a IIB in Animals");
		count++;
	}
  /*default constructor*/
	public Animals() {
		System.out.println("Animals() called");
	}
/*staticMethod */
	public static void staticMethod() {
		System.out.println("Static method of Animals");
	}
//Instance method
	public void testMethod() {
		System.out.println("This is a method of Animals");
	}
}
