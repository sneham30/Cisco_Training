package Servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CustomerAccountDetails.Customer;
import DataBaseHelper.CustomersHelper;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	// private static int count = 0;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();

		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("adminId");
		String password = request.getParameter("pwd");
		ArrayList<Customer> customers = new ArrayList<Customer>();
		CustomersHelper custHelp = new CustomersHelper();
		customers = custHelp.fetchRecords();
		for (Customer customer : customers) {
			if (userName.equalsIgnoreCase(customer.getCustomerName()) && password.equalsIgnoreCase(customer.getPassWord())) {

				RequestDispatcher reqdis = request.getRequestDispatcher("/WelcomeServlet");
				reqdis.forward(request, response);
			}
		}


	}
}
