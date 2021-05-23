package Logica;

import java.util.Set;

public class Ejercicio1A {

    public static void main(String[] args) {
        
        VideoJuego videoJuegos[] = new VideoJuego[5];
        
        VideoJuego juego1 = new VideoJuego(1, "Super Mario 3D World", "Nintendo Switch", 4, "Plataformas");
        VideoJuego juego2 = new VideoJuego(2, "Resident Evil 2 Remake", "Play Station 4", 1, "Acción");
        VideoJuego juego3 = new VideoJuego(3, "Resident Evil 8: Village", "Play Station 5", 1, "Acción");
        VideoJuego juego4 = new VideoJuego(4, "Crash Bandicoot 4: It's About Time", "Play Station 4", 4, "Plataformas");
        VideoJuego juego5 = new VideoJuego(5, "Prince of Persia: El Alma del Guerrero", "XBOX", 1, "Acción");
        
        videoJuegos[0] = juego1;
        videoJuegos[1] = juego2;
        videoJuegos[2] = juego3;
        videoJuegos[3] = juego4;
        videoJuegos[4] = juego5;
        
        for(int i=0; i <5 ; i++){
            System.out.println("Título del videojuego: " + videoJuegos[i].getTitulo()
                + ". Consola: " + videoJuegos[i].getConsola()
                + ". Cantidad de jugadores: " + videoJuegos[i].getCantidadJugadores());
        }
        
        System.out.println("");
        
        juego3.setTitulo("Batman Forever");
        juego3.setCantidadJugadores(2);
        
        juego5.setTitulo("Goblins");
        juego5.setCantidadJugadores(4);
        
        for(int i=0; i <5 ; i++){
            System.out.println("Título del videojuego: " + videoJuegos[i].getTitulo()
                + ". Consola: " + videoJuegos[i].getConsola()
                + ". Cantidad de jugadores: " + videoJuegos[i].getCantidadJugadores());
        }
        
        System.out.println("");
        
        for(int i=0; i <5 ; i++){
            if(videoJuegos[i].getConsola().equals("Play Station 4"))
                System.out.println("Título del videojuego: " + videoJuegos[i].getTitulo()
                    + ". Consola: " + videoJuegos[i].getConsola()
                    + ". Cantidad de jugadores: " + videoJuegos[i].getCantidadJugadores());
        }
        
    }
    
}
