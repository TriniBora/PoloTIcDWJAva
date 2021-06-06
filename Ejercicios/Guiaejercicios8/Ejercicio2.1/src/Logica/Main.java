package Logica;

public class Main {

    public static void main(String[] args) {
        
        Arbol arbol1 = new Arbol("Frutal", "Delgado", 0.105, "Verde Oscuro", "Perennes", "Limonero", 3.5, true, "Cálido");
        Flor flor1 = new Flor("Blanco", 1, "Amarillo", "Cala", "Primavera", "Cala", 0.80, false, "Húmedo");
        Arbusto arbusto1 = new Arbusto(0.305, true, "Caducos", "Verde Claro", true, "Rosal", 0.60, true, "Templado");
        
        
        //Primera forma de mostrar cada mensaje, poco eficiente ya que cada clase hija tiene 
        //el mismo metodo
        arbol1.mostrarMensaje();
        flor1.mostrarMensaje();
        arbusto1.mostrarMensaje();
        
        //Alternativa, utilizo el metodo mostrarMensaje2 que está solo en  la clase madre
        arbol1.mostrarMensaje2("Hola, soy un árbol 2");
        flor1.mostrarMensaje2("Hola, soy una flor 2");
        arbusto1.mostrarMensaje2("Hola, soy un arbusto 2");
        
        //Alternativa aún más eficiente, utilizo el metodo mostrarMensaje3 que está solo en  la clase madre
        arbol1.mostrarMensaje3("árbol");
        flor1.mostrarMensaje3("flor");
        arbusto1.mostrarMensaje3("arbusto");
    }
}