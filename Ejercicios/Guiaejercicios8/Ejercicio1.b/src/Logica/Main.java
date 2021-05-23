package Logica;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        
        Fruta frutas[] = new Fruta[5];
        /*Para cuando pido ingreso por teclado de cada fruta, inicializo los objetos vacíoa
        Fruta frut1 = new Fruta();
        Fruta frut2 = new Fruta();
        Fruta frut3 = new Fruta();
        Fruta frut4 = new Fruta();
        Fruta frut5 = new Fruta();*/
        
        
        Fruta frut1 = new Fruta("Naranja", "Anaranjado", 80, "Rugosa", true);
        Fruta frut2 = new Fruta("Manzana", "Verde", 69, "Lisa", true);
        Fruta frut3 = new Fruta("Banana", "Amarilla", 93, "Lisa moteada", true);
        Fruta frut4 = new Fruta("Mandarina", "Anaranjado", 75, "Rugosa", true);
        Fruta frut5 = new Fruta("Pera", "Amarilla", 55, "Lisa", true);
        
        
        frutas[0] = frut1;
        frutas[1] = frut2;
        frutas[2] = frut3;
        frutas[3] = frut4;
        frutas[4] = frut5;
        
        //Otra opción, pidiendo por teclado cada fruta
        
        //Scanner teclado =  new Scanner (System.in);
        
        /*
        for(int i=0;i<frutas.length;i++){
            System.out.println("Ingrese el nombre de la fruta: ");        
            frutas[i].setNombre(teclado.next());
            System.out.println("Ingrese el color de la cáscara: ");        
            frutas[i].setColor(teclado.next());
            System.out.println("Ingrese la cantidad de calorías: ");        
            frutas[i].setCalorias(teclado.nextDouble());
            System.out.println("Ingrese el tipo de cáscara: ");        
            frutas[i].setTipoCascara(teclado.next());
            System.out.println("Ingrese true si es comestible o false si no lo es ");        
            frutas[i].setEsComestible(teclado.nextBoolean());
        }*/
        
        //Recorrido y lectura
        for(int i=0;i<frutas.length;i++){
            System.out.println("La " + frutas[i].getNombre() + " tiene " + frutas[i].getCalorias() + " calorías.");   
        }
        
        //Modificación del objeto y actualización en el vector
        frut1.setCalorias(45);
        frutas[0]=frut1;
        frut2.setCalorias(50);
        frutas[1]=frut2;
        frut3.setCalorias(89);
        frutas[2]=frut3;
        
        //Recorrido y lectura
        for(int i=0;i<frutas.length;i++){
            System.out.println("La " + frutas[i].getNombre() + " tiene " + frutas[i].getCalorias() + " calorías.");   
        }
        
        //Recorrido y lectura con una condición
        for(int i=0;i<frutas.length;i++){
            if(frutas[i].getColor().equalsIgnoreCase("Verde")){
                System.out.println("Soy verde");
                System.out.println("La " + frutas[i].getNombre() + " tiene " + frutas[i].getCalorias() + " calorías.");   
        } 
        }
        
        
         
        
    }
    
}
