package myfirstservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "NewServlet", urlPatterns = {"/NewServletPath"}, initParams = {@WebInitParam(name = "name", value = "Serere")})
public class NewServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title></title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<hr>");
//            out.println("<h4 style=color:red>Red Greetings</h4>");
//            out.println("</body>");
//            out.println("</html>");
//        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("name");
        String surName = request.getParameter("surName");
        HttpSession session = request.getSession();
        PrintWriter out = response.getWriter();
        if ((name != "") && (name != null)){
            session.setAttribute("sessionName", name);
            session.setAttribute("sessionSurName", surName);
            out.println("Good evening " + (String) session.getAttribute("sessionName") + " " + (String) session.getAttribute("sessionSurName"));
        }
        
        out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title></title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<hr>");
            out.println("<h4 style=color:blue>Blue Greetings</h4>");
            out.println("Good evening " + name + " " + surName + "<br>");
            out.println(getServletConfig().getInitParameter("name")+ " is the default name.");
            out.println("<h4 style=color:red>Red Greetings</h4>");
            out.println("<hr>");
            out.println("</body>");
            out.println("</html>");
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
   
     
    

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
