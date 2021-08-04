package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Habitacion implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_habitacion;
    @Basic
    private int nroPiso;
    private String nombreHab;
    private double precioPorNoche;
    @OneToOne
    TipoHabitacion tipoHab;    

    public Habitacion() {
    }

    public Habitacion(long id_habitacion, int nroPiso, String nombreHab, double precioPorNoche, TipoHabitacion tipoHab) {
        this.id_habitacion = id_habitacion;
        this.nroPiso = nroPiso;
        this.nombreHab = nombreHab;
        this.precioPorNoche = precioPorNoche;
        this.tipoHab = tipoHab;
    }

    public long getId_habitacion() {
        return id_habitacion;
    }

    public void setId_habitacion(long id_habitacion) {
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

    public TipoHabitacion getTipoHab() {
        return tipoHab;
    }

    public void setTipoHab(TipoHabitacion tipoHab) {
        this.tipoHab = tipoHab;
    }
}

    