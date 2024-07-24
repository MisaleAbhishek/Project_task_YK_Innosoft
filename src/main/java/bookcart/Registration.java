package bookcart;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Servlet implementation class Registration
 */
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		try {
			
			String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		    String USER = "c##dbms" ;
		    String PASSWORD = "abhi" ;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(URL,USER,PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String fname    = request.getParameter("fname");
			String lname    = request.getParameter("lname");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			PreparedStatement pstmt = con.prepareStatement("insert into userinfo values(?,?,?,?)");
			pstmt.setString(1, fname);
			pstmt.setString(2, lname);
			pstmt.setString(3, username);
			pstmt.setString(4, password);
			
			pstmt.executeUpdate();
			
			PrintWriter pw = response.getWriter();
			pw.println("<html><body bgcolor= black text = green><center><h3>");
			pw.println("You Have Registered Successfully!!!!<br><br>");
			pw.println("<a href=login1.html>Login <a>");
			pw.println("<h3></center><body><html>");
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
