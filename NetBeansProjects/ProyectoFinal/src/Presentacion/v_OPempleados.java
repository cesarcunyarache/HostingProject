package Presentacion;

import BusinessObject.*;
import TransferObject.*;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerContrastIJTheme;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.table.DefaultTableModel;

public class v_OPempleados extends javax.swing.JFrame {

    //iDEmpleado
    int idEmpleado;
    //CLIENTES
    DefaultTableModel modelCliente;
    Cliente cln;
    ClienteDTO clnDTO;
    int idCliente;

    TipoDocumento tD;
    TipoDocumentoDTO tdDTO;

    // ASIGNACION DE HABITACIONES
    DefaultTableModel modelClienteHabitaciones;
    int idClienteHabitaciones;

    TipoHabitacion tH;
    TipoHabitacionDTO tHDTO;

    Habitacion h;
    HabitacionDTO hDTO;

    int idHabitacionAsignar;
    DefaultTableModel habitacionesModel;

    String estadoHabitacion;

    //registro de habitaciones
    RegistroHabitacion regHabita;
    RegistroHabitacionDTO regHabitaDTO;

    DefaultTableModel registroModel;
    int idRegistro;

    int idTipoHasig;

    public v_OPempleados() {
        initComponents();
        // VENTANA REGISTRO CLIENTES
        modelCliente = new DefaultTableModel();
        tD = new TipoDocumento();
        tdDTO = new TipoDocumentoDTO();
        listar();
        llenarComboTipo();

        // VENTANA ASIGNACION DE HABITACIONES
        modelClienteHabitaciones = new DefaultTableModel();
        tH = new TipoHabitacion();
        tHDTO = new TipoHabitacionDTO();

        h = new Habitacion();
        hDTO = new HabitacionDTO();
        listarClientesH();

        llenarComboTiposHabitacion();
        habitacionesModel = new DefaultTableModel();

        regHabita = new RegistroHabitacion();
        regHabitaDTO = new RegistroHabitacionDTO();

        // REGISTRO CLIENTES
        registroModel = new DefaultTableModel();
        listarRegistros();
        BTN_FECHA.setVisible(false);
    }

    public void mostrarConValidacion(int idEmpleado) {
        this.setVisible(true);
        txtEmpleadoActivo.setText(String.valueOf(idEmpleado));
        this.idEmpleado = idEmpleado;
    }

    public void ocultar() {
        this.setVisible(false);
    }

    // METODOS VENTANA CLIENTE  ////////////////////////     
    private void listar() {
        cln = new Cliente();
        limpiarTabla();
        try {
            modelCliente = (DefaultTableModel) tblCliente.getModel();
            Object[] obj = new Object[10];
            for (ClienteDTO p : cln.listar()) {
                asignarFilaDeDatos(modelCliente, obj, p);
            }
            tblCliente.setModel(modelCliente);
        } catch (Exception e) {
        }

    }

    private void limpiarTexto() {
        txtApellidos.setText("");
        txtNombres.setText("");
        cboTipoDocumento.setSelectedIndex(0);
        txtNumeroDocumento.setText("");
        cboGenero.setSelectedIndex(0);
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        cbxNacionalidad.setSelectedIndex(0);
        tblCliente.clearSelection();
        buttonGroup1.clearSelection();
        tblCliente.clearSelection();
        listar();
    }

    private void llenarComboTipo() {
        List<TipoDocumentoDTO> listaTipos = tD.listar();
        cboTipoDocumento.removeAllItems();
        cboTipoDocumento.addItem("Seleccione");
        for (int i = 0; i < listaTipos.size(); i++) {
            cboTipoDocumento.addItem(String.valueOf(listaTipos.get(i).getIdTipoDocumento() + " - " + String.valueOf(listaTipos.get(i).getNombre())));

        }
    }

    private void asignarFilaDeDatos(DefaultTableModel modelo, Object[] ob, ClienteDTO c) {

        ob[0] = c.getIdCliente();
        ob[1] = c.getNombres();
        ob[2] = c.getApellidos();
        ob[3] = c.getTelefono();
        ob[4] = c.getNacionalidad();
        ob[5] = c.getCorreo();
        ob[6] = c.getDireccion();
//        ob[7] = c.getNumDoc();
        ob[8] = c.getTipoDocumentoID();
        ob[9] = c.getGenero();
        modelo.addRow(ob);
    }

    private void limpiarTabla() {
        modelCliente = (DefaultTableModel) tblCliente.getModel();
        modelCliente.getDataVector().removeAllElements();
        tblCliente.removeAll();
    }

    ////////////////////////    METODOS VENTANA CLIENTE
    // METODOS VENTANA CLIENTE TABLA  ////////////////////////     
    private void listarClientesH() {
        cln = new Cliente();
        limpiarTablaAsig();
        try {
            modelClienteHabitaciones = (DefaultTableModel) tblClientesParaAs.getModel();
            Object[] obj = new Object[10];
            for (ClienteDTO p : cln.listar()) {
                asignarFilaDeDatosClienAsig(modelClienteHabitaciones, obj, p);
            }
            tblClientesParaAs.setModel(modelClienteHabitaciones);
        } catch (Exception e) {
        }

    }

    private void llenarComboTiposHabitacion() {
//        List<TipoHabitacionDTO> listaTipos = tH.listar();
//        cboTipoHabitacion.removeAllItems();
//        cboTipoHabitacion.addItem("Seleccione");
//        for (int i = 0; i < listaTipos.size(); i++) {
//            cboTipoHabitacion.addItem(String.valueOf(listaTipos.get(i).getIdTipo() + " - " + String.valueOf(listaTipos.get(i).getNombre())));
//
//        }
    }

    private void asignarFilaDeDatosClienAsig(DefaultTableModel modelo, Object[] ob, ClienteDTO c) {

//        ob[0] = c.getIdCliente();
//        ob[1] = c.getNombres();
//        ob[2] = c.getApellidos();
//        ob[3] = c.getTelefono();
//        ob[4] = c.getNumDoc();
//
//        modelo.addRow(ob);
    }

