<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
        <link rel="stylesheet" href="basic-90/styles/bootstrap.min.css" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <link href="halice/layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
        <title>Dev Cred</title>
       
    </head>
    <body id="top">
        <div class="bgded overlay" style="background-image:url('dev_edited.jpg');"> 
  
  <div id="pageintro" class="hoc"> 
    
    <article>
        <div class="fl_left">
        <h3 class="heading"><a href="index.jsp">The Developer's Choice</a></h3>
      <p>A simple application to record the 
          <br>most preferred programming language of developers</p>
      </div>
      
      <div class="fl_right">
            <form name="preference" action="DataAdd" method="POST">
                <input type="hidden" name="anothername" value="<%=request.getAttribute("firstName")%>" />
                <div class="row">
                    <div class="col-3"><span>A</span></div>
                    <div class="col-3"><span>B</span></div>
                    <div class="col-3"><span>C</span></div>
                    <div class="col-3"><span>D</span></div>
                </div>
                <input class="btn" type="submit" value="Submit" name="submit" />
            </form>
      </div> 
    </article>
    <div class="fl_right fl_right_margin">
        
        <%
            if(request.getAttribute("count") != null){   
        %>
        <h4>Did you know that <i>${count}</i> developers prefer <i>${firstPref}</i>?</h4>
        <%
            }
        %>

      </div>
    
  </div>

  <div class="wrapper row0">
    <div id="topbar" class="hoc clear"> 

      <div class="fl_right">
        <ul>

          <li><a href="login.jsp">Login</a></li>
          <li><a href="create.jsp">Register</a></li>
        </ul>
      </div>
      
    </div>
  </div>
  
</div>
    </body>
</html>
