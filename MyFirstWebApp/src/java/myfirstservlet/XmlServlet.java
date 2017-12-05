
package myfirstservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import java.io.PrintWriter;

@WebServlet(name = "XmlServlet", urlPatterns = {"/XmlServletPath"})
public class XmlServlet extends HttpServlet{
     @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//         PrintWriter writeOut = response.getWriter();
//        processRequest(request, response);
//        response.getWriter().print("Inside doGet for new class XmlServlet");
        response.getWriter().print("Inside doGet for new class XmlServlet");
    }

    
}
