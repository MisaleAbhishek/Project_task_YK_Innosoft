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
 * Servlet implementation class AddedBooks
 */
public class AddedBooks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddedBooks() {
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		HttpSession hs = request.getSession();
		String book1 = (String)hs.getAttribute("book1");
		String book2 = (String)hs.getAttribute("book2");
		String book3 = (String)hs.getAttribute("book3");
		String book4 = (String)hs.getAttribute("book4");
		PrintWriter pw = response.getWriter();
		pw.println("<html><body bgcolor=yellow text=green> ");
		pw.println("<h1><u>Selected books</u></h1>");
		if(book1!=null)
		{
			pw.println(book1+"<br>");
		}
		if(book2!=null)
		{
			pw.println(book2+"<br>");			
		}
		if(book3!=null)
		{
			pw.println(book3+"<br>");			
		}
		if(book4!=null)
		{
			pw.println(book4+"<br>");			
		}
		pw.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
