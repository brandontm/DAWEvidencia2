package Controladores;

import Modelos.CuentaCliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author huert
 */
public class ReCuenta_serlvet extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     ArrayList cuentas = new ArrayList();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       PrintWriter out = response.getWriter();
           
        String NumCuenta = request.getParameter("NumCuenta");
        String NumCliente = request.getParameter("NumCliente");
        String TipoCuenta = request.getParameter("TipoCuenta");
        String Monto = request.getParameter("monto");
        
        HttpSession session = request.getSession();
        
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
