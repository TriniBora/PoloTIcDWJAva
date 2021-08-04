package Servlets;

import Logica.Controladora;
import Logica.Huesped;
import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvEditarHuesped", urlPatterns = {"/SvEditarHuesped"})
public class SvEditarHuesped extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Controladora ctrl = new Controladora();
        
        long id = Long.parseLong(request.getParameter("txtId"));
        String nombre = request.getParameter("txtNombre");
        String apellido = request.getParameter("txtApellido");
        String dni = request.getParameter("txtDni");
        
        String fechaNacString = request.getParameter("txtFechaNac");
        Date fechaNac = ctrl.fechaStringADate(fechaNacString);
                
        String direccion = request.getParameter("txtDireccion");
        String telefono = request.getParameter("txtTelefono");
        String email = request.getParameter("txtEmail");        
        String profesion = request.getParameter("txtProfesion");
        
        Huesped huesped = ctrl.buscarHuesped(id);
        huesped.setNombre(nombre);
        huesped.setApellido(apellido);
        huesped.setDni(dni);
        huesped.setFechaNac(fechaNac);
        huesped.setDireccion(direccion);
        huesped.setTelefono(telefono);
        huesped.setEmail(email);
        huesped.setProfesion(profesion);
        
        ctrl.modificarHuesped(huesped);
        
        request.getSession().setAttribute("listaHuespedes", ctrl.verHuespedes());
        response.sendRedirect("verHuespedes.jsp");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        long id = Long.parseLong(request.getParameter("txtId"));
        
        Controladora ctrl = new Controladora();
        Huesped huesped = ctrl.buscarHuesped(id);
        
        request.getSession().setAttribute("huesped", huesped);
        response.sendRedirect("editarHuesped.jsp");
        
    }    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
