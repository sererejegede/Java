/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author TOSIN
 */
public class quicktest extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String DB_URL = "jdbc:mysql://localhost/registration";
        PrintWriter out = response.getWriter();
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection(DB_URL, "root", "");
            String sql_add = "INSERT INTO dev_credentials (fname, lname, username, password) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = c.prepareStatement(sql_add);
            
            statement.setString(1, "John");
            statement.setString(1, "Bosco");
            statement.setString(1, "j.bosco");
            statement.setString(1, "johnbosco");
            statement.execute();
            out.println("Connected");
        }catch (SQLException se){
                    se.printStackTrace();
           }catch (Exception e){
               e.printStackTrace();
           }
        

    }

}
