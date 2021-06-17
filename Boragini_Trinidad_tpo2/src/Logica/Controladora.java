package Logica;

import Persistencia.ControladoraPersistencia;
import javax.swing.JOptionPane;

public class Controladora {

    ControladoraPersistencia ctrlPersistencia = new ControladoraPersistencia();
    
    public void altaCliente(int num_cliente, String nombre_perro, String raza, String color, String alergico, String atencion_especial, String nombre_duenio, String celular_duenio, String observaciones) {

        MascotaCliente cliente = new MascotaCliente();

        cliente.setNum_cliente(num_cliente);
        cliente.setNombre_perro(nombre_perro);
        cliente.setRaza(raza);
        cliente.setColor(color);
        cliente.setAlergico(alergico);
        cliente.setAtencion_especial(atencion_especial);
        cliente.setNombre_duenio(nombre_duenio);
        cliente.setCelular_duenio(celular_duenio);
        cliente.setObservaciones(observaciones);

        ctrlPersistencia.altaCliente(cliente);
        
        JOptionPane.showMessageDialog(null, "Carga de cliente realizada con éxito.");

    }

}
