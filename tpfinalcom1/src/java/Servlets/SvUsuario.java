package Servlets;

import Logica.Controladora;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvUsuario", urlPatterns = {"/SvUsuario"})
public class SvUsuario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("txtUsername");
        String contrasenia = request.getParameter("txtPass");
        
        Controladora ctrl = new Controladora();
        boolean autorizado = ctrl.verificarUsuario(username, contrasenia);
        
        if (autorizado == true){
            HttpSession miSesion = request.getSession(true);
            miSesion.setAttribute("username", username);
            miSesion.setAttribute("contrasenia", contrasenia);
            
            response.sendRedirect("principal.jsp");
        }
        else{
            response.sendRedirect("login.jsp");
        }
                       
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
