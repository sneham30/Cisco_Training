package One_to_Many;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("One_to_Many//hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		Query query = session.createQuery("from Student");
		@SuppressWarnings("unchecked")
		List<Student> list = query.list();

		Iterator<Student> itr = list.iterator();
		System.out.println("Student Details:");
		while (itr.hasNext()) {
			Student student = itr.next();

			System.out.println(student.getStudentId() + " " + student.getStudentName() + " " + student.getAge() + " " + student.getDepartment().getDeptName());

		}

		session.close();
		System.out.println("success");
	}
}