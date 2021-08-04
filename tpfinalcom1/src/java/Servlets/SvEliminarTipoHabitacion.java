package Servlets;

import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvEliminarTipoHabitacion", urlPatterns = {"/SvEliminarTipoHabitacion"})
public class SvEliminarTipoHabitacion extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        int id = Integer.parseInt(request.getParameter("txtId"));
        
        Controladora ctrl = new Controladora();
        ctrl.eliminarTipoHabitacion(id);
        
        request.getSession().setAttribute("listaTipoHabitaciones", ctrl.verTipoHabitaciones());
        response.sendRedirect("verTipoHabitaciones.jsp");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
