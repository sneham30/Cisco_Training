


public class NestedInnerClass {
	private String name="Hello";
	public NestedInnerClass() {
		System.out.println("Outer Class Constructor");
	}
	public String getName(){
		return this.name;
	}
	 class InnerClass {
		public InnerClass(){
			name = "Sneha";
			System.out.println("Inner Class Constructor");
		}
	/*	public String getName(){
			return this.getName();
		}*/
	// StaticInnerClass.InnerClass.name="Sneha";
	}

	public static void main(String[] args) {
		NestedInnerClass outer = new NestedInnerClass();
		System.out.println(outer.getName());

	    NestedInnerClass.InnerClass inner = outer.new InnerClass();
		//System.out.println(inner.getName());
	}
}
