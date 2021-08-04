package Servlets;

import Logica.Controladora;
import Logica.Habitacion;
import Logica.Huesped;
import Logica.Reserva;
import Logica.Usuario;
import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvEditarReserva", urlPatterns = {"/SvEditarReserva"})
public class SvEditarReserva extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Controladora ctrl = new Controladora();
        
        long id = Long.parseLong(request.getParameter("txtId"));
        String fechaEntString = request.getParameter("txtFechaEnt");
        Date fechaEnt = ctrl.fechaStringADate(fechaEntString);
        String fechaSalString = request.getParameter("txtFechaSal");
        Date fechaSal = ctrl.fechaStringADate(fechaSalString);
        int cantPer = Integer.parseInt(request.getParameter("txtCantPer"));
        double montoTotal = Double.parseDouble(request.getParameter("txtMonto"));
        String huespedDni = request.getParameter("txtHuespedDni");
        String nombreHab = request.getParameter("txtNombreHab");
        String username = request.getParameter("txtUsername");
        
               
        Reserva reserva = ctrl.buscarReserva(id);
        reserva.setFechaEntrada(fechaEnt);
        reserva.setFechaSalida(fechaSal);
        reserva.setCantPersonas(cantPer);
        reserva.setMontoTotal(montoTotal);
        
        Huesped huesped = ctrl.obtenerHuesped(huespedDni);
        reserva.setHuesped(huesped);
        
        Habitacion habitacion = ctrl.obtenerHabitacion(nombreHab);
        reserva.setHabitacion(habitacion);
        
        Usuario usuario = ctrl.obtenerUsuario(username);
        reserva.setUsuario(usuario);
                        
        ctrl.modificarReserva(reserva);
        
        request.getSession().setAttribute("listaReservas", ctrl.verReservas());
        response.sendRedirect("verReservas.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        long id = Long.parseLong(request.getParameter("txtId"));

        Controladora ctrl = new Controladora();
        Reserva reserva = ctrl.buscarReserva(id);

        request.getSession().setAttribute("reserva", reserva);
        response.sendRedirect("editarReserva.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
