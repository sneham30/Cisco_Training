import java.util.Scanner;


public class IntegerStack {
	public static final int LENGTH = 5;
	private int value[] = new int[LENGTH];
	int index = -1;
	
	public void push(int element){
		if(index>LENGTH){
			System.out.println("Stack OverFlow!!");
		}
		else{
	        value[++index] = element;
		}
	}
	
	public int pop(){
		return value[index--];
		
	}
	private boolean isEmpty() {
	  if(index == -1){
		  return true;
	  }
		return false;
	}


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		IntegerStack st = new IntegerStack();
		System.out.println("Enter elements to push");
		st.push(scan.nextInt());
		st.push(scan.nextInt());
		st.push(scan.nextInt());
		st.push(scan.nextInt());
		st.push(scan.nextInt());
		//st.push(scan.nextInt());
	
		
			System.out.println("Elements in Stack:");
		while(!st.isEmpty()){
			System.out.println(st.pop());
		}

	}

	
}
