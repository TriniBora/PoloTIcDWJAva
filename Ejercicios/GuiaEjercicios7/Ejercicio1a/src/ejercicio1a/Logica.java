package ejercicio1a;

public class Logica {

    public static void main(String[] args) {
       Auto auto1 = new Auto("Negro", "Peugeot", "307", "AAA555", 5);
       Auto auto2 = new Auto("Blanco", "Ford", "Ka", "AEI789", 3);
       Auto auto3 = new Auto("Gris", "Chrvrolet", "Corsa", "CDG654", 5);
       
       Auto auto4 = new Auto();
       
       auto1.mostrarDatos(auto1);
       auto2.mostrarDatos(auto2);
       auto3.mostrarDatos(auto3);
       
       auto4.getMarca(); //no muestra ningún valor, de mostrar algún valor, mostraría el seteado por defecto en el constructor       
    }
    
}
