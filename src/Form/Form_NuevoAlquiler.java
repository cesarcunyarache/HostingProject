package Form;

import BusinessObject.CaracteristicaHabitacion;
import BusinessObject.Cliente;
import BusinessObject.RegistroHabitacion;
import BusinessObject.TipoHabitacion;
import BusinessObject.TipoPago;
import DataAccessObject.CaracteristicaHabitacionDAO;
import Form.Components.ComponentRoom;
import Menu.Menu;
import TransferObject.CaracteristicaHabitacionDTO;
import TransferObject.ClienteDTO;
import TransferObject.HabitacionDTO;
import TransferObject.TipoHabitacionDTO;
import TransferObject.TipoPagoDTO;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.apache.commons.collections4.list.AbstractLinkedList;

public class Form_NuevoAlquiler extends javax.swing.JPanel {

    ClienteDTO clienteDTO;
    Cliente cliente;
    Menu menu;
    TipoHabitacion tH;
    DefaultComboBoxModel modelo;
    HabitacionDTO habitacionDTO;
    CaracteristicaHabitacionDTO caracDTO;
    CaracteristicaHabitacion carac;
    DefaultComboBoxModel modeloPago;
    TipoPago tHP;

    RegistroHabitacion rH;
    boolean sw = true;

    public Form_NuevoAlquiler() {

        initComponents();
        txtCostoAdicional.setText("0");
        carac = new CaracteristicaHabitacion();
        caracDTO = new CaracteristicaHabitacionDTO();
        tHP = new TipoPago();
        rH = new RegistroHabitacion();
        clienteDTO = null;
        cliente = new Cliente();
        tH = new TipoHabitacion();
        modelo = new DefaultComboBoxModel(llenarCombo());
        cbx_tipoHabitacion.setModel(modelo);
        modeloPago = new DefaultComboBoxModel(llenarComboPago());
        cbx_TipoPago.setModel(modeloPago);
        comprobarCambiosOpciones();
        comprobarCambiosOpciones2();

    }

    public void llenarCamposHabitacion(HabitacionDTO hab) {
        this.habitacionDTO = hab;
        txt_NHabitacion.setText(String.valueOf(hab.getNumHabitacion()));
        modelo.setSelectedItem(String.valueOf(tH.buscar(hab.getTipoHabitacionID())));
        textArea_Descripcion.setText(String.valueOf(hab.getDescripcion()));
        txt_PrecioHabitacion.setText(String.valueOf(tH.buscar(hab.getTipoHabitacionID()).getPrecio()));
        añadirCaracteristicasHabitacion();
    }

    public Vector<String> llenarCombo() {
        Vector<String> combo = new Vector<String>();
        ArrayList<TipoHabitacionDTO> lista = new ArrayList<>();
        combo.add("-Seleccione-");
        lista = (ArrayList<TipoHabitacionDTO>) tH.listar();
        if (lista != null) {
            for (TipoHabitacionDTO tADTO : lista) {
                combo.add(tADTO.getNombre());
            }
        }
        return combo;
    }

    public Vector<String> llenarComboPago() {
        Vector<String> combo = new Vector<String>();
        ArrayList<TipoPagoDTO> lista = new ArrayList<>();
        combo.add("-Seleccione-");
        lista = (ArrayList<TipoPagoDTO>) tHP.listar();
        if (lista != null) {
            for (TipoPagoDTO tADTO : lista) {
                combo.add(tADTO.getNombre());
            }
        }
        return combo;
    }

