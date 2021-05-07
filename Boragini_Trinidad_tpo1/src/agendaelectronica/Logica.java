package agendaelectronica;

import IGU.AgendaElectronica;
/**
 * @author Trinidad Boragini
 * Desarrollo Web full stack con Java
 * Prof. Ing. Luisina de Paula
 */
public class Logica {

    public static void main(String[] args) {
        
        /*Instancia del objeto agenda del tipo AgendaElectronica; se lo hace visible
        y se lo ubica por defecto en el centro de la pantalla del dispositivo*/
        
        AgendaElectronica agenda = new AgendaElectronica();
        agenda.setVisible(true);
        agenda.setLocationRelativeTo(null);
                 
    }
    
    
}
