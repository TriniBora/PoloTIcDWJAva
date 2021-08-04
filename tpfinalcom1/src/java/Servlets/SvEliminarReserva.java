package Servlets;

import Logica.Controladora;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvEliminarReserva", urlPatterns = {"/SvEliminarReserva"})
public class SvEliminarReserva extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        long id = Long.parseLong(request.getParameter("txtId"));
        
        Controladora ctrl = new Controladora();
        ctrl.eliminarReserva(id);
        
        request.getSession().setAttribute("listaReservas", ctrl.verReservas());
        response.sendRedirect("verReservas.jsp");
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
