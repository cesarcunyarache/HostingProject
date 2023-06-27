package Form;

public class Form_NuevaReservaC extends javax.swing.JPanel {

    public Form_NuevaReservaC() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLbBienvenido = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_Agregar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTxtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnBuscar2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txt_NHabitacion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cbx_tipoHabitacion = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea_Descripcion = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        txtCostoAdicional = new javax.swing.JTextField();
        jPCaracteristicas = new javax.swing.JPanel();
        cbFrigoFab = new javax.swing.JCheckBox();
        cbAireAcondicionado = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jDtFechaEntrada = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jDtFechaSalida = new com.toedter.calendar.JDateChooser();
        btnBuscar1 = new javax.swing.JButton();
        cbx_TipoPago = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        txtDescripcionPago = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_PrecioHabitacion = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtCostoTotal1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        btnBuscar3 = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbBienvenido.setFont(new java.awt.Font("Roboto", 1, 40)); // NOI18N
        jLbBienvenido.setText("Reserva");
        jPanel2.add(jLbBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información de cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 16), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel3.setToolTipText("");

        btn_Agregar.setText("Ver más información");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });

        jLabel7.setText("Correo");

        jLabel8.setText("Nombres");

        jLabel10.setText("Apellidos");

        txt_apellido.setEditable(false);
        txt_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_apellidoKeyPressed(evt);
            }
        });

        txt_correo.setEditable(false);

        txt_telefono.setEditable(false);

        jLabel12.setText("Telefono");

        txt_nombre.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_telefono)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_correo)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 561, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(153, 153, 153)));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Buscar cliente");

        jTxtBuscar.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jTxtBuscar.setForeground(new java.awt.Color(102, 102, 102));
        jTxtBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnBuscar.setBackground(new java.awt.Color(0, 110, 230));
        btnBuscar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnBuscar2.setBackground(new java.awt.Color(255, 127, 80));
        btnBuscar2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscar2.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar2.setText("X");
        btnBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 560, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información de la habitación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 16), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        txt_NHabitacion.setEditable(false);
        txt_NHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NHabitacionActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Tipo de habitación");

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("N° Habitación");

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Caracteristicas Opcionales");

        jLabel22.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Descripción");

        cbx_tipoHabitacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbx_tipoHabitacion.setEnabled(false);

        jButton1.setBackground(new java.awt.Color(255, 127, 80));
        jButton1.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Seleccionar otra habitación");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        textArea_Descripcion.setEditable(false);
        textArea_Descripcion.setColumns(1);
        textArea_Descripcion.setLineWrap(true);
        textArea_Descripcion.setRows(5);
        textArea_Descripcion.setToolTipText("");
        textArea_Descripcion.setWrapStyleWord(true);
        jScrollPane1.setViewportView(textArea_Descripcion);

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Costo adicional");

        txtCostoAdicional.setEditable(false);
        txtCostoAdicional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostoAdicionalActionPerformed(evt);
            }
        });

        cbFrigoFab.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        cbFrigoFab.setForeground(new java.awt.Color(0, 0, 0));
        cbFrigoFab.setSelected(true);
        cbFrigoFab.setText("Frigobar");
        cbFrigoFab.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbFrigoFabItemStateChanged(evt);
            }
        });
        cbFrigoFab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbFrigoFabMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbFrigoFabMousePressed(evt);
            }
        });
        cbFrigoFab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbFrigoFabKeyPressed(evt);
            }
        });

        cbAireAcondicionado.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        cbAireAcondicionado.setForeground(new java.awt.Color(0, 0, 0));
        cbAireAcondicionado.setSelected(true);
        cbAireAcondicionado.setText("Aire Acondicionado");
        cbAireAcondicionado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAireAcondicionadoItemStateChanged(evt);
            }
        });
        cbAireAcondicionado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbAireAcondicionadoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPCaracteristicasLayout = new javax.swing.GroupLayout(jPCaracteristicas);
        jPCaracteristicas.setLayout(jPCaracteristicasLayout);
        jPCaracteristicasLayout.setHorizontalGroup(
            jPCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCaracteristicasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbFrigoFab)
                    .addComponent(cbAireAcondicionado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCaracteristicasLayout.setVerticalGroup(
            jPCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCaracteristicasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbFrigoFab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbAireAcondicionado)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_NHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtCostoAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPCaracteristicas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(cbx_tipoHabitacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel11)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_NHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_tipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCostoAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 540, 320));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2229, 395, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información del alquiler", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 16), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Fecha de entrada");

        jDtFechaEntrada.setMaxSelectableDate(new java.util.Date(253370786461000L));
        jDtFechaEntrada.setMinSelectableDate(new java.util.Date(-62135747939000L));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Fecha de salida");

        jDtFechaSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDtFechaSalidaMouseClicked(evt);
            }
        });

        btnBuscar1.setBackground(new java.awt.Color(0, 110, 230));
        btnBuscar1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnBuscar1.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar1.setText("Alquiler");
        btnBuscar1.setEnabled(false);
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        cbx_TipoPago.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cbx_TipoPago.setForeground(new java.awt.Color(102, 102, 102));
        cbx_TipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_TipoPago.setEnabled(false);

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Tipo de pago");

        jLabel21.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Información adicional");

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Costo por día");

        txt_PrecioHabitacion.setEditable(false);
        txt_PrecioHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PrecioHabitacionActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Información de pago:");

        txtCostoTotal1.setEditable(false);

        jLabel24.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("Costo Total");

        btnBuscar3.setBackground(new java.awt.Color(0, 110, 230));
        btnBuscar3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnBuscar3.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar3.setText("Verificar");
        btnBuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jDtFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(117, 117, 117))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jDtFechaSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(27, 27, 27))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(txt_PrecioHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbx_TipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(29, 29, 29)))
                                .addGap(80, 80, 80)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21)
                                            .addComponent(txtDescripcionPago, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtCostoTotal1)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel24)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(btnBuscar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnBuscar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDtFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDtFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_PrecioHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCostoTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_TipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcionPago, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, 540, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1584, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        //        menu.SelectMenu(3, menu.cliente);
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void txt_apellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoKeyPressed

    }//GEN-LAST:event_txt_apellidoKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
