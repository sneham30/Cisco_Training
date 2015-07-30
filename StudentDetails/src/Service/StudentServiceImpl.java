package Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import Model.Student;



@Service("studentService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class StudentServiceImpl implements StudentService {

	private List<Student> students = new ArrayList<Student>();

	/*
	 * (non-Javadoc)
	 * @see Service.StudentService#addStudent(Model.Student)
	 */
	@Override
	public void addStudent(Student student) {
		if (students.size() != 0) {
			for (Student stud : students) {
				if (!stud.equals(student)) {
					this.students.add(student);
					System.out.println("Student added!!");
					System.out.println(students);
					break;
				}
			}
		} else {
			this.students.add(student);
			System.out.println("Student added!!");
			System.out.println(students);

		}

	}

	/*
	 * (non-Javadoc)
	 * @see Service.StudentService#listStudents()
	 */
	@Override
	public List<Student> listStudents() {
		return this.students;
	}

	/*
	 * (non-Javadoc)
	 * @see Service.StudentService#getStudent(int)
	 */
	@Override
	public Student getStudent(int studentId) {

		for (Student stud : students) {
			if (stud.getStudentId() == studentId) {

				System.out.println("Student present!!");
				System.out.println(students);
				return stud;
			}
		}
		return null;


	}

	/*
	 * (non-Javadoc)
	 * @see Service.StudentService#deleteStudent(int)
	 */
	@Override
	public void deleteStudent(int studentId) {
		for (Student stud : students) {
			if (stud.getStudentId() == studentId) {
				this.students.remove(stud);
				System.out.println("Student removed!!");
				System.out.println(students);
				break;
			}
		}

	}

	/*
	 * (non-Javadoc)
	 * @see Service.StudentService#updateStudent(Model.Student)
	 */
	@Override
	public void updateStudent(Student student) {
		Student stud = getStudent(student.getStudentId());
		this.students.remove(stud);
		this.students.add(student);
		System.out.println("Student updated!!");
		System.out.println(students);

	}



}
