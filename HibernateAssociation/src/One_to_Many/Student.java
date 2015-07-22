package One_to_Many;

/**
 * @author sneham
 *
 */


public class Student {

	private int studentId;
	private String StudentName;
	private int age;
	private Department department;

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
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * @param department
	 *            the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}

}
