<%-- 
    Document   : RegistroCuenta
    Created on : Mar 28, 2020, 6:47:57 PM
    Author     : huert
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Alta de Cuenta</title>

    <link rel="stylesheet" type="text/css" href="styles/skeleton.css" />
    <link rel="stylesheet" type="text/css" href="styles/normalize.css" />
</head>

<body>
    <jsp:include page="header.jsp" />
    <div class="container">
        <h1>Alta de Cuenta Bancaria</h1>
        <form name="AltaCuenta" action="ReCuenta_serlvet.do" method="post" onsubmit="return validar()">
            <label for="NumCaunt"><b>N&uacute;mero de Cuenta</b></label>
            <input type="text" placeholder="N&uacute;mero de cuenta" name="NumCuenta" required="true">
            <br>
            <label for="NumCustomer"><b>N&uacute;mero de Cliente</b></label>
            <input type="text" placeholder="N&uacute;mero de cliente" name="NumCliente" required="true">
            <br>
            <label for="tipoCuenta"><b>Tipo de Cuenta</b></label>
            <input type="text" placeholder="Tipo de cuenta" name="TipoCuenta">
            <br>
            <label for="Monto"><b>Monto</b></label>
            <input type="text" placeholder="Monto" name="monto"><br><br>

            <input class="button-primary" type="submit" value="Guardar">
        </form>
    </div>
</body>

</html>