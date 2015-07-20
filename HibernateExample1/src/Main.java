import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		Student student = new Student();
		student.setStudentName("sneha");
		student.setStudentId(1);
		student.setAge(21);

		SessionFactory sFactory = cfg.buildSessionFactory();
		Session session = sFactory.openSession();
		session.save(student);
		Transaction trans = session.beginTransaction();

		trans.commit();
		System.out.println("STUDENT ID=" + student.getStudentId());

		session.close();


	}

}
