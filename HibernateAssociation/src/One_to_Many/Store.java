package One_to_Many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Store {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("One_to_Many//hibernate.cfg.xml");

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

		Department dept1 = new Department();
		dept1.setDeptName("CSE");

		Department dept2 = new Department();
		dept2.setDeptName("ISE");
		student1.setDepartment(dept1);
		student2.setDepartment(dept1);
		student3.setDepartment(dept2);
		session.persist(student1);
		session.persist(student2);
		session.persist(student3);
		tx.commit();

		session.close();
		System.out.println("success");
	}
}