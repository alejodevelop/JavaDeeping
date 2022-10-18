<%-- 
    Document   : index
    Created on : Feb 24, 2022, 12:33:17 AM
    Author     : alejo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1

        <%--
        scriptlet JSP, este es un scriptlet de comentario
        --%>

        <%--
        scriptlet de declaracion 
        --%>

        <%int limite = 15;%>

        <% for (int i = 0; i < limite; i++) {%>
        <p><%= i%></p>     
        <%}%>


        <%--
        scriptlet para mostrar el valor de una variable
        --%>

        <%= limite%> 



    </body>
</html>
