package Logica;

public class Main {

    public static void main(String[] args) {
        Arbol arbol1 = new Arbol("Frutal", "Delgado", 0.105, "Verde Oscuro", "Perennes", "Limonero", 3.5, true, "Cálido");
        Flor flor1 = new Flor("Blanco", 1, "Amarillo", "Cala", "Primavera", "Cala", 0.80, false, "Húmedo");
        Arbusto arbusto1 = new Arbusto(0.305, true, "Caducos", "Verde Claro", true, "Rosal", 0.60, true, "Templado");
        
        arbol1.mostrarMensaje();
        flor1.mostrarMensaje();
        arbusto1.mostrarMensaje();
        
        
    }
}