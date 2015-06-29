package SetDemo;

// Student Class with rollNo and name has members and implements Comparable
// interface to make Student objects comparable useful with TreeSet i.e., for
// sorting student objects

public class Student implements Comparable<Student> {

	private int rollNO; // integer variable to store rollNo
	private String studentName; // String variable to store studentName


	public int getRollNO() {
		return this.rollNO;
	}


	public void setRollNO(int rollNO) {
		this.rollNO = rollNO;
	}


	public String getStudentName() {
		return this.studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	// parameterized constructor for Student Class with two parameters
	public Student(int rollNO, String studentName) {
		this.setRollNO(rollNO);
		this.studentName = studentName;
	}

	// parameterized constructor for Student Class with one parameters
	public Student(String studentName) {
		this.studentName = studentName;
	}

	// overriding compareTo() method to compare student objects based on
	// studentName

	@Override
	public int compareTo(Student object) {
		return studentName.compareTo((String) object.studentName);
	}


	// overriding toString() method to display studentName
	@Override
	public String toString() {
		return this.rollNO + "--->" + this.studentName;

	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) { return (((Student) obj).getRollNO() == this.rollNO) && ((Student) obj).getStudentName().equals(this.studentName); }
		return false;

	}

	@Override
	public int hashCode() {
		int hashcode = rollNO * 3;
		hashcode = hashcode + studentName.hashCode();
		return hashcode;

	}

}
