<%-- 
    Document   : DetallesCuenta
    Created on : Mar 28, 2020, 7:00:22 PM
    Author     : huert
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detalle de Cuenta</title>
    </head>
    <body>
         <h1>Detalle de cuenta</h1>
        <table border="1">
            <tr>
            <th>Numero de Cuenta</th>
            <th>Numero de Cliente</th>
            <th>Tipo de Cuenta</th>
            <th>Monto</th>
            </tr>
            <c:forEach var="cuentaC" items="${sessionScope.Cuenta}">
        <tr>
            <td>${cuentaC.getNumCuenta()}</td>
            <td>${cuentaC.getNumCliente()}</td>
            <td>${cuentaC.getTipoCuenta()}</td>
            <td>${cuentaC.getMonto()}</td>
        </tr>
        </c:forEach>
       
        </table>
          <form action="ReCuenta_serlvet.do" method="get" onsubmit="return validar()">
            <input type="submit" value="Actualizar">
        </form>
    </body>
</html>
