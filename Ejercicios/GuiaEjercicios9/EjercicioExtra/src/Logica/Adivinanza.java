package Logica;

public class Adivinanza extends Articulo implements AdiCruci{

    public Adivinanza() {
    }

    @Override
    public void publicarResolucion() {
        System.out.println("Esta es la resolución de la adivinanza");
    }
    
}
