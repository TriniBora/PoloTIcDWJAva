package Logica;

public class Colectivo extends Vehiculo{
    
    private boolean aptodiscapacitados;
    private boolean poseeLectorSube;
    private String tipocolectivo;

    public Colectivo() {
    }

    public Colectivo(boolean aptodiscapacitados, boolean poseeLectorSube, String tipocolectivo, String patente, String numChasis, String motor, String color, String marca, String modelo, int cantAsientos) {
        super(patente, numChasis, motor, color, marca, modelo, cantAsientos);
        this.aptodiscapacitados = aptodiscapacitados;
        this.poseeLectorSube = poseeLectorSube;
        this.tipocolectivo = tipocolectivo;
    }

    public boolean isAptodiscapacitados() {
        return aptodiscapacitados;
    }

    public void setAptodiscapacitados(boolean aptodiscapacitados) {
        this.aptodiscapacitados = aptodiscapacitados;
    }

    public boolean isPoseeLectorSube() {
        return poseeLectorSube;
    }

    public void setPoseeLectorSube(boolean poseeLectorSube) {
        this.poseeLectorSube = poseeLectorSube;
    }

    public String getTipocolectivo() {
        return tipocolectivo;
    }

    public void setTipocolectivo(String tipocolectivo) {
        this.tipocolectivo = tipocolectivo;
    }

    @Override
    public void mostrarMensaje(){
        System.out.println("Hola soy un colectivo y mi cantidad de asientos es " + this.getCantAsientos());
    }
    
    
}
