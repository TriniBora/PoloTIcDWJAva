package Logica;

import Persistencia.ControladoraPersistencia;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controladora {

    ControladoraPersistencia ctrlPersis = new ControladoraPersistencia();

    public void crearEmpleado(String dni, String nombre, String apellido, Date fechaNac, String telefono, String email, String direccion, String cargo, Usuario usuario) {

        Empleado empleado = new Empleado();
        empleado.setDni(dni);
        empleado.setNombre(nombre);
        empleado.setApellido(apellido);
        empleado.setFechaNac(fechaNac);
        empleado.setTelefono(telefono);
        empleado.setEmail(email);
        empleado.setDireccion(direccion);
        empleado.setCargo(cargo);
        empleado.setUsuario(usuario);

        ctrlPersis.crearEmpleado(empleado);

    }

    public void crearHabitacion(int nroPiso, String nombreHab, double precioPorNoche, TipoHabitacion tipoHab) {

        Habitacion hab = new Habitacion();
        hab.setNroPiso(nroPiso);
        hab.setNombreHab(nombreHab);
        hab.setPrecioPorNoche(precioPorNoche);
        hab.setTipoHab(tipoHab);

        ctrlPersis.crearHabitacion(hab);

    }

    public void crearHuesped(String dni, String nombre, String apellido, Date fechaNac, String telefono, String email, String direccion, String profesion) {

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

    public void crearReserva(Date fechaEntrada, Date fechaSalida, int cantPersonas, double montoTotal, Huesped huesped, Habitacion habitacion, Usuario usuario) {

        Reserva reserva = new Reserva();
        reserva.setFechaEntrada(fechaEntrada);
        reserva.setFechaSalida(fechaSalida);
        reserva.setCantPersonas(cantPersonas);
        reserva.setMontoTotal(montoTotal);
        reserva.setHuesped(huesped);
        reserva.setHabitacion(habitacion);
        reserva.setUsuario(usuario);

        ctrlPersis.crearReserva(reserva);

    }

    public void crearTipoHabitacion(String nombreTipo, int cantMaxPersonas) {

        TipoHabitacion tipoHab = new TipoHabitacion();
        tipoHab.setNombreTipo(nombreTipo);
        tipoHab.setCantMaxPersonas(cantMaxPersonas);

        ctrlPersis.crearTipoHabitacion(tipoHab);

    }

    public void crearUsuario(String user, String contrasenia) {

        Usuario usuario = new Usuario();
        usuario.setUsername(user);
        usuario.setContrasenia(contrasenia);

        ctrlPersis.crearUsuario(usuario);

    }

    public List<Empleado> verEmpleados() {

        return ctrlPersis.verEmpleados();
    }

    public List<Habitacion> verHabitaciones() {

        return ctrlPersis.verHabitaciones();
    }

    public List<Huesped> verHuespedes() {

        return ctrlPersis.verHuespedes();
    }

    public List<Reserva> verReservas() {

        return ctrlPersis.verReservas();
    }

    public List<TipoHabitacion> verTipoHabitaciones() {

        return ctrlPersis.verTipoHabitaciones();
    }

    public List<Usuario> verUsuarios() {

        return ctrlPersis.verUsuarios();
    }

    //Dado un nombre de usuario y una contraseña, se verifica si hay ya en la lista un objeto Usuario
    //con estos datos
    public boolean verificarUsuario(String username, String contrasenia) {

        List<Usuario> listaUsuarios = ctrlPersis.verUsuarios();

        if (listaUsuarios != null) {
            for (Usuario usuario : listaUsuarios) {
                if (usuario.getUsername().equals(username) && usuario.getContrasenia().equals(contrasenia)) {
                    return true;
                }
            }
        }
        return false;
    }

    //Dado un nombre de usuario, se verifica si hay ya en la lista un objeto Usuario
    //con el mismo nombre, evitando así tener nombres duplicados
    public boolean existeUsername(String username) {

        List<Usuario> listaUsuarios = ctrlPersis.verUsuarios();

        if (listaUsuarios != null) {
            for (Usuario usuario : listaUsuarios) {
                if (usuario.getUsername().equals(username)) {
                    return true;
                }
            }
        }

        return false;
    }

    //Dado un nombre de habitación, se verifica si hay ya en la lista un objeto Habitación
    //con el mismo nombre, evitando así tener nombres duplicados
    public boolean existeNombreHab(String nombreHab) {

        List<Habitacion> listaHabitaciones = ctrlPersis.verHabitaciones();

        if (listaHabitaciones != null) {
            for (Habitacion habitacion : listaHabitaciones) {
                if (habitacion.getNombreHab().equals(nombreHab)) {
                    return true;
                }
            }
        }

        return false;
    }

    //Dado un rango de fechas y el nombre de una habitación, se verifica si hay ya e
    //dicho rango alguna reserva con esa habitación asignada, evitando así asignar
    //la misma habitación a más de una reserva
    public boolean existeHab(Date fechaInicial, Date fechaFinal, String nombreHab) {

        List<Reserva> listaReservas = ctrlPersis.verReservas();

        if (listaReservas != null) {
            for (Reserva reserva : listaReservas) {

                if (reserva.getHabitacion().getNombreHab().equals(nombreHab)) {

                    boolean fechaInValida = verificarFecha(reserva.getFechaEntrada(), reserva.getFechaSalida(), fechaInicial);
                    boolean fechaFinValida = verificarFecha(reserva.getFechaEntrada(), reserva.getFechaSalida(), fechaFinal);

                    if (fechaInValida == false && fechaFinValida == false) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }

        return false;
    }

    //Dado un dni, se verifica si hay ya en la lista un objeto Huésped
    //con el mismo dni, evitando así tener dni duplicados
    public boolean existeHuesped(String dni) {

        List<Huesped> listaHuespedes = ctrlPersis.verHuespedes();

        if (listaHuespedes != null) {
            for (Huesped huesped : listaHuespedes) {
                if (huesped.getDni().equals(dni)) {
                    return true;
                }
            }
        }
        return false;
    }

    //Dado un nombre de tipo de habitación, se verifica si hay ya en la lista un objeto TipoHabitación
    //con el mismo nombre, evitando así tener nombres duplicados
    public boolean existeTipoHabitacion(String nombreTipoHab) {

        List<TipoHabitacion> listatipoHab = ctrlPersis.verTipoHabitaciones();

        if (listatipoHab != null) {
            for (TipoHabitacion tipoHab : listatipoHab) {
                if (tipoHab.getNombreTipo().equals(nombreTipoHab)) {
                    return true;
                }
            }
        }
        return false;
    }

    //Dado un nombre de habitación, se obtiene el objeto Habitación al que pertenece
    public Habitacion obtenerHabitacion(String nombreHab) {

        List<Habitacion> listaHabitaciones = ctrlPersis.verHabitaciones();

        if (listaHabitaciones != null) {
            for (Habitacion habitacion : listaHabitaciones) {
                if (habitacion.getNombreHab().equals(nombreHab)) {
                    return habitacion;
                }
            }
        }
        return null;
    }

    //Dado un dni de un huésped, se obtiene el objeto Huésped al que pertenece
    public Huesped obtenerHuesped(String dni) {

        List<Huesped> listaHuespedes = ctrlPersis.verHuespedes();

        if (listaHuespedes != null) {
            for (Huesped huesped : listaHuespedes) {
                if (huesped.getDni().equals(dni)) {
                    return huesped;
                }
            }
        }
        return null;
    }

    //Dado un tipo de habitación, se obtiene el objeto TipoHabitación al que pertenece
    public TipoHabitacion obtenerTipoHabitacion(String nombreTipoHab) {

        List<TipoHabitacion> listaTipoHabitaciones = ctrlPersis.verTipoHabitaciones();

        if (listaTipoHabitaciones != null) {
            for (TipoHabitacion tipoHabitacion : listaTipoHabitaciones) {
                if (tipoHabitacion.getNombreTipo().equals(nombreTipoHab)) {
                    return tipoHabitacion;
                }
            }
        }
        return null;
    }

    //Dado un nombre de usuario, se obtiene el objeto Usuario al que pertenece
    public Usuario obtenerUsuario(String username) {

        List<Usuario> listaUsuarios = ctrlPersis.verUsuarios();

        if (listaUsuarios != null) {
            for (Usuario usuario : listaUsuarios) {
                if (usuario.getUsername().equals(username)) {
                    return usuario;
                }
            }
        }
        return null;
    }

    public void eliminarEmpleado(long id) {

        ctrlPersis.eliminarEmpleado(id);

    }

    public void eliminarHabitacion(long id) {

        ctrlPersis.eliminarHabitacion(id);
    }

    public void eliminarHuesped(long id) {

        ctrlPersis.eliminarHuesped(id);
    }

    public void eliminarReserva(long id) {

        ctrlPersis.eliminarReserva(id);
    }

    public void eliminarTipoHabitacion(long id) {

        ctrlPersis.eliminarTipoHabitacion(id);
    }

    public void eliminarUsuario(long id) {

        ctrlPersis.eliminarUsuario(id);
    }

    public Empleado buscarEmpleado(long id) {

        return ctrlPersis.buscarEmpleado(id);

    }

    public Habitacion buscarHabitacion(long id) {

        return ctrlPersis.buscarHabitacion(id);

    }

    public Huesped buscarHuesped(long id) {

        return ctrlPersis.buscarHuesped(id);

    }

    public Reserva buscarReserva(long id) {

        return ctrlPersis.buscarReserva(id);

    }

    public TipoHabitacion buscarTipoHabitacion(long id) {

        return ctrlPersis.buscarTipoHabitacion(id);

    }

    public Usuario buscarUsuario(long id) {

        return ctrlPersis.buscarUsuario(id);

    }

    public void modificarEmpleado(Empleado empleado) {

        ctrlPersis.modificarEmpleado(empleado);

    }

    public void modificarHabitacion(Habitacion habitacion) {

        ctrlPersis.modificarHabitacion(habitacion);

    }

    public void modificarHuesped(Huesped huesped) {

        ctrlPersis.modificarHuesped(huesped);

    }

    public void modificarReserva(Reserva reserva) {

        ctrlPersis.modificarReserva(reserva);

    }

    public void modificarTipoHabitacion(TipoHabitacion tipoHab) {

        ctrlPersis.modificarTipoHabitacion(tipoHab);

    }

    public void modificarUsuario(Usuario usuario) {

        ctrlPersis.modificarUsuario(usuario);

    }

    //Convierte fecha String a Date, dado un formato particular    
    public Date fechaStringADate(String fechaString) {

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date fechaDate = sdf.parse(fechaString);
            return fechaDate;
        } catch (ParseException ex) {
            Logger.getLogger(Controladora.class
                    .getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    //Convierte fecha Date a String, dado un formato particular
    public String fechaDateAString(Date fechaDate) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fechaString = sdf.format(fechaDate);
        return fechaString;

    }

    //Verifica que una fecha dada pertenezca a un intervalo
    public boolean verificarFecha(Date fechaInicio, Date fechaFin, Date fecha) {

        boolean disponible = fecha.after(fechaInicio) && fecha.before(fechaFin);

        return disponible;
    }

    //Dadas dos fechas, devuelve un int con los días de diferencia entre ambas
    public int diferenciaEntreDosFechas(Date fechaInicial, Date fechaFinal) {

        int dias = (int) ((fechaFinal.getTime() - fechaInicial.getTime()) / 86400000);

        return dias;

    }

    //Dadas las fechas inicial y final de una Reserva, devuelve un double con el monto total de la misma
    public double calcularMontoTotal(Date fechaInicial, Date fechaFinal, double precioPorNoche) {

        int cantDias = diferenciaEntreDosFechas(fechaInicial, fechaFinal);

        double montoTotal = precioPorNoche * cantDias;

        return montoTotal;

    }

    //Dadas las personas de una Reserva y la capacidad máxima de la Habitación elegida,
    //se verifica si es posible o no asignar dicha habitación a la reserva
    public boolean verificarCapacidadMax(int cantMaxPersonas, int cantPersonas) {

        if (cantMaxPersonas >= cantPersonas) {
            return true;
        } else {
            return false;
        }
    }

    //Dadas la fecha inicial de una Reserva, verifica que la fecha inicial
    //sea igual o posterior que la fecha actual del sistema
    public boolean verificarFechaEntrada(Date fechaInicial) {

        long miliseconds = System.currentTimeMillis();

        Date fechaActual = new Date(miliseconds);

        int resultado = fechaActual.compareTo(fechaInicial);

        if (resultado >= 0) {
            return true;
        } else {
            return false;
        }
    }

    //Dadas las fechas inicial y final de una Reserva, verifica que la fecha inicial
    //sea anterior a la fecha final
    public boolean verificarFechaSalida(Date fechaInicial, Date FechaFinal) {

        int resultado = fechaInicial.compareTo(FechaFinal);

        if (resultado > 0) {
            return true;
        } else {
            return false;
        }
    }

}
