package Servlets;

import Logica.Controladora;
import Logica.Empleado;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvEliminarEmpleado", urlPatterns = {"/SvEliminarEmpleado"})
public class SvEliminarEmpleado extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        long id = Long.parseLong(request.getParameter("txtId"));
        
        Controladora ctrl = new Controladora();
                       
        Empleado empleado = ctrl.buscarEmpleado(id);
        
        long idUsuario = empleado.getUsuario().getId_usuario();
        
        ctrl.eliminarEmpleado(id);
        ctrl.eliminarUsuario(idUsuario);
                
        request.getSession().setAttribute("listaEmpleados", ctrl.verEmpleados());
        request.getSession().setAttribute("listaUsuarios", ctrl.verUsuarios());
        response.sendRedirect("verEmpleados.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
