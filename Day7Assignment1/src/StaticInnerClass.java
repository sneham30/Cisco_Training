
public class StaticInnerClass {
	private static String name="Hello";
	public StaticInnerClass() {
		System.out.println("Outer Class Constructor");
	}
	/*static Inner Class*/
	static class InnerClass {
		public InnerClass(){
			name = "Sneha";
			System.out.println("static Inner Class Constructor");
		}
	// StaticInnerClass.InnerClass.name="Sneha";
	}

	public static void main(String[] args) {
		StaticInnerClass outer = new StaticInnerClass();
		System.out.println(outer.name);

		StaticInnerClass.InnerClass inner = new InnerClass();//instantiating static inner class
		System.out.println(outer.name);
	}

}
