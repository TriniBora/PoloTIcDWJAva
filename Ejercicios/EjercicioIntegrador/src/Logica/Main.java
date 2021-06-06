package Logica;

import IGU.Principal;

public class Main {

    public static void main(String[] args) {
        
        Controladora control = new Controladora();
        
        Principal pantPrincipal = new Principal(control);
        pantPrincipal.setVisible(true);
        pantPrincipal.setLocationRelativeTo(null);
        
        
        
    }
    
}
