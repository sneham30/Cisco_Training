
public class LocalInnerClass {
 private String name = "Hello";
	public LocalInnerClass(){
		System.out.println("Constructor of outer Class");
	}
	public void localMethod(){
		final String message = "Sneha";
		 
		      class Local{ 
		    	  Local(){
		    		  System.out.println("Local Constuctor");
		    	  }
		        void msg(){  
		          System.out.println(name + " "+ message);  
		        }  
		      }  
		     Local loc = new Local();  
		     loc.msg();  
		   }  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerClass outer = new LocalInnerClass();
		outer.localMethod();

	}

}
