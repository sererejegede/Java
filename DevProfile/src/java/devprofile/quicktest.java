package devprofile;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class quicktest extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        PrintWriter out = response.getWriter();
        out.println("IT WORKS!!!!!");
    }
            
    
}

//public class quicktest extends HttpServlet {
//
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//      
//    }
//
//    
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//        
//        String DB_URL = "jdbc:mysql://localhost/registration";
//        PrintWriter out = response.getWriter();
//        
//        try{
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection c = DriverManager.getConnection(DB_URL, "root", "");
//            String sql_add = "INSERT INTO dev_credentials (fname, lname, username, password) VALUES (?, ?, ?, ?)";
//            PreparedStatement statement = c.prepareStatement(sql_add);
//            
//            statement.setString(1, "John");
//            statement.setString(1, "Bosco");
//            statement.setString(1, "j.bosco");
//            statement.setString(1, "johnbosco");
//            statement.execute();
//            out.println("Connected");
//        }catch (SQLException se){
//                    se.printStackTrace();
//           }catch (Exception e){
//               e.printStackTrace();
//           }
//        
//
//    }
//
//}
