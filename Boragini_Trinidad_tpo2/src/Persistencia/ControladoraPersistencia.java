package Persistencia;

import Logica.MascotaCliente;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    MascotaClienteJpaController jpaCliente = new MascotaClienteJpaController();
    
    public void altaCliente (MascotaCliente cliente){
        
        try {
            jpaCliente.create(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
