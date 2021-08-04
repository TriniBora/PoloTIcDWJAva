package Servlets;

import Logica.Controladora;
import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvCrearHuesped", urlPatterns = {"/SvCrearHuesped"})
public class SvCrearHuesped extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
              
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Controladora ctrl = new Controladora();
        
        String nombre = request.getParameter("txtNombre");
        String apellido = request.getParameter("txtApellido");
        String dni = request.getParameter("txtDni");
        
        String fechaNacString = request.getParameter("txtFechaNac");
        Date fechaNac = ctrl.fechaStringADate(fechaNacString);
                
        String direccion = request.getParameter("txtDireccion");
        String telefono = request.getParameter("txtTelefono");
        String email = request.getParameter("txtEmail");        
        String profesion = request.getParameter("txtProfesion");
        
        request.getSession().setAttribute("txtNombre", nombre);
        request.getSession().setAttribute("txtApellido", apellido);
        request.getSession().setAttribute("txtDni", dni);
        request.getSession().setAttribute("txtFechaNac", fechaNac);
        request.getSession().setAttribute("txtDireccion", direccion);
        request.getSession().setAttribute("txtTelefono", telefono);
        request.getSession().setAttribute("txtEmail", email);
        request.getSession().setAttribute("txtProfesion", profesion);
        
        ctrl.crearHuesped(dni, nombre, apellido, fechaNac, telefono, email, direccion, profesion);
        
        response.sendRedirect("personas.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
