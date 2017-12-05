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
  <div class="row">
      <div class="col-2"></div>
      <div class="col-8">
      <h3>Select your preferred languages</h3><br>
      <div class="row">
      <div class="col-6 div1">First Choice:</div>
      <div class="col-6">
          <select name="first">
            <option>Java</option>
            <option>FORTRAN</option>
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
      </div>    
      </div>
      </div>
      <div class="col-2"></div>
  </div> <br>
 <div class="row">
      <div class="col-2"></div>
      <div class="col-8">
      <div class="row">
      <div class="col-6 div1">Second Choice:</div>
      <div class="col-6">
        <form action="Login" method="post">
          <select name="first">
            <option>Java</option>
            <option>FORTRAN</option>
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
        </form>       
      </div>    
      </div>
      </div>
      <div class="col-2"></div>
  </div> <br>
  <div class="row">
      <div class="col-2"></div>
      <div class="col-8">
      <div class="row">
      <div class="col-6 div1">Third Choice:</div>
      <div class="col-6">
          <select name="first">
            <option>Java</option>
            <option>FORTRAN</option>
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
      </div>    
      </div>
      </div>
      <div class="col-2"></div>
  </div>    