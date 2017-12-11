package devprofile;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewReg extends HttpServlet {
	protected void processRequest (HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		processRequest(request, response);
		PrintWriter out = response.getWriter();
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");
		
		
//		/*********SQL LOGIN*********/
		String DB_URL = "jdbc:mysql://localhost/registration";
		String sql_username = "root";
		String sql_password = "";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
                    try (Connection con = DriverManager.getConnection(DB_URL, sql_username, sql_password); Statement stmt = con.createStatement()) {
                        
//			String sql_check = "SELECT username FROM dev_credentials WHERE username = '"+username+"'";
//			ResultSet res = stmt.executeQuery(sql_check);

//                        String sql_add = "INSERT INTO choice (prog_name) VALUE ('"+firstName+"')";
String sql_add = "INSERT INTO dev_credentials (fname, lname, username, password) VALUES ('"+firstName+"','"+lastName+"','"+userName+"','"+passWord+"')";
//                        out.println(sql_add);
stmt.executeUpdate(sql_add);

                    }
		}catch (SQLException se){}
                catch (Exception e){}
	}
	
}