<%-- 
    Document   : index
    Created on : 28/03/2020, 03:00:36 PM
    Author     : DAVID
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>

        <link rel="stylesheet" type="text/css" href="styles/skeleton.css" />
        <link rel="stylesheet" type="text/css" href="styles/normalize.css" />
    </head>

    <body>
        <div class="container">
            <%
                if(session.getAttribute("usuario") != null){
            %>
                    <h1 style="text-align: right;">Bienvenido <%=session.getAttribute("usuario")%></h1>
                    <p style="text-align: right;"><a class="button" href="cerrarSesion.do">Cerrar Sesion</a></p>
            <%
                }
            %>

            <h2>Banco del Rey</h2>
            <a class="button button-primary" href="Registro.jsp">Alta de cliente</a><br>
            <a class="button button-primary" href="InicioSesion.jsp">Iniciar Sesión</a><br>
            <a class="button button-primary" href="ListaClientes.jsp">Lista de Clientes</a><br>
            <a class="button button-primary" href="DetalleCliente.jsp">Detalles de Clientes</a>
        </div>
    </body>

</html>