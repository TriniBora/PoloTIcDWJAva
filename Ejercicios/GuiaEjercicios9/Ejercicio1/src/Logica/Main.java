package Logica;
public class Main {

    public static void main(String[] args) {
        
        Nintendo64 juego1 = new Nintendo64("PAL-N", true, "N6401","Super Mario 3D World" , "Nintendo", "2021");
        
        PlayStation2 juego2 = new PlayStation2("NTSC", true, 16, "PS01", "Resident Evil 2", "Capcom", "1998");
        
        XBoxOne juego3 = new XBoxOne(true, false, false, "XB01", "Grand Theft Auto V", "Rockstar North", "2014");
        
        juego1.leerCartucho(juego1.nombre);
        juego1.cargarJuego();
        
        juego2.leerDVD(juego2.nombre);
        juego2.cargarJuego();
        
        juego3.leerJuegoDigital(juego3.nombre);
        juego3.cargarJuego();
        
    }
    
}
