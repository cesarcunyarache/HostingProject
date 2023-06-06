package Form;

import BusinessObject.Empleado;
import BusinessObject.Usuario;
import TransferObject.EmpleadoDTO;
import TransferObject.Encriptado;
import TransferObject.UsuarioDTO;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Form_Usuarios extends javax.swing.JPanel {

    Usuario usuario;
    Empleado empleado;
    UsuarioDTO usuarioDTO;
    EmpleadoDTO obj;
    Encriptado enc;
    DefaultTableModel df;
    int id = 0;

    public Form_Usuarios() {
        initComponents();
        usuario = new Usuario();
        empleado = new Empleado();
        enc = new Encriptado();
        Disabled(true);
        df = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tabla.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        popMenu = new javax.swing.JPopupMenu();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbo_rol = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btn_Actualizar = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_confi_pass = new javax.swing.JPasswordField();
        txt_pass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel5.setText("jLabel5");
        jLabel5.getAccessibleContext().setAccessibleName("Hola");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("DNI del Empleado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        txt_dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_dniKeyPressed(evt);
            }
        });
        jPanel1.add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 324, 40));

        jLabel2.setText("Confirmar Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel3.setText("Rol");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        cbo_rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado", "Administrador" }));
        jPanel1.add(cbo_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 235, 36));

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
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 540, 240));

        btn_Actualizar.setText("Actualizar");
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, 106, 35));

        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 106, 35));

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 106, 35));

        jLabel4.setText("Usuario");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));
        jPanel1.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 324, 40));
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 324, 40));

        jLabel7.setText("Nombres y Apellidos");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, -1, -1));
        jPanel1.add(txt_confi_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 320, 40));
        jPanel1.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 320, 40));

        jLabel6.setText("Contraseña");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        if (!txt_dni.getText().isEmpty()) {
            String dni = txt_dni.getText();
            if (!txt_user.getText().isEmpty() && !txt_pass.getText().isEmpty()
                    && !txt_confi_pass.getText().isEmpty()) {
                String user = txt_user.getText();
                String pass = txt_pass.getText();
                String confirPass = txt_confi_pass.getText();
                String rol = (String) cbo_rol.getSelectedItem();

                if (dni.matches("[0-9]*")) {
                    if (user.matches("^[a-zA-Z0-9_]+$")) {
                        if (pass.equals(confirPass)) {
                            EmpleadoDTO empleadoDTO = empleado.buscarPorDNI(dni);
                            if (empleadoDTO != null) {
                                if (usuario.Buscar(empleadoDTO.getIdEmpleado()) == null) {
                                    UsuarioDTO var = usuario.BuscarUsuario(user);
                                    if (var == null) {
                                        String mensaje = usuario.Agregar(obj.getIdEmpleado(), user, enc.ecnode(pass), rol);
                                        JOptionPane.showMessageDialog(null, mensaje);
                                        limpiar();
                                    } else {
                                        JOptionPane.showMessageDialog(null, "El usuario ya existe");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "El Empleado ya cuenta con un usuario");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "El empleado no cuenta con un usuario o no existe");
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Error: las contraseñas no coinciden");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: valores admitidos [a-zA-Z0-9_]");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Error: solo se admiten valores númericos");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error: uno o más campos vacios");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese el DNI del Empleado");
        }
        
        
    }//GEN-LAST:event_btn_AgregarActionPerformed

   
    private void txt_dniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dniKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txt_dni.getText().isEmpty()) {
                String dni = txt_dni.getText();
                if (dni.matches("[0-9]*")) {
                    EmpleadoDTO empleadoDTO = empleado.buscarPorDNI(dni);
                    if (empleadoDTO != null) {
                        obj = empleadoDTO;
                        Disabled(true);
                        txt_nombre.setText(obj.getNombres() + " " + obj.getApellidos());
                    } else {
                        JOptionPane.showMessageDialog(null, "Empleado no encontrado");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error: solo se admiten valores númericos");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Error: ingrese un valor en el campo DNI ");
            }
        }
    }//GEN-LAST:event_txt_dniKeyPressed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        if (!txt_dni.getText().isEmpty()) {
            String dni = txt_dni.getText();
            if (dni.matches("[0-9]*")) {
                EmpleadoDTO empleadoDTO = empleado.buscarPorDNI(dni);
                if (empleadoDTO != null) {
                    UsuarioDTO us = usuario.Buscar(empleadoDTO.getIdEmpleado());
                    if (us != null) {
                        txt_user.setText(us.getUsuario());
                        txt_pass.setText(enc.deecnode(us.getContrasena()));
                        txt_confi_pass.setText(enc.deecnode(us.getContrasena()));
                        cbo_rol.setSelectedItem(us.getRol());
                        txt_nombre.setText(empleadoDTO.getNombres() + " " + empleadoDTO.getApellidos());
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario no encontrado");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Empleado no encontrado");

                }
            } else {
                JOptionPane.showMessageDialog(null, "Error: solo se admiten valores númericos");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Error: ingrese un valor en el campo DNI ");
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
        if (!txt_dni.getText().isEmpty()) {
            String dni = txt_dni.getText();
            if (!txt_user.getText().isEmpty() && !txt_pass.getText().isEmpty()
                    && !txt_confi_pass.getText().isEmpty()) {
                String user = txt_user.getText();
                String pass = txt_pass.getText();
                String confirPass = txt_confi_pass.getText();
                String rol = (String) cbo_rol.getSelectedItem();

                if (dni.matches("[0-9]*")) {
                    if (user.matches("^[a-zA-Z0-9_]+$")) {
                        if (pass.equals(confirPass)) {
                            EmpleadoDTO empleadoDTO = empleado.buscarPorDNI(dni);
                            if (empleadoDTO != null) {
                                UsuarioDTO usr = usuario.Buscar(empleadoDTO.getIdEmpleado());
                                if (usr != null) {
                                    UsuarioDTO var = usuario.BuscarActualizar(user, usr.getIdUsuario());
                                    if (var == null) {
                                        String mensaje = usuario.Actualizar(usr.getIdUsuario(), obj.getIdEmpleado(), user, enc.ecnode(pass), rol);
                                        JOptionPane.showMessageDialog(null, mensaje);
                                         limpiar();
                                    } else {
                                        JOptionPane.showMessageDialog(null, "El usuario ya existe");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "El usuario no existe");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "El empleado no cuenta con un usuario o no existe");
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Error: las contraseñas no coinciden");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: valores admitidos [a-zA-Z0-9_]");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Error: solo se admiten valores númericos");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error: uno o más campos vacios");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese el DNI del Empleado");
        }
        
       
  
    }//GEN-LAST:event_btn_ActualizarActionPerformed

    public void Disabled(boolean var) {
        txt_nombre.setEnabled(var);
        txt_user.setEnabled(var);
        txt_pass.setEnabled(var);
        txt_confi_pass.setEnabled(var);
        cbo_rol.setEnabled(var);
        btn_Agregar.setEnabled(var);
        btn_buscar.setEnabled(var);
        btn_Actualizar.setEnabled(var);
    }

    private void llenarTabla() {
        df.setColumnCount(0);
        df.setRowCount(0);

        String[] cabezera = {"#", "Usuario", "Rol"};
        df.setColumnIdentifiers(cabezera);

        Object[] datos = new Object[df.getColumnCount()];

        ArrayList<UsuarioDTO> lista = new ArrayList<>();
        lista = (ArrayList<UsuarioDTO>) usuario.Listar();
        if (lista != null) {

            for (int i = 0; i < lista.size(); i++) {
                UsuarioDTO u = lista.get(i);

                datos[0] = u.getIdUsuario();
                datos[1] = u.getUsuario();
                datos[2] = u.getRol();

                df.addRow(datos);
            }

            tabla.setModel(df);

        }
    }
    
    
    public void limpiar (){
        txt_dni.setText("");
        txt_nombre.setText("");
        txt_user.setText("");
        txt_pass.setText("");
        txt_confi_pass.setText("");
        cbo_rol.setSelectedIndex(0);
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JComboBox<String> cbo_rol;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu popMenu;
    private javax.swing.JTable tabla;
    private javax.swing.JPasswordField txt_confi_pass;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables

}
