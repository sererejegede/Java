<%-- 
    Document   : login
    Created on : Nov 27, 2017, 11:46:02 AM
    Author     : oluwatosin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Registration Application</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div>
            <form action="login" method="POST">
                <input type="text" name="userName" placeholder="Input Username" /><br>
                <input type="password" name="password" placeholder="Enter Password" /><br>
                <input type="submit" value="Go" name="submit" />
            </form>
        </div>
    </body>
</html>

