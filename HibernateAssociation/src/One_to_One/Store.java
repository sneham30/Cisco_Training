package One_to_One;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Store {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("One_to_One//hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Student student = new Student();
		student.setStudentName("sneha");
		student.setAge(21);

		Address address1 = new Address();
		address1.setAddressLine1("#60,7th cross,50 ft road,chowdeshwari nagar,laggere");
		address1.setCity("Bangalore");
		address1.setState("Karanataka");
		address1.setCountry("India");
		address1.setPincode(560058);


		student.setAddress(address1);
		address1.setStudent(student);
		;

		session.persist(student);
		tx.commit();

		session.close();
		System.out.println("success");
	}
}