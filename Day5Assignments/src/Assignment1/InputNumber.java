package Assignment1;

import java.util.Scanner;

public class InputNumber extends Calculate {
  private int numbers[];
 public InputNumber(int... numbers){
	 
	  if(checkNumOfDigits(numbers)){
		  this.numbers = numbers;
	  }else{
		  System.out.println("Invalid input!!");
	  }
  }
  public boolean checkNumOfDigits(int... num){
	  
	  for(int i =0;i<num.length;i++){
		  int length = 0;
		  int digits[] =getDigits(num[i]);
		  for(int j =0;j<digits.length;j++){
			  if(digits[j]!=0){
				  length++;
			  }
		  }
	  
		  if(length>=3 && length <=4){
			  
			  System.out.println("Valid number");
			  return true;
		  }
		  else{
			  System.out.println("Invalid number!! Please enter a number that as minimum of 3 digits and maximum of 4 digits.");
			  return false;
		  }
	  }
	return false;
	  
  }
	@Override
	public void sumOfDigits(int[] nums) {
		for(int i =0 ;i<nums.length; i++){
			int digits[] = getDigits(nums[i]);
			int sum = 0;
			for(int j =0;j<digits.length;j++){
			
				sum = sum +digits[j];
			}
			System.out.println("Sum Of Digits of number " + nums[i] + ":" +sum);
		}
		
	}

	@Override
	public void reverseNumber(int[] nums) {
		for(int i =0 ;i<nums.length; i++){
			int digits[] = getDigits(nums[i]);
			int rev = 0;
			for(int j =0;j<digits.length;j++){
				if(digits[j]!=0){
				rev = rev * 10;
				rev = rev + digits[j];
				
				}
			}
			System.out.println("Reverse of number " + nums[i] + ":" +rev);
			
		}
		
	}

	@Override
	public void factorialOfDigits(int[] nums) {
		for(int i =0 ;i<nums.length; i++){
			int digits[] = getDigits(nums[i]);
			for(int j=0;j<digits.length;j++){
			int fact =1;
			while(digits[i]!=0){
				fact = fact*digits[i]--;
				
			}
			System.out.println("Factorial of " + j + "th digit of" + nums[i] + ":" +fact);
			}
			
		}
		
	}

	@Override
	public void averageOfDigits(int[] nums) {
		for(int i =0 ;i<nums.length; i++){
			int digits[] = getDigits(nums[i]);
			int sum = 0;
			int avg = 0;
			int length = 0;
			for(int j =0;j<digits.length;j++){
			if(digits[j]!=0){
				sum = sum +digits[j];
				length++;
			}
			}
			avg = sum/length;
			System.out.println("Average Of Digits of number " + nums[i] + ":" +avg);
		}
		
	}

	@Override
	public void printPattern(int[] nums) {
		Pattern2 pattern = new Pattern2();
		int rows =0;
		for(int i=0;i<nums.length;i++){
			int lastDigit = checkLastDigit(nums[i]);
			if(lastDigit == 1 || lastDigit == 2){
				 rows = lastDigit * 3;
				 pattern.printPattern(rows);
			}else{
				rows = lastDigit;
				pattern.printPattern(rows);
			}
		}
		
	}
	public static void main(String[] args){
		
		//int i =0;
		/*Scanner scan = new Scanner(System.in);
		int n =0;
	   int nos[] = new int[n] ;
		for(int i=0;i<10;i++){
		System.out.println("DO you Want to still continue? ");
		String flag = scan.next();
		while(flag.equalsIgnoreCase("yes") || flag.equalsIgnoreCase("y")){
			n++;
			System.out.println("Enter a number:");
			nos[i] = scan.nextInt();
			
		}
		
		}*/
		
		InputNumber  numb = new InputNumber(121,456,1231);
		numb.averageOfDigits(numb.numbers);
		numb.sumOfDigits(numb.numbers);
		numb.factorialOfDigits(numb.numbers);
		numb.reverseNumber(numb.numbers);
		numb.printPattern(numb.numbers);
		
	}

}
