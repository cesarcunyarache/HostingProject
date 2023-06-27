package Form;

import BusinessObject.Cliente;
import BusinessObject.TipoDocumento;
import Menu.Menu;
import TransferObject.ClienteDTO;
import TransferObject.TipoDocumentoDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cesarcunyarache
 */
public class Form_Cliente extends javax.swing.JPanel {

    Cliente cliente;
    ClienteDTO clienteDTO;
    TipoDocumento tipoDocumento;
    DefaultTableModel df;
    DefaultComboBoxModel modelo;
    Vector<TipoDocumentoDTO> combo;
    Menu menu;
    Form_Organizacion formOrg;
    int id = 0;

    public Form_Cliente() {
        initComponents();
        this.menu = menu;
        tipoDocumento = new TipoDocumento();
        cliente = new Cliente();
        formOrg = new Form_Organizacion();
        combo = new Vector<>();
        modelo = new DefaultComboBoxModel(llenarCombo());
        cbo_tipoDoc.setModel(modelo);
        df = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        llenarTabla();
        cbo_nacionalidad.setSelectedItem("Perú");
        rbNombre.setSelected(true);
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_numDoc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbo_tipoDoc = new javax.swing.JComboBox<>();
        txt_nombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbo_nacionalidad = new javax.swing.JComboBox<>();
        txt_correo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbo_genero = new javax.swing.JComboBox<>();
        btn_Actualizar = new javax.swing.JButton();
        btn_Buscar = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        rbCorreo = new javax.swing.JRadioButton();
        rbDni = new javax.swing.JRadioButton();
        rbTelefono = new javax.swing.JRadioButton();
        rbApellidos = new javax.swing.JRadioButton();
        rbNombre = new javax.swing.JRadioButton();
        txtBusqueda = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Número de documento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, -1));

        txt_numDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_numDocKeyTyped(evt);
            }
        });
        jPanel1.add(txt_numDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 210, 30));

        jLabel2.setText("Tipo de documento");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        cbo_tipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "DNI", "Pasaporte" }));
        cbo_tipoDoc.setToolTipText("");
        cbo_tipoDoc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbo_tipoDocItemStateChanged(evt);
            }
        });
        jPanel1.add(cbo_tipoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 210, -1));
        jPanel1.add(txt_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 210, 30));

        jLabel3.setText("Nombres");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));
        jPanel1.add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 210, 30));

        jLabel4.setText("Apellidos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));

        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 210, 30));

        jLabel5.setText("Telefono");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        jLabel6.setText("Nacionalidad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));

        cbo_nacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Baréin", "Bélgica", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bisáu", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República del Congo", "República Democrática del Congo", "República Dominicana", "Ruanda", "Rumanía", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue" }));
        jPanel1.add(cbo_nacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 210, 30));
        jPanel1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 210, 30));

        jLabel7.setText("Correo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));
        jPanel1.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 200, 30));

        jLabel8.setText("Dirección");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, -1, -1));

        jLabel9.setText("Género");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        cbo_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Masculino", "Femenino" }));
        jPanel1.add(cbo_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 210, 30));

        btn_Actualizar.setText("Actualizar");
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 120, 40));

        btn_Buscar.setText("Buscar");
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 120, 40));

        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 120, 40));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 860, 270));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        buttonGroup1.add(rbCorreo);
        rbCorreo.setText("Correo");
        rbCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCorreoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbDni);
        rbDni.setText("Dni");
        rbDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDniActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbTelefono);
        rbTelefono.setText("Telefono");
        rbTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTelefonoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbApellidos);
        rbApellidos.setText("Apellidos");
        rbApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbApellidosActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbNombre);
        rbNombre.setText("Nombres");
        rbNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNombreActionPerformed(evt);
            }
        });

        txtBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaActionPerformed(evt);
            }
        });
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbTelefono)
                            .addComponent(rbNombre)
                            .addComponent(rbDni)
                            .addComponent(rbCorreo)
                            .addComponent(rbApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rbNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbApellidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbTelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbDni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbCorreo)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 130, -1, 270));

        jButton1.setText("Asociar a organización");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, -1, 40));

        jButton2.setText("Alquilar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 320, 90, 40));

        jButton3.setText("Reservar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, 90, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1112, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        String dni = JOptionPane.showInputDialog("Ingrese el DNI a buscar");

        if (dni != null && !dni.equals("")) {
            if (dni.matches("[0-9]*")) {
                ClienteDTO clienteDTO = cliente.BuscarDNI(dni);

                if (clienteDTO != null) {

                    for (TipoDocumentoDTO tipoDocumentoDTO : combo) {
                        if (tipoDocumentoDTO.getIdTipoDocumento() == clienteDTO.getTipoDocumentoID()) {
                            modelo.setSelectedItem(tipoDocumentoDTO);
                        }
                    }
                    txt_nombres.setText(clienteDTO.getNombres());
                    txt_apellidos.setText(clienteDTO.getApellidos());
                    txt_telefono.setText(clienteDTO.getTelefono());
                    txt_correo.setText(clienteDTO.getCorreo());
                    txt_direccion.setText(clienteDTO.getDireccion());

                    switch (clienteDTO.getGenero()) {
                        case 'M' ->
                            cbo_genero.setSelectedIndex(1);
                        case 'F' ->
                            cbo_genero.setSelectedIndex(2);
                        default ->
                            cbo_genero.setSelectedIndex(0);
                    }

                    cbo_nacionalidad.setSelectedItem(clienteDTO.getNacionalidad());
                    txt_numDoc.setText(clienteDTO.getNumDocumento());
                    id = clienteDTO.getIdCliente();

                } else {
                    JOptionPane.showMessageDialog(null, "Valor no encontrado");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese solo valores númericos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Campo vacio");
        }

    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        if (!txt_numDoc.getText().isEmpty() && !cbo_tipoDoc.getSelectedItem().equals("-Seleccione-")
                && !txt_nombres.getText().isEmpty() && !txt_apellidos.getText().isEmpty()
                && !txt_telefono.getText().isEmpty()
                && !cbo_genero.getSelectedItem().equals("-Seleccione-")
                && !cbo_tipoDoc.getSelectedItem().equals("")) {
            String numDoc = txt_numDoc.getText();
            if (numDoc.matches("[0-9]*")) {
                TipoDocumentoDTO var = (TipoDocumentoDTO) cbo_tipoDoc.getSelectedItem();
                int tipoDoc = var.getIdTipoDocumento();
                String nombres = txt_nombres.getText();
                String apellidos = txt_apellidos.getText();
                String telefono = txt_telefono.getText();
                String correo = txt_correo.getText();
                String direccion = txt_direccion.getText();
                String genero = cbo_genero.getSelectedItem().toString();
                String nacionaldad = cbo_nacionalidad.getSelectedItem().toString();
                String mensaje = cliente.Agregar(numDoc, tipoDoc, nombres, apellidos, telefono, nacionaldad, correo, direccion, genero.charAt(0));

                clienteDTO = new ClienteDTO(numDoc, tipoDoc, nombres, apellidos, telefono, nacionaldad, correo, direccion, genero.charAt(0));

                JOptionPane.showMessageDialog(null, mensaje);
                llenarTabla();
                limpiar();
                JOptionPane.showMessageDialog(null, "Se registró al empleado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error, solo ingresa valores númericos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error, uno o más campos vacios!");
        }

    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        id = (int) (tabla.getValueAt(tabla.getSelectedRow(), 0));
        if (id == 0) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        } else {
            ClienteDTO clienteDTO = cliente.Buscar(id);

            if (clienteDTO != null) {

                for (TipoDocumentoDTO tipoDocumentoDTO : combo) {
                    if (tipoDocumentoDTO.getIdTipoDocumento() == clienteDTO.getTipoDocumentoID()) {
                        modelo.setSelectedItem(tipoDocumentoDTO);
                    }
                }

                txt_nombres.setText(clienteDTO.getNombres());
                txt_apellidos.setText(clienteDTO.getApellidos());
                txt_telefono.setText(clienteDTO.getTelefono());
                txt_correo.setText(clienteDTO.getCorreo());
                txt_direccion.setText(clienteDTO.getDireccion());

                switch (clienteDTO.getGenero()) {
                    case 'M' ->
                        cbo_genero.setSelectedIndex(1);
                    case 'F' ->
                        cbo_genero.setSelectedIndex(2);
                    default ->
                        cbo_genero.setSelectedIndex(0);

                }
                cbo_nacionalidad.setSelectedItem(clienteDTO.getNacionalidad());
                txt_numDoc.setText(clienteDTO.getNumDocumento());

            } else {
                JOptionPane.showMessageDialog(null, "Valor no encontrado");
            }
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
        if (!txt_numDoc.getText().isEmpty() && !cbo_tipoDoc.getSelectedItem().equals("-Seleccione-")
                && !txt_nombres.getText().isEmpty() && !txt_apellidos.getText().isEmpty()
                && !txt_telefono.getText().isEmpty()
                && !cbo_genero.getSelectedItem().equals("-Seleccione-")
                && !cbo_tipoDoc.getSelectedItem().equals("")) {

            String numDoc = txt_numDoc.getText();
            TipoDocumentoDTO var = (TipoDocumentoDTO) cbo_tipoDoc.getSelectedItem();
            int tipoDoc = var.getIdTipoDocumento();
            String nombres = txt_nombres.getText();
            String apellidos = txt_apellidos.getText();
            String telefono = txt_telefono.getText();
            String correo = txt_correo.getText();
            String direccion = txt_direccion.getText();
            String genero = cbo_genero.getSelectedItem().toString();
            String nacionaldad = cbo_nacionalidad.getSelectedItem().toString();

            if (correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                String mensaje = cliente.Actualizar(id, numDoc, tipoDoc, nombres, apellidos, telefono, nacionaldad, correo, direccion, genero.charAt(0));

                JOptionPane.showMessageDialog(null, mensaje);
                llenarTabla();
                limpiar();
                id = 0;
            } else {
                JOptionPane.showMessageDialog(null, "Error, formato de correo erróneo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error, uno o más campos vacios!");
        }

    }//GEN-LAST:event_btn_ActualizarActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

    }//GEN-LAST:event_jPanel1MouseClicked

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        if (txt_telefono.getText().length() > 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void txt_numDocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_numDocKeyTyped
        TipoDocumentoDTO obj = (TipoDocumentoDTO) modelo.getSelectedItem();
        String sw = obj.getNombre();
        char c = evt.getKeyChar();

        if (sw.equals("DNI")) {
            if (!Character.isDigit(c)) {
                evt.consume();
            }
            if (txt_numDoc.getText().length() > 7) {
                evt.consume();
            }
        } else if (sw.equals("Pasaporte") || sw.equals("Carnet extranjeria")) {
            if (!Character.isDigit(c)) {
                evt.consume();
            }
            if (txt_numDoc.getText().length() > 8) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txt_numDocKeyTyped

    private void cbo_tipoDocItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbo_tipoDocItemStateChanged
        txt_numDoc.setText("");
    }//GEN-LAST:event_cbo_tipoDocItemStateChanged

    private void txtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaActionPerformed
    private void limpiarTabla() {
        df = (DefaultTableModel) tabla.getModel();
        df.getDataVector().removeAllElements();
        tabla.removeAll();
    }

    private void asignarFilaDeDatos(DefaultTableModel modelo, Object[] datos, ClienteDTO c) {

        datos[0] = c.getIdCliente();
        datos[1] = c.getNumDocumento();
        datos[2] = c.getTipoDocumentoID();
        datos[3] = c.getNombres();
        datos[4] = c.getApellidos();
        datos[5] = c.getTelefono();
        datos[6] = c.getNacionalidad();
        datos[7] = c.getCorreo();
        datos[8] = c.getDireccion();
        datos[9] = c.getGenero();

        modelo.addRow(datos);
    }
    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        try {

            if (!txtBusqueda.getText().isEmpty()) {
                limpiarTabla();

                df = (DefaultTableModel) tabla.getModel();
                Object[] ob = new Object[10];
                if (rbNombre.isSelected()) {
                    List<ClienteDTO> listaCliente = cliente.buscarPorNombre(txtBusqueda.getText());
                    if (listaCliente != null) {
                        for (ClienteDTO c : listaCliente) {
                            asignarFilaDeDatos(df, ob, c);
                        }
                    }
                } else if (rbApellidos.isSelected()) {
                    List<ClienteDTO> listaCliente = cliente.buscarPorApellido(txtBusqueda.getText());
                    if (listaCliente != null) {
                        for (ClienteDTO c : listaCliente) {
                            asignarFilaDeDatos(df, ob, c);
                        }

                    }
                } else if (rbTelefono.isSelected()) {
                    List<ClienteDTO> listaCliente = cliente.buscarPorTelefono(txtBusqueda.getText());
                    if (listaCliente != null) {
                        for (ClienteDTO c : listaCliente) {
                            asignarFilaDeDatos(df, ob, c);
                        }
                    }
                } else if (rbDni.isSelected()) {
                    List<ClienteDTO> listaCliente = cliente.buscarPorDniFiltro(txtBusqueda.getText());
                    if (listaCliente != null) {
                        for (ClienteDTO c : listaCliente) {
                            asignarFilaDeDatos(df, ob, c);
                        }
                    }
                } else if (rbCorreo.isSelected()) {
                    List<ClienteDTO> listaCliente = cliente.buscarPorCorreo(txtBusqueda.getText());
                    if (listaCliente != null) {
                        for (ClienteDTO c : listaCliente) {
                            asignarFilaDeDatos(df, ob, c);
                        }
                    }
                } else {

                    limpiarTabla();
                }
                tabla.setModel(df);

            } else {

                llenarTabla();

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!txt_numDoc.getText().isEmpty()) {

            ClienteDTO obj = cliente.BuscarDNI(txt_numDoc.getText());

            if (obj != null) {
                formOrg.setDataClient(obj);
                menu.SelectMenu(5, formOrg);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Error, ingresa el Número de documento del cliente!");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (clienteDTO != null) {
            menu.reserva.setClienteDTO(clienteDTO);
            //Llenamos el formulario con aquellos datos
            menu.reserva.llenarCamposCliente(clienteDTO);
            //Abrimos formulario
            menu.SelectMenu(2, menu.reserva);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void rbNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNombreActionPerformed
        txtBusqueda.setText("");
    }//GEN-LAST:event_rbNombreActionPerformed

    private void rbApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbApellidosActionPerformed
        txtBusqueda.setText("");
    }//GEN-LAST:event_rbApellidosActionPerformed

    private void rbTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTelefonoActionPerformed
        txtBusqueda.setText("");
    }//GEN-LAST:event_rbTelefonoActionPerformed

    private void rbDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDniActionPerformed
        txtBusqueda.setText("");
    }//GEN-LAST:event_rbDniActionPerformed

    private void rbCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCorreoActionPerformed
        txtBusqueda.setText("");
    }//GEN-LAST:event_rbCorreoActionPerformed

    public void llenarTabla() {

        df.setColumnCount(0);
        df.setRowCount(0);

        String[] cabezera = {"#", "N° de documento", "Tipo Doc", "Nombres", "Apellidos", "Telefono", "Nacionalidad", "Correo", "Direccion", "Género"};
        df.setColumnIdentifiers(cabezera);

        Object[] datos = new Object[df.getColumnCount()];

        ArrayList<ClienteDTO> lista = new ArrayList<>();
        lista = (ArrayList<ClienteDTO>) cliente.Listar();
        if (lista != null) {

            for (int i = 0; i < lista.size(); i++) {
                ClienteDTO c = lista.get(i);

                datos[0] = c.getIdCliente();
                datos[1] = c.getNumDocumento();
                datos[2] = c.getTipoDocumentoID();
                datos[3] = c.getNombres();
                datos[4] = c.getApellidos();
                datos[5] = c.getTelefono();
                datos[6] = c.getNacionalidad();
                datos[7] = c.getCorreo();
                datos[8] = c.getDireccion();
                datos[9] = c.getGenero();

                df.addRow(datos);
            }

            tabla.setModel(df);

        }
    }

    public Vector<TipoDocumentoDTO> llenarCombo() {

        ArrayList<TipoDocumentoDTO> lista = new ArrayList<>();

        lista = (ArrayList<TipoDocumentoDTO>) tipoDocumento.Listar();
        if (lista != null) {
            for (TipoDocumentoDTO tipoDocumentoDTO : lista) {
                combo.add(tipoDocumentoDTO);
            }
        }
        return combo;
    }

    public void limpiar() {
        txt_numDoc.setText("");
        txt_nombres.setText("");
        txt_apellidos.setText("");
        txt_telefono.setText("");
        txt_correo.setText("");
        txt_direccion.setText("");
        cbo_genero.setSelectedIndex(0);
        cbo_nacionalidad.setSelectedItem("Perú");

    }

    public void setNumDoc(String nDoc) {
        txt_numDoc.setText(nDoc);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbo_genero;
    private javax.swing.JComboBox<String> cbo_nacionalidad;
    private javax.swing.JComboBox<String> cbo_tipoDoc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbApellidos;
    private javax.swing.JRadioButton rbCorreo;
    private javax.swing.JRadioButton rbDni;
    private javax.swing.JRadioButton rbNombre;
    private javax.swing.JRadioButton rbTelefono;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_numDoc;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
