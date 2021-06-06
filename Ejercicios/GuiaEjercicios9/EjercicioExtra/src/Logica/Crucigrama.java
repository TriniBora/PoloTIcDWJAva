package Logica;

public class Crucigrama extends Articulo implements AdiCruci{

    public Crucigrama() {
    }

    @Override
    public void publicarResolucion() {
        System.out.println("Esta es la resolución del crucigrama");
    }
    
}