    private void limpiarTablaAsig() {
        modelClienteHabitaciones = (DefaultTableModel) tblClientesParaAs.getModel();
        modelClienteHabitaciones.getDataVector().removeAllElements();
        tblClientesParaAs.removeAll();
    }

    ////////////////////////    METODOS VENTANA CLIENTE
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel16 = new javax.swing.JPanel();
        tbTodo = new javax.swing.JTabbedPane();
        pnlAsignarHabitacion = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtEmpleadoActivo = new javax.swing.JTextField();
        mensajeHabit = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtAsignarBuscar = new javax.swing.JTextField();
        rdbID_asig = new javax.swing.JRadioButton();
        rdbDni_asig = new javax.swing.JRadioButton();
        rdbTel_asig = new javax.swing.JRadioButton();
        msjASIG = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        cboTipoHabitacion = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblHabitaciones = new javax.swing.JTable();
        tblClienteSeleccionado = new javax.swing.JLabel();
        txtFechaIngreso = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        btnAsignarHabitacion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientesParaAs = new javax.swing.JTable();
        pnlRegistrarClientes = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        txtBuscarRegistroCliente = new javax.swing.JTextField();
        rdbID_rCliente = new javax.swing.JRadioButton();
        rdbGenero_cliente = new javax.swing.JRadioButton();
        rdbApellidos_Cliente = new javax.swing.JRadioButton();
        rdbDNI_cliente = new javax.swing.JRadioButton();
        mensajetbl = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        cboTipoDocumento = new javax.swing.JComboBox<>();
        txtNumeroDocumento = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cboGenero = new javax.swing.JComboBox<>();
        cbxNacionalidad = new javax.swing.JComboBox<>();
        jPanel15 = new javax.swing.JPanel();
        btnAgregarRegCliente = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btnActualizarRegCliente = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btnNuevoRegCliente = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        btnEliminarRegCliente = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        pnlCheckOut = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        txtBuscarRegistros = new javax.swing.JTextField();
        reg_rbIDregistro = new javax.swing.JRadioButton();
        reg_rbfechaIngreso = new javax.swing.JRadioButton();
        reg_rbIDhabitacion = new javax.swing.JRadioButton();
        reg_IDEMPLEADO = new javax.swing.JRadioButton();
        reg_rdIDCLIENTE = new javax.swing.JRadioButton();
        reg_rbfechaSalida = new javax.swing.JRadioButton();
        msjBusquedaRegistro = new javax.swing.JLabel();
        BTN_FECHA = new javax.swing.JButton();
        choseerrBuscar = new com.toedter.calendar.JDateChooser();
        jPanel14 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txt_regIDselec = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        dateSalida = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        lbRegistro = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();
        msjChecks = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        msjCheck = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 580, 34));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Empleado Activo"));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel3.setText("ID");

        txtEmpleadoActivo.setEditable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmpleadoActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmpleadoActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        mensajeHabit.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        mensajeHabit.setText("Mensaje");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Buscar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 1, 14))); // NOI18N

        txtAsignarBuscar.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        txtAsignarBuscar.setBorder(null);
        txtAsignarBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAsignarBuscarKeyReleased(evt);
            }
        });

        buttonGroup2.add(rdbID_asig);
        rdbID_asig.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        rdbID_asig.setText("IdCliente");

        buttonGroup2.add(rdbDni_asig);
        rdbDni_asig.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        rdbDni_asig.setText("Dni");

        buttonGroup2.add(rdbTel_asig);
        rdbTel_asig.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        rdbTel_asig.setText("telefono");

        msjASIG.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdbID_asig, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbTel_asig, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbDni_asig, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2)
                    .addComponent(txtAsignarBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(msjASIG, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAsignarBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbID_asig)
                    .addComponent(rdbDni_asig)
                    .addComponent(rdbTel_asig))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(msjASIG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Habitaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 1, 14))); // NOI18N

        cboTipoHabitacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTipoHabitacionItemStateChanged(evt);
            }
        });
        cboTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoHabitacionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel1.setText("Tipo Habitaciones");

        tblHabitaciones.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        tblHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "#", "Estado"
            }
        ));
        tblHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHabitacionesMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblHabitaciones);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tblClienteSeleccionado.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        tblClienteSeleccionado.setText("Mensaje");

        txtFechaIngreso.setDateFormatString("yyyy/dd/MM HH:mm");

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel2.setText("Fecha:");

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Operaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 1, 14))); // NOI18N

        jButton2.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jButton2.setText("NUEVO");
        jButton2.setPreferredSize(new java.awt.Dimension(78, 35));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnAsignarHabitacion.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnAsignarHabitacion.setText("ASIGNAR HABITACIÓN");
        btnAsignarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarHabitacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAsignarHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAsignarHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tblClientesParaAs.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        tblClientesParaAs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "IdCliente", "Nombres", "Apellidos", "telefono", "Num Doc."
            }
        ));
        tblClientesParaAs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesParaAsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientesParaAs);
        if (tblClientesParaAs.getColumnModel().getColumnCount() > 0) {
            tblClientesParaAs.getColumnModel().getColumn(0).setMinWidth(80);
            tblClientesParaAs.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblClientesParaAs.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        javax.swing.GroupLayout pnlAsignarHabitacionLayout = new javax.swing.GroupLayout(pnlAsignarHabitacion);
        pnlAsignarHabitacion.setLayout(pnlAsignarHabitacionLayout);
        pnlAsignarHabitacionLayout.setHorizontalGroup(
            pnlAsignarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAsignarHabitacionLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(pnlAsignarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAsignarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAsignarHabitacionLayout.createSequentialGroup()
                        .addGroup(pnlAsignarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAsignarHabitacionLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlAsignarHabitacionLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlAsignarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(56, Short.MAX_VALUE))
                    .addGroup(pnlAsignarHabitacionLayout.createSequentialGroup()
                        .addComponent(mensajeHabit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tblClienteSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        pnlAsignarHabitacionLayout.setVerticalGroup(
            pnlAsignarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAsignarHabitacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAsignarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAsignarHabitacionLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(pnlAsignarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAsignarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mensajeHabit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tblClienteSeleccionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlAsignarHabitacionLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        tbTodo.addTab("Asignación Habitaciones", pnlAsignarHabitacion);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Buscar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 1, 14))); // NOI18N

        txtBuscarRegistroCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarRegistroClienteKeyReleased(evt);
            }
        });

        buttonGroup1.add(rdbID_rCliente);
        rdbID_rCliente.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        rdbID_rCliente.setText("idCliente");

        buttonGroup1.add(rdbGenero_cliente);
        rdbGenero_cliente.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        rdbGenero_cliente.setText("Genero");

        buttonGroup1.add(rdbApellidos_Cliente);
        rdbApellidos_Cliente.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        rdbApellidos_Cliente.setText("Apellidos");

        buttonGroup1.add(rdbDNI_cliente);
        rdbDNI_cliente.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        rdbDNI_cliente.setText("Dni");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbID_rCliente)
                .addGap(29, 29, 29)
                .addComponent(rdbApellidos_Cliente)
                .addGap(28, 28, 28)
                .addComponent(rdbDNI_cliente)
                .addGap(35, 35, 35)
                .addComponent(rdbGenero_cliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(txtBuscarRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbID_rCliente)
                    .addComponent(rdbGenero_cliente)
                    .addComponent(rdbApellidos_Cliente)
                    .addComponent(rdbDNI_cliente)
                    .addComponent(txtBuscarRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        mensajetbl.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N

        tblCliente.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "IdCliente", "Nombres", "Apellidos", "Teléfono", "Nacionalidad", "Correo", "Dirección", "Número", "Tipo Doc.", "Genero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblCliente);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 1, 14))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel4.setText("Apellidos");

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel5.setText("Nombres");

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel6.setText("Numero de Documento");

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel7.setText("Tipo de Documento");

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel8.setText("Genero");

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel9.setText("Dirección");

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel10.setText("Teléfono");

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel12.setText("Correo");

        txtNombres.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        txtApellidos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        cboTipoDocumento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cboTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Dni", "Carnet de Extranjería", "Pasaporte" }));

        txtNumeroDocumento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        txtDireccion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        txtTelefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        txtCorreo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel13.setText("Nacionalidad");

        cboGenero.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "M", "F" }));

        cbxNacionalidad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cbxNacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Baréin", "Bélgica", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bisáu", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República del Congo", "República Democrática del Congo", "República Dominicana", "Ruanda", "Rumanía", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue" }));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel5))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboGenero, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumeroDocumento, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cboTipoDocumento, javax.swing.GroupLayout.Alignment.CENTER, 0, 1, Short.MAX_VALUE)
                    .addComponent(txtNombres, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cbxNacionalidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cbxNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        btnAgregarRegCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarRegCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarRegCliente.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        btnAgregarRegCliente.setPreferredSize(new java.awt.Dimension(133, 29));
        btnAgregarRegCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarRegClienteMouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("AGREGAR");

        javax.swing.GroupLayout btnAgregarRegClienteLayout = new javax.swing.GroupLayout(btnAgregarRegCliente);
        btnAgregarRegCliente.setLayout(btnAgregarRegClienteLayout);
        btnAgregarRegClienteLayout.setHorizontalGroup(
            btnAgregarRegClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAgregarRegClienteLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(31, 31, 31))
        );
        btnAgregarRegClienteLayout.setVerticalGroup(
            btnAgregarRegClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarRegClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        btnActualizarRegCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizarRegCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarRegCliente.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        btnActualizarRegCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarRegClienteMouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("ACTUALIZAR");

        javax.swing.GroupLayout btnActualizarRegClienteLayout = new javax.swing.GroupLayout(btnActualizarRegCliente);
        btnActualizarRegCliente.setLayout(btnActualizarRegClienteLayout);
        btnActualizarRegClienteLayout.setHorizontalGroup(
            btnActualizarRegClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizarRegClienteLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel17)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        btnActualizarRegClienteLayout.setVerticalGroup(
            btnActualizarRegClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizarRegClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNuevoRegCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnNuevoRegCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoRegCliente.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        btnNuevoRegCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoRegClienteMouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("NUEVO");

        javax.swing.GroupLayout btnNuevoRegClienteLayout = new javax.swing.GroupLayout(btnNuevoRegCliente);
        btnNuevoRegCliente.setLayout(btnNuevoRegClienteLayout);
        btnNuevoRegClienteLayout.setHorizontalGroup(
            btnNuevoRegClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNuevoRegClienteLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel18)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        btnNuevoRegClienteLayout.setVerticalGroup(
            btnNuevoRegClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnNuevoRegClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addContainerGap())
        );

        btnEliminarRegCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarRegCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarRegCliente.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        btnEliminarRegCliente.setPreferredSize(new java.awt.Dimension(133, 29));
        btnEliminarRegCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarRegClienteMouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("ELIMINAR");

        javax.swing.GroupLayout btnEliminarRegClienteLayout = new javax.swing.GroupLayout(btnEliminarRegCliente);
        btnEliminarRegCliente.setLayout(btnEliminarRegClienteLayout);
        btnEliminarRegClienteLayout.setHorizontalGroup(
            btnEliminarRegClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEliminarRegClienteLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(31, 31, 31))
        );
        btnEliminarRegClienteLayout.setVerticalGroup(
            btnEliminarRegClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarRegClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(btnAgregarRegCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarRegCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(btnEliminarRegCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevoRegCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregarRegCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btnActualizarRegCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminarRegCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btnNuevoRegCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel20.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel20.setText("MENSAJE:");

        javax.swing.GroupLayout pnlRegistrarClientesLayout = new javax.swing.GroupLayout(pnlRegistrarClientes);
        pnlRegistrarClientes.setLayout(pnlRegistrarClientesLayout);
        pnlRegistrarClientesLayout.setHorizontalGroup(
            pnlRegistrarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarClientesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlRegistrarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRegistrarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlRegistrarClientesLayout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mensajetbl, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlRegistrarClientesLayout.setVerticalGroup(
            pnlRegistrarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarClientesLayout.createSequentialGroup()
                .addGroup(pnlRegistrarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistrarClientesLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlRegistrarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mensajetbl, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlRegistrarClientesLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tbTodo.addTab("Registro Cliente", pnlRegistrarClientes);

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Buscar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 1, 14))); // NOI18N

        txtBuscarRegistros.setEnabled(false);
        txtBuscarRegistros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarRegistrosKeyReleased(evt);
            }
        });

        buttonGroup3.add(reg_rbIDregistro);
        reg_rbIDregistro.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        reg_rbIDregistro.setText("idRegistro");
        reg_rbIDregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_rbIDregistroActionPerformed(evt);
            }
        });

        buttonGroup3.add(reg_rbfechaIngreso);
        reg_rbfechaIngreso.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        reg_rbfechaIngreso.setText("Fecha Ingreso");
        reg_rbfechaIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_rbfechaIngresoActionPerformed(evt);
            }
        });

        buttonGroup3.add(reg_rbIDhabitacion);
        reg_rbIDhabitacion.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        reg_rbIDhabitacion.setText("idHabitacion");
        reg_rbIDhabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_rbIDhabitacionActionPerformed(evt);
            }
        });

        buttonGroup3.add(reg_IDEMPLEADO);
        reg_IDEMPLEADO.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        reg_IDEMPLEADO.setText("idEmpleado");
        reg_IDEMPLEADO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_IDEMPLEADOActionPerformed(evt);
            }
        });

        buttonGroup3.add(reg_rdIDCLIENTE);
        reg_rdIDCLIENTE.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        reg_rdIDCLIENTE.setText("idCliente");
        reg_rdIDCLIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_rdIDCLIENTEActionPerformed(evt);
            }
        });

        buttonGroup3.add(reg_rbfechaSalida);
        reg_rbfechaSalida.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        reg_rbfechaSalida.setText("Fecha Salida");
        reg_rbfechaSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_rbfechaSalidaActionPerformed(evt);
            }
        });

        msjBusquedaRegistro.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        msjBusquedaRegistro.setText("Mensaje Busqueda");

        BTN_FECHA.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        BTN_FECHA.setText("GO");
        BTN_FECHA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_FECHAActionPerformed(evt);
            }
        });

        choseerrBuscar.setDateFormatString("yyyy/dd/MM HH:mm");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(reg_rbIDhabitacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(reg_rbfechaSalida))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reg_IDEMPLEADO)
                            .addComponent(reg_rbIDregistro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reg_rbfechaIngreso)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addComponent(reg_rdIDCLIENTE)
                                .addGap(26, 26, 26)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(msjBusquedaRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtBuscarRegistros)
                    .addComponent(choseerrBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reg_rbIDregistro)
                    .addComponent(reg_rdIDCLIENTE)
                    .addComponent(txtBuscarRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(reg_IDEMPLEADO)
                        .addComponent(reg_rbfechaIngreso))
                    .addComponent(choseerrBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(msjBusquedaRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTN_FECHA))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reg_rbIDhabitacion)
                            .addComponent(reg_rbfechaSalida))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "CheckOut", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 0, 12))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel14.setText("idCliente");

        txt_regIDselec.setEditable(false);

        jLabel15.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel15.setText("Fecha Salida");

        jButton3.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jButton3.setText("Realizar CheckOut");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jButton4.setText("Nuevo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        dateSalida.setDateFormatString("yyyy/dd/MM HH:mm");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_regIDselec, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_regIDselec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(dateSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel11.setText("SELECCIONADO");

        tblRegistro.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        tblRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idRegistro", "idHabitacion", "idCliente", "idEmpleado", "fechaIngreso", "fechaSalida"
            }
        ));
        tblRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegistroMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblRegistro);
        if (tblRegistro.getColumnModel().getColumnCount() > 0) {
            tblRegistro.getColumnModel().getColumn(0).setMinWidth(80);
            tblRegistro.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblRegistro.getColumnModel().getColumn(0).setMaxWidth(80);
            tblRegistro.getColumnModel().getColumn(1).setMinWidth(95);
            tblRegistro.getColumnModel().getColumn(1).setPreferredWidth(95);
            tblRegistro.getColumnModel().getColumn(1).setMaxWidth(95);
            tblRegistro.getColumnModel().getColumn(2).setMinWidth(95);
            tblRegistro.getColumnModel().getColumn(2).setPreferredWidth(95);
            tblRegistro.getColumnModel().getColumn(2).setMaxWidth(95);
            tblRegistro.getColumnModel().getColumn(3).setMinWidth(95);
            tblRegistro.getColumnModel().getColumn(3).setPreferredWidth(95);
            tblRegistro.getColumnModel().getColumn(3).setMaxWidth(95);
        }

        jLabel21.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel21.setText("MENSAJE:");

        javax.swing.GroupLayout pnlCheckOutLayout = new javax.swing.GroupLayout(pnlCheckOut);
        pnlCheckOut.setLayout(pnlCheckOutLayout);
        pnlCheckOutLayout.setHorizontalGroup(
            pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCheckOutLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(lbRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addGroup(pnlCheckOutLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCheckOutLayout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(msjChecks, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        pnlCheckOutLayout.setVerticalGroup(
            pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCheckOutLayout.createSequentialGroup()
                .addGroup(pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCheckOutLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCheckOutLayout.createSequentialGroup()
                        .addGroup(pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(msjChecks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        tbTodo.addTab("Registro de Habitaciones", pnlCheckOut);

        getContentPane().add(tbTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 600));
        getContentPane().add(msjCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu1.setText("Operaciones");

        jMenuItem2.setText("Registrar Clientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Asignar Habitaciones");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Check Out registros");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);
        jMenu1.add(jSeparator1);

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblClientesParaAsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesParaAsMouseClicked
        // TODO add your handling code here:
        int fila = tblClientesParaAs.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar una Fila");
        } else {
            idCliente = Integer.parseInt(tblClientesParaAs.getValueAt(fila, 0).toString());
            tblClienteSeleccionado.setText("Cliente seleccionado: " + idCliente);
        }
    }//GEN-LAST:event_tblClientesParaAsMouseClicked

    private void btnAsignarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarHabitacionActionPerformed

        String mensaje = "";
        if (h.actualizarEstado(idHabitacionAsignar, 1)) {
            mensaje = regHabita.agregar(idHabitacionAsignar, idCliente, idEmpleado, ((JTextField) txtFechaIngreso.getDateEditor().getUiComponent()).getText());
            limpiarTexto();
            mensajeHabit.setText(mensaje);
            listarRegistros();
            listarClientesH();
            listarTiposHabitaciones(idTipoHasig);
            limpAsignar();

        } else {
            JOptionPane.showMessageDialog(null, "La habitacion se encuentra ocupada");
        }


    }//GEN-LAST:event_btnAsignarHabitacionActionPerformed

    private void listarRegistros() {
        regHabita = new RegistroHabitacion();
        limpiarTablaREGISTRO();
        try {
            registroModel = (DefaultTableModel) tblRegistro.getModel();
            Object[] obj = new Object[6];
            for (RegistroHabitacionDTO p : regHabita.listar()) {
                asignarFilaDeDatosREGISTROS(registroModel, obj, p);
            }
            tblRegistro.setModel(registroModel);
        } catch (Exception e) {
        }

    }

    private void asignarFilaDeDatosREGISTROS(DefaultTableModel modelo, Object[] ob, RegistroHabitacionDTO c) {

//        ob[0] = c.getIdRegistro();
//        ob[1] = c.getIdHabitacion();
//        ob[2] = c.getIdCliente();
//        ob[3] = c.getIdEmpleado();
//        ob[4] = c.getFechaIngreso();
//        ob[5] = c.getFechaSalida();
//
//        modelo.addRow(ob);
    }

    private void limpiarTablaREGISTRO() {
        registroModel = (DefaultTableModel) tblRegistro.getModel();
        registroModel.getDataVector().removeAllElements();
        tblRegistro.removeAll();
    }
    private void txtAsignarBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAsignarBuscarKeyReleased
        try {

            msjASIG.setText("");
            if (!txtAsignarBuscar.getText().isEmpty()) {
                limpiarTablaAsig();

                modelClienteHabitaciones = (DefaultTableModel) tblClientesParaAs.getModel();
                Object[] ob = new Object[5];
                if (rdbID_asig.isSelected()) {
                    clnDTO = cln.buscarPorID(Integer.parseInt(txtAsignarBuscar.getText()));
                    if (clnDTO != null) {
                        asignarFilaDeDatosClienAsig(modelClienteHabitaciones, ob, clnDTO);
                        msjASIG.setText("encontrado");
                    } else {
                        msjASIG.setText(" no encontrado");
                    }
                } else if (rdbDni_asig.isSelected()) {
                    clnDTO = cln.buscarPorDoc(txtAsignarBuscar.getText());
                    if (clnDTO != null) {
                        asignarFilaDeDatosClienAsig(modelClienteHabitaciones, ob, clnDTO);
                        msjASIG.setText(" encontrado");
                    } else {
                        msjASIG.setText("no encontrado");
                    }
                } else if (rdbTel_asig.isSelected()) {
                    clnDTO = cln.buscarPorTelefono(txtAsignarBuscar.getText());
                    if (clnDTO != null) {
                        asignarFilaDeDatosClienAsig(modelClienteHabitaciones, ob, clnDTO);
                        msjASIG.setText(" encontrado");
                    } else {
                        msjASIG.setText(" no encontrado");
                    }
                }
                tblClientesParaAs.setModel(modelClienteHabitaciones);

            } else {

                listarClientesH();

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtAsignarBuscarKeyReleased


    private void txtBuscarRegistroClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarRegistroClienteKeyReleased
        try {

            mensajetbl.setText("");
            if (!txtBuscarRegistroCliente.getText().isEmpty()) {
                limpiarTabla();

                modelCliente = (DefaultTableModel) tblCliente.getModel();
                Object[] ob = new Object[10];
                if (rdbID_rCliente.isSelected()) {
                    clnDTO = cln.buscarPorID(Integer.parseInt(txtBuscarRegistroCliente.getText()));
                    if (clnDTO != null) {
                        asignarFilaDeDatos(modelCliente, ob, clnDTO);
                        mensajetbl.setText("Cliente encontrado");
                    } else {
                        mensajetbl.setText("Cliente no encontrado");
                    }
                } else if (rdbApellidos_Cliente.isSelected()) {
                    List<ClienteDTO> listaCliente = cln.buscarPorApellidos(txtBuscarRegistroCliente.getText());
                    if (listaCliente != null) {
                        for (ClienteDTO c : listaCliente) {
                            asignarFilaDeDatos(modelCliente, ob, c);
                        }
                        mensajetbl.setText("Registros encontrados");
                    } else {
                        mensajetbl.setText("No hay registros");
                    }
                } else if (rdbDNI_cliente.isSelected()) {
                    clnDTO = cln.buscarPorDoc(txtBuscarRegistroCliente.getText());
                    if (clnDTO != null) {
                        asignarFilaDeDatos(modelCliente, ob, clnDTO);
                        mensajetbl.setText("Cliente encontrado");
                    } else {
                        mensajetbl.setText("Cliente no encontrado");
                    }
                } else if (rdbGenero_cliente.isSelected()) {
                    List<ClienteDTO> listaCliente = cln.buscarPorGenero(txtBuscarRegistroCliente.getText().charAt(0));
                    if (listaCliente != null) {
                        for (ClienteDTO c : listaCliente) {
                            asignarFilaDeDatos(modelCliente, ob, c);
                        }
                        mensajetbl.setText("Registros encontrados");
                    } else {
                        mensajetbl.setText("No hay registros");
                    }
                } else {
                    mensajetbl.setText("Seleccione");

                }
                tblCliente.setModel(modelCliente);
            } else {

                listar();

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtBuscarRegistroClienteKeyReleased

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        int fila = tblCliente.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        } else {
            idCliente = Integer.parseInt(tblCliente.getValueAt(fila, 0).toString());
            txtNombres.setText(tblCliente.getValueAt(fila, 1).toString());
            txtApellidos.setText(tblCliente.getValueAt(fila, 2).toString());
            txtTelefono.setText(tblCliente.getValueAt(fila, 3).toString());
            cbxNacionalidad.setSelectedItem(tblCliente.getValueAt(fila, 4).toString());
            txtCorreo.setText(tblCliente.getValueAt(fila, 5).toString());
            txtDireccion.setText(tblCliente.getValueAt(fila, 6).toString());
            txtNumeroDocumento.setText(tblCliente.getValueAt(fila, 7).toString());
            cboTipoDocumento.setSelectedIndex((int) tblCliente.getValueAt(fila, 8));
            cboGenero.setSelectedItem(tblCliente.getValueAt(fila, 9).toString());
            mensajetbl.setText("");
        }
    }//GEN-LAST:event_tblClienteMouseClicked

    private void txtBuscarRegistrosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarRegistrosKeyReleased

        try {

            msjBusquedaRegistro.setText("");
            if (!txtBuscarRegistros.getText().isEmpty()) {
                limpiarTablaREGISTRO();

                registroModel = (DefaultTableModel) tblRegistro.getModel();
                Object[] ob = new Object[6];
                if (reg_rbIDregistro.isSelected()) {

                    RegistroHabitacionDTO reg = regHabita.buscarIDregistro(Integer.parseInt(txtBuscarRegistros.getText()));
                    if (reg != null) {
                        asignarFilaDeDatosREGISTROS(registroModel, ob, reg);
                        msjBusquedaRegistro.setText("Encontrado");
                    } else {
                        msjBusquedaRegistro.setText("No encontrado");
                    }

                } else if (reg_rbIDhabitacion.isSelected()) {
                    List<RegistroHabitacionDTO> listaHabitaciones = regHabita.buscarIDHabitacion(Integer.parseInt(txtBuscarRegistros.getText()));
                    if (listaHabitaciones != null) {
                        for (RegistroHabitacionDTO c : listaHabitaciones) {
                            asignarFilaDeDatosREGISTROS(registroModel, ob, c);
                        }
                        msjBusquedaRegistro.setText("Registros encontrados");
                    } else {
                        msjBusquedaRegistro.setText("No hay registros");
                    }
                } else if (reg_rdIDCLIENTE.isSelected()) {
                    List<RegistroHabitacionDTO> listaHClientes = regHabita.buscarIDcliente(Integer.parseInt(txtBuscarRegistros.getText()));
                    if (listaHClientes != null) {
                        for (RegistroHabitacionDTO c : listaHClientes) {
                            asignarFilaDeDatosREGISTROS(registroModel, ob, c);
                        }
                        msjBusquedaRegistro.setText("Registros encontrados");
                    } else {
                        msjBusquedaRegistro.setText("No hay registros");
                    }
                } else if (reg_IDEMPLEADO.isSelected()) {
                    List<RegistroHabitacionDTO> listaEmpleado = regHabita.buscarIDEmpleado(Integer.parseInt(txtBuscarRegistros.getText()));
                    if (listaEmpleado != null) {
                        for (RegistroHabitacionDTO c : listaEmpleado) {
                            asignarFilaDeDatosREGISTROS(registroModel, ob, c);
                        }
                        msjBusquedaRegistro.setText("Registros encontrados");
                    } else {
                        msjBusquedaRegistro.setText("No hay registros");
                    }
                } else {
                    msjBusquedaRegistro.setText("Seleccione");
                    limpiarTablaREGISTRO();
                }

                tblRegistro.setModel(registroModel);

            } else {

                listarRegistros();

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtBuscarRegistrosKeyReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ocultar();
        v_principal ven1 = new v_principal();
        ven1.mostrar();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void cboTipoHabitacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTipoHabitacionItemStateChanged

        if (cboTipoHabitacion.getSelectedItem().toString().equals("Seleccione")) {
            limpiarTablaHabitaciones();
        } else {
            idTipoHasig = Integer.parseInt(String.valueOf(cboTipoHabitacion.getSelectedItem().toString().charAt(0)));
            listarTiposHabitaciones(idTipoHasig);
        }


    }//GEN-LAST:event_cboTipoHabitacionItemStateChanged
    private void listarTiposHabitaciones(int tipo) {
        h = new Habitacion();
        limpiarTablaHabitaciones();
        try {
            modelClienteHabitaciones = (DefaultTableModel) tblHabitaciones.getModel();
            Object[] obj = new Object[2];
            for (HabitacionDTO p : h.listar(tipo)) {
                asignarFilaDeDatosHabitaciones(modelClienteHabitaciones, obj, p);
            }
            tblHabitaciones.setModel(modelClienteHabitaciones);
        } catch (Exception e) {
        }

    }

    private void asignarFilaDeDatosHabitaciones(DefaultTableModel modelo, Object[] ob, HabitacionDTO c) {

//        ob[0] = c.getNumeroHabitacion();
//        ob[1] = c.getEstadoHabitacion();
//        modelo.addRow(ob);
    }

    private void limpiarTablaHabitaciones() {
        habitacionesModel = (DefaultTableModel) tblHabitaciones.getModel();
        habitacionesModel.getDataVector().removeAllElements();
        tblHabitaciones.removeAll();
    }

    public void limpAsignar() {
        tblClientesParaAs.clearSelection();
        tblHabitaciones.clearSelection();
        buttonGroup2.clearSelection();
        txtAsignarBuscar.setText("");
        cboTipoHabitacion.setSelectedIndex(0);
        txtFechaIngreso.setCalendar(null);
        listarClientesH();
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpAsignar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cboTipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTipoHabitacionActionPerformed

    private void tblHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHabitacionesMouseClicked
        int fila = tblHabitaciones.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar una Fila");
        } else {
            idHabitacionAsignar = Integer.parseInt(tblHabitaciones.getValueAt(fila, 0).toString());
            estadoHabitacion = tblHabitaciones.getValueAt(fila, 1).toString();
            mensajeHabit.setText("Habitacion seleccionada: " + idHabitacionAsignar);
        }
    }//GEN-LAST:event_tblHabitacionesMouseClicked

    private void tblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistroMouseClicked

        int fila = tblRegistro.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar una Fila");
        } else {
            idRegistro = Integer.parseInt(tblRegistro.getValueAt(fila, 0).toString());
            idHabitacionAsignar = Integer.parseInt(tblRegistro.getValueAt(fila, 1).toString());
            txt_regIDselec.setText(String.valueOf((int) tblRegistro.getValueAt(fila, 2)));
            lbRegistro.setText(String.valueOf(idRegistro));
        }
    }//GEN-LAST:event_tblRegistroMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        limpiarRegistross();
        listarRegistros();


    }//GEN-LAST:event_jButton4ActionPerformed
    public void limpiarRegistross() {
        choseerrBuscar.setEnabled(false);
        tblRegistro.clearSelection();
        txt_regIDselec.setText("");
        lbRegistro.setText("");
        buttonGroup3.clearSelection();
        choseerrBuscar.setCalendar(null);
        dateSalida.setCalendar(null);
        txt_regIDselec.setText("");
        tblRegistro.clearSelection();
        lbRegistro.setText("");
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String mensaje = "";
        if (h.actualizarEstado(idHabitacionAsignar, 2)) {
            mensaje = regHabita.checkOut(idRegistro, ((JTextField) dateSalida.getDateEditor().getUiComponent()).getText());
            listarRegistros();
            limpiarRegistross();

        } else {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
        }
        msjChecks.setText(mensaje);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        tbTodo.setSelectedIndex(0);
        setTitle("Asignación de Habitaciones");
        limpiarRegistross();
        limpiarTexto();
        limpAsignar();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        tbTodo.setSelectedIndex(1);
        setTitle("Registro Clientes");

        limpiarRegistross();
        limpiarTexto();
        limpAsignar();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        tbTodo.setSelectedIndex(2);
        setTitle("Check Out Registrso");
        limpiarRegistross();
        limpiarTexto();
        limpAsignar();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void reg_rbIDregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_rbIDregistroActionPerformed
        txtBuscarRegistros.setEnabled(true);
        choseerrBuscar.setEnabled(false);
        BTN_FECHA.setVisible(false);
    }//GEN-LAST:event_reg_rbIDregistroActionPerformed

    private void reg_IDEMPLEADOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_IDEMPLEADOActionPerformed
        txtBuscarRegistros.setEnabled(true);
        choseerrBuscar.setEnabled(false);
        BTN_FECHA.setVisible(false);
    }//GEN-LAST:event_reg_IDEMPLEADOActionPerformed

    private void reg_rbIDhabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_rbIDhabitacionActionPerformed
        txtBuscarRegistros.setEnabled(true);
        choseerrBuscar.setEnabled(false);
        BTN_FECHA.setVisible(false);
    }//GEN-LAST:event_reg_rbIDhabitacionActionPerformed

    private void reg_rdIDCLIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_rdIDCLIENTEActionPerformed
        txtBuscarRegistros.setEnabled(true);
        choseerrBuscar.setEnabled(false);
        BTN_FECHA.setVisible(false);
    }//GEN-LAST:event_reg_rdIDCLIENTEActionPerformed

    private void reg_rbfechaIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_rbfechaIngresoActionPerformed
        txtBuscarRegistros.setEnabled(false);
        choseerrBuscar.setEnabled(true);
        BTN_FECHA.setVisible(true);
    }//GEN-LAST:event_reg_rbfechaIngresoActionPerformed

    private void reg_rbfechaSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_rbfechaSalidaActionPerformed
        txtBuscarRegistros.setEnabled(false);
        choseerrBuscar.setEnabled(true);
        BTN_FECHA.setVisible(true);
    }//GEN-LAST:event_reg_rbfechaSalidaActionPerformed

    private void BTN_FECHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_FECHAActionPerformed
        try {

            msjBusquedaRegistro.setText("");
            if (!((JTextField) choseerrBuscar.getDateEditor().getUiComponent()).getText().isEmpty()) {
                limpiarTablaREGISTRO();

                registroModel = (DefaultTableModel) tblRegistro.getModel();
                Object[] ob = new Object[6];
                if (reg_rbfechaIngreso.isSelected()) {
                    List<RegistroHabitacionDTO> listaFechaIngreso = regHabita.buscarFechaIngreso(((JTextField) choseerrBuscar.getDateEditor().getUiComponent()).getText());

                    if (listaFechaIngreso != null) {
                        for (RegistroHabitacionDTO c : listaFechaIngreso) {
                            asignarFilaDeDatosREGISTROS(registroModel, ob, c);
                        }
                        msjBusquedaRegistro.setText("Registros encontrados");
                    } else {
                        msjBusquedaRegistro.setText("No hay registros");
                    }

                } else if (reg_rbfechaSalida.isSelected()) {
                    List<RegistroHabitacionDTO> listaSalidas = regHabita.buscarFechaSalida(((JTextField) choseerrBuscar.getDateEditor().getUiComponent()).getText());
                    if (listaSalidas != null) {
                        for (RegistroHabitacionDTO c : listaSalidas) {
                            asignarFilaDeDatosREGISTROS(registroModel, ob, c);
                        }
                        msjBusquedaRegistro.setText("Registros encontrados");
                    } else {
                        msjBusquedaRegistro.setText("No hay registros");
                    }

                } else {
                    limpiarTablaREGISTRO();
                }
            } else {

                listarRegistros();

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_BTN_FECHAActionPerformed

    private void btnAgregarRegClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarRegClienteMouseClicked

        String mensaje;

        mensaje = cln.agregar(txtNombres.getText(),
                txtApellidos.getText(),
                txtTelefono.getText(),
                cbxNacionalidad.getSelectedItem().toString(),
                txtCorreo.getText(),
                txtDireccion.getText(),
                txtNumeroDocumento.getText(),
                Integer.parseInt(String.valueOf(cboTipoDocumento.getSelectedItem().toString().charAt(0))),
                cboGenero.getSelectedItem().toString().charAt(0));

        limpiarTexto();
        limpiarTabla();
        mensajetbl.setText(mensaje);
        listar();
        listarClientesH();

    }//GEN-LAST:event_btnAgregarRegClienteMouseClicked

    private void btnActualizarRegClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarRegClienteMouseClicked
        if (idCliente >= 0) {
            String mensaje = cln.actualizar(idCliente, txtNombres.getText(),
                    txtApellidos.getText(),
                    txtTelefono.getText(),
                    cbxNacionalidad.getSelectedItem().toString(),
                    txtCorreo.getText(),
                    txtDireccion.getText(),
                    txtNumeroDocumento.getText(),
                    Integer.parseInt(String.valueOf(cboTipoDocumento.getSelectedItem().toString().charAt(0))),
                    cboGenero.getSelectedItem().toString().charAt(0));
            limpiarTexto();
            mensajetbl.setText(mensaje);
            listar();
            listarClientesH();
        } else {
            JOptionPane.showMessageDialog(null, "Debe selecciona una fila");
        }

    }//GEN-LAST:event_btnActualizarRegClienteMouseClicked

    private void btnNuevoRegClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoRegClienteMouseClicked
        limpiarTexto();


    }//GEN-LAST:event_btnNuevoRegClienteMouseClicked

    private void btnEliminarRegClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarRegClienteMouseClicked

        if (idCliente >= 0) {
            mensajetbl.setText(String.valueOf(idCliente));
            String mensaje = cln.eliminar(idCliente);
            limpiarTexto();

            listar();
            listarClientesH();
            listarRegistros();
            mensajetbl.setText(mensaje);
        } else {
            JOptionPane.showMessageDialog(null, "Debe selecciona una fila");
        }

    }//GEN-LAST:event_btnEliminarRegClienteMouseClicked

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
//            UIManager.setLookAndFeel(new FlatLightLaf());
            FlatMaterialDarkerContrastIJTheme.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_OPempleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_FECHA;
    private javax.swing.JPanel btnActualizarRegCliente;
    private javax.swing.JPanel btnAgregarRegCliente;
    private javax.swing.JButton btnAsignarHabitacion;
    private javax.swing.JPanel btnEliminarRegCliente;
    private javax.swing.JPanel btnNuevoRegCliente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cboGenero;
    private javax.swing.JComboBox<String> cboTipoDocumento;
    private javax.swing.JComboBox<String> cboTipoHabitacion;
    private javax.swing.JComboBox<String> cbxNacionalidad;
    private com.toedter.calendar.JDateChooser choseerrBuscar;
    private com.toedter.calendar.JDateChooser dateSalida;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbRegistro;
    private javax.swing.JLabel mensajeHabit;
    private javax.swing.JLabel mensajetbl;
    private javax.swing.JLabel msjASIG;
    private javax.swing.JLabel msjBusquedaRegistro;
    private javax.swing.JLabel msjCheck;
    private javax.swing.JLabel msjChecks;
    private javax.swing.JPanel pnlAsignarHabitacion;
    private javax.swing.JPanel pnlCheckOut;
    private javax.swing.JPanel pnlRegistrarClientes;
    private javax.swing.JRadioButton rdbApellidos_Cliente;
    private javax.swing.JRadioButton rdbDNI_cliente;
    private javax.swing.JRadioButton rdbDni_asig;
    private javax.swing.JRadioButton rdbGenero_cliente;
    private javax.swing.JRadioButton rdbID_asig;
    private javax.swing.JRadioButton rdbID_rCliente;
    private javax.swing.JRadioButton rdbTel_asig;
    private javax.swing.JRadioButton reg_IDEMPLEADO;
    private javax.swing.JRadioButton reg_rbIDhabitacion;
    private javax.swing.JRadioButton reg_rbIDregistro;
    private javax.swing.JRadioButton reg_rbfechaIngreso;
    private javax.swing.JRadioButton reg_rbfechaSalida;
    private javax.swing.JRadioButton reg_rdIDCLIENTE;
    private javax.swing.JTabbedPane tbTodo;
    private javax.swing.JTable tblCliente;
    private javax.swing.JLabel tblClienteSeleccionado;
    private javax.swing.JTable tblClientesParaAs;
    private javax.swing.JTable tblHabitaciones;
    private javax.swing.JTable tblRegistro;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtAsignarBuscar;
    private javax.swing.JTextField txtBuscarRegistroCliente;
    private javax.swing.JTextField txtBuscarRegistros;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmpleadoActivo;
    private com.toedter.calendar.JDateChooser txtFechaIngreso;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumeroDocumento;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txt_regIDselec;
    // End of variables declaration//GEN-END:variables
}
