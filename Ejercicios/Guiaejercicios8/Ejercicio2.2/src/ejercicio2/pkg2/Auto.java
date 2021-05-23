package ejercicio2.pkg2;

public class Auto extends Vehiculo{
    
    private String materialAsientos;
    private int cantidad_caballos;

    public Auto() {
    }

    public Auto(String materialAsientos, int cantidad_caballos, String patente, String numChasis, String motor, String color, String marca, String modelo, int cantAsientos) {
        super(patente, numChasis, motor, color, marca, modelo, cantAsientos);
        this.materialAsientos = materialAsientos;
        this.cantidad_caballos = cantidad_caballos;
    }

    public String getMaterialAsientos() {
        return materialAsientos;
    }

    public void setMaterialAsientos(String materialAsientos) {
        this.materialAsientos = materialAsientos;
    }

    public int getCantidad_caballos() {
        return cantidad_caballos;
    }

    public void setCantidad_caballos(int cantidad_caballos) {
        this.cantidad_caballos = cantidad_caballos;
    }
    
    @Override
    public void mostrarMensaje(){
        System.out.println("Hola soy un auto y mi marca es " + this.getMarca());
    }
}
