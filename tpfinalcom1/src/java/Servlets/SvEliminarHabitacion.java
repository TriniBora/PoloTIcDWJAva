package Servlets;

import Logica.Controladora;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvEliminarHabitacion", urlPatterns = {"/SvEliminarHabitacion"})
public class SvEliminarHabitacion extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("txtId"));
        
        Controladora ctrl = new Controladora();
        ctrl.eliminarHabitacion(id);
        
        request.getSession().setAttribute("listaHabitaciones", ctrl.verHabitaciones());
        response.sendRedirect("verHabitaciones.jsp");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
