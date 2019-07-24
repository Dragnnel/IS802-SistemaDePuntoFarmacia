/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadepuntos;
/**
 *
 * @author bayro
 */
public class frmRegistroClientes extends javax.swing.JFrame {

    /**
     * Creates new form frmRegistroClientes
     */
    public frmRegistroClientes() {
        initComponents();
         this.setLocationRelativeTo(null); //para ponerse en el centro
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP1_DatosCliente = new javax.swing.JPanel();
        SegundoNombre = new javax.swing.JLabel();
        PrimerApellido = new javax.swing.JLabel();
        SegundoApelliido = new javax.swing.JLabel();
        NoIdentidad = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        CorreoElectronico = new javax.swing.JLabel();
        primerNombre = new javax.swing.JTextField();
        segundoNombre = new javax.swing.JTextField();
        primerApellido = new javax.swing.JTextField();
        segundoApellido = new javax.swing.JTextField();
        noIdentidad = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        PrimerNombre = new javax.swing.JLabel();
        correoElectronico = new javax.swing.JTextField();
        jP2_DatosCliente = new javax.swing.JPanel();
        jL_Sexo = new javax.swing.JLabel();
        jC_Sexo = new javax.swing.JComboBox<>();
        jL_fechaNacimiento = new javax.swing.JLabel();
        jDC_fechaNacimiento = new com.toedter.calendar.JDateChooser();
        jP_DatosDireccion = new javax.swing.JPanel();
        jL_TituloDireccion = new javax.swing.JLabel();
        jL_DetalleDirecion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        jL_Zona = new javax.swing.JLabel();
        jC_zona = new javax.swing.JComboBox<>();
        j_Botones = new javax.swing.JPanel();
        btn_guardarCliente = new javax.swing.JButton();
        btn_menuInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión cliente");
        setMaximumSize(new java.awt.Dimension(490, 550));
        setMinimumSize(new java.awt.Dimension(490, 550));
        setName("Registro Cliente"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(490, 550));
        getContentPane().setLayout(null);

        jP1_DatosCliente.setLayout(null);

        SegundoNombre.setText("Segundo nombre:");
        SegundoNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP1_DatosCliente.add(SegundoNombre);
        SegundoNombre.setBounds(10, 37, 98, 20);

        PrimerApellido.setText("Primer apellido:");
        PrimerApellido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP1_DatosCliente.add(PrimerApellido);
        PrimerApellido.setBounds(10, 63, 98, 20);

        SegundoApelliido.setText("Segundo apellido:");
        SegundoApelliido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP1_DatosCliente.add(SegundoApelliido);
        SegundoApelliido.setBounds(10, 89, 98, 20);

        NoIdentidad.setText("No. Identidad:");
        NoIdentidad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP1_DatosCliente.add(NoIdentidad);
        NoIdentidad.setBounds(10, 115, 98, 20);

        Telefono.setText("Teléfono:");
        Telefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP1_DatosCliente.add(Telefono);
        Telefono.setBounds(10, 141, 98, 20);

        CorreoElectronico.setText("Correo electrónico:");
        CorreoElectronico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP1_DatosCliente.add(CorreoElectronico);
        CorreoElectronico.setBounds(10, 167, 98, 20);

        primerNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primerNombreActionPerformed(evt);
            }
        });
        jP1_DatosCliente.add(primerNombre);
        primerNombre.setBounds(112, 11, 311, 20);

        segundoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segundoNombreActionPerformed(evt);
            }
        });
        jP1_DatosCliente.add(segundoNombre);
        segundoNombre.setBounds(112, 37, 311, 20);

        primerApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primerApellidoActionPerformed(evt);
            }
        });
        jP1_DatosCliente.add(primerApellido);
        primerApellido.setBounds(112, 63, 311, 20);

        segundoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segundoApellidoActionPerformed(evt);
            }
        });
        jP1_DatosCliente.add(segundoApellido);
        segundoApellido.setBounds(112, 89, 311, 20);

        noIdentidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noIdentidadActionPerformed(evt);
            }
        });
        jP1_DatosCliente.add(noIdentidad);
        noIdentidad.setBounds(112, 115, 311, 20);

        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });
        jP1_DatosCliente.add(telefono);
        telefono.setBounds(112, 141, 311, 20);

        PrimerNombre.setText("Primer nombre:");
        PrimerNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP1_DatosCliente.add(PrimerNombre);
        PrimerNombre.setBounds(10, 11, 98, 20);
        jP1_DatosCliente.add(correoElectronico);
        correoElectronico.setBounds(112, 167, 311, 20);

        jP2_DatosCliente.setLayout(null);

        jL_Sexo.setText("Sexo:");
        jL_Sexo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jL_Sexo.setPreferredSize(new java.awt.Dimension(98, 20));
        jP2_DatosCliente.add(jL_Sexo);
        jL_Sexo.setBounds(0, 0, 100, 20);

        jC_Sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        jC_Sexo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jP2_DatosCliente.add(jC_Sexo);
        jC_Sexo.setBounds(100, 0, 130, 20);

        jL_fechaNacimiento.setText("Fecha nacimiento dd-mm-yy :");
        jL_fechaNacimiento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP2_DatosCliente.add(jL_fechaNacimiento);
        jL_fechaNacimiento.setBounds(0, 30, 200, 30);
        jP2_DatosCliente.add(jDC_fechaNacimiento);
        jDC_fechaNacimiento.setBounds(200, 30, 210, 30);

        jP1_DatosCliente.add(jP2_DatosCliente);
        jP2_DatosCliente.setBounds(10, 200, 413, 69);

        jP_DatosDireccion.setLayout(null);

        jL_TituloDireccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_TituloDireccion.setText("Dirección");
        jL_TituloDireccion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jL_TituloDireccion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jP_DatosDireccion.add(jL_TituloDireccion);
        jL_TituloDireccion.setBounds(10, 0, 413, 20);

        jL_DetalleDirecion.setText("Detalle:");
        jL_DetalleDirecion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP_DatosDireccion.add(jL_DetalleDirecion);
        jL_DetalleDirecion.setBounds(10, 52, 76, 20);

        descripcion.setColumns(20);
        descripcion.setRows(5);
        jScrollPane1.setViewportView(descripcion);

        jP_DatosDireccion.add(jScrollPane1);
        jScrollPane1.setBounds(90, 52, 333, 96);

        jL_Zona.setText("Zona:");
        jL_Zona.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jP_DatosDireccion.add(jL_Zona);
        jL_Zona.setBounds(10, 26, 76, 20);

        jC_zona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Las casitas" }));
        jP_DatosDireccion.add(jC_zona);
        jC_zona.setBounds(90, 26, 180, 20);

        jP1_DatosCliente.add(jP_DatosDireccion);
        jP_DatosDireccion.setBounds(0, 270, 460, 160);

        getContentPane().add(jP1_DatosCliente);
        jP1_DatosCliente.setBounds(30, 10, 470, 430);

        j_Botones.setLayout(null);

        btn_guardarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgenesProyecto/guardar.png"))); // NOI18N
        btn_guardarCliente.setText("Guardar");
        btn_guardarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_guardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarClienteActionPerformed(evt);
            }
        });
        j_Botones.add(btn_guardarCliente);
        btn_guardarCliente.setBounds(30, 20, 160, 60);

        btn_menuInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgenesProyecto/VolverMenu.png"))); // NOI18N
        btn_menuInicio.setText("Atrás");
        btn_menuInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_menuInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuInicioActionPerformed(evt);
            }
        });
        j_Botones.add(btn_menuInicio);
        btn_menuInicio.setBounds(250, 20, 160, 60);

        getContentPane().add(j_Botones);
        j_Botones.setBounds(30, 430, 430, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void segundoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segundoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_segundoNombreActionPerformed

    private void primerApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primerApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_primerApellidoActionPerformed

    private void noIdentidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noIdentidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noIdentidadActionPerformed

    private void segundoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segundoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_segundoApellidoActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed

    private void btn_guardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardarClienteActionPerformed

    private void primerNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primerNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_primerNombreActionPerformed

    private void btn_menuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_menuInicioActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CorreoElectronico;
    private javax.swing.JLabel NoIdentidad;
    private javax.swing.JLabel PrimerApellido;
    private javax.swing.JLabel PrimerNombre;
    private javax.swing.JLabel SegundoApelliido;
    private javax.swing.JLabel SegundoNombre;
    private javax.swing.JLabel Telefono;
    private javax.swing.JButton btn_guardarCliente;
    private javax.swing.JButton btn_menuInicio;
    private javax.swing.JTextField correoElectronico;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JComboBox<String> jC_Sexo;
    private javax.swing.JComboBox<String> jC_zona;
    private com.toedter.calendar.JDateChooser jDC_fechaNacimiento;
    private javax.swing.JLabel jL_DetalleDirecion;
    private javax.swing.JLabel jL_Sexo;
    private javax.swing.JLabel jL_TituloDireccion;
    private javax.swing.JLabel jL_Zona;
    private javax.swing.JLabel jL_fechaNacimiento;
    private javax.swing.JPanel jP1_DatosCliente;
    private javax.swing.JPanel jP2_DatosCliente;
    private javax.swing.JPanel jP_DatosDireccion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel j_Botones;
    private javax.swing.JTextField noIdentidad;
    private javax.swing.JTextField primerApellido;
    private javax.swing.JTextField primerNombre;
    private javax.swing.JTextField segundoApellido;
    private javax.swing.JTextField segundoNombre;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
