
public class FinallyWithoutCatch {

	public static void main(String[] args) {
		try {
			int array[] = new int[3];
			array[4] = 1;
			// throw new RuntimeException();
		}
		/*
		 * catch (ArrayIndexOutOfBoundsException a) {
		 * System.out.println("ArraysOutboundException :" + a);
		 * }
		 * catch (Exception e) {
		 * System.out.println("Execption :" + e);
		 * }
		 */finally {
			System.out.println("In finally!!");
		}

	}

}
