public class ThrowsExample {

	void testMethod() throws NullPointerException {
		String a = null;
		System.out.println("unchecked Exception !!!");
	}

	void testMethod2() throws Exception {
		System.out.println("Checked Exception!!!");
		int a[] = new int[3];
		a[4] = 10;

	}

	public static void main(String[] args) {
		ThrowsExample test = new ThrowsExample();
		test.testMethod();
		Child c = new Child();
		Parent p = new Parent();

		try {
			test.testMethod2();
		}
		catch (Exception e) {
			System.out.println("Exception handle!!");
			e.printStackTrace();
		}
		p.exceptionMethod();
		c.exceptionMethod();
	}
}

class Parent {

	protected void exceptionMethod() throws ArithmeticException {
		System.out.println("Parent class Exception thrown!!");
		int div = 50 / 0;

	}
}

class Child extends Parent {

	protected void exceptionMethod() throws ArithmeticException {
		System.out.println("Child Class!! Exception");
	}
}
