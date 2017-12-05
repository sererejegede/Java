<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="basic-90/styles/layout.css" type="text/css">
        <link rel="stylesheet" href="basic-90/styles/bootstrap.min.css" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login | Dev Cred</title>
    </head>
    <body>
  <div class="wrapper row1">
   <header id="header" class="clear">
    <div id="hgroup">
      <h1><a href="#">Developer's Preference</a></h1>
      <h2>A Scale of Preference for Developers</h2>
    </div>
<!--       <form action="#" method="post">
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
        <form action="Login" method="POST">
            <input type="text" name="userName" placeholder="Enter Username" required="true" /><br>
            <input type="password" name="password" placeholder="Enter Password" required="true" /><br><br>
            <button class="btn btn-color" type="submit" value="Submit">Submit</button>  <button class="btn btn-color" type="reset" value="Reset">Reset</button>
        </form>
        </div> 
        <span class="div1">Not a member? <a href="create.jsp">Create Account</a></span>
        <% 
        Object errpass2 = request.getAttribute("errpass2");
        Object errpass = request.getAttribute("errpass");
//        if (errpass2 == null){
//            return;
//        }
//        else 
          
        
        if(errpass == null && errpass2 == null){
        return;
        } else
        %>
        <h3 class="div1">Username or password incorrect</h3>
       
    </body>
</html>
