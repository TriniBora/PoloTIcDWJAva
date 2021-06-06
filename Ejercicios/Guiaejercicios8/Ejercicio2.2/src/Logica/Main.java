package Logica;

public class Main {

    public static void main(String[] args) {
        
        //Creo el vector de la clase padre vehiculso
        Vehiculo vehiculos [] = new Vehiculo[9];
        
        //Creo los objetos de las clases hijas
        
        Auto auto1 = new Auto("Cuero", 75, "AAA000", "IJSIHUSA6766SS", "2.0", "Gris", "Peugeot", "307", 3);
        Auto auto2 = new Auto("Sintético", 90, "FRT332", "DOIAJIAJ876", "1.6", "Blanco", "Ford", "KA", 3);
        Auto auto3 = new Auto("Cuero", 120, "HYR456", "DKOQIDJ77", "2.0", "Negro", "Audi", "TT", 2);
        
        Moto moto1 = new Moto(650, "Cuero", "KIU888", "JSHAUHD6565", "1", "Azul", "Honda", "CB650", 1);
        Moto moto2 = new Moto(1043, "Sintético", "ERT532", "KKAMSIJAIJIA77", "4", "Rojo", "Kawasaki", "Ninja 1000", 1);
        Moto moto3 = new Moto(250, "Cuero", "JUY777", "KJKS5A56", "1", "Plateado", "Vento", "Rocketman Racing", 1);
        
        Colectivo colec1 = new Colectivo(true, true, "Urbano", "JIZ654", "JIOJDAAUS77", "3.0", "Celeste", "Neobus", "Spectrum 325", 50);
        Colectivo colec2 = new Colectivo(true, false, "Turismo", "SER333", "OPPOKPODAa765", "2.5", "Amarillo", "Corwin", "Tourist", 35);
        
        Camion camion1 = new Camion(true, 2, "SER876", "JIDJASY533", "4.0", "Azul", "Scania", "G500A6x4HA", 1);
        
        //Cargo en el vector los distintos vehiculos
        vehiculos [0] = auto1;
        vehiculos [1] = auto2;
        vehiculos [2] = auto3;
        vehiculos [3] = moto1;
        vehiculos [4] = moto2;
        vehiculos [5] = moto3;
        vehiculos [6] = colec1;
        vehiculos [7] = colec2;
        vehiculos [8] = camion1;
        
        //Recorro el vector y ejecuto el método de cada elemento del vector        
        for (int i=0;i<vehiculos.length;i++){
            vehiculos[i].mostrarMensaje();
            }
                
    }
    
}
