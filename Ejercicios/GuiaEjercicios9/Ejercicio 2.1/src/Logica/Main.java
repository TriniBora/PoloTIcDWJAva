package Logica;

public class Main {

    public static void main(String[] args) {
        
        Pikachu poke1 = new Pikachu(025, "Pikachu", 6.0, "50% male, 50% female", 1, "Electric");
        Charmander poke2 = new Charmander(004, "Charmander", 8.5, "87.5% male, 12.5% female", 1, "Fire");
        Bulbasaur poke3 = new Bulbasaur(001, "Bulbasaur", 6.9, "87.5% male, 12.5% female", 1, "Grass & Poison");
        Squirtle poke4 = new Squirtle(007, "Squirtle", 9.0, "87.5% male, 12.5% female", 1, "Water");
        
        poke1.atacarAraniazo();
        poke1.atacarImpactrueno();
        poke1.atacarMordisco();
        poke1.atacarPlacaje();
        poke1.atacarPunioTrueno();
        poke1.atacarRayo();
        poke1.atacarRayoCarga();
        
        poke2.atacarAraniazo();
        poke2.atacarLanzallamas();
        poke2.atacarMordisco();
        poke2.atacarPlacaje();
        poke2.atacarPunioFuego();
        poke2.atacarAscuas();
        
        poke3.atacarAraniazo();
        poke3.atacarDrenaje();
        poke3.atacarMordisco();
        poke3.atacarPlacaje();
        poke3.atacarHojaAfilada();
        poke3.atacarLatigoCepa();
        poke3.atacarParalizar();
        
        poke4.atacarAraniazo();
        poke4.atacarBurbuja();
        poke4.atacarMordisco();
        poke4.atacarPlacaje();
        poke4.atacarHidrobomba();
        poke4.atacarHidropulso();
        poke4.atacarPistolaAgua();
        
    }
    
}
