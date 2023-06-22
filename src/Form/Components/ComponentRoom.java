
package Form.Components;

import TransferObject.HabitacionDTO;
import java.awt.Color;

public class ComponentRoom extends javax.swing.JPanel {

    HabitacionDTO habitacionFrame = new HabitacionDTO();
    
    public ComponentRoom(HabitacionDTO habitacion) {
        initComponents();
        habitacionFrame = habitacion;
        cargarInfoHabitacion();
    }
    
    private void cargarInfoHabitacion(){
        jLNumeroHabitacion.setText("N° "+habitacionFrame.getNumHabitacion());
        jLTipoHabitacion.setText(cargarTipoHabitacion());
        jLEstadoHabitacion.setText(cargarEstadoHabitacion());
    }
    
    private String cargarTipoHabitacion() {
        String tipoHabitacion = "Habitacion ";
        switch (habitacionFrame.getTipoHabitacionID()) {
            case 1:
                tipoHabitacion = tipoHabitacion + "Simple";
                break;
            case 2:
                tipoHabitacion = tipoHabitacion + "Familiar";
                break;
            case 3:
                tipoHabitacion = tipoHabitacion + "Doble";
                break;
            case 4:
                tipoHabitacion = tipoHabitacion + "Matrimonial";
                break;
        }
        jLTipoHabitacion.setForeground(new Color(102, 102, 102));
        return tipoHabitacion;
    }
   
    private String cargarEstadoHabitacion(){
        switch (habitacionFrame.getEstado()) {
            case "En uso":
                jPColorEstado.setBackground(new Color(0, 110, 230));
                break;
            case "Reservada":
                jPColorEstado.setBackground(new Color(128, 206, 225));
                break;
            case "Limpieza":
                jPColorEstado.setBackground(new Color(194, 59, 34));
                break;
            case "Deshabilitada":
                jPColorEstado.setBackground(new Color(198, 255, 241));
                jLEstadoHabitacion.setForeground(Color.black);
                break;
            case "Diponible":
                jPColorEstado.setBackground(Color.GREEN);
                break;
        }
        return habitacionFrame.getEstado();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel11 = new javax.swing.JPanel();
        jPColorEstado = new javax.swing.JPanel();
        jLEstadoHabitacion = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLNumeroHabitacion = new javax.swing.JLabel();
        jLTipoHabitacion = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
        });

        jPColorEstado.setBackground(new java.awt.Color(28, 200, 138));

        jLEstadoHabitacion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLEstadoHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        jLEstadoHabitacion.setText("Disponible");

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText(">");

        javax.swing.GroupLayout jPColorEstadoLayout = new javax.swing.GroupLayout(jPColorEstado);
        jPColorEstado.setLayout(jPColorEstadoLayout);
        jPColorEstadoLayout.setHorizontalGroup(
            jPColorEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPColorEstadoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLEstadoHabitacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(21, 21, 21))
        );
        jPColorEstadoLayout.setVerticalGroup(
            jPColorEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPColorEstadoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPColorEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEstadoHabitacion)
                    .addComponent(jLabel18))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLNumeroHabitacion.setBackground(new java.awt.Color(255, 255, 255));
        jLNumeroHabitacion.setFont(new java.awt.Font("Roboto", 1, 32)); // NOI18N
        jLNumeroHabitacion.setForeground(new java.awt.Color(0, 0, 0));
        jLNumeroHabitacion.setText("NRO: 201");

        jLTipoHabitacion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLTipoHabitacion.setForeground(new java.awt.Color(102, 102, 102));
        jLTipoHabitacion.setText("Habitación simple");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPColorEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLTipoHabitacion)
                    .addComponent(jLNumeroHabitacion))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLNumeroHabitacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLTipoHabitacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jPColorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        // 
    }//GEN-LAST:event_jPanel11MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLEstadoHabitacion;
    private javax.swing.JLabel jLNumeroHabitacion;
    private javax.swing.JLabel jLTipoHabitacion;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPColorEstado;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    // End of variables declaration//GEN-END:variables

}
