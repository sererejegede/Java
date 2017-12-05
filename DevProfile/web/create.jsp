<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="basic-90/styles/layout.css" type="text/css">
        <link rel="stylesheet" href="basic-90/styles/bootstrap.min.css" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create an Account</title>
    </head>
    <body>
  <div class="wrapper row1">
   <header id="header" class="clear">
    <div id="hgroup">
      <h1><a href="#">Developer's Preference</a></h1>
      <h2>A Scale of Preference for Developers</h2>
    </div>
<!--    <form action="#" method="post">
      <fieldset>
        <legend>Search:</legend>
        <input type="text" value="Search Our Website&hellip;" onFocus="this.value=(this.value=='Search Our Website&hellip;')? '' : this.value ;">
        <input type="submit" id="sf_submit" value="submit">
      </fieldset>
    </form>-->
    <nav>
      <ul>
        <li><a href="create.jsp">Home</a></li>
        <li class="fl_right"><a href="login.jsp">Login</a></li>
      </ul>
    </nav>
  </header>
 </div>          
        <div class="div1">
        <form action="Registration" method="POST">
            <input type="text" name="fname" placeholder="First Name" required="true"/><br>
            <input type="text" name="lname" placeholder="Last Name" /><br>            
            <input type="text" name="username" placeholder="Username" required="true"/><br>
            <input type="password" name="password" placeholder="Password" required="true"/><br><br>
            <button class="btn btn-color" type="submit" value="Submit">Submit</button>  <button class="btn btn-color" type="reset" value="Reset">Reset</button>
        </form>
        </div> 
         <span class="div1"> Already a Member?<a href="login.jsp"> Login</a></span>
         <%
         Object success = request.getAttribute("success");
         if(success == null){
         return;
         } else
         %>
         <h1 class="div1"> <%= success %></h1>
         <h4 class="div1"> <a href="login.jsp">Login</a></h4>
        <% 
        Object errpass = request.getAttribute("errpass");
        if(errpass == null){
        return;
        } else
        %>
        <h1 class='div1'> <%= errpass %></h1>
       
    </body>
</html>
