package Logica;

import java.util.Date;

public class Reserva {
    
    private int id_reserva;
    private Date fechaEntrada;
    private Date fechaSalida;
    private int cantPersonas;
    private double montoTotal;
    private String observaciones;

    public Reserva() {
    }

    public Reserva(int id_reserva, Date fechaEntrada, Date fechaSalida, int cantPersonas, double montoTotal, String observaciones) {
        this.id_reserva = id_reserva;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.cantPersonas = cantPersonas;
        this.montoTotal = montoTotal;
        this.observaciones = observaciones;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
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

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
    
}
