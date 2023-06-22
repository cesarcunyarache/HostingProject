package Form;

import BusinessObject.Cliente;
import BusinessObject.TipoDocumento;
import TransferObject.ClienteDTO;
import TransferObject.TipoDocumentoDTO;
import java.util.ArrayList;
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
    TipoDocumento tipoDocumento;
    DefaultTableModel df;
    DefaultComboBoxModel modelo;
    Vector<TipoDocumentoDTO> combo;
    int id = 0;

    public Form_Cliente() {
        initComponents();
        tipoDocumento = new TipoDocumento();
        cliente = new Cliente();
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

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Número de documento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        txt_numDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_numDocKeyTyped(evt);
            }
        });
        jPanel1.add(txt_numDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 210, 30));

        jLabel2.setText("Tipo de documento");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        cbo_tipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "DNI", "Pasaporte" }));
        cbo_tipoDoc.setToolTipText("");
        cbo_tipoDoc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbo_tipoDocItemStateChanged(evt);
            }
        });
        jPanel1.add(cbo_tipoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 210, -1));
        jPanel1.add(txt_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 210, 30));

        jLabel3.setText("Nombres");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));
        jPanel1.add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 210, 30));

        jLabel4.setText("Apellidos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 210, 30));

        jLabel5.setText("Telefono");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel6.setText("Nacionalidad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        cbo_nacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Baréin", "Bélgica", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bisáu", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República del Congo", "República Democrática del Congo", "República Dominicana", "Ruanda", "Rumanía", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue" }));
        jPanel1.add(cbo_nacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 210, -1));
        jPanel1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 210, 30));

        jLabel7.setText("Correo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));
        jPanel1.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 210, 30));

        jLabel8.setText("Dirección");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, -1, -1));

        jLabel9.setText("Género");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        cbo_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Masculino", "Femenino" }));
        jPanel1.add(cbo_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 210, -1));

        btn_Actualizar.setText("Actualizar");
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 120, -1));

        btn_Buscar.setText("Buscar");
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 120, -1));

        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 120, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 770, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        String dni = JOptionPane.showInputDialog("Ingrese el DNI a buscar");

        if (!dni.equals("")) {
            if (dni.matches("[0-9]*")) {
                ClienteDTO clienteDTO = cliente.BuscarDNI(dni);

                if (clienteDTO != null) {
                    txt_numDoc.setText(clienteDTO.getNumDocumento());
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
                && !txt_telefono.getText().isEmpty() && !txt_correo.getText().isEmpty()
                && !txt_direccion.getText().isEmpty() && !cbo_genero.getSelectedItem().equals("-Seleccione-")
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

                if (correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                    String mensaje = cliente.Agregar(numDoc, tipoDoc, nombres, apellidos, telefono, nacionaldad, correo, direccion, genero.charAt(0));
                    JOptionPane.showMessageDialog(null, mensaje);
                    llenarTabla();
                    limpiar();

                } else {
                    JOptionPane.showMessageDialog(null, "Error, formato de correo erróneo");
                }
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

                txt_numDoc.setText(clienteDTO.getNumDocumento());

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

            } else {
                JOptionPane.showMessageDialog(null, "Valor no encontrado");
            }
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
        if (!txt_numDoc.getText().isEmpty() && !cbo_tipoDoc.getSelectedItem().equals("-Seleccione-")
                && !txt_nombres.getText().isEmpty() && !txt_apellidos.getText().isEmpty()
                && !txt_telefono.getText().isEmpty() && !txt_correo.getText().isEmpty()
                && !txt_direccion.getText().isEmpty() && !cbo_genero.getSelectedItem().equals("-Seleccione-")
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

    public void llenarTabla() {

        df.setColumnCount(0);
        df.setRowCount(0);

        String[] cabezera = {"#", "N° de documento", "Nombres", "Apellidos", "Telefono", "Género", "Correo"};
        df.setColumnIdentifiers(cabezera);

        Object[] datos = new Object[df.getColumnCount()];

        ArrayList<ClienteDTO> lista = new ArrayList<>();
        lista = (ArrayList<ClienteDTO>) cliente.Listar();
        if (lista != null) {

            for (int i = 0; i < lista.size(); i++) {
                ClienteDTO c = lista.get(i);

                datos[0] = c.getIdCliente();
                datos[1] = c.getNumDocumento();
                datos[2] = c.getNombres();
                datos[3] = c.getApellidos();
                datos[4] = c.getTelefono();
                datos[5] = c.getGenero();
                datos[6] = c.getCorreo();

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JComboBox<String> cbo_genero;
    private javax.swing.JComboBox<String> cbo_nacionalidad;
    private javax.swing.JComboBox<String> cbo_tipoDoc;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_numDoc;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
