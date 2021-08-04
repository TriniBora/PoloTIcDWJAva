package Persistencia;

import Logica.Empleado;
import Logica.Habitacion;
import Logica.Huesped;
import Logica.Persona;
import Logica.Reserva;
import Logica.TipoHabitacion;
import Logica.Usuario;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;

public class ControladoraPersistencia {
    
    EmpleadoJpaController empleadoJPA = new EmpleadoJpaController();
    HabitacionJpaController habitacionJPA = new HabitacionJpaController();
    HuespedJpaController huespedJPA = new HuespedJpaController();
    PersonaJpaController personaJPA = new PersonaJpaController();
    ReservaJpaController reservaJPA = new ReservaJpaController();
    TipoHabitacionJpaController tipoHabJPA = new TipoHabitacionJpaController();
    UsuarioJpaController usuarioJPA = new UsuarioJpaController();
    
    
    public void crearEmpleado(Empleado empleado){
        
        empleadoJPA.create(empleado);
    }
    
    public void crearHabitacion(Habitacion habitacion){
        
        habitacionJPA.create(habitacion);
    }
    
    public void crearHuesped(Huesped huesped){
        
        huespedJPA.create(huesped);
    }
    
    public void crearPersona(Persona persona){
        
        personaJPA.create(persona);
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
    
    public List<Empleado> verEmpleados() {
        return empleadoJPA.findEmpleadoEntities();
    }

    public List<Habitacion> verHabitaciones() {
        return habitacionJPA.findHabitacionEntities();
    }

    public List<Huesped> verHuespedes() {
        return huespedJPA.findHuespedEntities();
    }

    public List<Reserva> verReservas() {
        return reservaJPA.findReservaEntities();
    }
    
    public List<TipoHabitacion> verTipoHabitaciones() {
        return tipoHabJPA.findTipoHabitacionEntities();
    }
    
    public List<Usuario> verUsuarios() {
        
        return usuarioJPA.findUsuarioEntities();
        
    }

    public void eliminarEmpleado(long id) {
        
        try {
            empleadoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            java.util.logging.Logger.getLogger(ControladoraPersistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }
    
    public void eliminarHabitacion(long id) {
        
        try {
            habitacionJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            java.util.logging.Logger.getLogger(ControladoraPersistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }
    
    public void eliminarHuesped(long id) {
        
        try {
            huespedJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            java.util.logging.Logger.getLogger(ControladoraPersistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }
    
    public void eliminarReserva(long id) {
        
        try {
            reservaJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            java.util.logging.Logger.getLogger(ControladoraPersistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }
    
    public void eliminarTipoHabitacion(long id) {
        
        try {
            tipoHabJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            java.util.logging.Logger.getLogger(ControladoraPersistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }
    
    public void eliminarUsuario(long id) {
        
        try {
            usuarioJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            java.util.logging.Logger.getLogger(ControladoraPersistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }

    public Empleado buscarEmpleado(long id) {
        
        return empleadoJPA.findEmpleado(id);
        
    }
    
    public Habitacion buscarHabitacion(long id) {
        
        return habitacionJPA.findHabitacion(id);
        
    }
    
    public Huesped buscarHuesped(long id) {
        
        return huespedJPA.findHuesped(id);
        
    }
    
    public Reserva buscarReserva(long id) {
        
        return reservaJPA.findReserva(id);
        
    }
    
    public TipoHabitacion buscarTipoHabitacion(long id) {
        
        return tipoHabJPA.findTipoHabitacion(id);
        
    }
    
    public Usuario buscarUsuario(long id) {
        
        return usuarioJPA.findUsuario(id);
        
    }

    public void modificarEmpleado(Empleado empleado) {
        
        try {
            empleadoJPA.edit(empleado);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(ControladoraPersistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }
    
    public void modificarHabitacion(Habitacion habitacion) {
        
        try {
            habitacionJPA.edit(habitacion);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(ControladoraPersistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }
    
    public void modificarHuesped(Huesped huesped) {
        
        try {
            huespedJPA.edit(huesped);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(ControladoraPersistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }
    
    public void modificarReserva(Reserva reserva) {
        
        try {
            reservaJPA.edit(reserva);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(ControladoraPersistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }
    
    public void modificarTipoHabitacion(TipoHabitacion tipoHab) {
        
        try {
            tipoHabJPA.edit(tipoHab);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(ControladoraPersistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }
    
    public void modificarUsuario(Usuario usuario) {
        
        try {
            usuarioJPA.edit(usuario);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(ControladoraPersistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }

}
