package devprofile;


import java.io.*;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Login extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
         String name = request.getParameter("userName");
        String password =request.getParameter("password");

        
        PrintWriter out = response.getWriter();

        try {

            Connection connection = DBConnection.getConnection();
            Statement statement = DBConnection.cStatement();
            String sql_check = "SELECT fname, username, password FROM dev_credentials WHERE username = '"+name+"'";
          
            
            ResultSet rs = statement.executeQuery(sql_check);

           if(rs.next()){
            String username = rs.getString("username");
            String pass = rs.getString("password");
            String firstName = rs.getString("fname");
            String passErr = "Incorrect Password";
            
//            String passErr = "Incorrect Password";
          
           if (name.equals(username)){
             if (password.equals(pass)){
                RequestDispatcher rd = request.getRequestDispatcher("select.jsp");
                request.setAttribute("firstName", firstName);
                rd.forward(request, response);  
             } else{
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                request.setAttribute("passErr", passErr);
                rd.forward(request, response);
             } 
           } 

           } else {
               String userErr = "Incorrect Username";
               RequestDispatcher reqdisp = request.getRequestDispatcher("login.jsp");
               request.setAttribute("userErr", userErr);
               reqdisp.forward(request, response);
           }  
            
            rs.close();
            statement.close();
            connection.close();
//        } catch (IOException | ClassNotFoundException | SQLException | ServletException e) {
        }catch (SQLException | IOException | ServletException se){
           }
      } 
     
    }
