package ejercicio2.pkg2;

public class Main {

    public static void main(String[] args) {
        
        Auto auto1 = new Auto("Cuero", 75, "AAA000", "IJSIHUSA6766SS", "2.0", "Gris", "Peugeot", "307", 3);
        Auto auto2 = new Auto("Sintético", 90, "FRT332", "DOIAJIAJ876", "1.6", "Blanco", "Ford", "KA", 3);
        Auto auto3 = new Auto("Cuero", 120, "HYR456", "DKOQIDJ77", "2.0", "Negro", "Audi", "TT", 2);
        
        Moto moto1 = new Moto(650, "Cuero", "KIU888", "JSHAUHD6565", "1", "Azul", "Honda", "CB650", 1);
        Moto moto2 = new Moto(1043, "Sintético", "ERT532", "KKAMSIJAIJIA77", "4", "Rojo", "Kawasaki", "Ninja 1000", 1);
        Moto moto3 = new Moto(250, "Cuero", "JUY777", "KJKS5A56", "1", "Plateado", "Vento", "Rocketman Racing", 1);
        
        Colectivo colec1 = new Colectivo(true, true, "Urbano", "JIZ654", "JIOJDAAUS77", "3.0", "Celeste", "Neobus", "Spectrum 325", 50);
        Colectivo colec2 = new Colectivo(true, false, "Turismo", "SER333", "OPPOKPODAa765", "2.5", "Amarillo", "Corwin", "Tourist", 35);
        
        Camion camion1 = new Camion(true, 2, "SER876", "JIDJASY533", "4.0", "Azul", "Scania", "G500A6x4HA", 1);
        
        auto1.mostrarMensaje();
        moto1.mostrarMensaje();
        colec1.mostrarMensaje();
        camion1.mostrarMensaje();
        
    }
    
}
