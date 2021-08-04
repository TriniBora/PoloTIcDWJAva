package Servlets;

import Logica.Controladora;
import Logica.TipoHabitacion;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvCrearHabitacion", urlPatterns = {"/SvCrearHabitacion"})
public class SvCrearHabitacion extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Controladora ctrl = new Controladora();

        String nombreHab = request.getParameter("txtNombreHab");
        int nroPiso = Integer.parseInt(request.getParameter("txtNroPiso"));
        double precioNoche = Double.parseDouble(request.getParameter("txtPrecio"));
        String tipoHab = request.getParameter("txtTipoHab");

        request.getSession().setAttribute("txtNombreHab", nombreHab);
        request.getSession().setAttribute("txtNroPiso", nroPiso);
        request.getSession().setAttribute("txtPrecio", precioNoche);
        request.getSession().setAttribute("txtTipoHab", tipoHab);

        boolean existeNombreHab = ctrl.existeNombreHab(nombreHab);

        if (existeNombreHab == false) {
            TipoHabitacion tipoHabitacion = ctrl.obtenerTipoHabitacion(tipoHab);
            ctrl.crearHabitacion(nroPiso, nombreHab, precioNoche, tipoHabitacion);
            response.sendRedirect("habitaciones.jsp");
        } else {
            response.sendRedirect("crearHabitacion.jsp");
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
