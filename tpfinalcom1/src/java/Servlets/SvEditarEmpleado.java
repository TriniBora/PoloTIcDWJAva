package Servlets;

import Logica.Controladora;
import Logica.Empleado;
import Logica.Usuario;
import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvEditarEmpleado", urlPatterns = {"/SvEditarEmpleado"})
public class SvEditarEmpleado extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Controladora ctrl = new Controladora();

        long id = Long.parseLong(request.getParameter("txtId"));
        String nombre = request.getParameter("txtNomEmple");
        String apellido = request.getParameter("txtApEmple");
        String dni = request.getParameter("txtDniEmple");

        String fechaNacString = request.getParameter("txtFechaNac");
        Date fechaNac = ctrl.fechaStringADate(fechaNacString);

        String direccion = request.getParameter("txtDirEmple");
        String telefono = request.getParameter("txtTelEmple");
        String email = request.getParameter("txtEmailEmple");
        String cargo = request.getParameter("txtCargoEmple");
        
        String contrasenia = request.getParameter("txtContrasenia");

        Empleado empleado = ctrl.buscarEmpleado(id);
        empleado.setNombre(nombre);
        empleado.setApellido(apellido);
        empleado.setDni(dni);
        empleado.setFechaNac(fechaNac);
        empleado.setDireccion(direccion);
        empleado.setTelefono(telefono);
        empleado.setEmail(email);
        empleado.setCargo(cargo);
        
        Usuario usuario = ctrl.obtenerUsuario(empleado.getUsuario().getUsername());
        usuario.setContrasenia(contrasenia);
        
        empleado.setUsuario(usuario);

        ctrl.modificarUsuario(usuario);
        ctrl.modificarEmpleado(empleado);

        request.getSession().setAttribute("listaEmpleados", ctrl.verEmpleados());
        response.sendRedirect("verEmpleados.jsp");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        long id = Long.parseLong(request.getParameter("txtId"));

        Controladora ctrl = new Controladora();
        Empleado empleado = ctrl.buscarEmpleado(id);

        request.getSession().setAttribute("empleado", empleado);
        response.sendRedirect("editarEmpleado.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
