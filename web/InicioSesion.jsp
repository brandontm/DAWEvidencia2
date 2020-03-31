<%-- 
    Document   : InicioSesion
    Created on : 28/03/2020, 03:03:32 PM
    Author     : DAVID
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar Sesion</title>
    </head>
    <body>
    <center>
        <h1>Iniciar Sesion</h1>
        <form action="iniciarSesion.do" method="post">
            Usuario: <input type="text" name="user" placeholder="Usuario" required="true"><br><br>
            Contrasena: <input type="password" name="pass" placeholder="Contrasena" required="true"><br><br>
            <input type="submit" value="Iniciar Sesion">
        </form>
    </center>
</body>
</html>
