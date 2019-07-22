
package sistemadepuntos;
/**
 *
 * @author bayron
 */
public class registroClientes extends javax.swing.JFrame {

    public registroClientes() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel1_tituloPrincipal = new javax.swing.JLabel();
        jPanel2_Cajas_texto_principales = new javax.swing.JPanel();
        jTextSegundoNombre = new javax.swing.JTextField();
        jTextPrimerApellido = new javax.swing.JTextField();
        JTextSegundoApellido = new javax.swing.JTextField();
        jComboBox_Sexo = new javax.swing.JComboBox<>();
        jLabel_Fecha_Nacimiento = new javax.swing.JLabel();
        jDateChooser_FechaNac = new com.toedter.calendar.JDateChooser();
        jTextTelefono = new javax.swing.JTextField();
        jTextCorreo = new javax.swing.JTextField();
        jLabel6_sexo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8_correoElectronico = new javax.swing.JLabel();
        jLabel2_PrimerNombre = new javax.swing.JLabel();
        jLabel3_SegundoNombre = new javax.swing.JLabel();
        jLabel4_PrimerApellido = new javax.swing.JLabel();
        jLabel5_SegundoApellido = new javax.swing.JLabel();
        jLabel13_No_Identidad = new javax.swing.JLabel();
        jTextField2_No_Identidad = new javax.swing.JTextField();
        JTextprimerNombre = new javax.swing.JTextField();
        jPanel_Direccion = new javax.swing.JPanel();
        jLabel_Direccion = new javax.swing.JLabel();
        jLabel_Zona = new javax.swing.JLabel();
        jTextZona = new javax.swing.JTextField();
        jLabel_Descripcion_Direccion = new javax.swing.JLabel();
        jScrollPane_Descripcion_Direccion = new javax.swing.JScrollPane();
        jTextArea_Descripcion_Direccion = new javax.swing.JTextArea();
        jSeparator_separador = new javax.swing.JSeparator();
        jPanel_Botones = new javax.swing.JPanel();
        jButton_Guardar = new javax.swing.JButton();
        jButton_cancelar = new javax.swing.JButton();
        jButto_Volver_a_Menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanel1_tituloPrincipal.setBackground(new java.awt.Color(204, 204, 255));
        jpanel1_tituloPrincipal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpanel1_tituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jpanel1_tituloPrincipal.setLabelFor(this);
        jpanel1_tituloPrincipal.setText("Registro de clientes");
        jpanel1_tituloPrincipal.setAlignmentY(0.0F);
        jpanel1_tituloPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextSegundoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSegundoNombreActionPerformed(evt);
            }
        });

        jTextPrimerApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPrimerApellidoActionPerformed(evt);
            }
        });

        JTextSegundoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextSegundoApellidoActionPerformed(evt);
            }
        });

        jComboBox_Sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        jLabel_Fecha_Nacimiento.setText("Fecha Nacimiento:");

        jTextTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTelefonoActionPerformed(evt);
            }
        });

        jTextCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCorreoActionPerformed(evt);
            }
        });

        jLabel6_sexo.setText("Sexo:");
        jLabel6_sexo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6_sexo.setMaximumSize(new java.awt.Dimension(98, 20));
        jLabel6_sexo.setMinimumSize(new java.awt.Dimension(98, 20));
        jLabel6_sexo.setPreferredSize(new java.awt.Dimension(98, 20));

        jLabel7.setText("Teléfono:");
        jLabel7.setAlignmentX(0.5F);
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel7.setMaximumSize(new java.awt.Dimension(98, 20));
        jLabel7.setMinimumSize(new java.awt.Dimension(98, 20));
        jLabel7.setPreferredSize(new java.awt.Dimension(98, 20));

        jLabel8_correoElectronico.setText("Correo electrónico:");
        jLabel8_correoElectronico.setAlignmentX(0.5F);
        jLabel8_correoElectronico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2_PrimerNombre.setText("Primer nombre:");
        jLabel2_PrimerNombre.setAlignmentX(0.5F);
        jLabel2_PrimerNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2_PrimerNombre.setMaximumSize(new java.awt.Dimension(98, 20));
        jLabel2_PrimerNombre.setMinimumSize(new java.awt.Dimension(98, 20));

        jLabel3_SegundoNombre.setText("Segundo nombre:");
        jLabel3_SegundoNombre.setAlignmentX(0.5F);
        jLabel3_SegundoNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3_SegundoNombre.setMaximumSize(new java.awt.Dimension(98, 20));
        jLabel3_SegundoNombre.setMinimumSize(new java.awt.Dimension(98, 20));

        jLabel4_PrimerApellido.setText("Primer apellido:");
        jLabel4_PrimerApellido.setAlignmentX(0.5F);
        jLabel4_PrimerApellido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4_PrimerApellido.setMaximumSize(new java.awt.Dimension(98, 20));
        jLabel4_PrimerApellido.setMinimumSize(new java.awt.Dimension(98, 20));

        jLabel5_SegundoApellido.setText("Segundo apellido:");
        jLabel5_SegundoApellido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel5_SegundoApellido.setMaximumSize(new java.awt.Dimension(98, 20));
        jLabel5_SegundoApellido.setMinimumSize(new java.awt.Dimension(98, 20));

        jLabel13_No_Identidad.setText("No. Identidad:");
        jLabel13_No_Identidad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel13_No_Identidad.setMaximumSize(new java.awt.Dimension(98, 20));
        jLabel13_No_Identidad.setMinimumSize(new java.awt.Dimension(98, 20));

        jTextField2_No_Identidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_No_IdentidadActionPerformed(evt);
            }
        });

        JTextprimerNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextprimerNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2_Cajas_texto_principalesLayout = new javax.swing.GroupLayout(jPanel2_Cajas_texto_principales);
        jPanel2_Cajas_texto_principales.setLayout(jPanel2_Cajas_texto_principalesLayout);
        jPanel2_Cajas_texto_principalesLayout.setHorizontalGroup(
            jPanel2_Cajas_texto_principalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_Cajas_texto_principalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2_Cajas_texto_principalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13_No_Identidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5_SegundoApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4_PrimerApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8_correoElectronico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6_sexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3_SegundoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2_PrimerNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2_Cajas_texto_principalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2_Cajas_texto_principalesLayout.createSequentialGroup()
                        .addComponent(jComboBox_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel_Fecha_Nacimiento)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser_FechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextField2_No_Identidad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JTextSegundoApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextSegundoNombre)
                    .addComponent(JTextprimerNombre)
                    .addComponent(jTextPrimerApellido)
                    .addComponent(jTextCorreo))
                .addContainerGap())
        );
        jPanel2_Cajas_texto_principalesLayout.setVerticalGroup(
            jPanel2_Cajas_texto_principalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_Cajas_texto_principalesLayout.createSequentialGroup()
                .addGroup(jPanel2_Cajas_texto_principalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JTextprimerNombre)
                    .addComponent(jLabel2_PrimerNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2_Cajas_texto_principalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3_SegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextSegundoNombre))
                .addGap(10, 10, 10)
                .addGroup(jPanel2_Cajas_texto_principalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4_PrimerApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPrimerApellido))
                .addGap(10, 10, 10)
                .addGroup(jPanel2_Cajas_texto_principalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JTextSegundoApellido)
                    .addComponent(jLabel5_SegundoApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2_Cajas_texto_principalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13_No_Identidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2_No_Identidad))
                .addGroup(jPanel2_Cajas_texto_principalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2_Cajas_texto_principalesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooser_FechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2_Cajas_texto_principalesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2_Cajas_texto_principalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6_sexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Fecha_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(jPanel2_Cajas_texto_principalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextTelefono)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2_Cajas_texto_principalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8_correoElectronico)
                    .addComponent(jTextCorreo))
                .addContainerGap())
        );

        jTextTelefono.getAccessibleContext().setAccessibleName("Telefono");
        jTextTelefono.getAccessibleContext().setAccessibleDescription("");

        jLabel_Direccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Direccion.setText("Dirección");
        jLabel_Direccion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_Zona.setText("Zona");
        jLabel_Zona.setAlignmentX(0.5F);
        jLabel_Zona.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_Zona.setMaximumSize(new java.awt.Dimension(124, 20));
        jLabel_Zona.setMinimumSize(new java.awt.Dimension(124, 20));

        jTextZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextZonaActionPerformed(evt);
            }
        });

        jLabel_Descripcion_Direccion.setText("Descripción de direccion");
        jLabel_Descripcion_Direccion.setAlignmentX(0.5F);
        jLabel_Descripcion_Direccion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel_Descripcion_Direccion.setNextFocusableComponent(this);

        jTextArea_Descripcion_Direccion.setColumns(20);
        jTextArea_Descripcion_Direccion.setRows(5);
        jScrollPane_Descripcion_Direccion.setViewportView(jTextArea_Descripcion_Direccion);

        javax.swing.GroupLayout jPanel_DireccionLayout = new javax.swing.GroupLayout(jPanel_Direccion);
        jPanel_Direccion.setLayout(jPanel_DireccionLayout);
        jPanel_DireccionLayout.setHorizontalGroup(
            jPanel_DireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_DireccionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane_Descripcion_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel_DireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_DireccionLayout.createSequentialGroup()
                    .addGroup(jPanel_DireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel_DireccionLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel_Direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE))
                        .addGroup(jPanel_DireccionLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel_DireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel_Zona, javax.swing.GroupLayout.PREFERRED_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(jLabel_Descripcion_Direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                            .addComponent(jTextZona, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );
        jPanel_DireccionLayout.setVerticalGroup(
            jPanel_DireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_DireccionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane_Descripcion_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(jPanel_DireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_DireccionLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel_Direccion)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel_DireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_Zona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel_Descripcion_Direccion)
                    .addGap(132, 132, 132)))
        );

        jButton_Guardar.setText("Guardar");
        jButton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GuardarActionPerformed(evt);
            }
        });

        jButton_cancelar.setText("Cancelar");
        jButton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelarActionPerformed(evt);
            }
        });

        jButto_Volver_a_Menu.setText("Menu Inicio");
        jButto_Volver_a_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButto_Volver_a_MenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_BotonesLayout = new javax.swing.GroupLayout(jPanel_Botones);
        jPanel_Botones.setLayout(jPanel_BotonesLayout);
        jPanel_BotonesLayout.setHorizontalGroup(
            jPanel_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButto_Volver_a_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_BotonesLayout.setVerticalGroup(
            jPanel_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BotonesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_BotonesLayout.createSequentialGroup()
                        .addGroup(jPanel_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButto_Volver_a_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel_Botones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel_Direccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2_Cajas_texto_principales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator_separador, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpanel1_tituloPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanel1_tituloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jPanel2_Cajas_texto_principales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator_separador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_Botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

    private void JTextprimerNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextprimerNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextprimerNombreActionPerformed

    private void jButton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_GuardarActionPerformed

    private void jButton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_cancelarActionPerformed

    private void jTextTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTelefonoActionPerformed

    private void jButto_Volver_a_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButto_Volver_a_MenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButto_Volver_a_MenuActionPerformed

    private void jTextField2_No_IdentidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_No_IdentidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_No_IdentidadActionPerformed

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
            java.util.logging.Logger.getLogger(registroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextSegundoApellido;
    private javax.swing.JTextField JTextprimerNombre;
    private javax.swing.JButton jButto_Volver_a_Menu;
    private javax.swing.JButton jButton_Guardar;
    private javax.swing.JButton jButton_cancelar;
    private javax.swing.JComboBox<String> jComboBox_Sexo;
    private com.toedter.calendar.JDateChooser jDateChooser_FechaNac;
    private javax.swing.JLabel jLabel13_No_Identidad;
    private javax.swing.JLabel jLabel2_PrimerNombre;
    private javax.swing.JLabel jLabel3_SegundoNombre;
    private javax.swing.JLabel jLabel4_PrimerApellido;
    private javax.swing.JLabel jLabel5_SegundoApellido;
    private javax.swing.JLabel jLabel6_sexo;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8_correoElectronico;
    private javax.swing.JLabel jLabel_Descripcion_Direccion;
    private javax.swing.JLabel jLabel_Direccion;
    private javax.swing.JLabel jLabel_Fecha_Nacimiento;
    private javax.swing.JLabel jLabel_Zona;
    private javax.swing.JPanel jPanel2_Cajas_texto_principales;
    private javax.swing.JPanel jPanel_Botones;
    private javax.swing.JPanel jPanel_Direccion;
    private javax.swing.JScrollPane jScrollPane_Descripcion_Direccion;
    private javax.swing.JSeparator jSeparator_separador;
    private javax.swing.JTextArea jTextArea_Descripcion_Direccion;
    private javax.swing.JTextField jTextCorreo;
    private javax.swing.JTextField jTextField2_No_Identidad;
    private javax.swing.JTextField jTextPrimerApellido;
    private javax.swing.JTextField jTextSegundoNombre;
    private javax.swing.JTextField jTextTelefono;
    private javax.swing.JTextField jTextZona;
    private javax.swing.JLabel jpanel1_tituloPrincipal;
    // End of variables declaration//GEN-END:variables
}
