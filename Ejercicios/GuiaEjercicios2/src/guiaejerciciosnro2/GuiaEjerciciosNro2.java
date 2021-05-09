package guiaejerciciosnro2;

import java.util.Scanner;

public class GuiaEjerciciosNro2 {

    public static void main(String[] args) {

        /*1.a. Realizar un programa que muestre por pantalla los números de 1 a 35 (uno abajo del otro).
        Utilizar para esto alguna estructura repretitiva.
        for (int i=1;i<=35;i++){
            System.out.println("Número " + i);
        }*/

 /* 1.b. Realizar un programa que dado por teclado un límite numérico (por ejemplo 100)
        muestre en pantalla todos los números hasta ese límite (empezando por 1)
        int contador = 1;

        System.out.println("Ingrese un número entero mayr que 0: ");        
        Scanner teclado =  new Scanner (System.in);
        int numero = teclado.nextInt();

        while (contador <= numero){

            System.out.println("Numero " + contador);
            contador = contador + 1;

        }*/

 /* 1.c Realizar un programa que muestre por pantalla los números del 200 al 250 saltando
        de dos en dos. La secuencia debería ser: 200...202...204...etc.*/
        //OPCION 1
        /*
        int contador = 200;

        while (contador <=250){
            System.out.println("Número: " + contador);

            contador = contador + 2;
        }

        //OPCION 2

        for (int i=200;i<=250;i=i+2){
            System.out.println("Número " + i);
        }*/
 /* 1.d Realizar un programa que lleve a cabo la cuenta regresiva para el año nuevo.
        La cuenta debe comenzar en 0 y terminar en 1.
        for(int i=10;i>0;i--){
            System.out.println("Falta " + i + " para Año Nuevo!!");
        }
 
        //OPCION 2

        int cont = 10;

        while (cont >0 && cont<=10){
            System.out.println("Falta " + cont + " para Año Nuevo!!");
            cont = cont - 1;
        }*/
 /* 1.e Realizar un programa que muestre por pantalla palabras que sean ingresadas por teclado
        hasta que se ingrese la palabra "salir"
        
        System.out.println("Ingrese una palabra: ");        
        Scanner teclado =  new Scanner (System.in);
        String palabra = teclado.next();

        while (!palabra.equalsIgnoreCase("salir")){

            System.out.println("La palabra ingresada fue " + palabra);
            System.out.println("Ingrese una palabra: ");        
            palabra = teclado.next();
        }*/

 /*Ejercicio 2.a.
        
        Un gerente de una empresa prestadora de servicios de internet necesita un programa que
        permita realizar el cálculo del monto a pagar de la factura de consumo de internet de 5
        clientes de una empresa. Para ello, el algoritmo debe solicitar por teclado dos datos: DNI
        del cliente y el tipo de servicio. Los tipos de servicio son 3:
        i. Internet 30 megas (cuyo valor es de $890 – 10% de descuento)
        ii. Internet 50 megas (Cuyo valor es de $1050 – 5% de descuento) 
        iii. Internet 100 megas (Cuyo valor fijo es de $1600)
        El programa debe poder calcular el monto a pagar (dependiendo del tipo de servicio con el
        que cuente el cliente) e informar por pantalla el DNI del mismo junto con el monto a pagar
        y el número de servicio con el que cuenta.*/
 
        
        for (int cont = 0; cont < 6; cont++) {

            System.out.println("Ingrese su DNI: ");
            Scanner teclado = new Scanner(System.in);
            String dni = teclado.next();

            System.out.println("Ingrese el tipo de servicio: 1: Internet 30 megas - 2:Internet 50 megas - 3: Internet 100 megas");
            Scanner teclado2 = new Scanner(System.in);
            int tipoServicio = teclado2.nextInt();
            
            double montoAPagar = 0;
            
            if ((tipoServicio == 1) || (tipoServicio == 2) || (tipoServicio == 3)) {
                
                if (tipoServicio == 1) {
                    montoAPagar = montoAPagar + (890 * 0.9);
                } else if (tipoServicio == 2) {
                    montoAPagar = montoAPagar + (1050 * 0.95);
                } else {
                    montoAPagar = montoAPagar + 1600;
                }

                System.out.print("Dni del cliente " + (cont + 1) + ": " + dni);
                System.out.print(" Tipo de servicio: " + tipoServicio);
                System.out.println(" Monto a pagar: " + montoAPagar);

            }else{
                System.out.println("El valor ingresado no es válido");
                cont --;
                
            }
            
              
                      

            /*Ejercicio 2.b.
        Un niño de primaria necesita realizar 10 cálculos diferentes entre dos números. Para esto
        necesita un programa que, para cada cálculo, permita el ingreso de los dos números por
        separado al igual que la operación que desea hacer entre ambos. Al mismo tiempo debe
        poder realizar el cálculo en cuestión y mostrar el resultado por pantalla.
        double num1, num2, resultado = 0;
        String operador;

        for (int cont = 0; cont < 3; cont++) {

            System.out.println("Ingrese el primer número: ");
            Scanner teclado = new Scanner(System.in);
            num1 = teclado.nextDouble();

            System.out.println("Ingrese el primer número: ");
            num2 = teclado.nextDouble();

            System.out.println("Ingrese el operador: ");
            operador = teclado.next();

            if (operador.equals("+")) {
                resultado = num1 + num2;
            } else {
                if (operador.equals("-")) {
                    resultado = num1 - num2;
                } else {
                    if (operador.equals("*")) {
                        resultado = num1 * num2;
                    } else {
                        if (operador.equals("/")) {
                            if (num2 == 0) {
                                System.out.println("No existe la división por 0, la operación no se puede realizar.");
                            }
                        }
                        resultado = num1 / num2;

                    }
                }
            }

            System.out.println("El resultado es: " + resultado);

        }*/
        }
    }
}
