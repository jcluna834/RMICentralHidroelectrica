package cliente;

import java.rmi.RemoteException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sop_rmi.*;

public class MenuAdmin extends javax.swing.JFrame {
    principal pr;
    IntMaestroZona obj;

    public MenuAdmin(IntMaestroZona obj, principal s) {
        initComponents();
        this.obj = obj;
        pr = s;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcion = new javax.swing.ButtonGroup();
        listaId = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaListaId = new javax.swing.JTextArea();
        solicitar = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldIdSolicitar = new javax.swing.JTextField();
        jButtonAceptarSolicitar = new javax.swing.JButton();
        jLabelNombre = new javax.swing.JLabel();
        consumoEnergia = new javax.swing.JFrame();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldIdConsumo = new javax.swing.JTextField();
        jButtonAceptarConsumoEnergia = new javax.swing.JButton();
        jTextFieldResConsumo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        modificar = new javax.swing.JFrame();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldIdModificar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldNNombre = new javax.swing.JTextField();
        jButtonAceptarModificar = new javax.swing.JButton();
        jLabelConf = new javax.swing.JLabel();
        modificarPass = new javax.swing.JFrame();
        jLabel7 = new javax.swing.JLabel();
        jButtonAceptarMP = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabelError = new javax.swing.JLabel();
        jPasswordFieldPass = new javax.swing.JPasswordField();
        jPasswordFieldPassConf = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButtonMenOpcAdm1 = new javax.swing.JRadioButton();
        jRadioButtonMenOpcAdm2 = new javax.swing.JRadioButton();
        jRadioButtonMenOpcAdm3 = new javax.swing.JRadioButton();
        jRadioButtonMenOpcAdm4 = new javax.swing.JRadioButton();
        jRadioButtonMenOpcAdm5 = new javax.swing.JRadioButton();

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Lista de sensores");

        jTextAreaListaId.setColumns(20);
        jTextAreaListaId.setRows(5);
        jScrollPane1.setViewportView(jTextAreaListaId);

        javax.swing.GroupLayout listaIdLayout = new javax.swing.GroupLayout(listaId.getContentPane());
        listaId.getContentPane().setLayout(listaIdLayout);
        listaIdLayout.setHorizontalGroup(
            listaIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaIdLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(listaIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                    .addGroup(listaIdLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(118, 118, 118)))
                .addContainerGap())
        );
        listaIdLayout.setVerticalGroup(
            listaIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaIdLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addGap(128, 128, 128))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setText("Digite el identificador");

