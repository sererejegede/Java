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
        <title>Statistics | Dev Cred</title>
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
  
  <div class="row"  >
    <div class="col-2"></div>
    <div class="col-8">
        <% 
            if(request.getAttribute("firstName") == null){
        %>
        <div class="topmargin"> <h1>You must be logged in to input your preference</h1></div>
        <%
            return;
            }
        %>
        <div class="topmargin"><h1 class='fl_right'>${firstName}'s Profile</h1></div><hr>
        <form action="Statistics" method="POST">
            <select name="firstPref">
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
    </div>
    <div class="col-2"></div>
  </div>
        <% 
            if(request.getAttribute("count") == null){
            return;
            }
        %>
        <p> <b>${count}</b> developers chose <b>${firstPref}</b> as their most preferred programming language</p>
        