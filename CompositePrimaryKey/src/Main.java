import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Student student = new Student();
		student.setStudentId(100);
		student.setStudentName("sneha");
		student.setAge(21);
		Student stud = new Student();
		stud.setAge(23);
		stud.setStudentId(102);
		stud.setStudentName("sneha");
		Transaction tx = session.beginTransaction();
		session.save(student);
		session.save(stud);
		System.out.println("Object Loaded successfully.....!!");
		tx.commit();

		session.close();
		factory.close();
	}



}
