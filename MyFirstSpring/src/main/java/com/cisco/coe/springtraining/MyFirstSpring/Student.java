package com.cisco.coe.springtraining.MyFirstSpring;

/**
 * @author sneham
 *
 */


public class Student {

	private int studentId;
	private String StudentName;
	private int age;
	private int marks;

	public Student(int marks) {
		this.marks = marks;
	}

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

	@Override
	public String toString() {
		return " id:" + this.studentId + " name:" + this.StudentName + " age:" + this.age + " marks:" + this.marks;
	}

	public void setMarks(int i) {
		this.marks = i;

	}
}
