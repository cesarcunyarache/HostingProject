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

        jLabel1.setText("Nombre");

        jLabel2.setText("Razon social");

        jLabel3.setText("RUC");

        jLabel4.setText("Descripcion");

        txt_descripcion.setColumns(20);
        txt_descripcion.setRows(5);
        jScrollPane1.setViewportView(txt_descripcion);

        jLabel5.setText("Estado");

        cbo_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

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

        btn_Actualizar.setText("Actualizar");
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(319, 319, 319)
                                .addComponent(jLabel3))
                            .addComponent(cbo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(txt_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_razon)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(btn_Agregar)
                        .addGap(36, 36, 36)
                        .addComponent(btn_Buscar)
                        .addGap(52, 52, 52)
                        .addComponent(btn_Actualizar)))
                .addContainerGap(294, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_razon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Agregar)
                    .addComponent(btn_Buscar)
                    .addComponent(btn_Actualizar))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                txt_descripcion.append(org.getDescripcion());
                cbo_estado.setSelectedItem(org.getEstado());
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
                txt_descripcion.append(org.getDescripcion());
                cbo_estado.setSelectedItem(org.getEstado());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
        if (!txt_nombre.getText().isEmpty() && !txt_razon.getText().isEmpty()
                && txt_ruc.getText().isEmpty()) {

            String nombre = txt_nombre.getText();
            String razon = txt_razon.getText();
            String ruc = txt_ruc.getText();
            String descripcion = txt_descripcion.getText();
            String estado = (String) cbo_estado.getSelectedItem();

            String mensaje = organizacion.Actualizar(id, nombre, razon, ruc, descripcion, estado);

            JOptionPane.showMessageDialog(null, mensaje);
            

        } else {
            JOptionPane.showMessageDialog(null, "ERROR : Uno o más campos vacios");
        }
        
        llenarTabla();
        Limpiar();
    }//GEN-LAST:event_btn_ActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JComboBox<String> cbo_estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
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
