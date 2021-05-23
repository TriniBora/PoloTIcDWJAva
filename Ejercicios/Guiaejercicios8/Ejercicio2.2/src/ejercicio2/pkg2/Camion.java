package ejercicio2.pkg2;

public class Camion extends Vehiculo{
    private boolean tieneAcoplado;
    private int cantejes;

    public Camion() {
    }

    public Camion(boolean tieneAcoplado, int cantejes, String patente, String numChasis, String motor, String color, String marca, String modelo, int cantAsientos) {
        super(patente, numChasis, motor, color, marca, modelo, cantAsientos);
        this.tieneAcoplado = tieneAcoplado;
        this.cantejes = cantejes;
    }

    

    public boolean isTieneAcoplado() {
        return tieneAcoplado;
    }

    public void setTieneAcoplado(boolean tieneAcoplado) {
        this.tieneAcoplado = tieneAcoplado;
    }

    public int getCantejes() {
        return cantejes;
    }

    public void setCantejes(int cantejes) {
        this.cantejes = cantejes;
    }
    
    @Override
    public void mostrarMensaje(){
        System.out.println("Hola soy un camión y mi cantidad de ejes es " + this.getCantejes());
    }
}
