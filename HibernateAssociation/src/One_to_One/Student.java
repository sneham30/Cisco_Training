package One_to_One;

/**
 * @author sneham
 *
 */


public class Student {

	private int studentId;
	private String StudentName;
	private int age;
	private Address address;

	/**
	 * @return int
	 *         studentId
	 */
	public int getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return String
	 *         studentName
	 */
	public String getStudentName() {
		return StudentName;
	}

	/**
	 * @param studentName
	 */
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	/**
	 * @return int
	 *         age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return Address address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

}
