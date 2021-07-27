package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.Date;
import java.util.List;

public class Controladora {
   
    ControladoraPersistencia ctrlPersis = new ControladoraPersistencia();
    
    public void crearEmpleado(String dni, String nombre, String apellido, Date fechaNac, String telefono, String email, String direccion, String cargo){
        
        Empleado empleado = new Empleado();
        empleado.setDni(dni);
        empleado.setNombre(nombre);
        empleado.setApellido(apellido);
        empleado.setFechaNac(fechaNac);
        empleado.setTelefono(telefono);
        empleado.setEmail(email);
        empleado.setDireccion(direccion);
        empleado.setCargo(cargo);
        
        ctrlPersis.crearEmpleado(empleado);
    
    }
    
    public void crearHabitacion(int nroPiso, String nombreHab, double precioPorNoche, boolean estaDisponible){
        
        Habitacion hab = new Habitacion();
        hab.setNroPiso(nroPiso);
        hab.setNombreHab(nombreHab);
        hab.setPrecioPorNoche(precioPorNoche);
        hab.setEstaDisponible(estaDisponible);
        
        ctrlPersis.crearHabitacion(hab);
    
    }
    
    public void crearHuesped(String dni, String nombre, String apellido, Date fechaNac, String telefono, String email, String direccion, String profesion){
        
        Huesped huesped = new Huesped();
        huesped.setDni(dni);
        huesped.setNombre(nombre);
        huesped.setApellido(apellido);
        huesped.setFechaNac(fechaNac);
        huesped.setTelefono(telefono);
        huesped.setEmail(email);
        huesped.setDireccion(direccion);
        huesped.setProfesion(profesion);
        
        ctrlPersis.crearHuesped(huesped);
    
    }
    
    public void crearReserva(Date fechaEntrada, Date fechaSalida, int cantPersonas, double montoTotal, String observaciones){
        
        Reserva reserva = new Reserva();
        reserva.setFechaEntrada(fechaEntrada);
        reserva.setFechaSalida(fechaSalida);
        reserva.setCantPersonas(cantPersonas);
        reserva.setMontoTotal(montoTotal);
        reserva.setObservaciones(observaciones);
        
        ctrlPersis.crearReserva(reserva);
        
    }
    
    public void crearTipoHabitacion(String nombreTipo, int cantMaxPersonas){
        
        TipoHabitacion tipoHab = new TipoHabitacion();
        tipoHab.setNombreTipo(nombreTipo);
        tipoHab.setCantMaxPersonas(cantMaxPersonas);
                
        ctrlPersis.crearTipoHabitacion(tipoHab);
    
    }
    
    public void crearUsuario(String contrasenia){
        
        Usuario usuario = new Usuario();
        usuario.setContrasenia(contrasenia);
        
        ctrlPersis.crearUsuario(usuario);
            
    }
        
    public List<Empleado> verEmpleados(){
        
        return ctrlPersis.verEmpleados();
    }
    
    public List<Habitacion> verHabitaciones(){
        
        return ctrlPersis.verHabitaciones();
    }
    
    public List<Huesped> verHuespedes(){
        
        return ctrlPersis.verHuespedes();
    }
    
    public List<Reserva> verReservas(){
        
        return ctrlPersis.verReservas();
    }
    
    public List<TipoHabitacion> verTipoHabitaciones(){
        
        return ctrlPersis.verTipoHabitaciones();
    }
    
    public List<Usuario> verUsuarios(){
        
        return ctrlPersis.verUsuarios();
    }
    
}
