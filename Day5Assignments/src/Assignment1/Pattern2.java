package Assignment1;

public class Pattern2 {

	public void printPattern(int row){
	
		for(int i=0;i<row;i++){
			for(int k=0;k<i;k++){
				System.out.print(" ");
			}
			for(int j=0;j<row-i;j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
