package Form;

import BusinessObject.Cliente;
import TransferObject.ClienteDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cesarcunyarache
 */
public class Form_Cliente extends javax.swing.JPanel {

    Cliente cliente;
    DefaultTableModel df;

    public Form_Cliente() {
        initComponents();
        cliente = new Cliente();
        df = new DefaultTableModel();
        llenarTabla();
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

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Número de documento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));
        jPanel1.add(txt_numDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 210, 30));

        jLabel2.setText("Tipo de documento");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        cbo_tipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "DNI", "Pasaporte" }));
        cbo_tipoDoc.setToolTipText("");
        jPanel1.add(cbo_tipoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 210, -1));
        jPanel1.add(txt_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 210, 30));

        jLabel3.setText("Nombres");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));
        jPanel1.add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 210, 30));

        jLabel4.setText("Apellidos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));
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
        String codBusqueda = JOptionPane.showInputDialog("Ingrese el ID a buscar");

        ClienteDTO clienteDTO = cliente.Buscar(Integer.parseInt(codBusqueda));
        
        if (clienteDTO != null) {
            txt_numDoc.setText(clienteDTO.getNumDocumento());
            cbo_tipoDoc.setSelectedItem(clienteDTO.getTipoDocumentoID());
            txt_nombres.setText(clienteDTO.getNombres());
            txt_apellidos.setText(clienteDTO.getApellidos());
            txt_telefono.setText(clienteDTO.getTelefono());
            txt_correo.setText(clienteDTO.getCorreo());
            txt_direccion.setText(clienteDTO.getDireccion());
            cbo_genero.setSelectedItem(clienteDTO.getGenero());
            cbo_nacionalidad.setSelectedItem(clienteDTO.getNacionalidad());

        }


    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        if (!txt_numDoc.getText().isEmpty() && !cbo_tipoDoc.getSelectedItem().equals("-Seleccione-")
                && !txt_nombres.getText().isEmpty() && !txt_apellidos.getText().isEmpty()
                && !txt_telefono.getText().isEmpty() && !txt_correo.getText().isEmpty()
                && !txt_direccion.getText().isEmpty() && !cbo_genero.getSelectedItem().equals("-Seleccione-")
                && !cbo_tipoDoc.getSelectedItem().equals("")) {

            String numDoc = txt_numDoc.getText();
            int tipoDoc = cbo_tipoDoc.getSelectedIndex();
            String nombres = txt_nombres.getText();
            String apellidos = txt_apellidos.getText();
            String telefono = txt_telefono.getText();
            String correo = txt_correo.getText();
            String direccion = txt_direccion.getText();
            String genero = cbo_genero.getSelectedItem().toString();
            String nacionaldad = cbo_tipoDoc.getSelectedItem().toString();

            String mensaje = cliente.Agregar(numDoc, 2, nombres, apellidos, telefono, nacionaldad, correo, direccion, genero.charAt(0));

            if (!mensaje.equals("")) {
                JOptionPane.showMessageDialog(null, mensaje);

            } else {
                JOptionPane.showMessageDialog(null, mensaje);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error, uno o más campos vacios!");
        }
    }//GEN-LAST:event_btn_AgregarActionPerformed

    public void llenarTabla() {

        df.setColumnCount(0);
        df.setRowCount(0);

        String[] cabezera = {"N° de documento", "Nombres", "Apellidos", "Telefono", "Género", "Correo"};
        df.setColumnIdentifiers(cabezera);

        Object[] datos = new Object[df.getColumnCount()];

        ArrayList<ClienteDTO> lista = new ArrayList<>();
        lista = (ArrayList<ClienteDTO>) cliente.Listar();
        if (lista != null) {

            for (int i = 0; i < lista.size(); i++) {
                ClienteDTO c = lista.get(i);

                datos[0] = c.getNumDocumento();
                datos[1] = c.getNombres();
                datos[2] = c.getApellidos();
                datos[3] = c.getTelefono();
                datos[4] = c.getGenero();
                datos[5] = c.getCorreo();

                df.addRow(datos);
            }

            tabla.setModel(df);

        }
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
