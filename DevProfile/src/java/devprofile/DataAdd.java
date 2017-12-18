package devprofile;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DataAdd extends HttpServlet{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {}
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstOption = request.getParameter("first");
        String secondOption = request.getParameter("second");
        String thirdOption = request.getParameter("third");
        
        String anothername = request.getParameter("anothername");
        
        PrintWriter out = response.getWriter();
        
    try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USERNAME, Constants.DB_PASSWORD);
//            out.println("Connection created");
            Statement statement = connection.createStatement();
            
            String sql_preference = "UPDATE dev_credentials SET firstLang = '"+firstOption+"', secondLang = '"+secondOption+"', thirdLang = '"+thirdOption+"' WHERE fname = '"+anothername+"'";
            
            
            statement.execute(sql_preference);
            
            RequestDispatcher dis = request.getRequestDispatcher("statistics.jsp");
            request.setAttribute("firstName", anothername);
            dis.forward(request, response);

            statement.close();
            connection.close();

            
        }catch (SQLException se){
                    se.printStackTrace();
           }catch (Exception e){
               e.printStackTrace();
           }
    }

}