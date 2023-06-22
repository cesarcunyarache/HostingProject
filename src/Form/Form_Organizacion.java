/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Form;

import BusinessObject.Organizacion;
import TransferObject.OrganizacionDTO;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cesarcunyarache
 */
public class Form_Organizacion extends javax.swing.JPanel {

    Organizacion organizacion;
    DefaultTableModel df;
    int id = 0;

    public Form_Organizacion() {
        initComponents();
        organizacion = new Organizacion();

        df = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        llenarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_razon = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_ruc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_descripcion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        cbo_estado = new javax.swing.JComboBox<>();
        btn_Agregar = new javax.swing.JButton();
        btn_Buscar = new javax.swing.JButton();
        btn_Actualizar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel49 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNumDoc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 315, 36));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Razon social");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));
        jPanel1.add(txt_razon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 649, 36));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("RUC");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        txt_ruc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_rucKeyTyped(evt);
            }
        });
        jPanel1.add(txt_ruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 290, 36));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Descripcion");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        txt_descripcion.setColumns(20);
        txt_descripcion.setRows(5);
        jScrollPane1.setViewportView(txt_descripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 649, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Estado");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        cbo_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        jPanel1.add(cbo_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 238, 30));

        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 90, 30));

        btn_Buscar.setText("Buscar");
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 80, 30));

        btn_Actualizar.setText("Actualizar");
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 90, 30));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 650, 280));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 30, 740));

        jLabel49.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jLabel49.setText("Información de organizaciones");
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel6.setText("Número de documeto");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 50, -1, -1));
        jPanel1.add(txtNumDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 70, 240, 30));

        jLabel7.setText("Nombres y apeliidos");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, -1, -1));
        jPanel1.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 150, 230, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        if (!txt_nombre.getText().isEmpty() && !txt_razon.getText().isEmpty()
                && txt_ruc.getText().isEmpty()) {

            String nombre = txt_nombre.getText();
            String razon = txt_razon.getText();
            String ruc = txt_ruc.getText();
            String descripcion = txt_descripcion.getText();
            String estado = (String) cbo_estado.getSelectedItem();

            String mensaje = organizacion.Agregar(nombre, razon, ruc, descripcion, estado);
            JOptionPane.showMessageDialog(null, mensaje);
            llenarTabla();
            Limpiar();

        } else {
            JOptionPane.showMessageDialog(null, "Error, uno o más campos vacios!");
        }
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        String ID = JOptionPane.showInputDialog("Ingrese el ID a buscar");

        if (ID.matches("[0-9]*")) {
            OrganizacionDTO org = organizacion.Buscar(Integer.parseInt(ID));

            if (org != null) {
                txt_nombre.setText(org.getNombre());
                txt_razon.setText(org.getRazonSocial());
                txt_ruc.setText(org.getRuc());
                txt_descripcion.setText(org.getDescripcion());
                cbo_estado.setSelectedItem(org.getEstado());
                id = org.getIdOrganizacion();
            } else {
                JOptionPane.showMessageDialog(null, "No encontrado");
            }
 
        } else {
             JOptionPane.showMessageDialog(null, "Ingrese solo valores enteros");
        }
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        id = (int) (tabla.getValueAt(tabla.getSelectedRow(), 0));

        if (id != 0) {
            OrganizacionDTO org = organizacion.Buscar(id);

            if (org != null) {
                txt_nombre.setText(org.getNombre());
                txt_razon.setText(org.getRazonSocial());
                txt_ruc.setText(org.getRuc());
                txt_descripcion.setText(org.getDescripcion());
                cbo_estado.setSelectedItem(org.getEstado());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
        if (!txt_nombre.getText().isEmpty() && !txt_razon.getText().isEmpty()
                && !txt_ruc.getText().isEmpty()) {

            String nombre = txt_nombre.getText();
            String razon = txt_razon.getText();
            String ruc = txt_ruc.getText();
            String descripcion = txt_descripcion.getText();
            String estado = (String) cbo_estado.getSelectedItem();

            String mensaje = organizacion.Actualizar(id, nombre, razon, ruc, descripcion, estado);

            JOptionPane.showMessageDialog(null, mensaje );
            id = 0;

        } else {
            JOptionPane.showMessageDialog(null, "ERROR : Uno o más campos vacios HOLA");
        }
        
        llenarTabla();
        Limpiar();
    }//GEN-LAST:event_btn_ActualizarActionPerformed

    private void txt_rucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rucKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        if (txt_ruc.getText().length() > 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_rucKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JComboBox<String> cbo_estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtNumDoc;
    private javax.swing.JTextArea txt_descripcion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_razon;
    private javax.swing.JTextField txt_ruc;
    // End of variables declaration//GEN-END:variables

    private void llenarTabla() {
        df.setColumnCount(0);
        df.setRowCount(0);

        String[] cabezera = {"#", "Nombre", "Razon Social", "RUC", "Estado"};
        df.setColumnIdentifiers(cabezera);

        Object[] datos = new Object[df.getColumnCount()];

        ArrayList<OrganizacionDTO> lista = new ArrayList<>();
        lista = (ArrayList<OrganizacionDTO>) organizacion.Listar();
        if (lista != null) {

            for (int i = 0; i < lista.size(); i++) {
                OrganizacionDTO obj = lista.get(i);

                datos[0] = obj.getIdOrganizacion();
                datos[1] = obj.getNombre();
                datos[2] = obj.getRazonSocial();
                datos[3] = obj.getRuc();
                datos[4] = obj.getEstado();

                df.addRow(datos);
            }

            tabla.setModel(df);

        }
    }

    private void Limpiar() {
        txt_nombre.setText("");
        txt_razon.setText("");
        txt_ruc.setText("");
        txt_descripcion.append("");
        cbo_estado.setSelectedIndex(0);
    }

}
