<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="basic-90/styles/layout.css" type="text/css">
        <link rel="stylesheet" href="basic-90/styles/bootstrap.min.css" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Preference Select</title>
    </head>
    <body>
  <div class="wrapper row1">
   <header id="header" class="clear">
    <div id="hgroup">
      <h1><a href="#">Developer's Preference</a></h1>
      <h2>A Scale of Preference for Developers</h2>
    </div>
    <nav>
      <ul>
        <li><a href="create.jsp">Home</a></li>
        <li class="fl_right"><a href="login.jsp">Login</a></li>
      </ul>
    </nav>
  </header>  
  </div> 
        <% 
            if(request.getAttribute("firstName") == null){
        %>
        <h1>You must be logged in to input your preference</h1>
        <%
            return;
            }
        %>
        <h1>Welcome <%=request.getAttribute("firstName")%>!</h1>
        <form name="preference" action="DataAdd" method="POST">
            <input type="hidden" name="anothername" value="<%=request.getAttribute("firstName")%>" />    
First Option: <select name="first">
            <option>Java</option>
            <option>FORTRAN</option>
            <option>Python</option>
            <option>C</option>
            <option>C++</option>
            <option>C#</option>
            <option>PHP</option>
            <option>JavaScript</option>
            <option>Swift</option>
            <option>Arduino</option>
            <option>Ruby</option>
            <option>MATLAB</option>
            <option>HTML</option>
            <option>Perl</option>
            <option>SQL</option>
          </select><br><br>
          
Second Option: <select name="second">
            <option>Java</option>
            <option>FORTRAN</option>
            <option>Python</option>
            <option>C</option>
            <option>C++</option>
            <option>C#</option>
            <option>PHP</option>
            <option>JavaScript</option>
            <option>Swift</option>
            <option>Arduino</option>
            <option>Ruby</option>
            <option>MATLAB</option>
            <option>HTML</option>
            <option>Perl</option>
            <option>SQL</option>
        </select><br><br>          
        
Third Option: <select name="third">
            <option>Java</option>
            <option>FORTRAN</option>
            <option>Python</option>
            <option>C</option>
            <option>C++</option>
            <option>C#</option>
            <option>PHP</option>
            <option>JavaScript</option>
            <option>Swift</option>
            <option>Arduino</option>
            <option>Ruby</option>
            <option>MATLAB</option>
            <option>HTML</option>
            <option>Perl</option>
            <option>SQL</option>
        </select><br><br> 
        <input type="submit" value="Submit" name="submit" />
        </form>