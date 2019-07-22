
package sistemadepuntos;
/**
 *
 * @author bayron
 */
public class frmRegistroCliente extends javax.swing.JFrame {

    public frmRegistroCliente() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextSegundoNombre = new javax.swing.JTextField();
        jTextPrimerApellido = new javax.swing.JTextField();
        JTextSegundoApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextCorreo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextZona = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDireccion = new javax.swing.JTextArea();
        JTprimerNombre1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(730, 540));
        setMinimumSize(new java.awt.Dimension(730, 540));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(730, 540));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setLabelFor(this);
        jLabel1.setText("Registro de cliente");
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 16, 720, 23);

        jLabel2.setText("Primer nombre:");
        jLabel2.setAlignmentX(0.5F);
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(21, 52, 124, 20);

        jLabel3.setText("Segundo nombre:");
        jLabel3.setAlignmentX(0.5F);
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(21, 78, 124, 20);

        jLabel4.setText("Primer apellido:");
        jLabel4.setAlignmentX(0.5F);
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(21, 104, 124, 20);

        jLabel5.setText("Segundo apellido:");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(21, 130, 124, 20);

        jTextSegundoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSegundoNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextSegundoNombre);
        jTextSegundoNombre.setBounds(149, 78, 560, 20);

        jTextPrimerApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPrimerApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextPrimerApellido);
        jTextPrimerApellido.setBounds(149, 104, 560, 20);

        JTextSegundoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextSegundoApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(JTextSegundoApellido);
        JTextSegundoApellido.setBounds(149, 130, 560, 20);

        jLabel6.setText("Sexo");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(21, 200, 124, 20);

        jLabel7.setText("Teléfono:");
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(21, 236, 124, 20);

        jLabel8.setText("Correo electronico:");
        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(21, 262, 124, 20);

        jTextCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextCorreo);
        jTextCorreo.setBounds(149, 262, 550, 20);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Dirección");
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(21, 288, 680, 20);

        jLabel10.setText("Zona");
        jLabel10.setAlignmentX(0.5F);
        jLabel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(21, 314, 124, 20);

        jTextZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextZonaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextZona);
        jTextZona.setBounds(149, 314, 550, 20);

        jLabel11.setText("Descripción de direccion");
        jLabel11.setAlignmentX(0.5F);
        jLabel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel11.setNextFocusableComponent(this);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(21, 340, 124, 20);

        jTextAreaDireccion.setColumns(20);
        jTextAreaDireccion.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDireccion);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(149, 340, 550, 96);

        JTprimerNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTprimerNombre1ActionPerformed(evt);
            }
        });
        getContentPane().add(JTprimerNombre1);
        JTprimerNombre1.setBounds(149, 52, 560, 20);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(21, 446, 700, 10);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgenesProyecto/guardar.png"))); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 460, 180, 70);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgenesProyecto/limpiarCampos.png"))); // NOI18N
        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(260, 460, 150, 70);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgenesProyecto/VolverMenu.png"))); // NOI18N
        jButton3.setText("Volver a Menu Gestion Clientes");
        getContentPane().add(jButton3);
        jButton3.setBounds(440, 460, 260, 70);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(149, 236, 550, 20);
        jTextField1.getAccessibleContext().setAccessibleName("Telefono");
        jTextField1.getAccessibleContext().setAccessibleDescription("");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(163, 200, 33, 20);

        jLabel12.setText("Fecha Nacimiento:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(214, 203, 88, 14);

        jLabel13.setText("No. Identidad");
        jLabel13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel13.setMaximumSize(new java.awt.Dimension(91, 20));
        jLabel13.setMinimumSize(new java.awt.Dimension(91, 20));
        getContentPane().add(jLabel13);
        jLabel13.setBounds(21, 165, 124, 19);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(149, 164, 560, 20);

        jl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgenesProyecto/fondo-menuPrincial.jpg"))); // NOI18N
        jl_fondo.setMaximumSize(new java.awt.Dimension(740, 540));
        jl_fondo.setMinimumSize(new java.awt.Dimension(740, 540));
        jl_fondo.setPreferredSize(new java.awt.Dimension(740, 540));
        getContentPane().add(jl_fondo);
        jl_fondo.setBounds(0, 0, 730, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextPrimerApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPrimerApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPrimerApellidoActionPerformed

    private void jTextCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCorreoActionPerformed

    private void jTextZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextZonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextZonaActionPerformed

    private void JTextSegundoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextSegundoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextSegundoApellidoActionPerformed

    private void jTextSegundoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSegundoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSegundoNombreActionPerformed

    private void JTprimerNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTprimerNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTprimerNombre1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextSegundoApellido;
    private javax.swing.JTextField JTprimerNombre1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextAreaDireccion;
    private javax.swing.JTextField jTextCorreo;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextPrimerApellido;
    private javax.swing.JTextField jTextSegundoNombre;
    private javax.swing.JTextField jTextZona;
    private javax.swing.JLabel jl_fondo;
    // End of variables declaration//GEN-END:variables
}
