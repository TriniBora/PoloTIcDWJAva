package Servlets;

import Logica.Controladora;
import Logica.Usuario;
import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvCrearEmpleado", urlPatterns = {"/SvCrearEmpleado"})
public class SvCrearEmpleado extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Controladora ctrl = new Controladora();

        String nombre = request.getParameter("txtNomEmple");
        String apellido = request.getParameter("txtApEmple");
        String dni = request.getParameter("txtDniEmple");

        String fechaNacString = request.getParameter("txtFechaNac");
        Date fechaNac = ctrl.fechaStringADate(fechaNacString);

        String direccion = request.getParameter("txtDirEmple");
        String telefono = request.getParameter("txtTelEmple");
        String email = request.getParameter("txtEmailEmple");
        String cargo = request.getParameter("txtCargoEmple");
        String username = request.getParameter("txtUsername");
        String contrasenia = request.getParameter("txtContrasenia");

        request.getSession().setAttribute("txtNomEmple", nombre);
        request.getSession().setAttribute("txtApEmple", apellido);
        request.getSession().setAttribute("txtDniEmple", dni);
        request.getSession().setAttribute("txtFechaNac", fechaNac);
        request.getSession().setAttribute("txtDirEmple", direccion);
        request.getSession().setAttribute("txtTelEmple", telefono);
        request.getSession().setAttribute("txtEmailEmple", email);
        request.getSession().setAttribute("txtCargoEmple", cargo);
        request.getSession().setAttribute("txtUsuario", username);
        request.getSession().setAttribute("txtContrasenia", contrasenia);

        boolean existeUsername = ctrl.existeUsername(username);

        if (existeUsername == false) {
            ctrl.crearUsuario(username, contrasenia);
            Usuario usuario = ctrl.obtenerUsuario(username);
            ctrl.crearEmpleado(dni, nombre, apellido, fechaNac, telefono, email, direccion, cargo, usuario);
            response.sendRedirect("personas.jsp");
        } else{
            response.sendRedirect("crearEmpleado.jsp");
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
