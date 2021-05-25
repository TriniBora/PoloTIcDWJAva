package Logica;

public class Nintendo64 extends Consola{
    
    private String norma;
    private boolean leeCartuchosPiratas;

    public Nintendo64() {
    }

    public Nintendo64(String norma, boolean leeCartuchosPiratas, String codigo_consola, String nombre, String empresaDesarrollo, String anioDeLanzamiento) {
        super(codigo_consola, nombre, empresaDesarrollo, anioDeLanzamiento);
        this.norma = norma;
        this.leeCartuchosPiratas = leeCartuchosPiratas;
    }
    

    public String getNorma() {
        return norma;
    }

    public void setNorma(String norma) {
        this.norma = norma;
    }

    public boolean isLeeCartuchosPiratas() {
        return leeCartuchosPiratas;
    }

    public void setLeeCartuchosPiratas(boolean leeCartuchosPiratas) {
        this.leeCartuchosPiratas = leeCartuchosPiratas;
    }
    
    public void leerCartucho(String nombreJuego){
        System.out.println("Leyendo cartucho " + nombreJuego);
    }
    
    @Override
    public void cargarJuego() {
        System.out.println("Cargando " + this.nombre + ". Por favor espere.");
    }
    
}
