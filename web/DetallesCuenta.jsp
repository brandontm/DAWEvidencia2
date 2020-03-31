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

    <link rel="stylesheet" type="text/css" href="styles/skeleton.css" />
    <link rel="stylesheet" type="text/css" href="styles/normalize.css" />
</head>

<body>
    <jsp:include page="header.jsp" />

    <c:set var="cuentas"
        value="${listacuentas.stream().filter(c -> c.getNumCliente() == sessionScope.usuario.getNumeroCliente()).toList()}" />
    <div class="container">
        <h1>Detalle de cuenta</h1>
        <table class="u-full-width">
            <thead>
                <tr>
                    <th>Numero de Cuenta</th>
                    <th>Numero de Cliente</th>
                    <th>Tipo de Cuenta</th>
                    <th>Monto</th>
                </tr>
            </thead>

            <tbody>
                <c:forEach var="cuentaC" items="${cuentas}">
                    <tr>
                        <td>${cuentaC.getNumCuenta()}</td>
                        <td>${cuentaC.getNumCliente()}</td>
                        <td>${cuentaC.getTipoCuenta()}</td>
                        <td>${cuentaC.getMonto()}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <c:if test="${sessionScope.usuario.isAdministrador()}">
            <form action="ReCuenta_serlvet.do" method="get" onsubmit="return validar()">
                <input type="submit" value="Actualizar">
            </form>
        </c:if>
    </div>
</body>

</html>