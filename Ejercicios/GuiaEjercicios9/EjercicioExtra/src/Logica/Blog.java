package Logica;

public class Blog extends Articulo implements CuriBlog{

    public Blog() {
    }

    @Override
    public void publicarAhora() {
        System.out.println("Blog publicado ahora");
    }

    @Override
    public void postergar() {
        System.out.println("Blog postergado");
    }
    
}
