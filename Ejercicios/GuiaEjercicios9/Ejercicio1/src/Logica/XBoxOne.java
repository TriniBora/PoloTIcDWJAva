package Logica;

public class XBoxOne extends Consola{
    
    private boolean conectadaAInternet;
    private boolean calidad4KConectada;
    private boolean descargaAutomaticaDeActualizaciones;

    public XBoxOne() {
    }

    public XBoxOne(boolean conectadaAInternet, boolean calidad4KConectada, boolean descargaAutomaticaDeActualizaciones, String codigo_consola, String nombre, String empresaDesarrollo, String anioDeLanzamiento) {
        super(codigo_consola, nombre, empresaDesarrollo, anioDeLanzamiento);
        this.conectadaAInternet = conectadaAInternet;
        this.calidad4KConectada = calidad4KConectada;
        this.descargaAutomaticaDeActualizaciones = descargaAutomaticaDeActualizaciones;
    }

    public boolean isConectadaAInternet() {
        return conectadaAInternet;
    }

    public void setConectadaAInternet(boolean conectadaAInternet) {
        this.conectadaAInternet = conectadaAInternet;
    }

    public boolean isCalidad4KConectada() {
        return calidad4KConectada;
    }

    public void setCalidad4KConectada(boolean calidad4KConectada) {
        this.calidad4KConectada = calidad4KConectada;
    }

    public boolean isDescargaAutomaticaDeActualizaciones() {
        return descargaAutomaticaDeActualizaciones;
    }

    public void setDescargaAutomaticaDeActualizaciones(boolean descargaAutomaticaDeActualizaciones) {
        this.descargaAutomaticaDeActualizaciones = descargaAutomaticaDeActualizaciones;
    }
    
             
    public void leerJuegoDigital(String nombreJuego){
        System.out.println("Leyendo " + nombreJuego + " desde tienda");
    }        
 
    @Override
    public void cargarJuego() {
        System.out.println("Cargando " + this.nombre + ". Por favor espere.");
    }
    
}
