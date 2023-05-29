package Presentacion;

import BusinessObject.*;

import TransferObject.*;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerContrastIJTheme;
import javax.swing.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class v_OPadministrador extends javax.swing.JFrame {

    DefaultTableModel model;
    Empleado emp;
    EmpleadoDTO empDTO;
    int idEmpleado;

    TipoEmpleado tp;
    TipoEmpleadoDTO tpDTO;
    TipoHabitacion th;
    TipoHabitacionDTO thDTO;
    //Habitacion
    Habitacion hab;
    HabitacionDTO habDTO;

    DefaultTableModel modelHabitaciones;
    int numHabitacion;

    public v_OPadministrador() {
        initComponents();

        model = new DefaultTableModel();

        tp = new TipoEmpleado();
        tpDTO = new TipoEmpleadoDTO();

        hab = new Habitacion();
        habDTO = new HabitacionDTO();
        modelHabitaciones = new DefaultTableModel();

        th = new TipoHabitacion();
        thDTO = new TipoHabitacionDTO();
        listar();
        llenarComboTipo();

        listarHabitaciones();
        llenarComboTipoHabitaciones();

    }

    public void mostrar() {
        this.setVisible(true);

    }

    public void ocultar() {
        this.setVisible(false);
    }

    private void listar() {
        emp = new Empleado();
        limpiarTabla();
        try {
            model = (DefaultTableModel) tblEmpleados.getModel();
            Object[] obj = new Object[8];
            for (EmpleadoDTO p : emp.listar()) {
                asignarFilaDeDatos(model, obj, p);
            }
            tblEmpleados.setModel(model);
        } catch (Exception e) {
        }

    }

    private void limpiarTexto() {
        txtNombre.setText("");
        txtApellidos.setText("");
        txtDni.setText("");
        cbxTipo.setSelectedIndex(0);
        txtEdad.setText("");
        cbxGenero.setSelectedIndex(0);
        txtDireccion.setText("");

        tblEmpleados.clearSelection();
    }

    private void limpiarTabla() {
        model = (DefaultTableModel) tblEmpleados.getModel();
        model.getDataVector().removeAllElements();
        tblEmpleados.removeAll();
    }

    private void asignarFilaDeDatos(DefaultTableModel modelo, Object[] ob, EmpleadoDTO c) {

//        ob[0] = c.getIdEmpleado();
//        ob[1] = c.getNombre();
//        ob[2] = c.getApellido();
//        ob[3] = c.getDni();
//        ob[4] = c.getIdTipo();
//        ob[5] = c.getEdad();
//        ob[6] = c.getGenero();
//        ob[7] = c.getDireccion();
//        modelo.addRow(ob);
    }

    private void llenarComboTipo() {
        List<TipoEmpleadoDTO> listaTipos = tp.listar();
        cbxTipo.removeAllItems();
        cbxTipo.addItem("Seleccione");
        for (int i = 0; i < listaTipos.size(); i++) {
            cbxTipo.addItem(String.valueOf(listaTipos.get(i).getIdTipoEmpleado() + " - " + String.valueOf(listaTipos.get(i).getNombre())));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panedTodo = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        cbxGenero = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        cbxTipo = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel11 = new javax.swing.JPanel();
        btnAgregarEmpleado = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnActualizarEmpleado = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btnNuevoEmpleado = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btnEliminarEmpleado = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        tMensaje = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        busID = new javax.swing.JRadioButton();
        busNombre = new javax.swing.JRadioButton();
        busDNI = new javax.swing.JRadioButton();
        txtBuscar = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbxTipoHabitacion = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbxEstado = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        btnAgregarAsiHabitaciones = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        btnActualizarAsiHabitaciones = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        btnNuevoAsiHabitaciones = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        btnEliminarAsiHabitaciones = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHabitaciones = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblEmpleados.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        tblEmpleados.setForeground(new java.awt.Color(51, 51, 51));
        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Dni", "Tipo", "Edad", "Genero", "Direccion"
            }
        ));
        tblEmpleados.setGridColor(new java.awt.Color(255, 255, 255));
        tblEmpleados.getTableHeader().setResizingAllowed(false);
        tblEmpleados.getTableHeader().setReorderingAllowed(false);
        tblEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleados);

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setForeground(new java.awt.Color(204, 204, 204));

        jLabel10.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel10.setText("DATOS DE EMPLEADOS");

        txtNombre.setBorder(null);

        txtApellidos.setBorder(null);
        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });

        txtDni.setBorder(null);
        txtDni.setMinimumSize(new java.awt.Dimension(64, 27));

        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "M", "F" }));
        cbxGenero.setPreferredSize(new java.awt.Dimension(77, 22));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel2.setText("NOMBRE");

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel3.setText("APELLIDO");

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel4.setText("DNI");

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel5.setText("TIPO");

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel6.setText("EDAD");

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel7.setText("GENERO");

        jLabel8.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel8.setText("DIRECCION");

        txtEdad.setBorder(null);
        txtEdad.setMinimumSize(new java.awt.Dimension(64, 27));
        txtEdad.setPreferredSize(new java.awt.Dimension(64, 27));

        txtDireccion.setBorder(null);
        txtDireccion.setMinimumSize(new java.awt.Dimension(64, 27));
        txtDireccion.setPreferredSize(new java.awt.Dimension(64, 27));

        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidos)
                                    .addComponent(jSeparator4)
                                    .addComponent(cbxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxGenero, 0, 163, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel10)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        btnAgregarEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarEmpleado.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        btnAgregarEmpleado.setPreferredSize(new java.awt.Dimension(133, 29));
        btnAgregarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarEmpleadoMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("AGREGAR");

        javax.swing.GroupLayout btnAgregarEmpleadoLayout = new javax.swing.GroupLayout(btnAgregarEmpleado);
        btnAgregarEmpleado.setLayout(btnAgregarEmpleadoLayout);
        btnAgregarEmpleadoLayout.setHorizontalGroup(
            btnAgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAgregarEmpleadoLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(31, 31, 31))
        );
        btnAgregarEmpleadoLayout.setVerticalGroup(
            btnAgregarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        btnActualizarEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizarEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarEmpleado.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        btnActualizarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarEmpleadoMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("ACTUALIZAR");

        javax.swing.GroupLayout btnActualizarEmpleadoLayout = new javax.swing.GroupLayout(btnActualizarEmpleado);
        btnActualizarEmpleado.setLayout(btnActualizarEmpleadoLayout);
        btnActualizarEmpleadoLayout.setHorizontalGroup(
            btnActualizarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizarEmpleadoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel14)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        btnActualizarEmpleadoLayout.setVerticalGroup(
            btnActualizarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizarEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNuevoEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        btnNuevoEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoEmpleado.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        btnNuevoEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoEmpleadoMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("NUEVO");

        javax.swing.GroupLayout btnNuevoEmpleadoLayout = new javax.swing.GroupLayout(btnNuevoEmpleado);
        btnNuevoEmpleado.setLayout(btnNuevoEmpleadoLayout);
        btnNuevoEmpleadoLayout.setHorizontalGroup(
            btnNuevoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNuevoEmpleadoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel15)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        btnNuevoEmpleadoLayout.setVerticalGroup(
            btnNuevoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnNuevoEmpleadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addContainerGap())
        );

        btnEliminarEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarEmpleado.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        btnEliminarEmpleado.setPreferredSize(new java.awt.Dimension(133, 29));
        btnEliminarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarEmpleadoMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ELIMINAR");

        javax.swing.GroupLayout btnEliminarEmpleadoLayout = new javax.swing.GroupLayout(btnEliminarEmpleado);
        btnEliminarEmpleado.setLayout(btnEliminarEmpleadoLayout);
        btnEliminarEmpleadoLayout.setHorizontalGroup(
            btnEliminarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEliminarEmpleadoLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(31, 31, 31))
        );
        btnEliminarEmpleadoLayout.setVerticalGroup(
            btnEliminarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(btnAgregarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(btnEliminarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btnActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btnNuevoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        tMensaje.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setForeground(new java.awt.Color(204, 204, 204));

        buttonGroup1.add(busID);
        busID.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        busID.setText("ID");

        buttonGroup1.add(busNombre);
        busNombre.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        busNombre.setText("Nombre");

        buttonGroup1.add(busDNI);
        busDNI.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        busDNI.setText("dni");

        txtBuscar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtBuscar.setBorder(null);
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));

        jLabel13.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel13.setText("BUSCADOR");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(busID, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(busNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(busDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busID)
                    .addComponent(busNombre)
                    .addComponent(busDNI)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jLabel16.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel16.setText("MENSAJE:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        panedTodo.addTab("Registrar Empleados", jPanel1);

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setText("Tipo Habitacion");

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel9.setText("Estado");

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Disponible", "Ocupado" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxTipoHabitacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxEstado, 0, 142, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(cbxTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        btnAgregarAsiHabitaciones.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarAsiHabitaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarAsiHabitaciones.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        btnAgregarAsiHabitaciones.setPreferredSize(new java.awt.Dimension(133, 29));
        btnAgregarAsiHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarAsiHabitacionesMouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("AGREGAR");

        javax.swing.GroupLayout btnAgregarAsiHabitacionesLayout = new javax.swing.GroupLayout(btnAgregarAsiHabitaciones);
        btnAgregarAsiHabitaciones.setLayout(btnAgregarAsiHabitacionesLayout);
        btnAgregarAsiHabitacionesLayout.setHorizontalGroup(
            btnAgregarAsiHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAgregarAsiHabitacionesLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(31, 31, 31))
        );
        btnAgregarAsiHabitacionesLayout.setVerticalGroup(
            btnAgregarAsiHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarAsiHabitacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        btnActualizarAsiHabitaciones.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizarAsiHabitaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarAsiHabitaciones.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        btnActualizarAsiHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarAsiHabitacionesMouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("ACTUALIZAR");

        javax.swing.GroupLayout btnActualizarAsiHabitacionesLayout = new javax.swing.GroupLayout(btnActualizarAsiHabitaciones);
        btnActualizarAsiHabitaciones.setLayout(btnActualizarAsiHabitacionesLayout);
        btnActualizarAsiHabitacionesLayout.setHorizontalGroup(
            btnActualizarAsiHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizarAsiHabitacionesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel19)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        btnActualizarAsiHabitacionesLayout.setVerticalGroup(
            btnActualizarAsiHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizarAsiHabitacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNuevoAsiHabitaciones.setBackground(new java.awt.Color(0, 0, 0));
        btnNuevoAsiHabitaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoAsiHabitaciones.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        btnNuevoAsiHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoAsiHabitacionesMouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("NUEVO");

        javax.swing.GroupLayout btnNuevoAsiHabitacionesLayout = new javax.swing.GroupLayout(btnNuevoAsiHabitaciones);
        btnNuevoAsiHabitaciones.setLayout(btnNuevoAsiHabitacionesLayout);
        btnNuevoAsiHabitacionesLayout.setHorizontalGroup(
            btnNuevoAsiHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNuevoAsiHabitacionesLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel20)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        btnNuevoAsiHabitacionesLayout.setVerticalGroup(
            btnNuevoAsiHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnNuevoAsiHabitacionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addContainerGap())
        );

        btnEliminarAsiHabitaciones.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarAsiHabitaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarAsiHabitaciones.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        btnEliminarAsiHabitaciones.setPreferredSize(new java.awt.Dimension(133, 29));
        btnEliminarAsiHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarAsiHabitacionesMouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("ELIMINAR");

        javax.swing.GroupLayout btnEliminarAsiHabitacionesLayout = new javax.swing.GroupLayout(btnEliminarAsiHabitaciones);
        btnEliminarAsiHabitaciones.setLayout(btnEliminarAsiHabitacionesLayout);
        btnEliminarAsiHabitacionesLayout.setHorizontalGroup(
            btnEliminarAsiHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEliminarAsiHabitacionesLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(31, 31, 31))
        );
        btnEliminarAsiHabitacionesLayout.setVerticalGroup(
            btnEliminarAsiHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarAsiHabitacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(btnAgregarAsiHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarAsiHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(btnEliminarAsiHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevoAsiHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregarAsiHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btnActualizarAsiHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminarAsiHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btnNuevoAsiHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        lblMensaje.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N

        tblHabitaciones.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        tblHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero Habitacion", "Estado", "Tipo Habitacion"
            }
        ));
        tblHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHabitacionesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblHabitaciones);

        jLabel22.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel22.setText("MENSAJE:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panedTodo.addTab("Registrar Habitaciones", jPanel2);

        getContentPane().add(panedTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 520));

        jMenuBar1.setMinimumSize(new java.awt.Dimension(82, 40));

        jMenu1.setText("Operaciones");

        jMenuItem1.setText("Registrar Empleados");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Registrar Habitaciones");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadosMouseClicked
        int fila = tblEmpleados.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        } else {
            idEmpleado = Integer.parseInt(tblEmpleados.getValueAt(fila, 0).toString());
            txtNombre.setText(tblEmpleados.getValueAt(fila, 1).toString());
            txtApellidos.setText(tblEmpleados.getValueAt(fila, 2).toString());
            txtDni.setText(tblEmpleados.getValueAt(fila, 3).toString());
            cbxTipo.setSelectedIndex((int) tblEmpleados.getValueAt(fila, 4));
            txtEdad.setText(tblEmpleados.getValueAt(fila, 5).toString());
            cbxGenero.setSelectedItem(tblEmpleados.getValueAt(fila, 6).toString());
            txtDireccion.setText(tblEmpleados.getValueAt(fila, 7).toString());
            tMensaje.setText("");
        }
    }//GEN-LAST:event_tblEmpleadosMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        try {

            tMensaje.setText("");
            if (!txtBuscar.getText().isEmpty()) {
                limpiarTabla();

                model = (DefaultTableModel) tblEmpleados.getModel();
                Object[] ob = new Object[8];
                if (busID.isSelected()) {
                    empDTO = emp.buscarPorID(Integer.parseInt(txtBuscar.getText()));
                    if (empDTO != null) {
                        asignarFilaDeDatos(model, ob, empDTO);
                        tMensaje.setText("Empleado encontrado");
                    } else {
                        tMensaje.setText("Empleado no encontrado");
                    }
                } else if (busNombre.isSelected()) {
                    List<EmpleadoDTO> listaEmpleados = emp.buscarPorNombre(txtBuscar.getText());
                    if (listaEmpleados != null) {
                        for (EmpleadoDTO c : listaEmpleados) {
                            asignarFilaDeDatos(model, ob, c);
                        }
                        tMensaje.setText("Registros encontrados");
                    } else {
                        tMensaje.setText("No se encontraron registros");
                    }
                } else if (busDNI.isSelected()) {
                    empDTO = emp.buscarPorDNI(txtBuscar.getText());
                    if (empDTO != null) {
                        asignarFilaDeDatos(model, ob, empDTO);
                        tMensaje.setText("Empleado encontrado");
                    } else {
                        tMensaje.setText("Empleado no encontrado");
                    }
                } else {
                    tMensaje.setText("Seleccione un criterio de busqueda");
                    limpiarTabla();
                }
                tblEmpleados.setModel(model);

            } else {

                listar();

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tblHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHabitacionesMouseClicked
        int fila = tblHabitaciones.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar una Fila");
        } else {
            numHabitacion = Integer.parseInt(tblHabitaciones.getValueAt(fila, 0).toString());
            lblMensaje.setText("Habitacion seleccionado: " + numHabitacion);
            cbxEstado.setSelectedItem(tblHabitaciones.getValueAt(fila, 1).toString());
            cbxTipoHabitacion.setSelectedIndex((int) tblHabitaciones.getValueAt(fila, 2));
        }
    }//GEN-LAST:event_tblHabitacionesMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        panedTodo.setSelectedIndex(0);
        setTitle("Registro Empleados");

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        panedTodo.setSelectedIndex(1);
        setTitle("Registro Habitaciones");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ocultar();
        v_principal ven1 = new v_principal();
        ven1.mostrar();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnAgregarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadoMouseClicked

        String mensaje;

        mensaje = emp.agregar(txtNombre.getText(), txtApellidos.getText(), txtDni.getText(), Integer.parseInt(String.valueOf(cbxTipo.getSelectedItem().toString().charAt(0))), cbxGenero.getSelectedItem().toString().charAt(0), txtDireccion.getText(), Byte.parseByte(txtEdad.getText()));
        limpiarTexto();
        limpiarTabla();
        tMensaje.setText(mensaje);
        listar();


    }//GEN-LAST:event_btnAgregarEmpleadoMouseClicked

    private void btnEliminarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadoMouseClicked

        if (idEmpleado >= 0) {
            String mensaje = emp.eliminar(idEmpleado);
            limpiarTexto();

            listar();
            tMensaje.setText(mensaje);
        } else {
            JOptionPane.showMessageDialog(null, "Debe selecciona una fila");
        }


    }//GEN-LAST:event_btnEliminarEmpleadoMouseClicked

    private void btnActualizarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarEmpleadoMouseClicked

        if (idEmpleado >= 0) {
            String mensaje = emp.actualizar(idEmpleado, txtNombre.getText(), txtApellidos.getText(), txtDni.getText(), Integer.parseInt(String.valueOf(cbxTipo.getSelectedItem().toString().charAt(0))), cbxGenero.getSelectedItem().toString().charAt(0), txtDireccion.getText(), Byte.parseByte(txtEdad.getText()));
            limpiarTexto();
            tMensaje.setText(mensaje);
            listar();
        } else {
            JOptionPane.showMessageDialog(null, "Debe selecciona una fila");
        }


    }//GEN-LAST:event_btnActualizarEmpleadoMouseClicked

    private void btnNuevoEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoEmpleadoMouseClicked

        limpiarTexto();
        listar();


    }//GEN-LAST:event_btnNuevoEmpleadoMouseClicked

    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void btnAgregarAsiHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarAsiHabitacionesMouseClicked
        String mensaje;

        mensaje = hab.agregar(Integer.parseInt(String.valueOf(cbxTipoHabitacion.getSelectedItem().toString().charAt(0))), cbxEstado.getSelectedItem().toString());
        limpiarTextoHabitaciones();
        limpiarTablaHabitaciones();
        lblMensaje.setText(mensaje);
        listarHabitaciones();        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarAsiHabitacionesMouseClicked

    private void btnActualizarAsiHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarAsiHabitacionesMouseClicked
        if (numHabitacion >= 0) {
            String mensaje = hab.actualizar(numHabitacion, Integer.parseInt(String.valueOf(cbxTipoHabitacion.getSelectedItem().toString().charAt(0))), cbxEstado.getSelectedItem().toString());
            limpiarTextoHabitaciones();
            lblMensaje.setText(mensaje);
            listarHabitaciones();
        } else {
            JOptionPane.showMessageDialog(null, "Debe selecciona una fila");
        }
    }//GEN-LAST:event_btnActualizarAsiHabitacionesMouseClicked

    private void btnNuevoAsiHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoAsiHabitacionesMouseClicked
        limpiarTextoHabitaciones();        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoAsiHabitacionesMouseClicked

    private void btnEliminarAsiHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarAsiHabitacionesMouseClicked
        if (numHabitacion >= 0) {
            String mensaje = hab.eliminar(numHabitacion);
            limpiarTextoHabitaciones();
            lblMensaje.setText(mensaje);
            listarHabitaciones();
        } else {
            JOptionPane.showMessageDialog(null, "Debe selecciona una fila");
        }
    }//GEN-LAST:event_btnEliminarAsiHabitacionesMouseClicked
    //HABITACIONES
    private void listarHabitaciones() {
        hab = new Habitacion();
        limpiarTablaHabitaciones();
        try {
            modelHabitaciones = (DefaultTableModel) tblHabitaciones.getModel();
            Object[] obj = new Object[3];
            for (HabitacionDTO p : hab.listarR()) {
                asignarFilaDeDatosHabitaciones(modelHabitaciones, obj, p);
            }
            tblHabitaciones.setModel(modelHabitaciones);
        } catch (Exception e) {
        }

    }

    private void limpiarTextoHabitaciones() {
        cbxEstado.setSelectedIndex(0);
        cbxTipoHabitacion.setSelectedIndex(0);
        tblHabitaciones.clearSelection();
    }

    private void limpiarTablaHabitaciones() {
        modelHabitaciones = (DefaultTableModel) tblHabitaciones.getModel();
        modelHabitaciones.getDataVector().removeAllElements();
        tblHabitaciones.removeAll();
    }

    private void asignarFilaDeDatosHabitaciones(DefaultTableModel modelo, Object[] ob, HabitacionDTO c) {
//
//        ob[0] = c.getNumeroHabitacion();
//        ob[1] = c.getEstadoHabitacion();
//        ob[2] = c.getTipoHabitacion();
//
//        modelo.addRow(ob);
    }

    private void llenarComboTipoHabitaciones() {
//        List<TipoHabitacionDTO> listaTipos = th.listar();
//        cbxTipoHabitacion.removeAllItems();
//        cbxTipoHabitacion.addItem("Seleccione");
//        for (int i = 0; i < listaTipos.size(); i++) {
//            cbxTipoHabitacion.addItem(String.valueOf(listaTipos.get(i).getIdTipo() + " - " + String.valueOf(listaTipos.get(i).getNombre())));
//        }
    }

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
                new v_OPadministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnActualizarAsiHabitaciones;
    private javax.swing.JPanel btnActualizarEmpleado;
    private javax.swing.JPanel btnAgregarAsiHabitaciones;
    private javax.swing.JPanel btnAgregarEmpleado;
    private javax.swing.JPanel btnEliminarAsiHabitaciones;
    private javax.swing.JPanel btnEliminarEmpleado;
    private javax.swing.JPanel btnNuevoAsiHabitaciones;
    private javax.swing.JPanel btnNuevoEmpleado;
    private javax.swing.JRadioButton busDNI;
    private javax.swing.JRadioButton busID;
    private javax.swing.JRadioButton busNombre;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JComboBox<String> cbxGenero;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JComboBox<String> cbxTipoHabitacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JTabbedPane panedTodo;
    private javax.swing.JLabel tMensaje;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTable tblHabitaciones;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
