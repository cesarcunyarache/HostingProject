/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Form;

import BusinessObject.Pago;
import BusinessObject.TipoPago;
import TransferObject.PagoDTO;
import TransferObject.TipoPagoDTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author cesarcunyarache
 */
public class Form_Pago extends javax.swing.JPanel {

     int id;
    Pago pg;
    TipoPago tp;
    DefaultTableModel dt;
    DefaultComboBoxModel modelo;
    
    public Form_Pago() {
        initComponents();
        tp = new TipoPago();
        pg = new Pago();
        modelo = new DefaultComboBoxModel(llenarCombo());
        cbo_tipo.setModel(modelo);
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
        ArrayList<TipoPagoDTO> lista = new ArrayList<>();
        combo.add("-Seleccione-");
        lista = (ArrayList<TipoPagoDTO>) tp.listar();
        if (lista != null) {
            for (TipoPagoDTO tipoPago : lista) {
                combo.add(tipoPago.getNombre());
            }
        }
        return combo;
    }

    public void limpiar() {
        txt_monto.setText("");
        cbo_tipo.setSelectedIndex(0);
        txt_descripcion.setText("");
        tabla.clearSelection();
        id = -1;
    }

    public void llenarTabla() {

        dt.setColumnCount(0);
        dt.setRowCount(0);

        String[] cabezera = {
            "#",
            "Monto",
            "TipoPago",
            "Descripcion"};
        dt.setColumnIdentifiers(cabezera);

        Object[] datos = new Object[dt.getColumnCount()];

        ArrayList<PagoDTO> lista = new ArrayList<>();
        lista = (ArrayList<PagoDTO>) pg.listar();
        if (lista != null) {

            for (int i = 0; i < lista.size(); i++) {
                PagoDTO c = lista.get(i);

                datos[0] = c.getIdPago();
                datos[1] = c.getMonto();
                datos[2] = tp.buscar(c.getIdTipo()).getNombre();
                datos[3] = c.getDescripcion();

                dt.addRow(datos);

            }

            tabla.setModel(dt);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(25);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(25);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(50);
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

        jPanel1 = new javax.swing.JPanel();
        txt_monto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        cbo_tipo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btn_agregar = new javax.swing.JButton();
        btn_Acutalizar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_nuevo = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Monto");

        jLabel2.setText("Tipo");

        jLabel3.setText("Descripcion");

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
        jScrollPane2.setViewportView(tabla);

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_Acutalizar.setText("Actualizar");
        btn_Acutalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AcutalizarActionPerformed(evt);
            }
        });

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_nuevo.setText("Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                                .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Acutalizar)
                            .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Acutalizar)
                            .addComponent(btn_agregar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar)
                    .addComponent(btn_nuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        id = (int) (tabla.getValueAt(tabla.getSelectedRow(), 0));
        if (id == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        } else {
            btn_nuevo.setEnabled(true);
            btn_agregar.setEnabled(false);

            PagoDTO empDTO = pg.buscar(id);

            if (empDTO != null) {

                txt_monto.setText(String.valueOf(empDTO.getMonto()));
                txt_descripcion.setText(empDTO.getDescripcion());
                cbo_tipo.setSelectedItem(tp.buscar(empDTO.getIdTipo()).getNombre());

            }
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        if (!txt_monto.getText().isEmpty()
            && !txt_descripcion.getText().isEmpty() && !cbo_tipo.getSelectedItem().equals("-Seleccione-")) {

            Double monto = Double.valueOf(txt_monto.getText());
            String tipo = cbo_tipo.getSelectedItem().toString();
            String descripcion = txt_descripcion.getText();

            String mensaje = pg.agregar(monto, tp.buscarName(tipo).getIdTPago(), descripcion);

            if (!mensaje.equals("")) {
                JOptionPane.showMessageDialog(null, mensaje);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, mensaje);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error, uno o más campos vacios!");
        }
        llenarTabla();
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_AcutalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AcutalizarActionPerformed
        if (!txt_monto.getText().isEmpty() && !cbo_tipo.getSelectedItem().equals("-Seleccione-")
            && !txt_descripcion.getText().isEmpty()) {

            Double monto = Double.parseDouble(txt_monto.getText());
            String descripcion = txt_descripcion.getText();
            String tipo = cbo_tipo.getSelectedItem().toString();

            String mensaje = pg.actualizar(id, monto, tp.buscarName(tipo).getIdTPago(), descripcion);

            if (!mensaje.equals("")) {
                JOptionPane.showMessageDialog(null, mensaje);

            } else {
                JOptionPane.showMessageDialog(null, mensaje);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error, uno o más campos vacios!");
        }
        llenarTabla();
    }//GEN-LAST:event_btn_AcutalizarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

        String codBusqueda = JOptionPane.showInputDialog("Ingrese el ID a buscar");

        PagoDTO pgDTO = pg.buscar(Integer.parseInt(codBusqueda));

        if (pgDTO != null) {
            id = Integer.parseInt(codBusqueda);
            JOptionPane.showMessageDialog(null, "Registro encontrado");
            txt_monto.setText(String.valueOf(pgDTO.getMonto()));
            txt_descripcion.setText(pgDTO.getDescripcion());
            cbo_tipo.setSelectedItem(tp.buscar(pgDTO.getIdTipo()).getNombre());
            btn_agregar.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(null, "Registro no encontrado");
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        limpiar();
        btn_agregar.setEnabled(true);
    }//GEN-LAST:event_btn_nuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Acutalizar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JComboBox<String> cbo_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_monto;
    // End of variables declaration//GEN-END:variables
}
