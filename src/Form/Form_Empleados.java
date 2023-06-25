package Form;

import BusinessObject.Empleado;
import BusinessObject.TipoEmpleado;
import TransferObject.EmpleadoDTO;
import TransferObject.TipoEmpleadoDTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author cesarcunyarache
 */
public class Form_Empleados extends javax.swing.JPanel {

    int id = 0;
    Empleado emp;
    TipoEmpleado tp;
    DefaultTableModel dt;
    DefaultComboBoxModel modelo;

    public Form_Empleados() {
        initComponents();
        tp = new TipoEmpleado();
        emp = new Empleado();
        modelo = new DefaultComboBoxModel(llenarCombo());
        cbo_tipoEmpleado.setModel(modelo);
        dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        llenarTabla();
    }

    public Vector<String> llenarCombo() {
        Vector<String> combo = new Vector<String>();
        ArrayList<TipoEmpleadoDTO> lista = new ArrayList<>();
        combo.add("-Seleccione-");
        lista = (ArrayList<TipoEmpleadoDTO>) tp.Listar();
        if (lista != null) {
            for (TipoEmpleadoDTO tipoEmpleadoDTO : lista) {
                combo.add(tipoEmpleadoDTO.getNombre());
            }
        }
        return combo;
    }

    public void limpiar() {
        txt_nombres.setText("");
        txt_apellidos1.setText("");

        txt_telefono.setText("");
        txt_correo.setText("");
        cbo_estado.setSelectedIndex(0);
        cbo_tipoEmpleado.setSelectedIndex(0);
        txt_numDoc.setText("");
        cbo_nacionalidad1.setSelectedIndex(0);
        txt_direccion.setText("");
        cbo_genero1.setSelectedIndex(0);
        tabla.clearSelection();
        jDtFechaNacimiento.setDate(null);
        id = 0;
    }

