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


public class DataAdd extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {}
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstOption = request.getParameter("first");
        String secondOption = request.getParameter("second");
        String thirdOption = request.getParameter("third");
        
        String anothername = request.getParameter("anothername");
        String DB_URL = "jdbc:mysql://localhost/registration";
        PrintWriter out = response.getWriter();
        
    try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DB_URL, "root", "");
//            out.println("Connection created");
            Statement statement = connection.createStatement();
            
            String sql_preference = "UPDATE dev_credentials SET firstLang = '"+firstOption+"', secondLang = '"+secondOption+"', thirdLang = '"+thirdOption+"' WHERE fname = '"+anothername+"'";
//            out.println(sql_preference);
            
            statement.execute(sql_preference);
            
                out.println("Preference noted");
            
           

            
//            rs.close();
            statement.close();
            connection.close();
//        } catch (IOException | ClassNotFoundException | SQLException | ServletException e) {
        }catch (SQLException se){
                    se.printStackTrace();
           }catch (Exception e){
               e.printStackTrace();
           }
    }

}