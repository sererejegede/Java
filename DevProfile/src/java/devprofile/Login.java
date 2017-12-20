package devprofile;


import devprofile.auth.LoginService;
import devprofile.auth.RegistrationService;
import java.io.*;
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
        
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("userName");
        String password =request.getParameter("password");
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String userName = request.getParameter("username");
        
        if (name != null && password != null) {
            
        LoginService loginService = new LoginService();
        int result = loginService.authenticate(name, password);
       
        switch (result) {
            case 1:
                RequestDispatcher rd = request.getRequestDispatcher("select.jsp");
                request.setAttribute("firstName", loginService.firstName(name));
                rd.forward(request, response); 
                break;
            case 2:
                String passErr = "Incorrect Password";
                RequestDispatcher rd2 = request.getRequestDispatcher("login.jsp");
                request.setAttribute("passErr", passErr);
                rd2.forward(request, response);
                break;
            case 3:
                String userErr = "User does not exists";
                RequestDispatcher rd3 = request.getRequestDispatcher("login.jsp");
                request.setAttribute("userErr", userErr);
                rd3.forward(request, response);
                break;
            default:
                break;

        }    
        }
        
        if (fname != null && lname != null) {
            
        
        RegistrationService registrationService = new RegistrationService();
        int register = registrationService.registerer(fname, lname, userName, password);
//        out.println(register);
            if (register == 0) {
                String errpass = "User already exists";
                RequestDispatcher rd = request.getRequestDispatcher("create.jsp");
                request.setAttribute("errpass", errpass);
                rd.forward(request, response);
            }else if (register == 1) {
                String success = "Account Created";
                RequestDispatcher rd = request.getRequestDispatcher("create.jsp");
                request.setAttribute("success", success);
                rd.forward(request, response);
            }
        }
      } 
     
    }
