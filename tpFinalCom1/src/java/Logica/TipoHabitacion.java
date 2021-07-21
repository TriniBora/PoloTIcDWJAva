package Logica;

public class TipoHabitacion {
    
    private int id_tipo;
    private String nombreTipo;
    private int cantMaxPersonas;

    public TipoHabitacion() {
    }

    public TipoHabitacion(int id_tipo, String nombreTipo, int cantMaxPersonas) {
        this.id_tipo = id_tipo;
        this.nombreTipo = nombreTipo;
        this.cantMaxPersonas = cantMaxPersonas;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
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
