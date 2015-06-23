
public class LocalInnerClass {
 private String name = "Hello";
	public LocalInnerClass(){
		System.out.println("Constructor of outer Class");
	}
	public void localMethod(){
		class LocalClass(){
			public LocalClass(){
				System.out.println("Constructor of inner Class");
			}
			public String changeName(){
				name = "Sneha";
			}
		}
		LocalClass  local = new LocalClass();
		System.out.println(local.changeName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerClass outer = new LocalInnerClass();
		outer.localMethod();

	}

}
