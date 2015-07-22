package Many_to_Many;

import java.util.Set;


public class Subject {

	private int subId;
	private String subName;
	private Set<Student> students;

	/**
	 * @return the subId
	 */
	public int getSubId() {
		return subId;
	}

	/**
	 * @param subId
	 *            the subId to set
	 */
	public void setSubId(int subId) {
		this.subId = subId;
	}

	/**
	 * @return the subName
	 */
	public String getSubName() {
		return subName;
	}

	/**
	 * @param subName
	 *            the subName to set
	 */
	public void setSubName(String subName) {
		this.subName = subName;
	}

	/**
	 * @return the students
	 */
	public Set<Student> getStudents() {
		return students;
	}

	/**
	 * @param students
	 *            the students to set
	 */
	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return this.subName;
	}

}