//        clienteDTO = cliente.BuscarDNI(jTxtBuscar.getText().trim());
//        if (clienteDTO != null) {
//            llenarCamposCliente(clienteDTO);
//        } else {
//            JOptionPane.showMessageDialog(this, "Este usuario no se encuentra registrado. Serás redirigido al formulario para su registro.", " ERROR ",
//                JOptionPane.ERROR_MESSAGE);
//            //Enviamos el numero de documeto
//            menu.cliente.setNumDoc(jTxtBuscar.getText());
//            limpiarCampos();
//            menu.SelectMenu(3, menu.cliente);
//        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar2ActionPerformed
//        limpiarCampos();
//        clienteDTO = null;
    }//GEN-LAST:event_btnBuscar2ActionPerformed

    private void txt_NHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NHabitacionActionPerformed

        //        objHabitacion = habitacion.buscar(Integer.valueOf(txt_NHabitacion.getText()));
        //        if (objHabitacion != null) {
            //            //txtTipoHabitacion.setText(cargarTipoHab(objHabitacion.getTipoHabitacionID()));
            //            txt_PrecioHabitacion.setText(cargarPrecio(objHabitacion.getTipoHabitacionID()));
            //        }
    }//GEN-LAST:event_txt_NHabitacionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        menu.SelectMenu(0, menu.habitacion);
//        limpiarCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCostoAdicionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostoAdicionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoAdicionalActionPerformed

    private void cbFrigoFabItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbFrigoFabItemStateChanged
//        comprobarCambiosOpciones2();
    }//GEN-LAST:event_cbFrigoFabItemStateChanged

    private void cbFrigoFabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbFrigoFabMouseClicked

    }//GEN-LAST:event_cbFrigoFabMouseClicked

    private void cbFrigoFabMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbFrigoFabMousePressed

    }//GEN-LAST:event_cbFrigoFabMousePressed

    private void cbFrigoFabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbFrigoFabKeyPressed

    }//GEN-LAST:event_cbFrigoFabKeyPressed

    private void cbAireAcondicionadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAireAcondicionadoItemStateChanged
//        comprobarCambiosOpciones();
    }//GEN-LAST:event_cbAireAcondicionadoItemStateChanged

    private void cbAireAcondicionadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbAireAcondicionadoMouseClicked

    }//GEN-LAST:event_cbAireAcondicionadoMouseClicked

    private void jDtFechaSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDtFechaSalidaMouseClicked

    }//GEN-LAST:event_jDtFechaSalidaMouseClicked

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
//
//        int respuesta = JOptionPane.showConfirmDialog(
//            this,
//            "¿Estás seguro de realizar el alquiler?",
//            "Confirmación",
//            JOptionPane.YES_NO_OPTION
//        );
//
//        if (respuesta == JOptionPane.YES_OPTION) {
//            // Acción a realizar si se selecciona "Sí" en la confirmación
//            int idHabitacion = habitacionDTO.getNumHabitacion(), idCliente = clienteDTO.getIdCliente(), idEmpleado = 11;
//            Date fechaIngreso = jDtFechaEntrada.getDate();
//
//            // Crear el objeto SimpleDateFormat con el formato deseado
//            SimpleDateFormat formatoFecha1 = new SimpleDateFormat("yyyy-MM-dd");
//
//            // Formatear la fecha utilizando el objeto SimpleDateFormat
//            String fechaFormateada1 = formatoFecha1.format(fechaIngreso);
//
//            Date fechaSalida = jDtFechaSalida.getDate();
//
//            // Crear el objeto SimpleDateFormat con el formato deseado
//            SimpleDateFormat formatoFecha2 = new SimpleDateFormat("yyyy-MM-dd");
//
//            // Formatear la fecha utilizando el objeto SimpleDateFormat
//            String fechaFormateada2 = formatoFecha2.format(fechaSalida);
//            double monto = Double.parseDouble(txtCostoTotal1.getText());
//            int tipoPago = tHP.buscarName(cbx_TipoPago.getSelectedItem().toString()).getIdTPago();
//            String descripcion = txtDescripcionPago.getText();
//
//            JOptionPane.showMessageDialog(null, rH.registrarAlquiler(idHabitacion, idCliente, idEmpleado, fechaIngreso, fechaSalida, monto, tipoPago, descripcion));
//        } else {
//
//        }

    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void txt_PrecioHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PrecioHabitacionActionPerformed

    }//GEN-LAST:event_txt_PrecioHabitacionActionPerformed

    private void btnBuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar3ActionPerformed
