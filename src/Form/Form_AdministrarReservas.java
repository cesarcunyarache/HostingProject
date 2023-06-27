/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Form;

import BusinessObject.Cliente;
import BusinessObject.Habitacion;
import BusinessObject.Pago;
import BusinessObject.Reserva;
import TransferObject.ClienteDTO;
import TransferObject.PagoDTO;
import TransferObject.ReservaDTO;
import TransferObject.TipoDocumentoDTO;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cesarcunyarache
 */
public class Form_AdministrarReservas extends javax.swing.JPanel {

    Reserva reserva;
    Cliente cliente;
    Habitacion habitacion;
    int id = 0;
    Pago pago;
    DefaultTableModel df;
    ReservaDTO objReserva;

    public Form_AdministrarReservas() {
        initComponents();
        reserva = new Reserva();
        cliente = new Cliente();
        habitacion = new Habitacion();
        pago = new Pago();

        df = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        llenarTabla();
        rbNombre.setSelected(true);
    }

    public void llenarTabla() {

        df.setColumnCount(0);
        df.setRowCount(0);

        String[] cabezera = {"#", "N° de Habitaciín", "N° documento del cliente", "Nombres y Apellidos", "Fecha de Reserva", "Fecha de inicio", "Fecha salida", "Costo"};
        df.setColumnIdentifiers(cabezera);

        Object[] datos = new Object[df.getColumnCount()];

        ArrayList<ReservaDTO> lista = new ArrayList<>();
        lista = (ArrayList<ReservaDTO>) reserva.listar();
        if (lista != null) {

            for (int i = 0; i < lista.size(); i++) {
                ReservaDTO obj = lista.get(i);

                ClienteDTO clienteDTO = cliente.Buscar(obj.getIdCliente());
                PagoDTO pagoDTO = pago.buscar(obj.getIdHabitacion());

                datos[0] = obj.getIdReserva();
                datos[1] = obj.getIdHabitacion();
                datos[2] = clienteDTO.getNumDocumento();
                datos[3] = clienteDTO.getNombres() + " " + clienteDTO.getApellidos();
                datos[4] = obj.getFechaReserva();
                datos[5] = obj.getFechaInicio();
                datos[6] = obj.getFechaFin();
                datos[7] = pagoDTO.getMonto();

                df.addRow(datos);
            }

            tabla.setModel(df);

        }
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
        txtNumHab = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNumDoc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        rbNumeroDoc = new javax.swing.JRadioButton();
        rbHabitacion = new javax.swing.JRadioButton();
        rbNombre = new javax.swing.JRadioButton();
        txtBusqueda = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jDtFechaEntrada = new com.toedter.calendar.JDateChooser();
        jDtFechaFin = new com.toedter.calendar.JDateChooser();
        rbApellidos = new javax.swing.JRadioButton();
        jDtFechaReserva = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jDtFechaInicio = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jDtFechaSalida = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        txtNumHab.setEditable(false);
        txtNumHab.setEnabled(false);

        jLabel1.setText("Numero de habitación");

        txtNumDoc.setEditable(false);
        txtNumDoc.setEnabled(false);

        jLabel2.setText("N° de documento ");

        jLabel3.setText("Nombres y Apellidos");

        txtNombres.setEditable(false);
        txtNombres.setEnabled(false);

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(rbNumeroDoc);
        rbNumeroDoc.setText("N° de documento");
        jPanel3.add(rbNumeroDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        buttonGroup1.add(rbHabitacion);
        rbHabitacion.setText("N° Habitacion");
        jPanel3.add(rbHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 119, -1));

        buttonGroup1.add(rbNombre);
        rbNombre.setText("Nombres");
        jPanel3.add(rbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

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
        jPanel3.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 132, -1));

