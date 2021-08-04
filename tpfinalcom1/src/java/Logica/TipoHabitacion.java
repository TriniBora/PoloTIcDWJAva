package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoHabitacion implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_tipo;
    @Basic
    private String nombreTipo;
    private int cantMaxPersonas;

    public TipoHabitacion() {
    }

    public TipoHabitacion(long id_tipo, String nombreTipo, int cantMaxPersonas) {
        this.id_tipo = id_tipo;
        this.nombreTipo = nombreTipo;
        this.cantMaxPersonas = cantMaxPersonas;
    }

    public long getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(long id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public int getCantMaxPersonas() {
        return cantMaxPersonas;
    }

    public void setCantMaxPersonas(int cantMaxPersonas) {
        this.cantMaxPersonas = cantMaxPersonas;
    }
    
    
}
