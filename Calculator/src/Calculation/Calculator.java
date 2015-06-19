package Calculation;

public class Calculator implements InterfaceForOperations {
	public int addition(int... num){
		int sum =0;
		for(int i = 0 ;i<num.length;i++){
			sum= sum+num[i];
		}
       return sum;
	}
	public int subtraction(int m,int n){
		return m-n;
	}
    public int mutiply(int... num){
    	int prod = 1;
    	for(int i = 0 ;i<num.length;i++){
			prod= prod * num[i];
		}
       return prod;
    	
    }
    public int division(int m,int n){
    	int quotient=0;
    	if(m>n && n!=0){
    		quotient = m/n;
    	}
    	return quotient;
    }
	@Override
	public double averages(double... d) {
		double sum =0;
		double avg=0;
		for(int i = 0 ;i<d.length;i++){
			sum= sum+d[i];
		}
		avg=sum/d.length;
		return avg;
	}

	@Override
	public int GCD(int m, int n) {
		while(m!=n)
		{
			 if(m>n){
			m = m-n;
			 }else{
				 n = n-m;
			 }
		}
		return m;
	}

	@Override
	public int LCM(int m, int n) {
		int gcd= GCD(m, n);
		int lcm = gcd/m*n;
		return lcm;
	}

	@Override
	public double squareRoot(double n) {
		
		return Math.sqrt(n);
	}

	@Override
	public double square(double num) {
	
		return num*num;
	}

	@Override
	public double log(double l) {
		
		return Math.log(l);
	}
public static void main(String args[]){
	Calculator c = new Calculator();
     System.out.println("Sum (10,20,30,40) :"+ c.addition(10,20,30,40));
     System.out.println("Subtraction(50,20):" + c.subtraction(50, 20));
     System.out.println("Subtraction(5,20):" + c.subtraction(5, 20));
     System.out.println("division(50,2):" + c.division(50, 2));
     System.out.println("Multiplication(50,20,15):" + c.mutiply(50, 20 ,15));
     System.out.println("SquareRoot(25):" + c.squareRoot(25));
     System.out.println("Square(50):" + c.square(50));
     System.out.println("Log(45):" +c.log(45));
     System.out.println("LcM(12,24):"+ c.LCM(12,24));
     System.out.println("GCD(4,2):" + c.GCD(4,2 ));
     System.out.println("Averages(50,20,12):" + c.averages(50, 20,12));
     
}
}
