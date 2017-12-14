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

public class Statistics extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {}
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String DB_URL = "jdbc:mysql://localhost/registration";
        PrintWriter out = response.getWriter();
        
        String firstPref = request.getParameter("firstPref");
        String secondPref = request.getParameter("firstPref");
//        String thirdPref = request.getParameter("firstPref");
//        String secondPref = request.getParameter("");
//        String thirdPref = request.getParameter("");
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DB_URL, "root", "");
//            out.println("Connection created");
            Statement statement = connection.createStatement();
            String sql_count2 = "SELECT COUNT(*) AS 'count2' FROM dev_credentials WHERE secondLand = '"+secondPref+"'";
            String sql_count = "SELECT COUNT(*) AS 'count' FROM dev_credentials WHERE firstLang = '"+firstPref+"'";
//            String sql_count = "SELECT COUNT(*) AS 'count' FROM dev_credentials WHERE firstLang = '"+secondPref+"'";
//            String sql_count = "SELECT COUNT(*) AS 'count' FROM dev_credentials WHERE firstLang = '"+thirdPref+"'";
//            out.println(sql_count);
            
            ResultSet result = statement.executeQuery(sql_count);
//            statement.execute(sql_count);
            result.next();
            int count = result.getInt("count");
//                out.println(count);
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                request.setAttribute("count", count);
                request.setAttribute("firstPref", firstPref);
                rd.forward(request, response);  
           

            
            result.close();
            statement.close();
            connection.close();
//        } catch (IOException | ClassNotFoundException | SQLException | ServletException e) {
        }catch (SQLException | IOException | ClassNotFoundException | ServletException se){
           }
    }
        
    }



