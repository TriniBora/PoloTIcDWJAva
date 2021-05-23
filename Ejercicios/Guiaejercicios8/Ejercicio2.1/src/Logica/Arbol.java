package Logica;

public class Arbol extends Planta {
    private String variedad;
    private String tipoTronco;
    private double radioTronco;
    private String Color;
    private String tipoHojas;

    public Arbol() {
    }

    public Arbol(String variedad, String tipoTronco, double radioTronco, String Color, String tipoHojas, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoTronco = tipoTronco;
        this.radioTronco = radioTronco;
        this.Color = Color;
        this.tipoHojas = tipoHojas;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoTronco() {
        return tipoTronco;
    }

    public void setTipoTronco(String tipoTronco) {
        this.tipoTronco = tipoTronco;
    }

    public double getRadioTronco() {
        return radioTronco;
    }

    public void setRadioTronco(double radioTronco) {
        this.radioTronco = radioTronco;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getTipoHojas() {
        return tipoHojas;
    }

    public void setTipoHojas(String tipoHojas) {
        this.tipoHojas = tipoHojas;
    }
    
    private void mostrarMensajeArbol(){
        System.out.println("Hola soy un árbol");
    }
    
    @Override
    public void mostrarMensaje(){
        System.out.println("Soy un árbol");
    }
}
