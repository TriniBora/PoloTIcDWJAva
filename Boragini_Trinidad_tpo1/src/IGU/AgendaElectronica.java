package IGU;

import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 * @author Trinidad Boragini Desarrollo Web full stack con Java Prof. Ing.
 * Luisina de Paula
 */
public class AgendaElectronica extends javax.swing.JFrame {

    /*Declaración de los vectores donde se almacenarán cada uno de los datos
    ingresados en los campos de texto por el usuario*/
    
    String dniVector[] = new String[10];
    String nombresVector[] = new String[10];
    String apellidosVector[] = new String[10];
    String direccionVector[] = new String[10];
    String telefonoVector[] = new String[10];
    String fechaNacVector[] = new String[10];

    //Declaración e incialización del índice de la agenda en 0
    
    int indiceLogica = 0;

    public AgendaElectronica() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        labelAgenda = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        separador2 = new javax.swing.JSeparator();
        labelDNI = new javax.swing.JLabel();
        labelNombres = new javax.swing.JLabel();
        labelApellidos = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        labelFechaNac = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();
        nombres = new javax.swing.JTextField();
        apellidos = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        fechaNac = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        labelIndice = new javax.swing.JLabel();
        indice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(255, 204, 153));

        labelAgenda.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 30)); // NOI18N
        labelAgenda.setForeground(new java.awt.Color(102, 0, 0));
        labelAgenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAgenda.setText("Agenda Electrónica ");

        separador1.setBackground(new java.awt.Color(255, 255, 255));
        separador1.setForeground(new java.awt.Color(204, 102, 0));

        separador2.setBackground(new java.awt.Color(255, 255, 255));
        separador2.setForeground(new java.awt.Color(204, 102, 0));

        labelDNI.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        labelDNI.setForeground(new java.awt.Color(0, 0, 0));
        labelDNI.setText("DNI: ");

        labelNombres.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        labelNombres.setForeground(new java.awt.Color(0, 0, 0));
        labelNombres.setText("Nombres:");

        labelApellidos.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        labelApellidos.setForeground(new java.awt.Color(0, 0, 0));
        labelApellidos.setText("Apellidos:");

        labelDireccion.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        labelDireccion.setForeground(new java.awt.Color(0, 0, 0));
        labelDireccion.setText("Dirección:");

        labelTelefono.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        labelTelefono.setForeground(new java.awt.Color(0, 0, 0));
        labelTelefono.setText("Teléfono:");

        labelFechaNac.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        labelFechaNac.setForeground(new java.awt.Color(0, 0, 0));
        labelFechaNac.setText("Fecha.Nac:");

        dni.setBackground(new java.awt.Color(255, 255, 255));
        dni.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        dni.setForeground(new java.awt.Color(0, 0, 0));

        nombres.setBackground(new java.awt.Color(255, 255, 255));
        nombres.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        nombres.setForeground(new java.awt.Color(0, 0, 0));

        apellidos.setBackground(new java.awt.Color(255, 255, 255));
        apellidos.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        apellidos.setForeground(new java.awt.Color(0, 0, 0));

        direccion.setBackground(new java.awt.Color(255, 255, 255));
        direccion.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        direccion.setForeground(new java.awt.Color(0, 0, 0));

        telefono.setBackground(new java.awt.Color(255, 255, 255));
        telefono.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        telefono.setForeground(new java.awt.Color(0, 0, 0));

        fechaNac.setBackground(new java.awt.Color(255, 255, 255));
        fechaNac.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        fechaNac.setForeground(new java.awt.Color(0, 0, 0));

        btnGuardar.setBackground(new java.awt.Color(102, 0, 0));
        btnGuardar.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSiguiente.setBackground(new java.awt.Color(153, 51, 0));
        btnSiguiente.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguiente.setText("SIGUIENTE");
        btnSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnAnterior.setBackground(new java.awt.Color(153, 51, 0));
        btnAnterior.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        btnAnterior.setForeground(new java.awt.Color(255, 255, 255));
        btnAnterior.setText("ANTERIOR");
        btnAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        labelIndice.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        labelIndice.setForeground(new java.awt.Color(102, 0, 0));
        labelIndice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIndice.setText("ÍNDICE");

        indice.setEditable(false);
        indice.setBackground(new java.awt.Color(255, 255, 255));
        indice.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        indice.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelAgenda)
                .addGap(181, 181, 181))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addComponent(labelNombres)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addComponent(labelApellidos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addComponent(labelDNI)
                                        .addGap(47, 47, 47)
                                        .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addComponent(labelFechaNac)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                                        .addComponent(labelTelefono)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addComponent(labelDireccion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(btnAnterior)
                                .addGap(43, 43, 43)
                                .addComponent(btnGuardar)
                                .addGap(42, 42, 42)
                                .addComponent(btnSiguiente))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(labelIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(indice, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(161, 161, 161)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labelAgenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDNI)
                    .addComponent(labelDireccion)
                    .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombres)
                    .addComponent(labelTelefono)
                    .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelApellidos)
                    .addComponent(labelFechaNac)
                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        /*Al apretar el botón "GUARDAR", se guardan en la posición que indica la
        variable indiceLogica de los respectivos vectores, los valores de cada
        campo de texto
        Asignación del texto a mostrar en el campo de texto "Índice"
        El valor que mostrará es el de la variable "indiceLógica"
        Como indiceLógica es del tipo int, se lo convierte a String*/
                
        indice.setText(String.valueOf(indiceLogica));

        /*Asignación de los valores escritos por el usuario en cada campo de
        texto, en cada vector, en la posición que indica "indiceLógica"*/
        
        dniVector[indiceLogica] = dni.getText();
        nombresVector[indiceLogica] = nombres.getText();
        apellidosVector[indiceLogica] = apellidos.getText();
        direccionVector[indiceLogica] = direccion.getText();
        telefonoVector[indiceLogica] = telefono.getText();
        fechaNacVector[indiceLogica] = fechaNac.getText();

        /*A continuación se valida que todos los campos de texto estén completos,
        en caso de que alguno esté vacío, se muestra un mensaje de alerta que
        indica el campo sin completar.
        Como no lo vimos en clase, no lo incluyo en el programa.
        
        if (dniVector[indiceLogica].isEmpty()) {
            JOptionPane.showMessageDialog(null, "Falta ingresar DNI");
        }
        if (nombresVector[indiceLogica].isEmpty()) {
            JOptionPane.showMessageDialog(null, "Falta ingresar NOMBRES");
        }
        if (apellidosVector[indiceLogica].isEmpty()) {
            JOptionPane.showMessageDialog(null, "Falta ingresar APELLIDOS");
        }
        if (direccionVector[indiceLogica].isEmpty()) {
            JOptionPane.showMessageDialog(null, "Falta ingresar DIRECCIÓN");
        }
        if (telefonoVector[indiceLogica].isEmpty()) {
            JOptionPane.showMessageDialog(null, "Falta ingresar TELÉFONO");
        }
        if (fechaNacVector[indiceLogica].isEmpty()) {
            JOptionPane.showMessageDialog(null, "Falta ingresar FECHA NACIMIENTO");
        }*/

        /*Impresiones por consola para verificar que se están guardando los
        valores de los campos de texto en cada posicion del respectivo vector
        
        System.out.println("dni: " + dniVector[indiceLogica]);
        System.out.println("nombres: " + nombresVector[indiceLogica]);
        System.out.println("apellidos: " + apellidosVector[indiceLogica]);
        System.out.println("direccion: " + direccionVector[indiceLogica]);
        System.out.println("telefono: " + telefonoVector[indiceLogica]);
        System.out.println("fecha nacimiento: " + fechaNacVector[indiceLogica]);
        System.out.println("indice: " + indiceLogica);*/

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed

        /*Al apretar el botón "SIGUIENTE", se tiene en cuenta el valor de
        "indiceLogica".
        Si su valor es menor que la longitud del vector (10), entonces se
        cargan en los campos de texto de la agenda los valores almacenados
        en la posicion indiceLogica+1 de cada vector. Luego se incrementa en 1
        el valor de indiceLogica.
        Si su valor es igual a 9, entonces se cargan en los campos de texto
        de la agenda los valores almacenados en la posicion indiceLogica
        de cada vector y no se incrementa el valor de indiceLogica.*/
                
        if (indiceLogica < 9) {
            dni.setText(dniVector[indiceLogica + 1]);
            nombres.setText(nombresVector[indiceLogica + 1]);
            apellidos.setText(apellidosVector[indiceLogica + 1]);
            direccion.setText(direccionVector[indiceLogica + 1]);
            telefono.setText(telefonoVector[indiceLogica + 1]);
            fechaNac.setText(fechaNacVector[indiceLogica + 1]);
            indiceLogica++;
            indice.setText(String.valueOf(indiceLogica));
        } else {
            if (indiceLogica == 9) {
                dni.setText(dniVector[indiceLogica]);
                nombres.setText(nombresVector[indiceLogica]);
                apellidos.setText(apellidosVector[indiceLogica]);
                direccion.setText(direccionVector[indiceLogica]);
                telefono.setText(telefonoVector[indiceLogica]);
                fechaNac.setText(fechaNacVector[indiceLogica]);
                indice.setText(String.valueOf(indiceLogica));
            }
        }

    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed

        /*Al apretar el botón "ANTERIOR", se tiene en cuenta el valor de
        "indiceLogica". Si su valor es mayor que 0, entonces se cargan en los
        campos de texto de la agenda los valores almacenados en la posicion
        indiceLogica-1 de cada vector.
        Luego se decrementa en 1 el valor de indiceLogica.*/
        
        if (indiceLogica > 0) {
            dni.setText(dniVector[indiceLogica - 1]);
            nombres.setText(nombresVector[indiceLogica - 1]);
            apellidos.setText(apellidosVector[indiceLogica - 1]);
            direccion.setText(direccionVector[indiceLogica - 1]);
            telefono.setText(telefonoVector[indiceLogica - 1]);
            fechaNac.setText(fechaNacVector[indiceLogica - 1]);
            indiceLogica--;
            indice.setText(String.valueOf(indiceLogica));
        }

    }//GEN-LAST:event_btnAnteriorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField dni;
    private javax.swing.JTextField fechaNac;
    private javax.swing.JTextField indice;
    private javax.swing.JLabel labelAgenda;
    private javax.swing.JLabel labelApellidos;
    private javax.swing.JLabel labelDNI;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelFechaNac;
    private javax.swing.JLabel labelIndice;
    private javax.swing.JLabel labelNombres;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JTextField nombres;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}