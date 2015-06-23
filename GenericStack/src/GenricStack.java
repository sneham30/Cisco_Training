import java.util.Scanner;


public class GenricStack {
	
	public int length = 5;
	private Object value[]; 
	
	int index = -1;
	public GenricStack() {
		value = new Object[length];
	}
	public GenricStack(int size){
		this.length = size;
		value = new Object[size];
	}
	public void push(Object element){
		if(index>length){
			System.out.println("Stack OverFlow!!");
		}
		else{
	        value[++index] = element;
		}
	}
	
	public Object pop(){
		return value[index--];
		
	}
	public boolean isEmpty() {
	  if(index == -1){
		  return true;
	  }
		return false;
	}
public void reverse(GenricStack stack){
	
	Object array[] = new Object[stack.length];
	//GenricStack stack = new G
	for(int i =0;i<stack.length;i++){
		if(!stack.isEmpty()){
			
			array[i] =  stack.pop();
			
		}
	}
	for(Object ob:array){
		if(ob!=null)
		System.out.print(ob);
	}
		
			
}


	public static void main(String[] args) {
		//int i =0;
		Scanner scan = new Scanner(System.in);
		GenricStack st = new GenricStack();
		System.out.println("Enter elements to push");
		
		//st.push(scan.nextInt());
		st.push(1);
		st.push("hello");
		st.push('a');
		st.push(5.4);
		st.push(0);
		
	
		
			System.out.println("Elements in Stack:");
		while(!st.isEmpty()){
			System.out.println(st.pop());
		}

	}

	
}