        jButtonAceptarSolicitar.setText("Aceptar");
        jButtonAceptarSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarSolicitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout solicitarLayout = new javax.swing.GroupLayout(solicitar.getContentPane());
        solicitar.getContentPane().setLayout(solicitarLayout);
        solicitarLayout.setHorizontalGroup(
            solicitarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(solicitarLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(solicitarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(solicitarLayout.createSequentialGroup()
                        .addComponent(jLabelNombre)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(solicitarLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldIdSolicitar, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addGap(82, 82, 82))))
            .addGroup(solicitarLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jButtonAceptarSolicitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(142, 142, 142))
        );
        solicitarLayout.setVerticalGroup(
            solicitarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(solicitarLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(solicitarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldIdSolicitar))
                .addGap(44, 44, 44)
                .addComponent(jLabelNombre)
                .addGap(46, 46, 46)
                .addComponent(jButtonAceptarSolicitar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(62, 62, 62))
        );

        consumoEnergia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setText("Digite el identificador");

        jButtonAceptarConsumoEnergia.setText("Aceptar");
        jButtonAceptarConsumoEnergia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarConsumoEnergiaActionPerformed(evt);
            }
        });

        jTextFieldResConsumo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Consumo de energia:");

        javax.swing.GroupLayout consumoEnergiaLayout = new javax.swing.GroupLayout(consumoEnergia.getContentPane());
        consumoEnergia.getContentPane().setLayout(consumoEnergiaLayout);
        consumoEnergiaLayout.setHorizontalGroup(
            consumoEnergiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consumoEnergiaLayout.createSequentialGroup()
                .addGroup(consumoEnergiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(consumoEnergiaLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jButtonAceptarConsumoEnergia, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addGap(115, 115, 115))
                    .addGroup(consumoEnergiaLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consumoEnergiaLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(38, 38, 38)
                        .addComponent(jTextFieldIdConsumo)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consumoEnergiaLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jTextFieldResConsumo)
                        .addGap(59, 59, 59)))
                .addContainerGap())
        );
        consumoEnergiaLayout.setVerticalGroup(
            consumoEnergiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consumoEnergiaLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(consumoEnergiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldIdConsumo))
                .addGap(42, 42, 42)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldResConsumo, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addComponent(jButtonAceptarConsumoEnergia, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("Digite el identificador");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel8.setText("Nuevo nombre");

        jButtonAceptarModificar.setText("Aceptar");
        jButtonAceptarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout modificarLayout = new javax.swing.GroupLayout(modificar.getContentPane());
        modificar.getContentPane().setLayout(modificarLayout);
        modificarLayout.setHorizontalGroup(
            modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jButtonAceptarModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addGap(169, 169, 169))
            .addGroup(modificarLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modificarLayout.createSequentialGroup()
                        .addComponent(jLabelConf)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(modificarLayout.createSequentialGroup()
                        .addGroup(modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(modificarLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(37, 37, 37)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNNombre)
                            .addComponent(jTextFieldIdModificar))
                        .addGap(77, 77, 77))))
        );
        modificarLayout.setVerticalGroup(
            modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldIdModificar))
                .addGap(36, 36, 36)
                .addGroup(modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(jTextFieldNNombre))
                .addGap(18, 18, 18)
                .addComponent(jLabelConf)
                .addGap(11, 11, 11)
                .addComponent(jButtonAceptarModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel7.setText("Nueva contrasenia");

        jButtonAceptarMP.setText("Aceptar");
        jButtonAceptarMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarMPActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setText("Confirmar contrasenia");

        javax.swing.GroupLayout modificarPassLayout = new javax.swing.GroupLayout(modificarPass.getContentPane());
        modificarPass.getContentPane().setLayout(modificarPassLayout);
        modificarPassLayout.setHorizontalGroup(
            modificarPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarPassLayout.createSequentialGroup()
                .addGroup(modificarPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modificarPassLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(modificarPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelError)
                            .addGroup(modificarPassLayout.createSequentialGroup()
                                .addGroup(modificarPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(modificarPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPasswordFieldPassConf, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPasswordFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(modificarPassLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jButtonAceptarMP)))
                .addGap(27, 27, 27))
        );
        modificarPassLayout.setVerticalGroup(
            modificarPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarPassLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(modificarPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(modificarPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordFieldPassConf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelError)
                .addGap(45, 45, 45)
                .addComponent(jButtonAceptarMP, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Menu ADMINISTRADOR");

        jLabel2.setText("Escoja una opcion:");

        opcion.add(jRadioButtonMenOpcAdm1);
        jRadioButtonMenOpcAdm1.setText("Lista de identificadores");
        jRadioButtonMenOpcAdm1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonMenOpcAdm1MouseClicked(evt);
            }
        });

        opcion.add(jRadioButtonMenOpcAdm2);
        jRadioButtonMenOpcAdm2.setText("Solicitar el nombre de usuario");
        jRadioButtonMenOpcAdm2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonMenOpcAdm2MouseClicked(evt);
            }
        });

        opcion.add(jRadioButtonMenOpcAdm3);
        jRadioButtonMenOpcAdm3.setText("Modificar el nombre de usuario");
        jRadioButtonMenOpcAdm3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonMenOpcAdm3MouseClicked(evt);
            }
        });

        opcion.add(jRadioButtonMenOpcAdm4);
        jRadioButtonMenOpcAdm4.setText("Consumo energia");
        jRadioButtonMenOpcAdm4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonMenOpcAdm4MouseClicked(evt);
            }
        });

        opcion.add(jRadioButtonMenOpcAdm5);
        jRadioButtonMenOpcAdm5.setText("Modificar contrasenia");
        jRadioButtonMenOpcAdm5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonMenOpcAdm5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(174, 174, 174))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonMenOpcAdm4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonMenOpcAdm5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(45, 45, 45))
                    .addComponent(jRadioButtonMenOpcAdm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonMenOpcAdm2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonMenOpcAdm3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(66, 66, 66)))
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(61, 61, 61)
                .addComponent(jRadioButtonMenOpcAdm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(jRadioButtonMenOpcAdm2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(jRadioButtonMenOpcAdm3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(jRadioButtonMenOpcAdm4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(jRadioButtonMenOpcAdm5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonMenOpcAdm1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonMenOpcAdm1MouseClicked
        listaId.setBounds(0, 0, 500, 500);
        listaId.setVisible(true);
        List<Integer> idSensores;
        jTextAreaListaId.setText("");
        try {
            idSensores = obj.getIdentificadores();
            if (!idSensores.isEmpty()) {
                for(Integer i : idSensores)
                    jTextAreaListaId.append("Sensor ID: " + i +"\n");
            }else {
                //mensaje
            }
        } catch (RemoteException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jRadioButtonMenOpcAdm1MouseClicked

    private void jRadioButtonMenOpcAdm2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonMenOpcAdm2MouseClicked
        solicitar.setBounds(0, 0, 400, 300);
        solicitar.setVisible(true);
    }//GEN-LAST:event_jRadioButtonMenOpcAdm2MouseClicked

    private void jRadioButtonMenOpcAdm3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonMenOpcAdm3MouseClicked
        modificar.setBounds(0, 0, 400, 300);
        modificar.setVisible(true);
    }//GEN-LAST:event_jRadioButtonMenOpcAdm3MouseClicked

    private void jRadioButtonMenOpcAdm4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonMenOpcAdm4MouseClicked
        consumoEnergia.setBounds(0, 0, 400, 300);
        consumoEnergia.setVisible(true);
    }//GEN-LAST:event_jRadioButtonMenOpcAdm4MouseClicked

    private void jRadioButtonMenOpcAdm5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonMenOpcAdm5MouseClicked
        modificarPass.setBounds(0, 0, 400, 300);
        modificarPass.setVisible(true);
    }//GEN-LAST:event_jRadioButtonMenOpcAdm5MouseClicked

    private void jButtonAceptarMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarMPActionPerformed
        if (jPasswordFieldPass.getText().equals(jPasswordFieldPassConf.getText())) {
            pr.setContrasenia(jPasswordFieldPass.getText());
            jLabelError.setText("El cambio se realizo con exito");
        } else {
            jLabelError.setText("Las Contrasenias No Coinciden");
        }
    }//GEN-LAST:event_jButtonAceptarMPActionPerformed

    private void jButtonAceptarConsumoEnergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarConsumoEnergiaActionPerformed
        int aux = Integer.parseInt(jTextFieldIdConsumo.getText());
        double lectura = 0;
        try {
            lectura = obj.getLecturaSensor(aux);
        } catch (RemoteException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextFieldResConsumo.setText(Double.toString(lectura));
    }//GEN-LAST:event_jButtonAceptarConsumoEnergiaActionPerformed

    private void jButtonAceptarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarModificarActionPerformed
        int aux = Integer.parseInt(jTextFieldIdModificar.getText());
        String nNombre = jTextFieldNNombre.getText();
        try {
            boolean band = obj.setNombreUsuario(nNombre, aux);
            if (band) {
                jLabelConf.setText("El cambio se realizo con exito");
            } else {
                jLabelConf.setText("El cambio NO se realizo");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Al Ingresar Nombre de Usuario", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAceptarModificarActionPerformed

    private void jButtonAceptarSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarSolicitarActionPerformed
        int aux = Integer.parseInt(jTextFieldIdSolicitar.getText());
        String nombre = null;
        try {
            nombre = obj.getNombreUsuario(aux);
        } catch (RemoteException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        jLabelNombre.setText("Nombre de usuario: " + nombre);
    }//GEN-LAST:event_jButtonAceptarSolicitarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JFrame consumoEnergia;
    private javax.swing.JButton jButtonAceptarConsumoEnergia;
    private javax.swing.JButton jButtonAceptarMP;
    private javax.swing.JButton jButtonAceptarModificar;
    private javax.swing.JButton jButtonAceptarSolicitar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelConf;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPasswordField jPasswordFieldPass;
    private javax.swing.JPasswordField jPasswordFieldPassConf;
    private javax.swing.JRadioButton jRadioButtonMenOpcAdm1;
    private javax.swing.JRadioButton jRadioButtonMenOpcAdm2;
    private javax.swing.JRadioButton jRadioButtonMenOpcAdm3;
    private javax.swing.JRadioButton jRadioButtonMenOpcAdm4;
    private javax.swing.JRadioButton jRadioButtonMenOpcAdm5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaListaId;
    private javax.swing.JTextField jTextFieldIdConsumo;
    private javax.swing.JTextField jTextFieldIdModificar;
    private javax.swing.JTextField jTextFieldIdSolicitar;
    private javax.swing.JTextField jTextFieldNNombre;
    private javax.swing.JTextField jTextFieldResConsumo;
    private javax.swing.JFrame listaId;
    private javax.swing.JFrame modificar;
    private javax.swing.JFrame modificarPass;
    public static javax.swing.ButtonGroup opcion;
    private javax.swing.JFrame solicitar;
    // End of variables declaration//GEN-END:variables

}