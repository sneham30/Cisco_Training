package Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CustomerAccountDetails.Account;
import DataBaseHelper.AccountsHelper;

/**
 * Servlet implementation class NewAccount
 */
public class NewAccount extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NewAccount() {
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
		String type = request.getParameter("type");
		String name = request.getParameter("custName");
		System.out.println(name);
		Account account = new Account(name, type);
		AccountsHelper accHelp = new AccountsHelper(account);
		accHelp.insertIntoTable();
		RequestDispatcher reqdis = request.getRequestDispatcher("/CustomerDetails.jsp");
		request.setAttribute("CustomerName", name);
		reqdis.forward(request, response);
	}

}
