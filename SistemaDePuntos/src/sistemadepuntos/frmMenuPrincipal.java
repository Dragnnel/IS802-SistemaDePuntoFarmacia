/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadepuntos;

/**
 *
 * @author Luis Estrada
 */
public class frmMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmMenuPrincipal
     */
    public frmMenuPrincipal() {
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

        jl_tituloMenuPrincipal = new javax.swing.JLabel();
        panel_menuPrincipal = new java.awt.Panel();
        btn_ClienteMenu = new javax.swing.JButton();
        btn_PuntosMenu = new javax.swing.JButton();
        btn_ReportesMenu = new javax.swing.JButton();
        btn_configuracion = new javax.swing.JButton();
        btn_SalirMenuPrincipal = new javax.swing.JButton();
        jLabelFondoMenuPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Munu Principal");
        setMaximumSize(new java.awt.Dimension(680, 530));
        setMinimumSize(new java.awt.Dimension(680, 530));
        setName("Menu Princial Sistema de Puntos"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(680, 530));
        getContentPane().setLayout(null);

        jl_tituloMenuPrincipal.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jl_tituloMenuPrincipal.setText("Sistema de Puntos IS802");
        getContentPane().add(jl_tituloMenuPrincipal);
        jl_tituloMenuPrincipal.setBounds(100, 30, 570, 40);

        btn_ClienteMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgenesProyecto/cliente.png"))); // NOI18N
        btn_ClienteMenu.setText("Cliente");

        btn_PuntosMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgenesProyecto/gestionPuntos.png"))); // NOI18N
        btn_PuntosMenu.setText("Puntos");

        btn_ReportesMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgenesProyecto/reporte.png"))); // NOI18N
        btn_ReportesMenu.setText("Reportes");

        btn_configuracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgenesProyecto/administrador.png"))); // NOI18N
        btn_configuracion.setText("Configuración");
        btn_configuracion.setToolTipText("");

        btn_SalirMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgenesProyecto/salirSistema.png"))); // NOI18N
        btn_SalirMenuPrincipal.setText("Salir");
        btn_SalirMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirMenuPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_menuPrincipalLayout = new javax.swing.GroupLayout(panel_menuPrincipal);
        panel_menuPrincipal.setLayout(panel_menuPrincipalLayout);
        panel_menuPrincipalLayout.setHorizontalGroup(
            panel_menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuPrincipalLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(panel_menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menuPrincipalLayout.createSequentialGroup()
                        .addGroup(panel_menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_ClienteMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ReportesMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(panel_menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_PuntosMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_configuracion))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menuPrincipalLayout.createSequentialGroup()
                        .addComponent(btn_SalirMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))))
        );
        panel_menuPrincipalLayout.setVerticalGroup(
            panel_menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuPrincipalLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(panel_menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_PuntosMenu)
                    .addComponent(btn_ClienteMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(panel_menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_ReportesMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_configuracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_SalirMenuPrincipal)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(panel_menuPrincipal);
        panel_menuPrincipal.setBounds(100, 120, 500, 330);

        jLabelFondoMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgenesProyecto/fondo-menuPrincial.jpg"))); // NOI18N
        jLabelFondoMenuPrincipal.setMaximumSize(new java.awt.Dimension(680, 530));
        jLabelFondoMenuPrincipal.setMinimumSize(new java.awt.Dimension(680, 530));
        jLabelFondoMenuPrincipal.setPreferredSize(new java.awt.Dimension(680, 530));
        getContentPane().add(jLabelFondoMenuPrincipal);
        jLabelFondoMenuPrincipal.setBounds(0, 0, 680, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SalirMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirMenuPrincipalActionPerformed
        // TODO add your handling code here:
          System.exit(0); // salir del sistema 
    }//GEN-LAST:event_btn_SalirMenuPrincipalActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ClienteMenu;
    private javax.swing.JButton btn_PuntosMenu;
    private javax.swing.JButton btn_ReportesMenu;
    private javax.swing.JButton btn_SalirMenuPrincipal;
    private javax.swing.JButton btn_configuracion;
    private javax.swing.JLabel jLabelFondoMenuPrincipal;
    private javax.swing.JLabel jl_tituloMenuPrincipal;
    private java.awt.Panel panel_menuPrincipal;
    // End of variables declaration//GEN-END:variables
}
