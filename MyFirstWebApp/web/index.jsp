<%-- 
    Document   : index
    Created on : Nov 16, 2017, 11:50:52 AM
    Author     : Oluwasererefunmi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .div1{
                border: 2px solid #00ffff;
                color: #000000;
                padding: 10px;
                margin: 10px 0;
                width: auto;
            }
        </style>
    </head>
    <body>
        <div class="div1">
        <h1>Simple Form</h1>
        <form action="index.jsp" method="get">
            <input type="text" name="name" placeholder="Name"/>
            <input type="text" name="surName" placeholder="Surname"/>
            <input type="submit" value="Submit" name="submit" />
        </form>
        </div>
<%!
 public int add(int q, int z){
 return q + z;
}
%>

<%
String name = request.getParameter("name");
if (name != null){
session.setAttribute("sessionName", name);
application.setAttribute("applicationName", name);
pageContext.setAttribute("applicationName", name, PageContext.APPLICATION_SCOPE);
pageContext.setAttribute("sessionName", name, PageContext.SESSION_SCOPE);
}
%>
<p class="div1"> The name of the current user is <%= name%></p><br>
<p class="div1"> The name of the current user is (in session) <%= session.getAttribute("sessionName")%> </p><br>
<p class="div1"> The name of the current user is (in application) <%= application.getAttribute("applicationName")%> </p>

    </body>
</html>
