package Persistencia;

import Logica.Empleado;
import Logica.Habitacion;
import Logica.Huesped;
import Logica.Reserva;
import Logica.TipoHabitacion;
import Logica.Usuario;
import java.util.List;

public class ControladoraPersistencia {
    
    EmpleadoJpaController  empleadoJPA = new EmpleadoJpaController();
    HabitacionJpaController  habitacionJPA = new HabitacionJpaController();
    HuespedJpaController  huespedJPA = new HuespedJpaController();
    ReservaJpaController  reservaJPA = new ReservaJpaController();
    TipoHabitacionJpaController  tipoHabJPA = new TipoHabitacionJpaController();
    UsuarioJpaController  usuarioJPA = new UsuarioJpaController();
    
    public void crearEmpleado(Empleado empleado){
        
        empleadoJPA.create(empleado);
    }
    
    public void crearHabitacion(Habitacion habitacion){
        
        habitacionJPA.create(habitacion);
    }
        
    public void crearHuesped(Huesped huesped){
        
        huespedJPA.create(huesped);
    }
    
    public void crearReserva(Reserva reserva){
        
        reservaJPA.create(reserva);
    }
    
    public void crearTipoHabitacion(TipoHabitacion tipoHab){
        
        tipoHabJPA.create(tipoHab);
    }
    
    public void crearUsuario(Usuario usuario){
        
        usuarioJPA.create(usuario);
    }
    
    public List <Empleado> verEmpleados(){
        
        return empleadoJPA.findEmpleadoEntities();
    }
    
    public List <Habitacion> verHabitaciones(){
        
        return habitacionJPA.findHabitacionEntities();
    }
    
    public List <Huesped> verHuespedes(){
        
        return huespedJPA.findHuespedEntities();
    }
        
    public List <Reserva> verReservas(){
        
        return reservaJPA.findReservaEntities();
    }
    
    public List <TipoHabitacion> verTipoHabitaciones(){
        
        return tipoHabJPA.findTipoHabitacionEntities();
    }
    
    
    public List <Usuario> verUsuarios(){
        
        return usuarioJPA.findUsuarioEntities();
    }
}
