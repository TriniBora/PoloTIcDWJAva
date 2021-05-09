package guiaejerciciosnro3;

import java.util.Scanner;

public class GuiaEjerciciosNro3 {

    public static void main(String[] args) {
        
    /*//Ejercicio 1.a
    String nombres[] = new String[8];
    
    nombres[0] = "Alejandra";
    nombres[1] = "Leonardo";
    nombres[2] = "Rosa";
    nombres[3] = "Guillermo";
    nombres[4] = "Gabriel";
    nombres[5] = "Daniel";
    nombres[6] = "Luisa";
    nombres[7] = "Ludmila";
            
    for(int i=0;i<nombres.length;i++){
            
            System.out.println("El nombre en la posición " + i + " es: " + nombres[i] );
        }*/
    
/*    
//Ejercicio 1.b
    int numeros [] = new int [10];
    int mayor, menor;
    mayor = menor = numeros[0];
        
    Scanner teclado = new Scanner(System.in);
        
    for(int i=0;i<numeros.length;i++){
        System.out.println("Ingrese el número para la posición " + i + ": ");
        numeros[i] = teclado.nextInt();
        System.out.println("El número ingresado es: " + numeros[i]);
          
    }
    
    for(int i=0;i<numeros.length;i++){
        if(numeros[i] > mayor){
            mayor = numeros[i];
        }
        if(numeros[i] < menor){
            menor = numeros[i];
        }
    }
    
        System.out.println("El mayor número del arreglo es el " + mayor + " y el menor es el " + menor);
        
    }*/
    
    /*
    //Ejercicio 1.c
    int numeros [] = new int [15];
    int contador = 0;
            
    Scanner teclado = new Scanner(System.in);
        
    for(int i=0;i<numeros.length;i++){
        System.out.println("Ingrese el número para la posición " + i + ": ");
        numeros[i] = teclado.nextInt();
        System.out.println("El número ingresado es: " + numeros[i]);
    }
    
    for(int i=0;i<numeros.length;i++){
        if(numeros[i] == 3){
            contador = contador + 1;
        }
    }
    
        System.out.println("El número 3 está cargado " + contador + " veces en el arreglo");
        
    }*/
    /*
    //Ejercicio 1.d
    double sueldos [] = new double [12];
    double suma = 0;
            
    Scanner teclado = new Scanner(System.in);
        
    for(int i=0;i<sueldos.length;i++){
        System.out.println("Ingrese el sueldo correspondiente al mes " + (i+1) + ": ");
        sueldos[i] = teclado.nextDouble();
        System.out.println("El sueldo ingresado es: $" + sueldos[i]);
    }
    
    for(int i=0;i<sueldos.length;i++){
        suma = suma + sueldos[i];
        }
    
    System.out.println("El total anual es $" + suma + " y el promedio es $" + suma/12);
    */

    /*
    //Ejercicio 1.e
    String ciudades[] = new String [5];
    int minimas [] = new int [5];
    int maximas [] = new int [5];
            
    Scanner teclado = new Scanner(System.in);
    Scanner teclado2 = new Scanner(System.in);
        
    for(int i=0;i<ciudades.length;i++){
        System.out.println("Ingrese el nombre de la ciudad de la posicion: " + i);
        ciudades[i] = teclado.next();
        System.out.println("La ciudad ingresada es: " + ciudades[i]);
        
        System.out.println("Ingrese la minima temperatura de " + ciudades[i] + ": ");
        minimas[i] = teclado2.nextInt();
        System.out.println("La mínima ingresada es: " + minimas[i]);
        
        System.out.println("Ingrese la máxima temperatura de " + ciudades[i] + ": ");
        maximas[i] = teclado2.nextInt();
        System.out.println("La máxima ingresada es: " + maximas[i]);
    }
    
    //determinar la mínima
    int minima = minimas[0];
    int posicionMinima = -1;
    
    for(int i=0;i<minimas.length;i++){
        
        if(minimas[i] < minima){
            minima = minimas[i];
            posicionMinima = i;
        }
        
    }
    
    System.out.println("La mínima temperatura es " + minima + " y corresponde a la ciudad de " + ciudades[posicionMinima]);
    
    //determinar la máxima
    int maxima = maximas[0];
    int posicionMaxima = -1;
    
    for(int i=0;i<maximas.length;i++){
        
        if(maximas[i] > maxima){
            maxima = maximas[i];
            posicionMaxima = i;
        }
        
    }
    
    System.out.println("La máxima tenperatura es " + maxima + " y corresponde a la ciudad de " + ciudades[posicionMaxima]);
        
    }*/
    
    /*
    //Ejercicio 2.a
    
    int matriz [][] = new int [4][5];
       
    for(int f=0; f<4; f++){
        for(int c=0; c<5; c++){
               matriz [f][c] = 5;
               System.out.println("Celda (" + f + ", " + c + "), el valor ingresado es: " + matriz[f][c]);
        }*/
    
    /*
    //Ejercicio 2.b
    
    int matriz [][] = new int [6][6];
       
    for(int f=0; f<6; f++){
        for(int c=0; c<6; c++){
            
            if(f == c){
                matriz [f][c] = 1;
                System.out.println("Celda (" + f + ", " + c + "), el valor ingresado es: " + matriz[f][c]);
            }
            else{
                    matriz [f][c] = 0;
                    System.out.println("Celda (" + f + ", " + c + "), el valor ingresado es: " + matriz[f][c]);
            }
            
        }*/
    
/*    
    //Ejercicio 2.c
    
    String razas [][] = new String [3][3];
       
    Scanner teclado = new Scanner(System.in);
    
    //carga de la matriz y muestra de lo cargado
    for(int f=0; f<3; f++){
        for(int c=0; c<3; c++){
            System.out.println("Ingrese la raza para la posición (" + f + ", " + c + ")");
            //guardo en la matriz la nota obtenida por teclado
            razas [f][c] =teclado.next();
            System.out.println("La raza ingresada en la posición (" + f + ", " + c + ") es: " + razas[f][c]);
        }
    }    
    
    //buscar la raza indicada
    String raza;
    int fila = -1;
    int columna = -1;
    
    System.out.println("Ingrese la raza a buscar: " );
    raza = teclado.next();
    
    for(int f=0; f<3; f++){
        for(int c=0; c<3; c++){
            if(raza.equals(razas[f][c])){
                fila = f;
                columna = c;
            }    
        }
    }
    //mostrar posicion si la encuentra, mensaje son error si no la encuentra
    if (fila != -1 && columna != -1){
        System.out.println("La raza " + raza + " está cargada en la posición (" + fila + ", " + columna + ")");
    }
    else{
        System.out.println("La raza " + raza + " no está cargada en la matriz");
            }
    }*/

    /*
    //Ejercicio 2.d.
    
    double notas [][] = new double [4][4];
       
    Scanner teclado = new Scanner(System.in);
    
    double suma = 0;
    
    //carga de la matriz
    for(int f=0; f<4; f++){
        System.out.println("Cargar las tres notas para el alumno " + (f+1));
        for(int c=0; c<3; c++){
            //guardo en la matriz la nota obtenida por teclado
            notas [f][c] =teclado.nextDouble();
            //voy sumando/acumulando en cada vuelta cada nota desp sacar el promedio
            suma = suma + notas [f][c];
        }
        //cargo el promedio en la columna correspondiente
        notas[f][3] = suma / 3;
        suma = 0;
    }    
    
    //mostrar los elementos de la matriz
    for(int f=0; f<4; f++){
        System.out.println("Las notas y promedio del alumno " + (f+1) + " son: ");
        for(int c=0; c<4; c++){
            System.out.println(notas[f][c]);
        }
    
    }*/
    
    //Ejercicio 2.e
    
    int vuelos [][] = new int [6][3];
       
    Scanner teclado = new Scanner(System.in);
    
    //carga de la matriz
    for(int f=0; f<6; f++){
        //vuelos [f][0] = f; 
        System.out.println("Cargar la cantidad de asientos para cada vuelo (0-Mañana 1-Mediodía 2-Noche) del destino " + f );
        for(int c=0; c<3; c++){
            //guardo los datos obtenidos por teclado
            vuelos [f][c] =teclado.nextInt();
        }
    }    
    
    String finalizar = "";
    
    while (!finalizar.equals("FINISH")){
        
        //ingresar el número de destino, nro de vuelo y cantidad de asientos que necesita
        int destino, vuelo, asientos;

        System.out.println("Ingrese el número de destino al que quiere viajar:\n0-Río de Janeiro \n1-Cancún \n2-Madrid \n3-Roma \n4-Milán \n5-Iguazú");
        destino = teclado.nextInt();
        System.out.println("Ingrese el número de vuelo:\n0-Mañana \n1-Mediodía \n2-Noche");
        vuelo = teclado.nextInt();
        System.out.println("Ingrese la cantidad de asientos que necesita: ");
        asientos = teclado.nextInt();

        if(vuelos[destino][vuelo] >= asientos){
            System.out.println("Su reserva fue realizada con éxito.");
        }
        else{
            System.out.println("Disculpe, no se pudo completar su operación dado que no hay asientos disponibles");
        }
        
        System.out.println("¿Desea realizar otra reserva? Escriba 'SI' para consinuar o 'FINISH' para salir.");
        finalizar = teclado.next();
      
    }
      
    }
    
}
    


