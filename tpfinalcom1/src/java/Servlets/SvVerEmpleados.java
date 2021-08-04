package Servlets;

import Logica.Controladora;
import Logica.Empleado;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvVerEmpleados", urlPatterns = {"/SvVerEmpleados"})
public class SvVerEmpleados extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Controladora ctrl = new Controladora();
        List<Empleado> listaEmpleados = ctrl.verEmpleados();
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("listaEmpleados", listaEmpleados);
        response.sendRedirect("verEmpleados.jsp");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
