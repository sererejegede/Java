<%-- 
    Document   : login-success
    Created on : Nov 27, 2017, 11:49:18 AM
    Author     : oluwatosin
<%= request.getParameter("name")%>
--%>

<%@page import="regAppLogin.dto.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
    <body>
        
        
        <jsp:useBean id= "user" class= "regAppLogin.dto.User" scope= "request">
            <jsp:setProperty name="user" property="name" value="Jarlaxle Baenre"/>
        </jsp:useBean>
        
        Welcome (using jstl) <jsp:getProperty name="user" property="name" />
    </body>
</html>
