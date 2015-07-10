package Servlets;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class SessionCounterListener
 *
 */
public class SessionCounterListener implements ServletContextListener {

	private static int totalActiveSessions;

	/**
	 * Default constructor.
	 */
	public SessionCounterListener() {
		// TODO Auto-generated constructor stub
	}

	public static int getTotalActiveSession() {
		return totalActiveSessions;
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		totalActiveSessions++;
		System.out.println(totalActiveSessions + " Session created!!");
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		totalActiveSessions--;
		System.out.println("Session Destroyed!!");
	}

}
