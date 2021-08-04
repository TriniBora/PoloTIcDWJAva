<%@page import="Logica.Controladora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
                           
        <h1>Datos ingresados Empleado: </h1>
        <p>Nombre: <%= session.getAttribute("txtNomEmple")%></p>
        <p>Apellido: <%= session.getAttribute("txtApEmple")%></p>
        <p>Dni: <%= session.getAttribute("txtDniEmple")%></p>
        <p>Fecha de nacimiento: 
            <%= session.getAttribute("txtFechaNac")%>
        </p>
        <p>Dirección: <%= session.getAttribute("txtDirEmple")%></p>
        <p>Teléfono <%= session.getAttribute("txtTelEmple")%></p>
        <p>Email <%= session.getAttribute("txtEmailEmple")%></p>
        <p>Cargo: <%= session.getAttribute("txtCargoEmple")%></p>
        <p>Username <%= session.getAttribute("txtUsername")%></p>
        <p>Contraseña <%= session.getAttribute("txtContrasenia")%></p>
                
        <h1>Datos ingresados Huésped: </h1>
        <p>Nombre: <%= session.getAttribute("txtNombre")%></p>
        <p>Apellido: <%= session.getAttribute("txtApellido")%></p>
        <p>Dni: <%= session.getAttribute("txtDni")%></p>
        <p>Fecha de nacimiento: <%= session.getAttribute("txtFechaNac")%></p>
        <p>Dirección: <%= session.getAttribute("txtDireccion")%></p>
        <p>Teléfono <%= session.getAttribute("txtTelefono")%></p>
        <p>Email <%= session.getAttribute("txtEmail")%></p>
        <p>Profesión: <%= session.getAttribute("txtProfesion")%></p>
        
        <h1>Datos ingresados Habitacion: </h1>
        <p>Nombre: <%= session.getAttribute("txtNombreHab")%></p>
        <p>Número piso <%= session.getAttribute("txtNroPiso")%></p>
        <p>Precio por noche: <%= session.getAttribute("txtPrecio")%></p>
        <p>Tipo de habitación: <%= session.getAttribute("txtTipoHab")%></p>
        <p>Está disponible: <%= session.getAttribute("txtDisponible")%></p>
        
        <h1>Datos ingresados Usuario: </h1>
        <p>Nombre usuario: <%= session.getAttribute("txtUsername")%></p>
        <p>Contraseña <%= session.getAttribute("txtPass")%></p>
        <p>Empleado: <%= session.getAttribute("txtEmpleado")%></p>
      

        
    </body>
</html>
