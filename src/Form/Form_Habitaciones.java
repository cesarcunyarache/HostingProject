package Form;

import TransferObject.HabitacionDTO;
import java.util.ArrayList;
import BusinessObject.Habitacion;
import Form.Components.ComponentRoom;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class Form_Habitaciones extends javax.swing.JPanel {

     Habitacion habitacion = new Habitacion();
    
    public Form_Habitaciones() {
        initComponents();
        cargarHabitaciones();
//        habilitarCBX();
    }
    
    private void cargarHabitaciones(){
        ArrayList<HabitacionDTO> lista = new ArrayList<>();
        lista = (ArrayList<HabitacionDTO>) habitacion.listarR();
        if (lista != null){
            for (int i = 0; i < lista.size(); i++) {
                ComponentRoom componenteHabitacion = new ComponentRoom(lista.get(i));
                jPContent.add(componenteHabitacion);
                jPContent.updateUI();
            }
        }
    }
    
    private void obtenerTextoDejCb(JCheckBox jCbx, ArrayList filtro){
        String cadena = null;
        //Metodo para devolver los strings de una jCheckBox
        if (jCbx.isSelected()){
           filtro.add(jCbx.getText());
        }
    }
    
    private void cargarHabitacionesFiltro(){            
        ArrayList<HabitacionDTO> lista = new ArrayList<>();
        lista = (ArrayList<HabitacionDTO>) habitacion.listarR(jCbxEstado.getSelectedItem().toString());
        if (lista != null){
            jPContent.removeAll();
            jPContent.revalidate();
            jPContent.updateUI();
            for (int i = 0; i < lista.size(); i++) {
                ComponentRoom componenteHabitacion = new ComponentRoom(lista.get(i));
                jPContent.add(componenteHabitacion);
                jPContent.updateUI();
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jScContent = new javax.swing.JScrollPane();
        jPContent = new javax.swing.JPanel();
        jBAplicarFiltros = new javax.swing.JButton();
        jCbxEstado = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jLabel49.setText("Visualizar Habitaciones");

        jScContent.setBackground(new java.awt.Color(255, 255, 255));
        jScContent.setBorder(null);

        jPContent.setBackground(new java.awt.Color(255, 255, 255));
        jPContent.setLayout(new java.awt.GridLayout(0, 4));
        jScContent.setViewportView(jPContent);

        jBAplicarFiltros.setBackground(new java.awt.Color(0, 110, 230));
        jBAplicarFiltros.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jBAplicarFiltros.setForeground(new java.awt.Color(255, 255, 255));
        jBAplicarFiltros.setText("Aplcar filtros");
        jBAplicarFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAplicarFiltrosActionPerformed(evt);
            }
        });

        jCbxEstado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jCbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "En uso", "Reservada", "Deshabili", "Limpieza", "Disponible" }));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Estado de la habitación");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jCbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBAplicarFiltros)
                        .addContainerGap(998, Short.MAX_VALUE))))
            .addComponent(jScContent, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel49)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBAplicarFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScContent, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBAplicarFiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAplicarFiltrosActionPerformed

        try {
            cargarHabitacionesFiltro();
            JOptionPane.showMessageDialog(this, "Filtros aplicados con éxito", " Hosp. El Emperador ",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jBAplicarFiltrosActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAplicarFiltros;
    private javax.swing.JComboBox<String> jCbxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JPanel jPContent;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScContent;
    // End of variables declaration//GEN-END:variables
}