    public int restarFechas(Date fecha1, Date fecha2) {
        int totalDays = -1; // Obtener la fecha actual
        Calendar fechaActual = Calendar.getInstance();
        fechaActual.set(Calendar.HOUR_OF_DAY, 0);
        fechaActual.set(Calendar.MINUTE, 0);
        fechaActual.set(Calendar.SECOND, 0);
        fechaActual.set(Calendar.MILLISECOND, 0);

        // Crear objetos Calendar y establecer las fechas
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(fecha1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(fecha2);

        // Establecer la hora de ambos calendarios a las 00:00:00 para ignorar la hora del día
        cal1.set(Calendar.HOUR_OF_DAY, 0);
        cal1.set(Calendar.MINUTE, 0);
        cal1.set(Calendar.SECOND, 0);
        cal1.set(Calendar.MILLISECOND, 0);
        cal2.set(Calendar.HOUR_OF_DAY, 0);
        cal2.set(Calendar.MINUTE, 0);
        cal2.set(Calendar.SECOND, 0);
        cal2.set(Calendar.MILLISECOND, 0);

        // Verificar que ambas fechas no sean anteriores a la fecha actual
        if (cal1.before(fechaActual) || cal2.before(fechaActual)) {
            JOptionPane.showMessageDialog(null, "Ambas fechas deben ser posteriores o iguales a la fecha actual", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            // Calcular la diferencia en milisegundos entre las fechas
            long diffMillis = cal2.getTimeInMillis() - cal1.getTimeInMillis();

            // Calcular la diferencia en días
            totalDays = (int) (diffMillis / (24 * 60 * 60 * 1000));

        }
        return totalDays;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public JTextField getTxt_NHabitacion() {
        return txt_NHabitacion;
    }

    public void setTxt_NHabitacion(JTextField txt_NHabitacion) {
        this.txt_NHabitacion = txt_NHabitacion;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea_Descripcion = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        txtCostoAdicional = new javax.swing.JTextField();
        jPCaracteristicas = new javax.swing.JPanel();
        cbFrigoFab = new javax.swing.JCheckBox();
        cbAireAcondicionado = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jDtFechaEntrada = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jDtFechaSalida = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        txt_PrecioHabitacion = new javax.swing.JTextField();
        txtCostoTotal1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        btnBuscar3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        cbx_TipoPago = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        txtDescripcionPago = new javax.swing.JTextField();
        btnBuscar1 = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLbBienvenido.setFont(new java.awt.Font("Roboto", 1, 40)); // NOI18N
        jLbBienvenido.setText("Alquiler");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información de cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 16), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel3.setToolTipText("");

        btn_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/usuarios.png"))); // NOI18N
        btn_Agregar.setText("Ver más información");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Correo");

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nombres");

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Apellidos");

        txt_apellido.setEditable(false);
        txt_apellido.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txt_apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_apellidoKeyPressed(evt);
            }
        });

        txt_correo.setEditable(false);
        txt_correo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_telefono.setEditable(false);
        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Telefono");