//        if (clienteDTO != null) {
//            Date fecha1 = jDtFechaEntrada.getDate();
//            Date fecha2 = jDtFechaSalida.getDate();
//
//            int dias = restarFechas(fecha1, fecha2);
//            double costoHabitacionPorDia = Double.parseDouble(txt_PrecioHabitacion.getText());
//            double costoTotal = 0.0;
//
//            if (dias == 0 && cbx_tipoHabitacion.getSelectedItem().toString().equals("Matrimonial")) {
//                JTextField additionalInfoField = new JTextField();
//                Object[] message = {
//                    "Ha seleccionado el alquiler por horas. Ingrese el monto:",
//                    additionalInfoField
//                };
//
//                int respuesta = JOptionPane.showConfirmDialog(
//                    null,
//                    message,
//                    "Confirmación",
//                    JOptionPane.YES_NO_OPTION
//                );
//
//                if (respuesta == JOptionPane.YES_OPTION) {
//                    String additionalInfo = additionalInfoField.getText();
//                    txt_PrecioHabitacion.setText("");
//
//                    double adicional = Double.parseDouble(txtCostoAdicional.getText());
//                    costoTotal = Integer.parseInt(additionalInfo) + adicional;
//                    txtCostoTotal1.setText(String.valueOf(costoTotal));
//                    cbx_TipoPago.setEnabled(sw);
//                    btnBuscar1.setEnabled(sw);
//                    txtDescripcionPago.setEnabled(sw);
//
//                } else if (respuesta == JOptionPane.NO_OPTION) {
//                    cbx_TipoPago.setEnabled(!sw);
//                    btnBuscar1.setEnabled(!sw);
//                    txtDescripcionPago.setEnabled(!sw);
//                }
//            } else if (dias > 0) {
//                double adicional = Double.parseDouble(txtCostoAdicional.getText());
//                costoTotal = (costoHabitacionPorDia * dias) + adicional;
//                txtCostoTotal1.setText(String.valueOf(costoTotal));
//
//                int respuesta = JOptionPane.showConfirmDialog(
//                    this,
//                    "El costo total es de " + costoTotal + "\n¿Desea seguir con el Alquiler?",
//                    "Confirmación",
//                    JOptionPane.YES_NO_OPTION
//                );
//
//                if (respuesta == JOptionPane.YES_OPTION) {
//                    // Acción a realizar si se selecciona "Sí" en la confirmación
//                    System.out.println("Confirmación: Sí");
//                    cbx_TipoPago.setEnabled(sw);
//                    btnBuscar1.setEnabled(sw);
//                    txtDescripcionPago.setEnabled(sw);
//                } else if (respuesta == JOptionPane.NO_OPTION) {
//                    cbx_TipoPago.setEnabled(!sw);
//                    btnBuscar1.setEnabled(!sw);
//                    txtDescripcionPago.setEnabled(!sw);
//                }
//            } else if (dias == 0) {
//                JOptionPane.showMessageDialog(
//                    null,
//                    "Las habitaciones que no son de tipo Matrimonial no se pueden alquilar por horas",
//                    "Atención",
//                    JOptionPane.WARNING_MESSAGE
//                );
//            } else {
//                JOptionPane.showMessageDialog(
//                    null,
//                    "Introduzca los días de alquiler correctamente",
//                    "Error",
//                    JOptionPane.ERROR_MESSAGE
//                );
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "Aún no se tiene información del cliente");
//        }
    }//GEN-LAST:event_btnBuscar3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnBuscar2;
    private javax.swing.JButton btnBuscar3;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JCheckBox cbAireAcondicionado;
    private javax.swing.JCheckBox cbFrigoFab;
    private javax.swing.JComboBox<String> cbx_TipoPago;
    private javax.swing.JComboBox<String> cbx_tipoHabitacion;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDtFechaEntrada;
    private com.toedter.calendar.JDateChooser jDtFechaSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLbBienvenido;
    private javax.swing.JPanel jPCaracteristicas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxtBuscar;
    private javax.swing.JTextArea textArea_Descripcion;
    private javax.swing.JTextField txtCostoAdicional;
    private javax.swing.JTextField txtCostoTotal1;
    private javax.swing.JTextField txtDescripcionPago;
    private javax.swing.JTextField txt_NHabitacion;
    private javax.swing.JTextField txt_PrecioHabitacion;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
