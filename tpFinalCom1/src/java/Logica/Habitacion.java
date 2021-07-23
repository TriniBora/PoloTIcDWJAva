package Logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Habitacion implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_habitacion;
    @Basic
    private int nroPiso;
    private String nombreHab;
    private double precioPorNoche;
    private boolean estaDisponible;
    @OneToMany
    private List <Reserva> listaReservas;
    @OneToMany
    private List <TipoHabitacion> listaTipoHabitaciones;

    public Habitacion() {
    }

    public Habitacion(int id_habitacion, int nroPiso, String nombreHab, double precioPorNoche, boolean estaDisponible, List<Reserva> listaReservas, List<TipoHabitacion> listaTipoHabitaciones) {
        this.id_habitacion = id_habitacion;
        this.nroPiso = nroPiso;
        this.nombreHab = nombreHab;
        this.precioPorNoche = precioPorNoche;
        this.estaDisponible = estaDisponible;
        this.listaReservas = listaReservas;
        this.listaTipoHabitaciones = listaTipoHabitaciones;
    }

    public int getId_habitacion() {
        return id_habitacion;
    }

    public void setId_habitacion(int id_habitacion) {
        this.id_habitacion = id_habitacion;
    }

    public int getNroPiso() {
        return nroPiso;
    }

    public void setNroPiso(int nroPiso) {
        this.nroPiso = nroPiso;
    }

    public String getNombreHab() {
        return nombreHab;
    }

    public void setNombreHab(String nombreHab) {
        this.nombreHab = nombreHab;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }

    public List<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(List<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    public List<TipoHabitacion> getListaTipoHabitaciones() {
        return listaTipoHabitaciones;
    }

    public void setListaTipoHabitaciones(List<TipoHabitacion> listaTipoHabitaciones) {
        this.listaTipoHabitaciones = listaTipoHabitaciones;
    }
    
    
}
