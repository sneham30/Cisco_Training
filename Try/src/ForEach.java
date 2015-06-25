public class ForEach {

	public static void main(String[] args) {
		int array[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		
		System.out.println("Elements of 2D array:");

		/*using for each to display 2D array
		 * */
		for (int[] arr : array) {

			for (int ar : arr) {
				System.out.print(ar + "\t");
			}
			System.out.println();
		}

	}

}
