/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Cliente;
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
 * @author DAVID
 */
public class detallecliente_servlet extends HttpServlet {

    ArrayList listaclientes = new ArrayList();

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
            out.println("<title>Servlet detallecliente_servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet detallecliente_servlet at " + request.getContextPath() + "</h1>");
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
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
        String numerocliente = request.getParameter("numerocliente");

        ServletContext sc = getServletContext();

        ArrayList<Cliente> clientes = (ArrayList<Cliente>) sc.getAttribute("listaclientes");

        Cliente c1 = new Cliente();

        for (Cliente c : clientes) {
            if (c.getNumeroCliente().equals(numerocliente)) {
                c1.setNombre(c.getNombre());
                c1.setApellido(c.getApellido());
                c1.setDireccion(c.getDireccion());
                c1.setCp(c.getCp());
                c1.setCiudad(c.getCiudad());
                c1.setEstado(c.getEstado());
                c1.setPais(c.getPais());
                c1.setTelefono(c.getTelefono());
                c1.setCorreo(c.getCorreo());
                c1.setFecha_nacimiento(c.getFecha_nacimiento());
                c1.setNombreUsuario(c.getNombreUsuario());
                c1.setNumeroCliente(c.getNumeroCliente());
                clientes.remove(c);
                listaclientes.add(c1);
                request.setAttribute("clientesolicitado", listaclientes);
                request.getRequestDispatcher("Registro.jsp").forward(request, response);
                break;
            } else {
                out.println("<center>");
                out.print("<p>Error en los campos, verifique su informacion</p>");
                out.println("</center>");
                request.getRequestDispatcher("DetalleCliente.jsp").include(request, response);
                break;
            }
        }
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
