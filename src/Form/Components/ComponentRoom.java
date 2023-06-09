package Form.Components;

import DataAccessObject.CaracteristicaHabitacionDAO;
import Form.Form_NuevoAlquiler;
import Menu.Menu;
import TransferObject.CaracteristicaHabitacionDTO;
import TransferObject.HabitacionDTO;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JMenuItem;

public class ComponentRoom extends javax.swing.JPanel {

    Menu menu;
    public HabitacionDTO objHabitacion;
    CaracteristicaHabitacionDAO CaracDAO = new CaracteristicaHabitacionDAO();

    public ComponentRoom(HabitacionDTO habitacion) {
        initComponents();
        this.objHabitacion = habitacion;
        habitacionFrame = habitacion;
        cargarInfoHabitacion();
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        inicializarMenu();
    }

    HabitacionDTO habitacionFrame = new HabitacionDTO(SOMEBITS, SOMEBITS, TOOL_TIP_TEXT_KEY);
    private boolean selected;

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }

    private void cargarInfoHabitacion() {
        jLNumeroHabitacion.setText("N° " + habitacionFrame.getNumHabitacion());
        jLTipoHabitacion.setText(cargarTipoHabitacion());
        jLEstadoHabitacion.setText(cargarEstadoHabitacion());
        try {
            String caracteristicas = "";
            List<CaracteristicaHabitacionDTO> listaCarac = CaracDAO.Read(habitacionFrame.getNumHabitacion());
            for (CaracteristicaHabitacionDTO caracteristica : listaCarac) {
                caracteristicas = caracteristicas + caracteristica.getNombre() + " - ";
            }
            jLCaracteristicas.setText(caracteristicas);
        } catch (Exception e) {
        }
    }

    private String cargarTipoHabitacion() {
        String tipoHabitacion = "Habitacion ";
        switch (habitacionFrame.getTipoHabitacionID()) {
            case 1:
                tipoHabitacion = tipoHabitacion + "Simple";
                jlIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/simple (Personalizado).PNG")));
                break;
            case 2:
                tipoHabitacion = tipoHabitacion + "Familiar";
                jlIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/familiar (Personalizado).PNG")));
                break;
            case 3:
                tipoHabitacion = tipoHabitacion + "Doble";
                jlIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/doble (Personalizado).PNG")));
                break;
            case 4:
                tipoHabitacion = tipoHabitacion + "Matrimonial";
                jlIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/matrimonial (Personalizado).PNG")));
                break;
        }
        jLTipoHabitacion.setForeground(new Color(102, 102, 102));
        return tipoHabitacion;
    }

    private String cargarEstadoHabitacion() {
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

    @Override
    public void paint(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(242, 242, 242));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);

        if (selected) {
            g2.setColor(new Color(94, 156, 255));
            g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 0, 0);
        }
        g2.dispose();
        super.paint(grphcs);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPMOpcionesHabitacion = new javax.swing.JPopupMenu();
        jPanel11 = new javax.swing.JPanel();
        jpContenedor = new javax.swing.JPanel();
        jLTipoHabitacion = new javax.swing.JLabel();
        jLNumeroHabitacion = new javax.swing.JLabel();
        jLCaracteristicas = new javax.swing.JLabel();
        jPColorEstado = new javax.swing.JPanel();
        jLEstadoHabitacion = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JLabel();
        jlIcon = new javax.swing.JLabel();

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
        });

        jpContenedor.setBackground(new java.awt.Color(255, 255, 255));

        jLTipoHabitacion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLTipoHabitacion.setForeground(new java.awt.Color(102, 102, 102));
        jLTipoHabitacion.setText("Habitación simple");

        jLNumeroHabitacion.setBackground(new java.awt.Color(255, 255, 255));
        jLNumeroHabitacion.setFont(new java.awt.Font("Roboto", 1, 32)); // NOI18N
        jLNumeroHabitacion.setText("NRO: 201");

        jLCaracteristicas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLCaracteristicas.setForeground(new java.awt.Color(102, 102, 102));

        jPColorEstado.setBackground(new java.awt.Color(28, 200, 138));

        jLEstadoHabitacion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLEstadoHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        jLEstadoHabitacion.setText("Disponible");

        btnUpdate.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText(">");

        javax.swing.GroupLayout jPColorEstadoLayout = new javax.swing.GroupLayout(jPColorEstado);
        jPColorEstado.setLayout(jPColorEstadoLayout);
        jPColorEstadoLayout.setHorizontalGroup(
            jPColorEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPColorEstadoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLEstadoHabitacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                .addComponent(btnUpdate)
                .addGap(16, 16, 16))
        );
        jPColorEstadoLayout.setVerticalGroup(
            jPColorEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPColorEstadoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPColorEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEstadoHabitacion)
                    .addComponent(btnUpdate))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jlIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpContenedorLayout = new javax.swing.GroupLayout(jpContenedor);
        jpContenedor.setLayout(jpContenedorLayout);
        jpContenedorLayout.setHorizontalGroup(
            jpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPColorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jpContenedorLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLTipoHabitacion)
                    .addComponent(jLNumeroHabitacion)
                    .addComponent(jLCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpContenedorLayout.setVerticalGroup(
            jpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContenedorLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpContenedorLayout.createSequentialGroup()
                        .addComponent(jLNumeroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPColorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jpContenedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        //
    }//GEN-LAST:event_jPanel11MouseClicked
    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel btnUpdate;
    private javax.swing.JLabel jLCaracteristicas;
    private javax.swing.JLabel jLEstadoHabitacion;
    private javax.swing.JLabel jLNumeroHabitacion;
    private javax.swing.JLabel jLTipoHabitacion;
    private javax.swing.JPanel jPColorEstado;
    private javax.swing.JPopupMenu jPMOpcionesHabitacion;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JLabel jlIcon;
    private javax.swing.JPanel jpContenedor;
    // End of variables declaration//GEN-END:variables

    private void inicializarMenu() {
        JMenuItem Alquilar = new JMenuItem("Alquilar Habitación");
        JMenuItem Rerservar = new JMenuItem("Reservar Habitación");
        JMenuItem Masinfo = new JMenuItem("Más Información de habitación");
        jPMOpcionesHabitacion.add(Alquilar);
        jPMOpcionesHabitacion.add(Rerservar);
        jPMOpcionesHabitacion.add(Masinfo);

        // Asociar eventos a cada JMenuItem
        Alquilar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Evento para Alquilar Habitación
                // Aquí puedes agregar la lógica para abrir la ventana correspondiente

                menu.SelectMenu(10, menu.alquiler);

//                objHabitacion = hab.buscar(habitacionFrame.getNumHabitacion());
                menu.alquiler.llenarCamposHabitacion(objHabitacion);
            }
        });

        Masinfo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Evento para Alquilar Habitación
                // Aquí puedes agregar la lógica para abrir la ventana correspondiente

                menu.SelectMenu(2, menu.gesHab);

//                objHabitacion = hab.buscar(habitacionFrame.getNumHabitacion());
                menu.gesHab.llenarCamposHabitacion(objHabitacion);
            }
        });

        Rerservar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                menu.SelectMenu(2, menu.reserva);

                menu.reserva.llenarCamposHabitacion(objHabitacion);
            }
        });

        jpContenedor.setComponentPopupMenu(jPMOpcionesHabitacion);
    }

}
