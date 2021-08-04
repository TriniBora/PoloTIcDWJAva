package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.OneToOne;

@Entity
public class Reserva implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_reserva;
    @Temporal(TemporalType.DATE)
    private Date fechaEntrada;
    @Temporal(TemporalType.DATE)
    private Date fechaSalida;
    @Basic
    private int cantPersonas;
    private double montoTotal;
    @OneToOne
    Huesped huesped;
    @OneToOne
    Habitacion habitacion;
    @OneToOne
    Usuario usuario;


    public Reserva() {
    }

    public Reserva(long id_reserva, Date fechaEntrada, Date fechaSalida, int cantPersonas, double montoTotal, Huesped huesped, Habitacion habitacion, Usuario usuario) {
        this.id_reserva = id_reserva;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.cantPersonas = cantPersonas;
        this.montoTotal = montoTotal;
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.usuario = usuario;
    }

    public long getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(long id_reserva) {
        this.id_reserva = id_reserva;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

    