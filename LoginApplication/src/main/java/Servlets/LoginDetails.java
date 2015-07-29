package Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import Model.UserDetails;

/**
 * Servlet implementation class LoginDetails
 */
public class LoginDetails extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String uName = request.getParameter("adminId");
		String password = request.getParameter("pwd");

		UserDetails user = new UserDetails(uName, password);

		SessionFactory factory = ((AnnotationConfiguration) new AnnotationConfiguration().configure()).addAnnotatedClass(UserDetails.class).buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		int i = (Integer) session.save(user);
		tx.commit();
		session.close();
		if (i > 0) {
			System.out.println("Successfull!!!");
			RequestDispatcher rd = request.getRequestDispatcher("/Success.jsp");
			rd.forward(request, response);

		} else {
			RequestDispatcher rd = request.getRequestDispatcher("/Error.jsp");
			rd.forward(request, response);

		}


	}

}
