
public class AnonymousClass {
	/*constructor of outer class*/
	public AnonymousClass(){
		System.out.println("Constructor of Normal Class");
	}
	public void testMethod(){
		System.out.println("Method of Normal Class");
	}
public static void main(String args[]){
	AnonymousClass obj = new AnonymousClass();
	obj.testMethod(); 
	/*Anonymous Class*/
	AnonymousClass ob = new AnonymousClass(){
		public void AnonymousClass(){
			System.out.println("Constructor in Anonymous Class");
		}
		/*overriding method of outer class*/
		public void testMethod(){
			System.out.println("Method overriden in Anonymous Class");
		}
	};
	ob.testMethod(); 
	
	System.out.println("Class of obj:" + obj.getClass().getName());
	System.out.println("Class of ob:" + ob.getClass().getName());
	
}

}
