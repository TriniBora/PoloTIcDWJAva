package guíaejercciciosnro1;

import java.util.Scanner;

public class GuíaEjercciciosNro1 {

    public static void main(String[] args) {
        
        //Ejercicio Nº 1: Tipos de datos, Variables y Operaciones 
        /* a. Declarar una variable de tipo entero, otra de tipo double y otra de tipo String. */
        
        //int varEntera;
        //double varDouble;
        //String varString;
        
        /*  b.Asignar un valor a la variable de tipo entero y asignar esta última a la variable de tipo
        double. ¿Existe un error? ¿Se puede hacer esta operación? */
        
        //varEntera = -46;
        //varDouble = varEntera;
        //System.out.println("varDouble = " + varDouble);
        
        /* Respuesta: Es posible realizar la asignación, no existe ningún error. */
        
        /* c. Asignar un valor a la variable de tipo double y asignar esta última a la variable de tipo
        entero. ¿Existe un error? ¿Se puede hacer esta operación? */
        
        //varDouble = 34.76;
        //varEntera = varDouble;
        //System.out.println("varEntera = " + varEntera);
        
        /* Respuesta: No es posible realizar la asignación. Se produce un error, que especifica una posible pérdida
        en la conversión de double a int. El código no se ejecuta. */
        
        /* d. Asignar el valor 35 a la variable de tipo String. ¿Existe un error? ¿Se puede hacer esta
        operación? */
        
        //varString = 35;
        //System.out.println("varString = " + varString);
        
        /* Respuesta: No es posible realizar la asignación. Se produce un error, que especifica que no puede convertirse
        int en el  tipo string. El código no se ejecuta. */
        
        /* e. Si quiero almacenar el número 48 en la variable String. ¿Cómo debo realizar la asignación?*/
        
        //varString = "48";
        //System.out.println("varString = " + varString);
 
        /* Respuesta: el 48 debe ir entre comillas dobles. */ 
        
        /* 2) Realizar un programa que permita el intercambio de valores entre dos variables. Por ejemplo:
        Si una variable numero vale 35, y una variable numero2 vale 20, realizar las acciones
        necesarias para que numero pase a valer 20 y numero2 pase a valer 35. Una vez realizado el
        cambio mostrar el resultado por pantalla. */
        
        /*int numero1 = 35;
        int numero2 = 20;
        int guardanumero;
        
        System.out.println("El primer número es " + numero1 + " y el segundo número es " + numero2);
        
        guardanumero = numero1;
        numero1 = numero2;
        numero2 = guardanumero;
        
        System.out.println("El primer número es ahora " + numero1 + " y el segundo número es ahora " + numero2);*/
                
        //Ejercicio Nº 2: Condicionales
        /* 1) Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos de los
        mismos pueden tener 3 categorías: 1- repositor, 2-cajero y 3-supervisor.

        a) Los repositores cobran $15.890 + un bono de 10%.
        b) Los cajeros cobran $25.630,89 fijos.
        c) Los supervisores cobran $35.560,20 en bruto al cual se les descuenta un 11% de jubilación. 
        Se necesita una aplicación que, dependiendo el tipo de empleado del que se trate, calcule y
        muestre en pantalla el correspondiente sueldo. */
        
        double sueldoEmpleado;
                
        System.out.println("Ingrese el número que corresponde a la categoría del/de la empleado/a: :  \n1 repositor/a \n2 cajero/a \n3 supervisor/a");        
        
        Scanner teclado =  new Scanner (System.in);
        int categoria = teclado.nextInt();
        
        if (categoria == 1) {
            sueldoEmpleado = 15890*1.1;
            System.out.println("El sueldo de un/a repositor/a es: $" + sueldoEmpleado);
        }
        if (categoria == 2) {
            sueldoEmpleado = 25630.89;
            System.out.println("El sueldo de un/a cajero/a es: $" + sueldoEmpleado);
        }
        if (categoria == 3) {
            sueldoempleado = 35560.2*0.89;
            System.out.println("El sueldo de un/a supervisor/a es: $" + sueldoEmpleado);
        }
    }
    
}
