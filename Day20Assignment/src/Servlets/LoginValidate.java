package Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginValidate
 */
public class LoginValidate extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private String UserName;
	private String Password;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginValidate() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * @see javax.servlet.GenericServlet#init(javax.servlet.ServletConfig)
	 * intialising the username and pasword fields
	 */
	public void init(ServletConfig servletConfig) throws ServletException {
		this.UserName = servletConfig.getInitParameter("UserName");
		this.Password = servletConfig.getInitParameter("Password");
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
	 *      reads the parameter and validates the username and password
	 *      redirects to login page if validation fails otherwise on succesfull
	 *      validation
	 *      dispatches request to Welcome Servlet
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher reqdis = request.getRequestDispatcher("/WelcomeServlet");
		reqdis.forward(request, response);

	}

}
