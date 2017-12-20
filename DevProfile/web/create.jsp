<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="basic-90/styles/layout.css" type="text/css">
        <link rel="stylesheet" href="basic-90/styles/bootstrap.min.css" type="text/css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <link href="halice/layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create an Account</title>
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
            <input type="text" name="fname" placeholder="First Name" required="true"/><br>
            <input type="text" name="lname" placeholder="Last Name" /><br>            
            <input type="text" name="username" placeholder="Username" required="true"/><br>
            <input type="password" name="password" placeholder="Password" required="true"/><br>
            <div class="div1"> <button class="btn btn-color" type="submit" value="Submit">Submit</button>  <button class="btn btn-color" type="reset" value="Reset">Reset</button></div>
        </form>
        </div>
        <div class="col-4"></div> 
        </div>
            <br>
            <!--<span class="div1"> Already a Member?<a href="login.jsp"> Login</a></span>-->
         <%
         Object success = request.getAttribute("success");
         if(success != null){
                 
         %>
         <h1 class="div1"> <%=success %></h1>
         <h4 class="div1"> <a href="login.jsp">Login</a></h4>
        <% 
        }    
        Object errpass = request.getAttribute("errpass");
        if(errpass != null){
        
        %>
        <h1 class='div1'> <%=errpass %></h1>
       <%
           }
       %>
    </body>
</html>
