package Servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CustomerAccountDetails.Account;
import DataBaseHelper.AccountsHelper;
import Exceptions.LowBalanceException;

/**
 * Servlet implementation class Transaction
 */
public class Transaction extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Transaction() {
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
		String operation = request.getParameter("operation");
		String accName = request.getParameter("accName");
		int accountNumber = Integer.parseInt(request.getParameter("accNo"));
		double amount = Double.parseDouble(request.getParameter("amount"));
		Account account = new Account(accName, accountNumber);
		AccountsHelper accHelp = new AccountsHelper(account);
		if (operation.equalsIgnoreCase("deposit")) {
			ArrayList<Account> accounts = accHelp.fetchRecords(accName);
			for (Account acc : accounts) {
				if (acc.getAccountNumber() == accountNumber) {
					acc.deposit(amount);
					accHelp = new AccountsHelper(acc);
					accHelp.updateAccount();
					break;
				}

			}
		} else if (operation.equalsIgnoreCase("withdraw")) {
			try {
				ArrayList<Account> accounts = accHelp.fetchRecords(accName);
				for (Account acc : accounts) {
					if (acc.getAccountNumber() == accountNumber) {
						acc.withDraw(amount);
						accHelp = new AccountsHelper(acc);
						accHelp.updateAccount();
						break;
					}

				}


			}

			catch (LowBalanceException e) {
				System.out.println("Low Balance Exception!!!");
				e.printStackTrace();
			}
		}
		accHelp.updateAccount();
		RequestDispatcher reqdis = request.getRequestDispatcher("/CustomerDetails.jsp");
		request.setAttribute("CustomerName", account.getAccountHolderName());
		System.out.println(account.getAccountHolderName());
		reqdis.forward(request, response);

	}

}
