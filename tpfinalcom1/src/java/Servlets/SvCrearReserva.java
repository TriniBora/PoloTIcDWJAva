package Servlets;

import Logica.Controladora;
import Logica.Habitacion;
import Logica.Huesped;
import Logica.Usuario;
import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvCrearReserva", urlPatterns = {"/SvCrearReserva"})
public class SvCrearReserva extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Controladora ctrl = new Controladora();

        String fechaEntString = request.getParameter("txtFechaEnt");
        Date fechaEnt = ctrl.fechaStringADate(fechaEntString);
        String fechaSalString = request.getParameter("txtFechaSal");
        Date fechaSal = ctrl.fechaStringADate(fechaSalString);
        int cantPer = Integer.parseInt(request.getParameter("txtCantPer"));
        //double montoTotal = Double.parseDouble(request.getParameter("txtMonto"));
        String huespedDni = request.getParameter("txtHuespedDni");
        String nombreHab = request.getParameter("txtNombreHab");
        String username = request.getParameter("txtUsername");

        Habitacion habitacion = ctrl.obtenerHabitacion(nombreHab);

        double montoTotal = ctrl.calcularMontoTotal(fechaEnt, fechaSal, habitacion.getPrecioPorNoche());

        request.getSession().setAttribute("txtFechaEnt", fechaEnt);
        request.getSession().setAttribute("txtFechaSal", fechaSal);
        request.getSession().setAttribute("txtCantPer", cantPer);
        request.getSession().setAttribute("txtMonto", montoTotal);
        request.getSession().setAttribute("txtHuespedDni", huespedDni);
        request.getSession().setAttribute("txtNombreHab", nombreHab);
        request.getSession().setAttribute("txtUsername", username);

        boolean fechaEntradaValida = ctrl.verificarFechaEntrada(fechaEnt);

        if (fechaEntradaValida == true) {
            boolean fechaSalidaValida = ctrl.verificarFechaSalida(fechaEnt, fechaSal);

            if (fechaSalidaValida == true) {
                boolean existeHuesped = ctrl.existeHuesped(huespedDni);

                if (existeHuesped == true) {

                    Huesped huesped = ctrl.obtenerHuesped(huespedDni);
                    boolean existeHabitacion = ctrl.existeHab(fechaEnt, fechaSal, nombreHab);

                    if (existeHabitacion == false) {

                        boolean verificarCapacidad = ctrl.verificarCapacidadMax(habitacion.getTipoHab().getCantMaxPersonas(), cantPer);

                        if (verificarCapacidad == true) {

                            Usuario usuario = ctrl.obtenerUsuario(username);

                            ctrl.crearReserva(fechaEnt, fechaSal, cantPer, montoTotal, huesped, habitacion, usuario);

                            response.sendRedirect("verReservas.jsp");

                        } else {
                            response.sendRedirect("crearReserva.jsp");
                        }

                    } else {
                        response.sendRedirect("crearReserva.jsp");
                    }

                } else {
                    response.sendRedirect("crearHuesped.jsp");
                }
            } else {
                response.sendRedirect("crearReserva.jsp");
            }

        } else{
            response.sendRedirect("crearReserva.jsp");
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
