
package Logica;

public class Main {

    public static void main(String[] args) {
        
        Noticia noti = new Noticia();
        Curiosidad curi = new Curiosidad();
        Blog blog = new Blog();
        Adivinanza adi = new Adivinanza();
        Crucigrama cruci = new Crucigrama();
        
        noti.publicarNoticia();
        
        curi.publicarAhora();
        curi.postergar();
        
        blog.publicarAhora();
        blog.postergar();
        
        adi.publicarResolucion();
        
        cruci.publicarResolucion();
        
    }
    
}
