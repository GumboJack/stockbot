package servlets;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpServlet;

public class StartupServlet extends HttpServlet implements ServletContextListener {

    //TODO rájönni mi a kurva éde s anyjáért nem húzza be a database modult ez a trágya

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("Hello World");


    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
