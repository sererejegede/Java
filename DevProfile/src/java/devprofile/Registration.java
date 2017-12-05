package devprofile;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registration extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        PrintWriter out = response.getWriter();
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        
//        **********CHECK TO SEE ALL FIELDS FILLED***********

     

        String DB_URL = "jdbc:mysql://localhost/registration";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DB_URL, "root", "");
//            out.println("Connection created");
            Statement statement = connection.createStatement();

//            out.println(sql_statement);
            String sql_add = "INSERT INTO dev_credentials (fname, lname, username, password) VALUES ('" + fname + "','" + lname + "','" + userName + "','" + password + "')";
//            out.println(sql_add);

//          ***************CHECKING IF USER EXISTS*******************

            String sql_check = "SELECT username, password FROM dev_credentials WHERE username = '" + userName + "'";
            ResultSet rs = statement.executeQuery(sql_check);
            if(rs.next()) {
                String errpass = "User already exists";
                RequestDispatcher rd = request.getRequestDispatcher("create.jsp");
                request.setAttribute("errpass", errpass);
                rd.forward(request, response);
            } else {
                statement.executeUpdate(sql_add);
                String success = "Account Created";
                RequestDispatcher rd = request.getRequestDispatcher("create.jsp");
                request.setAttribute("success", success);
                rd.forward(request, response);
            }
//                String username = rs.getString("username");
//
//                if (userName.equals(username)) {
//                    out.println("User already exists");
//                    
//                }else {
//                statement.executeUpdate(sql_add);
//                    out.println("User created");
//                }

//           if(rs.next()){
//            String user_name = rs.getString("username");
//            String pass = rs.getString("password");
//           
////            if (username.equals(user_name) && password.equals(pass)){
////                RequestDispatcher rd = request.getRequestDispatcher("login-success.jsp");
////                rd.forward(request, response);
////            }
////            }else{
////                response.sendRedirect("login-error.jsp");
////            }
//           }
//            rs.close();
                statement.close();
                connection.close();
            
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
