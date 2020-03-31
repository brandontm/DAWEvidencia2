/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ReCuenta_serlvet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ReCuenta_serlvet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     ArrayList cuenta = new ArrayList();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Object clone = cuenta.clone();
        cuenta.clear();
        request.getRequestDispatcher("RegistroCuenta.jsp").forward(request, response);
   
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
        
        
        cuenta.add(d1);
          //ServletContext sc = getServletContext();
        session.setAttribute("Cuenta", cuenta);
      //  sc.setAttribute("Cuentaclientes", cuenta);
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
    }// </editor-fold>

}
