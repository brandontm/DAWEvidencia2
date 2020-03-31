

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de Clientes</h1>
        <table border="1">
            <tr>
                <th>Numero de Cliente</th>
                <th>Nombre</th>
                <th>Ciudad</th>
            </tr>
            <c:forEach var="lista" items="${listaclientes}">
                <tr>
                    <td>${lista.numeroCliente}</td>
                    <td>${lista.nombre}</td>
                    <td>${lista.ciudad}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