        txt_nombre.setEditable(false);
        txt_nombre.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(txt_apellido)
                            .addComponent(txt_telefono)
                            .addComponent(txt_correo))
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información de la habitación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 16), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        txt_NHabitacion.setEditable(false);
        txt_NHabitacion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_NHabitacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_NHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NHabitacionActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Tipo de habitación");

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("N° Habitación");

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Caracteristicas Opcionales");

        jLabel22.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Descripción");

        cbx_tipoHabitacion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cbx_tipoHabitacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbx_tipoHabitacion.setEnabled(false);

        textArea_Descripcion.setEditable(false);
        textArea_Descripcion.setColumns(1);
        textArea_Descripcion.setLineWrap(true);
        textArea_Descripcion.setRows(5);
        textArea_Descripcion.setToolTipText("");
        textArea_Descripcion.setWrapStyleWord(true);
        jScrollPane1.setViewportView(textArea_Descripcion);

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Costo adicional");

        txtCostoAdicional.setEditable(false);
        txtCostoAdicional.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCostoAdicional.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCostoAdicional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostoAdicionalActionPerformed(evt);
            }
        });

        cbFrigoFab.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        cbFrigoFab.setForeground(new java.awt.Color(102, 102, 102));
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
        cbAireAcondicionado.setForeground(new java.awt.Color(102, 102, 102));
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
                .addGap(56, 56, 56)
                .addGroup(jPCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbAireAcondicionado)
                    .addComponent(cbFrigoFab))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPCaracteristicasLayout.setVerticalGroup(
            jPCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCaracteristicasLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(cbFrigoFab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbAireAcondicionado)
                .addGap(21, 21, 21))
        );

        jButton1.setBackground(new java.awt.Color(255, 127, 80));
        jButton1.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Seleccionar otra habitación");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCostoAdicional, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPCaracteristicas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_NHabitacion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbx_tipoHabitacion, javax.swing.GroupLayout.Alignment.LEADING, 0, 260, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel23))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_tipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_NHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel18))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCostoAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));

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

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Costo por día");

        txt_PrecioHabitacion.setEditable(false);
        txt_PrecioHabitacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_PrecioHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PrecioHabitacionActionPerformed(evt);
            }
        });

        txtCostoTotal1.setEditable(false);
        txtCostoTotal1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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
                .addGap(39, 39, 39)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(233, 233, 233))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txt_PrecioHabitacion)
                                .addGap(69, 69, 69)))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtCostoTotal1)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jDtFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jDtFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(84, 84, 84))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(btnBuscar3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDtFechaEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jDtFechaSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel24))
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_PrecioHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCostoTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBuscar3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información de pago:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 16))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(102, 102, 102));

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Tipo de pago");

        cbx_TipoPago.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cbx_TipoPago.setForeground(new java.awt.Color(102, 102, 102));
        cbx_TipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_TipoPago.setEnabled(false);

        jLabel21.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Información adicional");

        txtDescripcionPago.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_TipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescripcionPago, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_TipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcionPago, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        btnBuscar1.setBackground(new java.awt.Color(0, 110, 230));
        btnBuscar1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnBuscar1.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/alquiler.png"))); // NOI18N
        btnBuscar1.setText("Alquiler");
        btnBuscar1.setEnabled(false);
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLbBienvenido)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(264, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLbBienvenido)
                        .addGap(2, 2, 2)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(141, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
//        menu.SelectMenu(3, menu.cliente);
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void txt_apellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoKeyPressed

    }//GEN-LAST:event_txt_apellidoKeyPressed
    private void limpiarCampos() {
        final String VACIO = "";
        txt_nombre.setText(VACIO);
        txt_telefono.setText(VACIO);
        txt_apellido.setText(VACIO);
        txt_correo.setText(VACIO);
        jTxtBuscar.setText(VACIO);
    }
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        clienteDTO = cliente.BuscarDNI(jTxtBuscar.getText().trim());
        if (clienteDTO != null) {
            llenarCamposCliente(clienteDTO);
        } else {
            JOptionPane.showMessageDialog(this, "Este usuario no se encuentra registrado. Serás redirigido al formulario para su registro.", " ERROR ",
                    JOptionPane.ERROR_MESSAGE);
            //Enviamos el numero de documeto
            menu.cliente.setNumDoc(jTxtBuscar.getText());
            limpiarCampos();
            menu.SelectMenu(3, menu.cliente);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txt_NHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NHabitacionActionPerformed

//        objHabitacion = habitacion.buscar(Integer.valueOf(txt_NHabitacion.getText()));
//        if (objHabitacion != null) {
//            //txtTipoHabitacion.setText(cargarTipoHab(objHabitacion.getTipoHabitacionID()));
//            txt_PrecioHabitacion.setText(cargarPrecio(objHabitacion.getTipoHabitacionID()));
//        }
    }//GEN-LAST:event_txt_NHabitacionActionPerformed
    public void llenarCamposCliente(ClienteDTO client) {
        if (client != null) {

            txt_nombre.setText(client.getNombres());
            txt_telefono.setText(client.getTelefono());
            txt_apellido.setText(client.getApellidos());
            txt_correo.setText(client.getCorreo());

        }
    }


    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed

        int respuesta = JOptionPane.showConfirmDialog(
                this,
                "¿Estás seguro de realizar el alquiler?",
                "Confirmación",
                JOptionPane.YES_NO_OPTION
        );

        if (respuesta == JOptionPane.YES_OPTION) {
            // Acción a realizar si se selecciona "Sí" en la confirmación
            int idHabitacion = habitacionDTO.getNumHabitacion(), idCliente = clienteDTO.getIdCliente(), idEmpleado = 11;
            Date fechaIngreso = jDtFechaEntrada.getDate();

            // Crear el objeto SimpleDateFormat con el formato deseado
            SimpleDateFormat formatoFecha1 = new SimpleDateFormat("yyyy-MM-dd");

            // Formatear la fecha utilizando el objeto SimpleDateFormat
            String fechaFormateada1 = formatoFecha1.format(fechaIngreso);

            Date fechaSalida = jDtFechaSalida.getDate();

            // Crear el objeto SimpleDateFormat con el formato deseado
            SimpleDateFormat formatoFecha2 = new SimpleDateFormat("yyyy-MM-dd");

            // Formatear la fecha utilizando el objeto SimpleDateFormat
            String fechaFormateada2 = formatoFecha2.format(fechaSalida);
            double monto = Double.parseDouble(txtCostoTotal1.getText());
            int tipoPago = tHP.buscarName(cbx_TipoPago.getSelectedItem().toString()).getIdTPago();
            String descripcion = txtDescripcionPago.getText();

            JOptionPane.showMessageDialog(null, rH.registrarAlquiler(idHabitacion, idCliente, idEmpleado, fechaIngreso, fechaSalida, monto, tipoPago, descripcion));
        } else {

        }


    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void txt_PrecioHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PrecioHabitacionActionPerformed

    }//GEN-LAST:event_txt_PrecioHabitacionActionPerformed

    private void cbFrigoFabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbFrigoFabKeyPressed


    }//GEN-LAST:event_cbFrigoFabKeyPressed
    private void setInfoCaracteristicas() {

    }

    public void comprobarCambiosOpciones2() {
        try {
            if (cbFrigoFab.isSelected()) {
                double costoTotal = Double.parseDouble(txtCostoAdicional.getText());
                double caracValor = carac.Buscar(2).getValor();
                double total = costoTotal + caracValor;
                txtCostoAdicional.setText(String.valueOf(total));
            } else {
                double costoTotal = Double.parseDouble(txtCostoAdicional.getText());
                double caracValor = carac.Buscar(2).getValor();
                double total = costoTotal - caracValor;
                txtCostoAdicional.setText(String.valueOf(total));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void comprobarCambiosOpciones() {
        try {
            if (cbAireAcondicionado.isSelected()) {
                double costoTotal = Double.parseDouble(txtCostoAdicional.getText());
                double caracValor = carac.Buscar(1).getValor();
                double total = costoTotal + caracValor;
                txtCostoAdicional.setText(String.valueOf(total));
            } else {
                double costoTotal = Double.parseDouble(txtCostoAdicional.getText());
                double caracValor = carac.Buscar(1).getValor();
                double total = costoTotal - caracValor;
                txtCostoAdicional.setText(String.valueOf(total));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void cbFrigoFabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbFrigoFabMouseClicked


    }//GEN-LAST:event_cbFrigoFabMouseClicked

    private void cbFrigoFabMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbFrigoFabMousePressed

    }//GEN-LAST:event_cbFrigoFabMousePressed

    private void cbAireAcondicionadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbAireAcondicionadoMouseClicked

    }//GEN-LAST:event_cbAireAcondicionadoMouseClicked

    private void cbFrigoFabItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbFrigoFabItemStateChanged
        comprobarCambiosOpciones2();
    }//GEN-LAST:event_cbFrigoFabItemStateChanged

    private void cbAireAcondicionadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAireAcondicionadoItemStateChanged
        comprobarCambiosOpciones();
    }//GEN-LAST:event_cbAireAcondicionadoItemStateChanged

    private void btnBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar2ActionPerformed
        limpiarCampos();
        clienteDTO = null;
    }//GEN-LAST:event_btnBuscar2ActionPerformed

    private void txtCostoAdicionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostoAdicionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoAdicionalActionPerformed

    private void jDtFechaSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDtFechaSalidaMouseClicked


    }//GEN-LAST:event_jDtFechaSalidaMouseClicked

    private void btnBuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar3ActionPerformed
        if (clienteDTO != null) {
            Date fecha1 = jDtFechaEntrada.getDate();
            Date fecha2 = jDtFechaSalida.getDate();

            int dias = restarFechas(fecha1, fecha2);
            double costoHabitacionPorDia = Double.parseDouble(txt_PrecioHabitacion.getText());
            double costoTotal = 0.0;

            if (dias == 0 && cbx_tipoHabitacion.getSelectedItem().toString().equals("Matrimonial")) {
                JTextField additionalInfoField = new JTextField();
                Object[] message = {
                    "Ha seleccionado el alquiler por horas. Ingrese el monto:",
                    additionalInfoField
                };

                int respuesta = JOptionPane.showConfirmDialog(
                        null,
                        message,
                        "Confirmación",
                        JOptionPane.YES_NO_OPTION
                );

                if (respuesta == JOptionPane.YES_OPTION) {
                    String additionalInfo = additionalInfoField.getText();
                    txt_PrecioHabitacion.setText("");

                    double adicional = Double.parseDouble(txtCostoAdicional.getText());
                    costoTotal = Integer.parseInt(additionalInfo) + adicional;
                    txtCostoTotal1.setText(String.valueOf(costoTotal));
                    cbx_TipoPago.setEnabled(sw);
                    btnBuscar1.setEnabled(sw);
                    txtDescripcionPago.setEnabled(sw);

                } else if (respuesta == JOptionPane.NO_OPTION) {
                    cbx_TipoPago.setEnabled(!sw);
                    btnBuscar1.setEnabled(!sw);
                    txtDescripcionPago.setEnabled(!sw);
                }
            } else if (dias > 0) {
                double adicional = Double.parseDouble(txtCostoAdicional.getText());
                costoTotal = (costoHabitacionPorDia * dias) + adicional;
                txtCostoTotal1.setText(String.valueOf(costoTotal));

                int respuesta = JOptionPane.showConfirmDialog(
                        this,
                        "El costo total es de " + costoTotal + "\n¿Desea seguir con el Alquiler?",
                        "Confirmación",
                        JOptionPane.YES_NO_OPTION
                );

                if (respuesta == JOptionPane.YES_OPTION) {
                    // Acción a realizar si se selecciona "Sí" en la confirmación
                    System.out.println("Confirmación: Sí");
                    cbx_TipoPago.setEnabled(sw);
                    btnBuscar1.setEnabled(sw);
                    txtDescripcionPago.setEnabled(sw);
                } else if (respuesta == JOptionPane.NO_OPTION) {
                    cbx_TipoPago.setEnabled(!sw);
                    btnBuscar1.setEnabled(!sw);
                    txtDescripcionPago.setEnabled(!sw);
                }
            } else if (dias == 0) {
                JOptionPane.showMessageDialog(
                        null,
                        "Las habitaciones que no son de tipo Matrimonial no se pueden alquilar por horas",
                        "Atención",
                        JOptionPane.WARNING_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Introduzca los días de alquiler correctamente",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        } else {
            JOptionPane.showMessageDialog(null, "Aún no se tiene información del cliente");
        }
    }//GEN-LAST:event_btnBuscar3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        menu.SelectMenu(0, menu.habitacion);
        limpiarCampos();
    }//GEN-LAST:event_jButton1ActionPerformed


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
    private javax.swing.JPanel jPanel6;
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

    private void añadirCaracteristicasHabitacion() {
        //Validamos que existe una habitacion seleccionada
        if (habitacionDTO != null) {

            CaracteristicaHabitacionDAO dao = new CaracteristicaHabitacionDAO();
            List<CaracteristicaHabitacionDTO> listaCaracteristicas = dao.Read(habitacionDTO.getNumHabitacion());
            try {

                if (listaCaracteristicas.get(0).getNombre().equals("Aire Acondicionado")) {
                    System.out.println("Tiene caracteristicas");

                    desactivarCheckBox(cbFrigoFab, true);
                    desactivarCheckBox(cbAireAcondicionado, true);
                }

            } catch (Exception e) {

                desactivarCheckBox(cbFrigoFab, false);
                desactivarCheckBox(cbAireAcondicionado, false);

            }

        }
    }

    private void desactivarCheckBox(JCheckBox jcb, boolean estado) {
        jcb.setSelected(estado);
        jcb.setEnabled(estado);
    }
}
