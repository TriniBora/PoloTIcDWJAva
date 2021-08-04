package Servlets;

import Logica.Controladora;
import Logica.TipoHabitacion;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvVerTipoHabitaciones", urlPatterns = {"/SvVerTipoHabitaciones"})
public class SvVerTipoHabitaciones extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Controladora ctrl = new Controladora();
        List<TipoHabitacion> listaTipoHabitaciones = ctrl.verTipoHabitaciones();
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("listaTipoHabitaciones", listaTipoHabitaciones);
        response.sendRedirect("verTipoHabitaciones.jsp");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
