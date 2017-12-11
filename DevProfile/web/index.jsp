<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
<!--         <link rel="stylesheet" href="basic-90/styles/layout.css" type="text/css">
        <link rel="stylesheet" href="basic-90/styles/bootstrap.min.css" type="text/css">-->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <link href="halice/layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
        <title>Dev Cred</title>
       
    </head>
    <body id="top">
        <div class="bgded overlay" style="background-image:url('dev_edited.jpg');"> 
  <!-- ################################################################################################ -->
  <div id="pageintro" class="hoc"> 
    <!-- ################################################################################################ -->
    <article>
      <h3 class="heading">The Developer's Choice</h3>
      <p>This is a simple application to record the most preferred programming language of developers</p>
      <!--<p class="font-x1 uppercase bold">Libero cursus malesuada etiam</p>-->
      
    </article>
    <div class="fl_right fl_right_margin">
        <%
            if(request.getAttribute("count") != null){   
        %>
        <h4>Did you know that ${count} developers prefer ${firstPref}?</h4>
        <%
            }
        %>
        <ul class="nospace inline pushright">
          <li><a class="btn" href="#">Y</a></li>
          <li><a class="btn inverse" href="#">N</a></li>
        </ul>
      </div>
    <!-- ################################################################################################ -->
  </div>
  <!-- ############################################################################################### -->
  <!-- ################################################################################################ -->
  <!-- ################################################################################################ -->
  <div class="wrapper row0">
    <div id="topbar" class="hoc clear"> 
      <!-- ################################################################################################ -->
<!--      <div class="fl_left">
        <ul>
          <li><i class="fa fa-phone"></i> +00 (123) 456 7890</li>
          <li><i class="fa fa-envelope-o"></i> info@domain.com</li>
        </ul>
      </div>-->
      <div class="fl_right">
        <ul>
          <li><a href="index.html"><i class="fa fa-lg fa-home"></i></a></li>
          <li><a href="login.jsp">Login</a></li>
          <li><a href="create.jsp">Register</a></li>
        </ul>
      </div>
      <!-- ################################################################################################ -->
    </div>
  </div>
  <!-- ################################################################################################ -->
</div>
    </body>
</html>
