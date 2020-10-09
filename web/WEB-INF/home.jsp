<%-- 
    Document   : home
    Created on : Oct 6, 2020, 12:18:50 PM
    Author     : 584893
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Welcome ${user.username}</h1>
        <a href="login?logout">Logout</a>
    </body>
</html>
