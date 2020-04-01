package Controladores;

import Modelos.CuentaCliente;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author huert
 */
public class ReCuenta_serlvet extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    List<CuentaCliente> cuentas = new ArrayList();

    @Override
    public void init() throws ServletException {
        List<CuentaCliente> cuentasActuales = (List<CuentaCliente>) getServletContext().getAttribute("listacuentas");

        if (cuentasActuales != null) {
            this.cuentas = cuentasActuales;
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String NumCuenta = request.getParameter("NumCuenta");
        String NumCliente = request.getParameter("NumCliente");
        CuentaCliente.Tipo TipoCuenta = (request.getParameter("tipoCuenta").equalsIgnoreCase("debito")
                ? CuentaCliente.Tipo.DEBITO
                : CuentaCliente.Tipo.RETIRO);
        double Monto = Double.valueOf(request.getParameter("monto"));

        CuentaCliente d1 = new CuentaCliente();

        d1.setNumCuenta(NumCuenta);
        d1.setNumCliente(NumCliente);
        d1.setTipoCuenta(TipoCuenta);
        d1.setMonto(Monto);

        cuentas.add(d1);

        getServletContext().setAttribute("listacuentas", cuentas);

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
