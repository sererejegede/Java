package devprofile;

import java.io.*;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Login extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
         String name = request.getParameter("userName");
        String password =request.getParameter("password");
        
        String DB_URL = "jdbc:mysql://localhost/registration";
        PrintWriter out = response.getWriter();
//        out.println(name);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DB_URL, "root", "");
//            out.println("Connection created");
            Statement statement = connection.createStatement();
            String sql_check = "SELECT fname, username, password FROM dev_credentials WHERE username = '"+name+"'";
//            out.println(sql_statement);
            
            ResultSet rs = statement.executeQuery(sql_check);
//            Boolean errtu = rs.next();
           rs.next();
            String username = rs.getString("username");
            String pass = rs.getString("password");
            String firstName = rs.getString("fname");
            String errpass = "Username or password incorrect";
            String errpass2 = "Username incorrect";
           if (name.equals(username)){
             if (password.equals(pass)){
                RequestDispatcher rd = request.getRequestDispatcher("login-success.jsp");
                request.setAttribute("firstName", firstName);
                rd.forward(request, response);  
             } else{
                 out.println("Incorrect Password");
             } 
           } else {
               out.println("Incorrect Username");
           }
//           if (name.equals(username) && password.equals(pass)){
//                
//            }
//            if (!name.equals(username)){
//               RequestDispatcher rd = request.getRequestDispatcher("login-error.jsp");
//               request.setAttribute("errpass2", errpass2);
//                rd.forward(request, response);
//            }
//            
//            else{
//               RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
//               request.setAttribute("errpass", errpass);
//                rd.forward(request, response);
//            }
            
            
            rs.close();
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
