package Servlets;

import Logica.Controladora;
import Logica.Habitacion;
import Logica.TipoHabitacion;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvEditarHabitacion", urlPatterns = {"/SvEditarHabitacion"})
public class SvEditarHabitacion extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Controladora ctrl = new Controladora();
        
        long id = Long.parseLong(request.getParameter("txtId"));
        String nombreHab = request.getParameter("txtNombreHab");
        int nroPiso = Integer.parseInt(request.getParameter("txtNroPiso"));
        double precioNoche = Double.parseDouble(request.getParameter("txtPrecio"));
        String tipoHab = request.getParameter("txtTipoHab");
        
               
        Habitacion habitacion = ctrl.buscarHabitacion(id);
        habitacion.setNombreHab(nombreHab);
        habitacion.setNroPiso(nroPiso);
        habitacion.setPrecioPorNoche(precioNoche);
        
        TipoHabitacion tipoHabitacion = ctrl.obtenerTipoHabitacion(tipoHab);
        
        habitacion.setTipoHab(tipoHabitacion);
                        
        ctrl.modificarHabitacion(habitacion);
        
        request.getSession().setAttribute("listaHabitaciones", ctrl.verHabitaciones());
        response.sendRedirect("verHabitaciones.jsp");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("txtId"));
        
        Controladora ctrl = new Controladora();
        Habitacion habitacion = ctrl.buscarHabitacion(id);
        
        request.getSession().setAttribute("habitacion", habitacion);
        response.sendRedirect("editarHabitacion.jsp");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
