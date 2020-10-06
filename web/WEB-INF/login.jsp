<%-- 
    Document   : login
    Created on : Oct 6, 2020, 8:28:42 AM
    Author     : 584893
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Week 5 Lab</title>
    </head>
    <body>
        <h1>Login Page</h1>
        <form action="/login" method="POST">
            Username: <input type="text" name="username" />
            Password: <input type="password" name="password" />
            <input type="submit" value="submit" />
        </form>
    </body>
</html>
