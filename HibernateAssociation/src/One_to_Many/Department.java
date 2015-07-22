package One_to_Many;

import java.util.List;


public class Department {

	private int deptId;
	private String deptName;
	private List<Student> students;

	/**
	 * @return the deptId
	 */
	public int getDeptId() {
		return deptId;
	}

	/**
	 * @param deptId
	 *            the deptId to set
	 */
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return deptName;
	}

	/**
	 * @param deptName
	 *            the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	/**
	 * @return the students
	 */
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * @param students
	 *            the students to set
	 */
	public void setStudents(List<Student> students) {
		this.students = students;
	}
}
