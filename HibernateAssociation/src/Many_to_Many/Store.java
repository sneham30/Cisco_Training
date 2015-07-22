package Many_to_Many;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Store {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("Many_to_Many//hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Student student1 = new Student();
		student1.setStudentName("sneha");
		student1.setAge(21);

		Student student2 = new Student();
		student2.setStudentName("shree");
		student2.setAge(21);


		Student student3 = new Student();
		student3.setStudentName("shruthi");
		student3.setAge(21);
		Subject sub1 = new Subject();
		sub1.setSubName("English");
		Subject sub2 = new Subject();
		sub2.setSubName("Kannada");
		Subject sub3 = new Subject();
		sub3.setSubName("Hindi");
		Subject sub4 = new Subject();
		sub4.setSubName("computer");

		Set<Subject> subjects = new HashSet<Subject>();
		subjects.add(sub1);
		subjects.add(sub2);
		subjects.add(sub3);
		subjects.add(sub4);

		student1.setSubjects(subjects);
		subjects.remove(sub3);
		student2.setSubjects(subjects);
		subjects.remove(sub1);
		student3.setSubjects(subjects);

		Set<Student> students = new HashSet<Student>();
		students.add(student3);
		students.add(student2);
		students.add(student1);

		sub1.setStudents(students);

		sub2.setStudents(students);
		sub3.setStudents(students);
		sub4.setStudents(students);


		session.persist(student1);
		session.persist(student2);
		session.persist(student3);

		session.persist(sub1);
		session.persist(sub2);
		session.persist(sub3);
		session.persist(sub4);

		tx.commit();

		session.close();
		System.out.println("success");
	}
}