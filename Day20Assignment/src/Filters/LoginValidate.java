package Filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class LoginValidate
 */
public class LoginValidate implements Filter {

	/**
	 * Default constructor.
	 */
	public LoginValidate() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("adminId");
		String password = request.getParameter("pwd");
		if (password.equals("admin123") && userName.equals("admin")) {
			chain.doFilter(request, response);// sends request to next resource
		} else {
			out.print("username or password error!");
			RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			rd.include(request, response);
		}

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
