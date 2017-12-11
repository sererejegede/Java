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
        <title>Login | Dev Cred</title>
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
        <div class="row">
            <div class="col-4 first"></div>
            <div class="col-4">    
        <form action="Login" method="POST">
            <input type="text" name="userName" placeholder="Enter Username" required="true" />
            <input type="password" name="password" placeholder="Enter Password" required="true" /><br>
            <div class="div1"> <button class="btn btn-color" type="submit" value="Submit">Submit</button>  <button class="btn btn-color" type="reset" value="Reset">Reset</button></div>
        </form>
        </div>
        <div class="col-4"></div>    
        </div><br>
        <span class="div1">Not a member? <a href="create.jsp">Create Account</a></span>
        <% 
        Object passErr = request.getAttribute("passErr");
        if(passErr != null){
        %>
        <h3 class="div1">Incorrect Password</h3>
        <%
            }
        %>
        <%
        Object userErr = request.getAttribute("userErr");
        if(userErr != null){
        %>
        <h3 class="div1">User does not exist</h3>
        <%
            }
        %>
    </body>
</html>
