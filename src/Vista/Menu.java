/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author jimen
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jm_agregarTipoProfesion = new javax.swing.JMenuItem();
        jm_eliminarTipoProfesion = new javax.swing.JMenuItem();
        jm_actualizarTipoProfesion = new javax.swing.JMenuItem();
        jm_listarTipoProfesion = new javax.swing.JMenuItem();
        jmenu_4 = new javax.swing.JMenu();
        jm_agregarMedico = new javax.swing.JMenuItem();
        jm_Salir = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        jMenu3.setText("Tipo Profesion");

        jm_agregarTipoProfesion.setText("Agregar");
        jm_agregarTipoProfesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_agregarTipoProfesionActionPerformed(evt);
            }
        });
        jMenu3.add(jm_agregarTipoProfesion);

        jm_eliminarTipoProfesion.setText("Eliminar");
        jMenu3.add(jm_eliminarTipoProfesion);

        jm_actualizarTipoProfesion.setText("Actualizar");
        jMenu3.add(jm_actualizarTipoProfesion);

        jm_listarTipoProfesion.setText("Listar");
        jMenu3.add(jm_listarTipoProfesion);

        jMenu1.add(jMenu3);

        jmenu_4.setText("Medico");

        jm_agregarMedico.setText("Agregar Medico");
        jm_agregarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_agregarMedicoActionPerformed(evt);
            }
        });
        jmenu_4.add(jm_agregarMedico);

        jMenu1.add(jmenu_4);

        jMenuBar1.add(jMenu1);

        jm_Salir.setText("Salir");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jm_Salir.add(jMenuItem1);

        jMenuBar1.add(jm_Salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jm_agregarTipoProfesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_agregarTipoProfesionActionPerformed
        // TODO add your handling code here:
        Form_IngregarTipoProfesion itp = new Form_IngregarTipoProfesion();
        itp.setVisible(true);
        
        
    }//GEN-LAST:event_jm_agregarTipoProfesionActionPerformed

    private void jm_agregarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_agregarMedicoActionPerformed
        // TODO add your handling code here:
        Form_IngresarMedico fim = new Form_IngresarMedico();
        fim.setVisible(true);
    }//GEN-LAST:event_jm_agregarMedicoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jm_Salir;
    private javax.swing.JMenuItem jm_actualizarTipoProfesion;
    private javax.swing.JMenuItem jm_agregarMedico;
    private javax.swing.JMenuItem jm_agregarTipoProfesion;
    private javax.swing.JMenuItem jm_eliminarTipoProfesion;
    private javax.swing.JMenuItem jm_listarTipoProfesion;
    private javax.swing.JMenu jmenu_4;
    // End of variables declaration//GEN-END:variables
}
