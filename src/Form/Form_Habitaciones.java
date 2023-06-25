package Form;

import TransferObject.HabitacionDTO;
import java.util.ArrayList;
import BusinessObject.Habitacion;
import Form.Components.ComponentRoom;
import Menu.Menu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Form_Habitaciones extends javax.swing.JPanel {

    private Form_Habitacion formHabitacion = new Form_Habitacion();
    private HabitacionDTO itemSelected;
    private Habitacion habitacion = new Habitacion();
    private Menu menu;
    public EventItem eventLabel;
    private EventItem eventSelect;

    public void setEventLabel(EventItem eventLabel) {
        this.eventLabel = eventLabel;
    }

    public void setEventSelect(EventItem eventSelect) {
        this.eventSelect = eventSelect;
    }

    public Form_Habitaciones(Menu menu) {
        initComponents();

        this.menu = menu;

        cargarHabitaciones();
//        habilitarCBX();
        setEventSelect(new EventItem() {
            @Override
            public void itemClick(Component com, HabitacionDTO item) {
                if (itemSelected != item) {
                    setSelected(com);
                }
            }

        });

        setEventLabel(new EventItem() {
            @Override
            public void itemClick(Component com, HabitacionDTO item) {
                if (itemSelected != item) {
                    setSelected(com);
                    menu.SelectMenu(1, formHabitacion);
                    formHabitacion.setData(item);
                }
            }

        });

    }

    private void cargarHabitaciones() {
        ArrayList<HabitacionDTO> lista = new ArrayList<>();
        lista = (ArrayList<HabitacionDTO>) habitacion.listarR();
        if (lista != null) {
            for (int i = 0; i < lista.size(); i++) {
                ComponentRoom componenteHabitacion = new ComponentRoom(lista.get(i));
                createEvents(componenteHabitacion, lista.get(i));
                componenteHabitacion.setMenu(menu);
                jPContent.add(componenteHabitacion);
                jPContent.repaint();
                jPContent.revalidate();
            }
        }
    }

    private void obtenerTextoDejCb(JCheckBox jCbx, ArrayList filtro) {
        String cadena = null;
        //Metodo para devolver los strings de una jCheckBox
        if (jCbx.isSelected()) {
            filtro.add(jCbx.getText());
        }
    }

    private void cargarHabitacionesFiltro() {
        ArrayList<HabitacionDTO> lista = new ArrayList<>();
        lista = (ArrayList<HabitacionDTO>) habitacion.listarR(jCbxEstado.getSelectedItem().toString());
        if (lista != null) {
            jPContent.removeAll();
            jPContent.revalidate();
            jPContent.updateUI();
            for (int i = 0; i < lista.size(); i++) {
                ComponentRoom componenteHabitacion = new ComponentRoom(lista.get(i));
                createEvents(componenteHabitacion, lista.get(i));
                jPContent.add(componenteHabitacion);
                jPContent.updateUI();
            }
        }
    }

    public void createEvents(ComponentRoom componenteHabitacion, HabitacionDTO obj) {
        componenteHabitacion.btnUpdate.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    eventLabel.itemClick(componenteHabitacion, obj);

                }
            }

        });

        componenteHabitacion.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    eventSelect.itemClick(componenteHabitacion, obj);
                }
            }

        });
    }

    public void setSelected(Component item) {
        for (Component com : jPContent.getComponents()) {
            ComponentRoom i = (ComponentRoom) com;
            if (i.isSelected()) {
                i.setSelected(false);
            }
        }
        ((ComponentRoom) item).setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jCbxEstado = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jBAplicarFiltros = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPContent = new Form.PanelItem();

        jCbxEstado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jCbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "En uso", "Reservada", "Deshabili", "Limpieza", "Disponible" }));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Estado de la habitación");

        jLabel49.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jLabel49.setText("Visualizar Habitaciones");

        jBAplicarFiltros.setBackground(new java.awt.Color(0, 110, 230));
        jBAplicarFiltros.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jBAplicarFiltros.setForeground(new java.awt.Color(255, 255, 255));
        jBAplicarFiltros.setText("Aplicar filtros");
        jBAplicarFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAplicarFiltrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jCbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBAplicarFiltros)))
                .addContainerGap(637, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel49)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAplicarFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(jPContent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                .addGap(37, 37, 37))
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
    private Form.PanelItem jPContent;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
