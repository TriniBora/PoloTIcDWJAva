package Logica;

public class Controladora {
    
    Alumno vectorAlu [] = new Alumno[4];
    
    public void agregarAlumno(String dni, String nombre, String apellido){
        
        //Creo un alumno
        Alumno alu = new Alumno();
        
        //Seteo datos
        //Convierto dni texto a numero 
        int dniNro = Integer.parseInt(dni);
        alu.setDni(dniNro);
        
        alu.setApellido(apellido);
        alu.setNombre(nombre);
        
        
        //Recorro el vector y cargo alumno donde esté vacío
        //Salgo del bucle una vez cargado
        for(int i=0; i<vectorAlu.length; i++){
            
            if(vectorAlu[i] == null){//si esta vacio en esa posicion puedo insertar
                vectorAlu[i] = alu;
                i = vectorAlu.length;
            }
        }
        
        //Muestro por consola los alumnos cargados
        for(int i=0; i<vectorAlu.length; i++){    
            if (vectorAlu[i] != null){
                System.out.println("Alumno posicion: " + i + " Nombre: " + vectorAlu[i].getNombre());
            }
        }
    }
    
    public Alumno traerAlumno(int indice) {
        
        return vectorAlu[indice];
    }
    
}
