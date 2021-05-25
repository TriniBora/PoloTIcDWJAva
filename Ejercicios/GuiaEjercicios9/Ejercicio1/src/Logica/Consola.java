
package Logica;

public abstract class Consola {
       
        protected String codigo_consola;
        protected String nombre;
        protected String empresaDesarrollo;
        protected String anioDeLanzamiento;

    public Consola() {
    }

    public Consola(String codigo_consola, String nombre, String empresaDesarrollo, String anioDeLanzamiento) {
        this.codigo_consola = codigo_consola;
        this.nombre = nombre;
        this.empresaDesarrollo = empresaDesarrollo;
        this.anioDeLanzamiento = anioDeLanzamiento;
    }
        
        
    public abstract void cargarJuego();
}
