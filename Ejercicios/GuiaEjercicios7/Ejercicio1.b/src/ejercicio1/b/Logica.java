package ejercicio1.b;

public class Logica {

    public static void main(String[] args) {
        
        Mueble mueble1 = new Mueble("Mesa", 0.8, 0.7, "Hierro", 2);
        Mueble mueble2 = new Mueble("Estantería", 0.5, 1.2, "Vidrio", 5);
        Mueble mueble3 = new Mueble("Sofá", 0.90, 1.5, "Cuero", 1);
        
        
        mueble1.mostrarDatos(mueble1);
        mueble2.mostrarDatos(mueble2);
        mueble3.mostrarDatos(mueble3);
        
        mueble1.setMaterial("Madera");
        mueble2.setMaterial("Madera");
        mueble3.setMaterial("Madera");
        
        mueble1.mostrarDatos(mueble1);
        mueble2.mostrarDatos(mueble2);
        mueble3.mostrarDatos(mueble3);
    }
    
}
