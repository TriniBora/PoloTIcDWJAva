package Logica;

public class Fruta {
    private String nombre;
    private String color;
    private double calorias;
    private String tipoCascara;
    private boolean esComestible;

    public Fruta() {
    }

    public Fruta(String nombre, String color, double calorias, String tipoCascara, boolean esComestible) {
        this.nombre = nombre;
        this.color = color;
        this.calorias = calorias;
        this.tipoCascara = tipoCascara;
        this.esComestible = esComestible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public String getTipoCascara() {
        return tipoCascara;
    }

    public void setTipoCascara(String tipoCascara) {
        this.tipoCascara = tipoCascara;
    }

    public boolean isEsComestible() {
        return esComestible;
    }

    public void setEsComestible(boolean esComestible) {
        this.esComestible = esComestible;
    }

    
    
}
