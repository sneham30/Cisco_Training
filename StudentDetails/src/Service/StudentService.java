package Service;

import java.util.List;

import Model.Student;

/**
 * @author sneham
 *
 */
public interface StudentService {

	/*
	 * Method to add Student
	 * @param Student
	 * Student Object to add
	 */
	public void addStudent(Student student);

	/*
	 * Method to List all Student
	 * @return List<Student>
	 * list of Student objects
	 */
	public List<Student> listStudents();

	/*
	 * Method to get Student Object based on stduentID
	 * @param studentId
	 * int Student Id whose Object is to be returned
	 * @return Student
	 * Object of Student
	 */
	public Student getStudent(int studentId);


	/*
	 * Method to delete Student
	 * @param studentId
	 * int Student Id to deleted
	 */
	public void deleteStudent(int studentId);

	/*
	 * Method to modify Student
	 * @param Student
	 * Student Object to updated
	 */
	public void updateStudent(Student student);
}
