package Logica;

import java.util.List;

public class Habitacion {
    
    private int id_habitacion;
    private int nroPiso;
    private String nombreHab;
    private double precioPorNoche;
    private boolean estaDisponible;
    private List <Reserva> listaReservas;
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
