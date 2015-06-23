


public class ReverseStatements {

	/*public static void reverse(GenricStack input){
		GenricStack sstack = new GenricStack(input.length);
		
		String array[] = new String[input.length];
	String revstr[] = new String[input.length];
		for(int i =0;i<input.length;i++){
		if(!input.isEmpty()){
			array[i] = (String) input.pop();
			
		}
		}
		for(int i=0;i<array.length;i++){
			if(array[i]!=null){
			//System.out.print(a + "\t");
			
			char[] arr = array[i].toCharArray();
			char[] rev = new char[array[i].length()];
			GenricStack cstack = new GenricStack(arr.length);
			for(char c:arr){
				cstack.push(c);
			}
		
			for(int j=0;j<cstack.length;j++){
				rev[j] = (char) cstack.pop();
				System.out.print(rev[j]);
				
			}
			System.out.print("\t");
			revstr[i] =rev.toString();
			
			}
			
		}
		for(String r:revstr){
			sstack.push(r);
		}
		System.out.println("Output:");
		for (int i=0;i<sstack.length;i++){
			if(!sstack.isEmpty()){
				System.out.print(sstack.pop() + "\t");
			}
		}
		
	}*/

	public static void main(String args[]) {
		GenricStack stack = new GenricStack();
		String input[] = { "hi", "hello", "how", "are", "you" };
		System.out.println("input:");
		for (String str : input) {
			System.out.print(str + "\t");
			stack.push(str);
		}
         System.out.println();
		//stack.reverse(stack);
		for(String in:input){
			GenricStack cs = new GenricStack();
			char carr[] = in.toCharArray();
			for(char c:carr){
				cs.push(c);
			}
			cs.reverse(cs);
			System.out.print("\t");
		}
		
	}
}
