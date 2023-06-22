package Login;

import BusinessObject.Usuario;
import Menu.Dashboard;
import TransferObject.EmpleadoDTO;
import TransferObject.UsuarioDTO;
import javax.swing.UIManager;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

public class Login extends javax.swing.JFrame {

    //Mover ventana
    int xMouse, yMouse;
    final String VACIO = "";
    Usuario usuario;

    public Login() {
        this.setUndecorated(true); //Eliminar bordes
        initComponents();
        this.setLocationRelativeTo(null);//Centrar 
        usuario = new Usuario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLFondoEmpeador = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTxtUsuario = new javax.swing.JTextField();
        jlUsuario = new javax.swing.JLabel();
        jlbContraseña = new javax.swing.JLabel();
        jPsContraseña = new javax.swing.JPasswordField();
        jCbxRecordarContraseña = new javax.swing.JCheckBox();
        btnIniciarsesion = new javax.swing.JButton();
        jLbIngresaLas = new javax.swing.JLabel();
        jLbBienvenido = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        jlbLinea = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jLFondoEmpeador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hospedajeEmpeador (Mediana).jpg"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTxtUsuario.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jTxtUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jTxtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jlUsuario.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jlUsuario.setText("Usuario");

        jlbContraseña.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jlbContraseña.setText("Contraseña");

        jPsContraseña.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jPsContraseña.setForeground(new java.awt.Color(102, 102, 102));
        jPsContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPsContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPsContraseñaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPsContraseñaMouseExited(evt);
            }
        });

        jCbxRecordarContraseña.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jCbxRecordarContraseña.setText("Recordar contraseña");
        jCbxRecordarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbxRecordarContraseñaActionPerformed(evt);
            }
        });

        btnIniciarsesion.setBackground(new java.awt.Color(0, 110, 230));
        btnIniciarsesion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnIniciarsesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarsesion.setText("Iniciar Sesión");
        btnIniciarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarsesionActionPerformed(evt);
            }
        });

        jLbIngresaLas.setBackground(new java.awt.Color(255, 255, 255));
        jLbIngresaLas.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLbIngresaLas.setForeground(new java.awt.Color(102, 102, 102));
        jLbIngresaLas.setText("Ingresa las credenciales asignadas:");

        jLbBienvenido.setFont(new java.awt.Font("Roboto", 1, 40)); // NOI18N
        jLbBienvenido.setText("Bienvenido");

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(102, 102, 102));
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jlbLinea.setForeground(new java.awt.Color(204, 204, 204));
        jlbLinea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbLinea.setText("_____________________________________________");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbLinea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbBienvenido)
                            .addComponent(jLbIngresaLas)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnIniciarsesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCbxRecordarContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                .addComponent(jlbContraseña)
                                .addComponent(jlUsuario)
                                .addComponent(jTxtUsuario)
                                .addComponent(jPsContraseña))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLbBienvenido)
                .addGap(13, 13, 13)
                .addComponent(jLbIngresaLas)
                .addGap(40, 40, 40)
                .addComponent(jlUsuario)
                .addGap(8, 8, 8)
                .addComponent(jTxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jlbContraseña)
                .addGap(8, 8, 8)
                .addComponent(jPsContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jCbxRecordarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnIniciarsesion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbLinea)
                .addGap(18, 18, 18)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLFondoEmpeador))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLFondoEmpeador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        //Obtenemos los valores de X y Y
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void btnIniciarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarsesionActionPerformed
        

        
        String usu = jTxtUsuario.getText();
        char[] contraseñaArray = jPsContraseña.getPassword();
        String contrasena = new String(contraseñaArray);

        if (usu.matches("^[a-zA-Z0-9_]+$")) {
            UsuarioDTO obj = usuario.ValidarUsuario(usu, contrasena);
            if (obj != null) {
                
                EmpleadoDTO empleadoDTO = new EmpleadoDTO(obj.getEmpleadoID());
                
              
                
                Dashboard dash = new Dashboard();
        dash.setVisible(true);
        this.dispose();
                //Dashboard ven2 = new Dashboard(empleadoDTO);
                //ven2.setVisible(true);
                //this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error: valores admitidos [a-zA-Z0-9_]");
        }      
        
    }//GEN-LAST:event_btnIniciarsesionActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // Mover ventana
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_formMouseDragged

    private void jPsContraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPsContraseñaMouseEntered

    }//GEN-LAST:event_jPsContraseñaMouseEntered

    private void jPsContraseñaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPsContraseñaMouseExited
       
    }//GEN-LAST:event_jPsContraseñaMouseExited

    private void jCbxRecordarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbxRecordarContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbxRecordarContraseñaActionPerformed

    

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (UnsupportedLookAndFeelException e) {
            System.err.print("Error en Look And Feel");
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnIniciarsesion;
    private javax.swing.JCheckBox jCbxRecordarContraseña;
    private javax.swing.JLabel jLFondoEmpeador;
    private javax.swing.JLabel jLbBienvenido;
    private javax.swing.JLabel jLbIngresaLas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPsContraseña;
    private javax.swing.JTextField jTxtUsuario;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JLabel jlbContraseña;
    private javax.swing.JLabel jlbLinea;
    // End of variables declaration//GEN-END:variables
}
