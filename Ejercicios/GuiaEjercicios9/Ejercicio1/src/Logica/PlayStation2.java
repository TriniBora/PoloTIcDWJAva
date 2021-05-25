package Logica;

public class PlayStation2 extends Consola{
    
    private String norma;
    private boolean chipeadaONo;
    private int tamanioMemoryCard;

    public PlayStation2() {
    }

    public PlayStation2(String norma, boolean chipeadaONo, int tamanioMemoryCard, String codigo_consola, String nombre, String empresaDesarrollo, String anioDeLanzamiento) {
        super(codigo_consola, nombre, empresaDesarrollo, anioDeLanzamiento);
        this.norma = norma;
        this.chipeadaONo = chipeadaONo;
        this.tamanioMemoryCard = tamanioMemoryCard;
    }

    

    public String getNorma() {
        return norma;
    }

    public void setNorma(String norma) {
        this.norma = norma;
    }

    public boolean isChipeadaONo() {
        return chipeadaONo;
    }

    public void setChipeadaONo(boolean chipeadaONo) {
        this.chipeadaONo = chipeadaONo;
    }

    public int getTamanioMemoryCard() {
        return tamanioMemoryCard;
    }

    public void setTamanioMemoryCard(int tamanioMemoryCard) {
        this.tamanioMemoryCard = tamanioMemoryCard;
    }
    
    public void leerDVD(String nombreJuego){
        System.out.println("Leyendo DVD " + nombreJuego);
    }

    @Override
    public void cargarJuego() {
        System.out.println("Cargando " + this.nombre + ". Por favor espere.");
    }
    
}
