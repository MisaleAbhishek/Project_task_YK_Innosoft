package bookcart;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class AddBooks
 */
public class AddBooks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBooks() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			// TODO Auto-generated method stub
			String book1 = request.getParameter("book1");
			String book2 = request.getParameter("book2");
			String book3 = request.getParameter("book3");
			String book4 = request.getParameter("book4");		
			HttpSession hs = request.getSession();
			hs.setAttribute("book1", book1);
			hs.setAttribute("book2", book2);
			hs.setAttribute("book3", book3);
			hs.setAttribute("book4", book4);
			PrintWriter pw= response.getWriter();
			pw.println("<html><body bgcolor= black text = green><center><h2>");
			pw.println("Your Books Are Added To Cart </h2><br><br>");
			pw.println("You can see you Added Books : <a href= addedbooks> Click here</a>");
			pw.println("</center></body></html>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
