package Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CustomerAccountDetails.Customer;
import DataBaseHelper.CustomersHelper;

/**
 * Servlet implementation class NewCustomer
 */
public class NewCustomer extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NewCustomer() {
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

		String name = request.getParameter("customerName");
		String address = request.getParameter("customerAddress");
		String password = request.getParameter("password");

		Customer customer = new Customer(name, address, password);
		CustomersHelper custHelp = new CustomersHelper(customer);
		custHelp.insertIntoTable();

		RequestDispatcher reqdis = request.getRequestDispatcher("CustomerDetails.jsp");
		request.setAttribute("CustomerName", customer.getCustomerName());
		reqdis.forward(request, response);
	}

}
