<%-- 
    Document   : index
    Created on : Feb 24, 2022, 1:03:10 AM
    Author     : alejo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="css/style.css"/>
        <script src="js/script.js"></script>
    </head>
    <body>
        <h1>Login</h1>
        <div>
            <form action="Validacion" method="post">
                <p><input type="text" name="user" id="user"/></p>
                <p><input type="password" name="pass" id="pass"/></p>
                <p><input type="submit" name="login" id="login" value="login"/></p>
            </form>
        </div>

        <input type="button" value="saluda" onclick="saluda()"/>
    </body>
</html>
