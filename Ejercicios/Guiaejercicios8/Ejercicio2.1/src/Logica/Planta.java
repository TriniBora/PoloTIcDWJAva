package Logica;

public class Planta {
    private String nombre;
    private double altoTallo;
    private boolean tieneHojas;
    private String climaIdeal;

    public Planta() {
    }

    public Planta(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        this.nombre = nombre;
        this.altoTallo = altoTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltoTallo() {
        return altoTallo;
    }

    public void setAltoTallo(double altoTallo) {
        this.altoTallo = altoTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }
    
    //Alternativa 1 creo este método y lo sobreescribo an cada clase hija
    public void mostrarMensaje(){
        System.out.println("Soy una planta!");
    }
    
    //Alternativa, creo un metodo para mostrar un mensaje que se pasa por
    //parametros. Este metodo solo esta en la clase madre
    
    public void mostrarMensaje2(String mensaje){
        System.out.println(mensaje);
    }
    
    //Alternativa 3, creo un metodo para mostrar el contenido de una variable 
    //que se pasa por parametros. Este metodo solo esta en la clase madre
    
    public void mostrarMensaje3(String tipoPlanta){
        System.out.println("Hola, soy una/a: " + tipoPlanta);
    }
    
}
