import java.io.Serializable;

/**
 * @author sneham
 *
 */


public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int studentId;
	private String StudentName;
	private int age;

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

}
