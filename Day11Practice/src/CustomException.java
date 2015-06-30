import java.util.Scanner;



public class CustomException {


	@SuppressWarnings("serial")
	class InvalidInputException extends Exception {

		public InvalidInputException() {

			System.out.println("Invalid Input!!");
		}

	}

	public static void main(String args[]) {

		System.out.println("Enter a string of length 4:");
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		if (input.length() != 4) {
			try {
				throw new CustomException().new InvalidInputException();
			}
			catch (InvalidInputException e) {

				e.printStackTrace();
			} finally {
				System.out.println("Exit!!");
			}
		}
	}
}
