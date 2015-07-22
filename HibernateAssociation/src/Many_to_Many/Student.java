package Many_to_Many;

import java.util.Set;

/**
 * @author sneham
 *
 */


public class Student {

	private int studentId;
	private String StudentName;
	private int age;
	private Set<Subject> subjects;

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
	 * @return the subjects
	 */
	public Set<Subject> getSubjects() {
		return subjects;
	}

	/**
	 * @param subjects
	 *            the subjects to set
	 */
	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return this.StudentName;
	}
}
