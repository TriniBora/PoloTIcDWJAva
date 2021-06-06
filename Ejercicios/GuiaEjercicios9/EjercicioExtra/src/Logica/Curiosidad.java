package Logica;

public class Curiosidad extends Articulo implements CuriBlog{

    public Curiosidad() {
    }

    @Override
    public void publicarAhora() {
        System.out.println("Soy una curiosidad y publico ahora");
    }

    @Override
    public void postergar() {
        System.out.println("Soy una curiosidad y postergo");
    }
    
}
