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
    </head>
    <body>
        <h1>Alta de Cuenta Bancaria</h1>
        <form name="AltaCuenta" action="ReCuenta_serlvet.do" method="post" onsubmit="return validar()">
            <label for="NumCaunt"><b>Numero de Cuenta</b></label>
            <input type="text" placeholder="Numero de cuenta" name="NumCuenta" required="true">
            <br>
            <label for="NumCustomer"><b>Numero de Cliente</b></label>
            <input type="text" placeholder="Numero de cliente" name="NumCliente" required="true"> 
            <br>
            <label for="tipoCuenta"><b>Tipo de Cuenta</b><label>
            <input type="text" placeholder="Tipo de cuenta" name="TipoCuenta">
            <br>
            <label for="Monto"><b>Monto</b></label>
            <input type="text" placeholder="Monto" name="monto"><br>
             
            <input type="submit" value="Guardar">
            </form>
        
    </body>
</html>
