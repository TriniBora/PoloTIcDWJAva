package Servlets;

import Logica.Controladora;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvCrearTipoHabitacion", urlPatterns = {"/SvCrearTipoHabitacion"})
public class SvCrearTipoHabitacion extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Controladora ctrl = new Controladora();
        
        String nombreTipo = request.getParameter("txtTipoHab");
        int cantMaxPer = Integer.parseInt(request.getParameter("txtCantMaxPer"));
                
        request.getSession().setAttribute("txtTipoHab", nombreTipo);
        request.getSession().setAttribute("txtCantMaxPer", cantMaxPer);
                
        ctrl.crearTipoHabitacion(nombreTipo, cantMaxPer);
        
        response.sendRedirect("verTipoHabitaciones.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
