package esclavo;

import java.rmi.Naming;
import javax.swing.JOptionPane;
import sop_rmi.*;


public class Tecnico extends javax.swing.JFrame {
    ImpEsclavo obj;

    public Tecnico(String[] args, ImpEsclavo obj) {
        initComponents();
        try {
            this.obj = obj;
            Naming.rebind("rmi://" + args[0] + ":" + args[1] + "/esclavo", this.obj);
            System.out.println("Servicio esclavo registrado en: "+args[1]);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha Ocurrido Un Error Al Registrar El Objeto Esclavo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEsclavo = new javax.swing.JPanel();
        btnSetNombre = new javax.swing.JButton();
        btnSetIde = new javax.swing.JButton();
        btnSetResidencia = new javax.swing.JButton();

        setTitle("Esclavo");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(400, 200));
        setName("fEsclavo"); // NOI18N
        setPreferredSize(new java.awt.Dimension(400, 170));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelEsclavo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Menu de Opciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Consolas", 0, 12), new java.awt.Color(204, 0, 0))); // NOI18N
        panelEsclavo.setMinimumSize(new java.awt.Dimension(400, 170));

        btnSetNombre.setText("Registrar Nombre de Usuario");
        btnSetNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetNombreActionPerformed(evt);
            }
        });

        btnSetIde.setText("Registrar Identificador");
        btnSetIde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetIdeActionPerformed(evt);
            }
        });

        btnSetResidencia.setText("Registrar Direccion de Residencia");
        btnSetResidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetResidenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEsclavoLayout = new javax.swing.GroupLayout(panelEsclavo);
        panelEsclavo.setLayout(panelEsclavoLayout);
        panelEsclavoLayout.setHorizontalGroup(
            panelEsclavoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEsclavoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEsclavoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSetResidencia, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                    .addComponent(btnSetNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSetIde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelEsclavoLayout.setVerticalGroup(
            panelEsclavoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEsclavoLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(btnSetIde)
                .addGap(18, 18, 18)
                .addComponent(btnSetNombre)
                .addGap(18, 18, 18)
                .addComponent(btnSetResidencia)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEsclavo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEsclavo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSetIdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetIdeActionPerformed
        String aux = JOptionPane.showInputDialog("Ingresa La Identificacion de la Residencia");
        try {
            obj.setIdResidencia(Integer.parseInt(aux));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Al Ingresar Identificacion", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSetIdeActionPerformed

    private void btnSetNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetNombreActionPerformed
        String aux = JOptionPane.showInputDialog("Ingresa El Nombre del Usuario de la Residencia");
        try {
            obj.setNombreUsuario(aux);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Al Ingresar Nombre de Usuario", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSetNombreActionPerformed

    private void btnSetResidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetResidenciaActionPerformed
        String aux = JOptionPane.showInputDialog("Ingresa La Direccion de la Residencia");
        try {
            obj.setDireccion(aux);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Al Ingresar Direccion de Residencia", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSetResidenciaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JOptionPane.showMessageDialog(null, "El servicio se seguira ejecutando", "Informacion", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSetIde;
    private javax.swing.JButton btnSetNombre;
    private javax.swing.JButton btnSetResidencia;
    private javax.swing.JPanel panelEsclavo;
    // End of variables declaration//GEN-END:variables
}