    public void llenarTabla() {

        dt.setColumnCount(0);
        dt.setRowCount(0);

        String[] cabezera = {
            "#",
            "Nombres",
            "Apellidos",
            "Telefono",
            "Correo",
            "Direccion",
            "Fecha Nacimiento",
            "Nacionalidad",
            "Género",
            "DNI",
            "Tipo",
            "Estado"};
        dt.setColumnIdentifiers(cabezera);

        Object[] datos = new Object[dt.getColumnCount()];

        ArrayList<EmpleadoDTO> lista = new ArrayList<>();
        lista = (ArrayList<EmpleadoDTO>) emp.listar();
        if (lista != null) {
            for (int i = 0; i < lista.size(); i++) {
                EmpleadoDTO c = lista.get(i);

                datos[0] = c.getIdEmpleado();
                datos[1] = c.getNombres();
                datos[2] = c.getApellidos();
                datos[3] = c.getTelefono();
                datos[4] = c.getCorreo();
                datos[5] = c.getDireccion();
                datos[6] = c.getFechaNacimiento();
                datos[7] = c.getNacionalidad();
                datos[8] = c.getGenero();
                datos[9] = c.getNumDocumento();
                datos[10] = tp.Buscar(c.getTipoEmpleadoID()).getNombre();
                switch (c.getEstado()) {
                    case 0:
                        datos[11] = "Inactivo";
                        break;
                    case 1:
                        datos[11] = "Activo";
                        break;
                    default:
                        throw new AssertionError();
                }
                dt.addRow(datos);
            }
            tabla.setModel(dt);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(25);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(50);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(50);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(50);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(145);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(130);
            tabla.getColumnModel().getColumn(6).setPreferredWidth(20);
            tabla.getColumnModel().getColumn(7).setPreferredWidth(40);
            tabla.getColumnModel().getColumn(8).setPreferredWidth(20);
            tabla.getColumnModel().getColumn(9).setPreferredWidth(60);
            tabla.getColumnModel().getColumn(10).setPreferredWidth(70);
            tabla.getColumnModel().getColumn(11).setPreferredWidth(40);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btn_Actualizar = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        btn_Buscar = new javax.swing.JButton();
        cbo_estado = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbo_genero1 = new javax.swing.JComboBox<>();
        cbo_nacionalidad1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbo_tipoEmpleado = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        txt_numDoc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_apellidos1 = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_nombres = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btn_nuevo = new javax.swing.JButton();
        jDtFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        rbCorreo = new javax.swing.JRadioButton();
        rbNacionalidad = new javax.swing.JRadioButton();
        rbDni = new javax.swing.JRadioButton();
        rbTelefono = new javax.swing.JRadioButton();
        rbApellidos = new javax.swing.JRadioButton();
        rbNombre = new javax.swing.JRadioButton();
        txtBusqueda = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 1110, 300));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestión Empleados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        btn_Actualizar.setText("Actualizar");
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });

        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });

        btn_Buscar.setText("Buscar");
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });

        cbo_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Activo", "Inactivo" }));
        cbo_estado.setEnabled(false);
        cbo_estado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbo_estadoMouseClicked(evt);
            }
        });
        cbo_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_estadoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Fecha Nacimiento");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Estado");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Género");

        cbo_genero1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Masculino", "Femenino" }));
        cbo_genero1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbo_genero1MouseClicked(evt);
            }
        });

        cbo_nacionalidad1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Baréin", "Bélgica", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bisáu", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República del Congo", "República Democrática del Congo", "República Dominicana", "Ruanda", "Rumanía", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue" }));
        cbo_nacionalidad1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbo_nacionalidad1MouseClicked(evt);
            }
        });
        cbo_nacionalidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_nacionalidad1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Nacionalidad");

        cbo_tipoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-" }));
        cbo_tipoEmpleado.setToolTipText("");
        cbo_tipoEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbo_tipoEmpleadoMouseClicked(evt);
            }
        });
        cbo_tipoEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbo_tipoEmpleadoKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Tipo de Empleado");

        txt_direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_direccionKeyPressed(evt);
            }
        });

        txt_numDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numDocActionPerformed(evt);
            }
        });
        txt_numDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_numDocKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_numDocKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Número de documento");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Correo");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Nombres");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Apellidos");

        txt_apellidos1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_apellidos1KeyPressed(evt);
            }
        });

        txt_correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_correoKeyPressed(evt);
            }
        });

        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Telefono");

        txt_nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombresKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Dirección");

        btn_nuevo.setText("Nuevo");
        btn_nuevo.setEnabled(false);
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        buttonGroup1.add(rbCorreo);
        rbCorreo.setText("Correo");

        buttonGroup1.add(rbNacionalidad);
        rbNacionalidad.setText("Nacionalidad");

        buttonGroup1.add(rbDni);
        rbDni.setText("Dni");

        buttonGroup1.add(rbTelefono);
        rbTelefono.setText("Telefono");

        buttonGroup1.add(rbApellidos);
        rbApellidos.setText("Apellidos");

        buttonGroup1.add(rbNombre);
        rbNombre.setText("Nombres");

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
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(rbApellidos)
                                .addComponent(rbNombre))
                            .addComponent(rbDni)
                            .addComponent(rbNacionalidad)
                            .addComponent(rbCorreo))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(rbNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbApellidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbTelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbDni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbNacionalidad)
                .addGap(12, 12, 12)
                .addComponent(rbCorreo)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbo_genero1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 704, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_apellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbo_nacionalidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbo_tipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_numDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDtFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(47, 47, 47)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_apellidos1)
                            .addComponent(txt_nombres)
                            .addComponent(jDtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbo_tipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_numDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbo_nacionalidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbo_genero1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 1110, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1362, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed

        String codBusqueda = JOptionPane.showInputDialog("Ingrese el ID a buscar");

        EmpleadoDTO empDTO = emp.buscarPorID(Integer.parseInt(codBusqueda));

        if (empDTO != null) {
            id = Integer.parseInt(codBusqueda);
            JOptionPane.showMessageDialog(null, "Registro encontrado");
            txt_nombres.setText(empDTO.getNombres());
            txt_apellidos1.setText(empDTO.getApellidos());
            txt_telefono.setText(empDTO.getTelefono());
            txt_correo.setText(empDTO.getCorreo());
            txt_direccion.setText(empDTO.getDireccion());
            jDtFechaNacimiento.setDate(empDTO.getFechaNacimiento());
            cbo_nacionalidad1.setSelectedItem(String.valueOf(empDTO.getNacionalidad()));

            switch (empDTO.getGenero()) {
                case 'M' ->
                    cbo_genero1.setSelectedIndex(1);
                case 'F' ->
                    cbo_genero1.setSelectedIndex(2);
                default ->
                    cbo_genero1.setSelectedIndex(0);

            }

            txt_numDoc.setText(empDTO.getNumDocumento());

            cbo_tipoEmpleado.setSelectedItem(tp.Buscar(empDTO.getTipoEmpleadoID()).getNombre());

            switch (empDTO.getEstado()) {
                case 1 ->
                    cbo_estado.setSelectedIndex(1);
                case 0 ->
                    cbo_estado.setSelectedIndex(2);
                default ->
                    cbo_estado.setSelectedIndex(0);

            }

        } else {
            JOptionPane.showMessageDialog(null, "Registro no encontrado");
        }

    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed

        if (!txt_numDoc.getText().isEmpty()
                && !txt_nombres.getText().isEmpty() && !(jDtFechaNacimiento.getDate() == null)
                && !txt_telefono.getText().isEmpty() && !txt_correo.getText().isEmpty()
                && !txt_direccion.getText().isEmpty() && !cbo_genero1.getSelectedItem().equals("-Seleccione-")
                && !cbo_tipoEmpleado.getSelectedItem().equals("-Seleccione-")
                && !cbo_nacionalidad1.getSelectedItem().equals("-Seleccione-")
                && !txt_apellidos1.getText().isEmpty()) {

            String nombres = txt_nombres.getText();
            String apellidos = txt_apellidos1.getText();
            String telefono = txt_telefono.getText();
            String correo = txt_correo.getText();
            String tipoEmpleado = cbo_tipoEmpleado.getSelectedItem().toString();
            String numDoc = txt_numDoc.getText();
            String nacionaldad = cbo_nacionalidad1.getSelectedItem().toString();
            String direccion = txt_direccion.getText();
            String generoSeleccionado = cbo_genero1.getSelectedItem().toString();
            char genero = generoSeleccionado.charAt(0);

            if (correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {

                java.sql.Date fechaNacimiento = new java.sql.Date(jDtFechaNacimiento.getDate().getTime());
                String mensaje = emp.agregar(tp.BuscarName(tipoEmpleado).getIdTipoEmpleado(), nombres, apellidos, telefono, correo, direccion, fechaNacimiento, nacionaldad, genero, numDoc);
                limpiar();
                llenarTabla();
                if (!mensaje.equals("")) {
                    JOptionPane.showMessageDialog(null, mensaje);

                } else {
                    JOptionPane.showMessageDialog(null, mensaje);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error, formato de correo erróneo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error, uno o más campos vacios!");
        }


    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void cbo_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_estadoActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        id = (int) (tabla.getValueAt(tabla.getSelectedRow(), 0));
        if (id == 0) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        } else {
            btn_nuevo.setEnabled(true);
            btn_Agregar.setEnabled(false);
            cbo_estado.setEnabled(true);

            EmpleadoDTO empDTO = emp.buscarPorID(id);

            if (empDTO != null) {

                txt_nombres.setText(empDTO.getNombres());
                txt_apellidos1.setText(empDTO.getApellidos());
                txt_telefono.setText(empDTO.getTelefono());
                txt_correo.setText(empDTO.getCorreo());
                txt_direccion.setText(empDTO.getDireccion());
                jDtFechaNacimiento.setDate(empDTO.getFechaNacimiento());
                cbo_nacionalidad1.setSelectedItem(String.valueOf(empDTO.getNacionalidad()));

                switch (empDTO.getGenero()) {
                    case 'M' ->
                        cbo_genero1.setSelectedIndex(1);
                    case 'F' ->
                        cbo_genero1.setSelectedIndex(2);
                    default ->
                        cbo_genero1.setSelectedIndex(0);

                }

                txt_numDoc.setText(empDTO.getNumDocumento());

                cbo_tipoEmpleado.setSelectedItem(tp.Buscar(empDTO.getTipoEmpleadoID()).getNombre());

                switch (empDTO.getEstado()) {
                    case 1 ->
                        cbo_estado.setSelectedIndex(1);
                    case 0 ->
                        cbo_estado.setSelectedIndex(2);
                    default ->
                        cbo_estado.setSelectedIndex(0);

                }

            }
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
        if (!txt_numDoc.getText().isEmpty() && !cbo_estado.getSelectedItem().equals("-Seleccione-")
                && !txt_nombres.getText().isEmpty() && !(jDtFechaNacimiento.getDate() == null)
                && !txt_telefono.getText().isEmpty() && !txt_correo.getText().isEmpty()
                && !txt_direccion.getText().isEmpty() && !cbo_genero1.getSelectedItem().equals("-Seleccione-")
                && !cbo_tipoEmpleado.getSelectedItem().equals("-Seleccione-")
                && !cbo_nacionalidad1.getSelectedItem().equals("-Seleccione-")
                && !txt_apellidos1.getText().isEmpty()) {
            String nombres = txt_nombres.getText();
            String apellidos = txt_apellidos1.getText();
            String telefono = txt_telefono.getText();
            String correo = txt_correo.getText();
            String direccion = txt_direccion.getText();

            String generoSeleccionado = cbo_genero1.getSelectedItem().toString();
            char genero = generoSeleccionado.charAt(0);
            String nacionalidad = (String) cbo_nacionalidad1.getSelectedItem();
            String numDoc = txt_numDoc.getText();

            String tipoEmpleado = cbo_tipoEmpleado.getSelectedItem().toString();

            int estado;

            switch (cbo_estado.getSelectedItem().toString()) {
                case "Activo" -> {
                    estado = 1;
                }
                case "Inactivo" -> {
                    estado = 0;
                }
                default ->
                    throw new AssertionError();
            }
            if (correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                java.sql.Date fechaNacimiento = new java.sql.Date(jDtFechaNacimiento.getDate().getTime());
                System.out.println(fechaNacimiento);
                String mensaje = emp.actualizar(id, tp.BuscarName(tipoEmpleado).getIdTipoEmpleado(), nombres, apellidos, telefono, correo, direccion, fechaNacimiento, nacionalidad, genero, numDoc, estado);
                limpiar();
                llenarTabla();
                id = 0;
                if (!mensaje.equals("")) {
                    JOptionPane.showMessageDialog(null, mensaje);

                } else {
                    JOptionPane.showMessageDialog(null, mensaje);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error, formato de correo erróneo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error, uno o más campos vacios!");
        }


    }//GEN-LAST:event_btn_ActualizarActionPerformed

    private void cbo_nacionalidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_nacionalidad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_nacionalidad1ActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        btn_Agregar.setEnabled(true);
        cbo_estado.setEnabled(false);
        limpiar();

    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void txt_nombresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombresKeyPressed
        btn_nuevo.setEnabled(true);
    }//GEN-LAST:event_txt_nombresKeyPressed

    private void txt_apellidos1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidos1KeyPressed
        btn_nuevo.setEnabled(true);
    }//GEN-LAST:event_txt_apellidos1KeyPressed

    private void txt_telefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyPressed
        btn_nuevo.setEnabled(true);
    }//GEN-LAST:event_txt_telefonoKeyPressed

    private void txt_correoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_correoKeyPressed
        btn_nuevo.setEnabled(true);
    }//GEN-LAST:event_txt_correoKeyPressed

    private void cbo_tipoEmpleadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbo_tipoEmpleadoKeyPressed

    }//GEN-LAST:event_cbo_tipoEmpleadoKeyPressed

    private void cbo_tipoEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbo_tipoEmpleadoMouseClicked
        btn_nuevo.setEnabled(true);
    }//GEN-LAST:event_cbo_tipoEmpleadoMouseClicked

    private void txt_numDocKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_numDocKeyPressed
        btn_nuevo.setEnabled(true);
    }//GEN-LAST:event_txt_numDocKeyPressed

    private void cbo_estadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbo_estadoMouseClicked
        btn_nuevo.setEnabled(true);
    }//GEN-LAST:event_cbo_estadoMouseClicked

    private void cbo_nacionalidad1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbo_nacionalidad1MouseClicked
        btn_nuevo.setEnabled(true);
    }//GEN-LAST:event_cbo_nacionalidad1MouseClicked

    private void txt_direccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_direccionKeyPressed
        btn_nuevo.setEnabled(true);
    }//GEN-LAST:event_txt_direccionKeyPressed

    private void cbo_genero1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbo_genero1MouseClicked
        btn_nuevo.setEnabled(true);
    }//GEN-LAST:event_cbo_genero1MouseClicked

    private void txt_numDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numDocActionPerformed

    private void txt_numDocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_numDocKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        if (txt_numDoc.getText().length() > 7) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_numDocKeyTyped

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        if (txt_telefono.getText().length() > 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void txtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaActionPerformed
    private void limpiarTabla() {
        dt = (DefaultTableModel) tabla.getModel();
        dt.getDataVector().removeAllElements();
        tabla.removeAll();
    }

    private void asignarFilaDeDatos(DefaultTableModel modelo, Object[] ob, EmpleadoDTO c) {

        ob[0] = c.getIdEmpleado();
        ob[1] = c.getNombres();
        ob[2] = c.getApellidos();
        ob[3] = c.getTelefono();
        ob[4] = c.getCorreo();
        ob[5] = c.getDireccion();
        ob[6] = c.getFechaNacimiento();
        ob[7] = c.getNacionalidad();
        ob[8] = c.getGenero();
        ob[9] = c.getNumDocumento();
        ob[10] = c.getTipoEmpleadoID();
        ob[11] = c.getEstado();

        modelo.addRow(ob);
    }
    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        try {

            if (!txtBusqueda.getText().isEmpty()) {
                limpiarTabla();

                dt = (DefaultTableModel) tabla.getModel();
                Object[] ob = new Object[12];
                if (rbNombre.isSelected()) {
                    List<EmpleadoDTO> listaEmpleados = emp.buscarPorNombre(txtBusqueda.getText());
                    if (listaEmpleados != null) {
                        for (EmpleadoDTO c : listaEmpleados) {
                            asignarFilaDeDatos(dt, ob, c);
                        }
                    }
                } else if (rbApellidos.isSelected()) {
                    List<EmpleadoDTO> listaEmpleados = emp.buscarPorApellido(txtBusqueda.getText());
                    if (listaEmpleados != null) {
                        for (EmpleadoDTO c : listaEmpleados) {
                            asignarFilaDeDatos(dt, ob, c);
                        }

                    }
                } else if (rbTelefono.isSelected()) {
                    List<EmpleadoDTO> listaEmpleados = emp.buscarPorTelefono(txtBusqueda.getText());
                    if (listaEmpleados != null) {
                        for (EmpleadoDTO c : listaEmpleados) {
                            asignarFilaDeDatos(dt, ob, c);
                        }
                    }
                } else if (rbDni.isSelected()) {
                    List<EmpleadoDTO> listaEmpleados = emp.buscarPorDniFiltro(txtBusqueda.getText());
                    if (listaEmpleados != null) {
                        for (EmpleadoDTO c : listaEmpleados) {
                            asignarFilaDeDatos(dt, ob, c);
                        }
                    }
                } else if (rbNacionalidad.isSelected()) {
                    List<EmpleadoDTO> listaEmpleados = emp.buscarPorNacionalidad(txtBusqueda.getText());
                    if (listaEmpleados != null) {
                        for (EmpleadoDTO c : listaEmpleados) {
                            asignarFilaDeDatos(dt, ob, c);
                        }
                    }
                } else if (rbCorreo.isSelected()) {
                    List<EmpleadoDTO> listaEmpleados = emp.buscarPorCorreo(txtBusqueda.getText());
                    if (listaEmpleados != null) {
                        for (EmpleadoDTO c : listaEmpleados) {
                            asignarFilaDeDatos(dt, ob, c);
                        }
                    }
                } else {

                    limpiarTabla();
                }
                tabla.setModel(dt);

            } else {

                llenarTabla();

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtBusquedaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbo_estado;
    private javax.swing.JComboBox<String> cbo_genero1;
    private javax.swing.JComboBox<String> cbo_nacionalidad1;
    private javax.swing.JComboBox<String> cbo_tipoEmpleado;
    private com.toedter.calendar.JDateChooser jDtFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbApellidos;
    private javax.swing.JRadioButton rbCorreo;
    private javax.swing.JRadioButton rbDni;
    private javax.swing.JRadioButton rbNacionalidad;
    private javax.swing.JRadioButton rbNombre;
    private javax.swing.JRadioButton rbTelefono;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txt_apellidos1;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_numDoc;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
