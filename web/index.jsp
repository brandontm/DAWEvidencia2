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
    <jsp:include page="header.jsp" />
    <div class="container">
        <h1>Bienvenido al Banco Mercantil de M&eacute;xico</h1>
        <a class="button button-primary" href="Registro.jsp">Alta de cliente</a><br>
        <a class="button button-primary" href="InicioSesion.jsp">Iniciar Sesi&oacute;n</a><br>
        <a class="button button-primary" href="ListaClientes.jsp">Lista de Clientes</a><br>
        <a class="button button-primary" href="DetalleCliente.jsp">Detalle de Clientes</a><br>
        <a class="button button-primary" href="RegistroCuenta.jsp">Registro de cuenta</a><br>
        <a class="button button-primary" href="DetallesCuenta.jsp">Detalle de cuenta</a>
    </div>
</body>

</html>