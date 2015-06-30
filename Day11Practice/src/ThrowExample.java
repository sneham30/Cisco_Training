public class ThrowExample {

	void firstMethod() {
		try {
			throw new Exception();
		}
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("In firstMethod()!!");
		}



	}

	void secondMethod() {
		System.out.println("In secondMethod()!!");
		firstMethod();
		int a = 5 / 0;

	}

	void thirdMethod() {
		System.out.println("In thirdMethod()!!");
		secondMethod();
	}

	public static void main(String[] args) {
		ThrowExample test = new ThrowExample();
		test.thirdMethod();
	}
}
