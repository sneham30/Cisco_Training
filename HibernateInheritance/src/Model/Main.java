package Model;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();

		Transaction t = session.beginTransaction();

		Employee e1 = new Employee();
		e1.setName("sneha");

		RegularEmployee e2 = new RegularEmployee();
		e2.setName("shree");
		e2.setSalary(50000);

		ContractEmployee e3 = new ContractEmployee();
		e3.setName("Arun");
		e3.setPay_per_hour(1000);
		e3.setContract_duartion(15);


		session.persist(e1);
		session.persist(e2);
		session.persist(e3);

		t.commit();
		session.close();
		System.out.println("success");
	}
}