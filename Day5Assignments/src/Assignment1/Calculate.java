package Assignment1;

public abstract class Calculate {
	/* abstract methods to calculate */
	public abstract void sumOfDigits(int[] nums);

	public abstract void reverseNumber(int[] nums);

	public abstract void factorialOfDigits(int[] nums);

	public abstract void averageOfDigits(int[] nums);

	public abstract void printPattern(int[] nums);

	/*method to get digits of a number */
	public int[] getDigits(int num) {
		int digits[] = new int[4];
		int i = 0;
		while (num != 0) {

			digits[i] = num % 10;
			num = num / 10;
			i++;
		}
		return digits;

	}
/*method to find and return last digit a number */
	public int checkLastDigit(int num) {
		int digits[] = getDigits(num);

		return digits[0];
	}
}