        jLabel13.setText("Intervalo fin");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        jLabel12.setText("Intervalo de inicio");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));
        jPanel3.add(jDtFechaEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 160, -1));
        jPanel3.add(jDtFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 160, -1));

        buttonGroup1.add(rbApellidos);
        rbApellidos.setText("Apellidos");
        jPanel3.add(rbApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jDtFechaReserva.setEnabled(false);

        jLabel14.setText("Fecha de Reserva");

        jLabel15.setText("Fecha de Inicio");

        jLabel16.setText("Fecha de Salida");

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ingresar Registro de habitación");

        jButton3.setText("Nuevo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jDtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(593, 593, 593))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 952, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNumDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtNumHab)
                                    .addComponent(jLabel2))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDtFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel16)
                                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jDtFechaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jButton1)
                .addGap(38, 38, 38)
                .addComponent(jButton2)
                .addGap(42, 42, 42)
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDtFechaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(3, 3, 3)
                                .addComponent(jDtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDtFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        try {

            if (jDtFechaEntrada.getDate() != null && jDtFechaFin.getDate() != null) {
                Date fecha = new java.sql.Date(jDtFechaEntrada.getDate().getTime());
                Date fecha2 = new java.sql.Date(jDtFechaFin.getDate().getTime());

                if (fecha.before(fecha2)) {

                    if (!txtBusqueda.getText().isEmpty()) {
                        limpiarTabla();

                        df = (DefaultTableModel) tabla.getModel();
                        Object[] ob = new Object[8];
                        if (rbNombre.isSelected()) {

                            List<ReservaDTO> listaCliente = reserva.buscarNombres(txtBusqueda.getText(), fecha, fecha2);
                            if (listaCliente != null) {
                                for (ReservaDTO c : listaCliente) {
                                    asignarFilaDeDatos(df, ob, c);
                                }
                            }
                        } else if (rbApellidos.isSelected()) {

                            List<ReservaDTO> listaCliente = reserva.buscarApellidos(txtBusqueda.getText(), fecha, fecha2);
                            if (listaCliente != null) {
                                for (ReservaDTO c : listaCliente) {
                                    asignarFilaDeDatos(df, ob, c);
                                }
                            }
                        } else if (rbNumeroDoc.isSelected()) {

                            List<ReservaDTO> listaCliente = reserva.buscarNumeroDoc(txtBusqueda.getText(), fecha, fecha2);
                            if (listaCliente != null) {
                                for (ReservaDTO c : listaCliente) {
                                    asignarFilaDeDatos(df, ob, c);
                                }
                            }
                        } else if (rbHabitacion.isSelected()) {

                            List<ReservaDTO> listaCliente = reserva.buscarHabitacion(txtBusqueda.getText(), fecha, fecha2);
                            if (listaCliente != null) {
                                for (ReservaDTO c : listaCliente) {
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
                } else {
                    txtBusqueda.setText("");
                    JOptionPane.showMessageDialog(null, "La fecha de Inicio no puede ser mayor a la fecha de Fin");
                }

            } else {
                txtBusqueda.setText("");
                JOptionPane.showMessageDialog(null, "Debes ingresar valores de intervalo en las fechas");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        id = (int) (tabla.getValueAt(tabla.getSelectedRow(), 0));
        if (id == 0) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        } else {
            ReservaDTO reservaSearch = reserva.buscarIDregistro(id);

            if (reservaSearch != null) {
                ClienteDTO clienteDTO = cliente.Buscar(reservaSearch.getIdCliente());
                PagoDTO pagoDTO = pago.buscar(reservaSearch.getIdHabitacion());

                if (clienteDTO != null) {
                    if (pagoDTO != null) {
                        txtNumHab.setText(String.valueOf(reservaSearch.getIdHabitacion()));
                        txtNombres.setText(clienteDTO.getNombres() + " " + clienteDTO.getApellidos());
                        txtNumDoc.setText(clienteDTO.getNumDocumento());
                        jDtFechaReserva.setDate(reservaSearch.getFechaReserva());
                        jDtFechaInicio.setDate(reservaSearch.getFechaInicio());
                        jDtFechaSalida.setDate(reservaSearch.getFechaFin());
                        this.objReserva = reservaSearch;
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Valor no encontrado");
                }
            }
        }

    }//GEN-LAST:event_tablaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jDtFechaInicio.getDate() != null && jDtFechaSalida.getDate() != null) {
            Date fecha = new java.sql.Date(jDtFechaInicio.getDate().getTime());
            Date fecha2 = new java.sql.Date(jDtFechaSalida.getDate().getTime());

            if (fecha.before(fecha2)) {
                
                Date fechaReserva =new java.sql.Date(jDtFechaReserva.getDate().getTime());
                String mensaje = reserva.actualizar(objReserva.getIdReserva(), objReserva.getIdHabitacion(), objReserva.getIdCliente(), objReserva.getIdEmpleado(),fechaReserva, fecha, fecha2, objReserva.getEstado());
                JOptionPane.showMessageDialog(null, mensaje);
                limpiar();
                llenarTabla();
            } else {
                 JOptionPane.showMessageDialog(null, "La fecha de Inicio no puede ser mayor a la fecha de Fin");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error: uno o más campos vacios");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      limpiar();
      llenarTabla();
      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void asignarFilaDeDatos(DefaultTableModel modelo, Object[] datos, ReservaDTO obj) {

        ClienteDTO clienteDTO = cliente.Buscar(obj.getIdCliente());
        PagoDTO pagoDTO = pago.buscar(obj.getIdHabitacion());

        datos[0] = obj.getIdReserva();
        datos[1] = obj.getIdHabitacion();
        datos[2] = clienteDTO.getNumDocumento();
        datos[3] = clienteDTO.getNombres() + " " + clienteDTO.getApellidos();
        datos[4] = obj.getFechaReserva();
        datos[5] = obj.getFechaInicio();
        datos[6] = obj.getFechaFin();
        datos[7] = pagoDTO.getMonto();

        modelo.addRow(datos);
    }

    private void limpiarTabla() {
        df = (DefaultTableModel) tabla.getModel();
        df.getDataVector().removeAllElements();
        tabla.removeAll();
    }
    
    public void limpiar(){
        txtBusqueda.setText("");
        txtNumHab.setText("");
        txtNumDoc.setText("");
        txtNombres.setText("");
        jDtFechaReserva.setDate(null);
        jDtFechaInicio.setDate(null);
        jDtFechaSalida.setDate(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDtFechaEntrada;
    private com.toedter.calendar.JDateChooser jDtFechaFin;
    private com.toedter.calendar.JDateChooser jDtFechaInicio;
    private com.toedter.calendar.JDateChooser jDtFechaReserva;
    private com.toedter.calendar.JDateChooser jDtFechaSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbApellidos;
    private javax.swing.JRadioButton rbHabitacion;
    private javax.swing.JRadioButton rbNombre;
    private javax.swing.JRadioButton rbNumeroDoc;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumDoc;
    private javax.swing.JTextField txtNumHab;
    // End of variables declaration//GEN-END:variables
}