<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
        <link rel="stylesheet" href="basic-90/styles/layout.css" type="text/css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <link href="halice/layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
        <link rel="stylesheet" href="basic-90/styles/bootstrap.min.css" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Preference Select | Dev Cred</title>
    </head>
    <body>
   <div class="bgded overlay" style="background-image:url('dev_edited.jpg');"> 
  <!-- ################################################################################################ -->
  <div class="wrapper row0">
    <div id="topbar" class="hoc clear"> 
      <!-- ################################################################################################ -->
      <div class="fl_left">
        <div id="hgroup">
      <h1><a href="#">Developer's Preference</a></h1>
      <p>A Scale of Preference for Developers</p>
    </div>
      </div>
      <div class="fl_right">
        <ul>
          <li><a href="index.jsp"><i class="fa fa-lg fa-home"></i></a></li>
          <li><a href="login.jsp">Login</a></li>
          <li><a href="create.jsp">Register</a></li>
        </ul>
      </div>
      <!-- ################################################################################################ -->
    </div>
  </div>
  <!-- ################################################################################################ -->
</div>
        <% 
            if(request.getAttribute("firstName") == null){
        %>
        <div class="topmargin"> <h1>You must be logged in to input your preference</h1></div>
        <%
            return;
            }
        %>
        <div class="row">
            <div class="col-2"></div>
            <div class="col-8">
        <div class="topmargin"> <h1>Welcome ${firstName}!</h1></div><hr>
        <form name="preference" action="DataAdd" method="POST">
            <input type="hidden" name="anothername" value="<%=request.getAttribute("firstName")%>" />
            <table class="styled">
                <tr>
                    <td>First Option: </td>
                    <td>
                        <select name="first">
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
                        </select>
                    </td>
                </tr> 
          
                <tr>
                    <td>Second Option: </td>
                    <td>
                       <select name="second">
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
                        </select> 
                    </td>
                </tr>          
        
                <tr>
                    <td>Third Option: </td>
                    <td>
                       <select name="third">
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
                        </select> 
                    </td>
                </tr> 
        </table>
 
        <input class="btn" type="submit" value="Submit" name="submit" />
        </form>
            </div>
<div class="col-2"></div>
</div>