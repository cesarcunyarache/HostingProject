package Login;

import BusinessObject.Usuario;
import java.awt.Color;
import Menu.NewJFrame2;
import TransferObject.EmpleadoDTO;
import TransferObject.Encriptado;
import TransferObject.UsuarioDTO;
import com.formdev.flatlaf.intellijthemes.FlatArcIJTheme;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Login extends javax.swing.JFrame {

    Usuario user;
  
    //mover ventana
    int xMouse, yMouse;

    public Login() {

        //Panel con color de fondp
        setUndecorated(true);                   //Eliminar bordes
        user = new Usuario();
        initComponents();
        difuminado.setBackground(new Color(15, 23, 42, 150));
        this.setLocationRelativeTo(null);
       

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        difuminado = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        txtuser = new javax.swing.JTextField();
        jlIconLock = new javax.swing.JLabel();
        jlIconUser = new javax.swing.JLabel();
        btnacceder = new javax.swing.JButton();
        jlFondo = new javax.swing.JLabel();

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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        difuminado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(15, 23, 42));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Bienvenido");

        jLabel8.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Ingresar los datos proporcionados");

        txtpass.setBackground(new java.awt.Color(15, 23, 42));
        txtpass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtpass.setForeground(new java.awt.Color(255, 255, 255));
        txtpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpass.setText("1234");
        txtpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtpass.setCaretColor(new java.awt.Color(255, 255, 255));
        txtpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtpassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtpassMouseExited(evt);
            }
        });

        txtuser.setBackground(new java.awt.Color(15, 23, 42));
        txtuser.setFont(new java.awt.Font("Roboto Light", 2, 18)); // NOI18N
        txtuser.setForeground(new java.awt.Color(255, 255, 255));
        txtuser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtuser.setText("Introduzca su usuario");
        txtuser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtuser.setCaretColor(new java.awt.Color(255, 255, 255));
        txtuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtuserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtuserMouseExited(evt);
            }
        });

        jlIconLock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/lock-32.png"))); // NOI18N

        jlIconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/usuario.png"))); // NOI18N

        btnacceder.setBackground(new java.awt.Color(47, 48, 57));
        btnacceder.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        btnacceder.setForeground(new java.awt.Color(255, 255, 255));
        btnacceder.setText("Ingresar");
        btnacceder.setBorderPainted(false);
        btnacceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaccederActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlIconLock, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlIconUser, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnacceder, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtpass)
                        .addComponent(txtuser, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)))
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jlIconLock)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jlIconUser)))
                .addGap(57, 57, 57)
                .addComponent(btnacceder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        difuminado.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, 460));

        getContentPane().add(difuminado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 770));

        jlFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hospedajeEmpeador (Mediana).jpg"))); // NOI18N
        getContentPane().add(jlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    final String MENSAJEPASS = "1234";
    final String BLANCO = "";
    final String MENSAJEUSUARIO = "Introduzca su usuario";

    public boolean estaVacio() {
        if (txtuser.getText().isEmpty() || txtpass.getText().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }


    private void txtpassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpassMouseEntered
        if (txtpass.getText().equals(MENSAJEPASS)) {
            txtpass.setText(BLANCO);
        } else {
        }
    }//GEN-LAST:event_txtpassMouseEntered

    private void txtpassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpassMouseExited
        if (estaVacio()) {
            txtpass.setText(MENSAJEPASS);
        } else {
        }
    }//GEN-LAST:event_txtpassMouseExited

    private void txtuserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtuserMouseEntered
        if (txtuser.getText().equals(MENSAJEUSUARIO)) {
            txtuser.setText(BLANCO);
        } else {
        }
    }//GEN-LAST:event_txtuserMouseEntered

    private void txtuserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtuserMouseExited
        if (estaVacio()) {
            txtuser.setText(MENSAJEUSUARIO);
        } else {
        }
    }//GEN-LAST:event_txtuserMouseExited

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        //mover ventana
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);

    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        //obtener posición de la ventana
        xMouse = evt.getX();
        yMouse = evt.getY();

    }//GEN-LAST:event_formMousePressed

    private void btnaccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaccederActionPerformed
        //comprobamos sí los campos estan llenos

        String usuario = txtuser.getText();
        char[] contraseñaArray = txtpass.getPassword();
        String contrasena = new String(contraseñaArray);
        
        UsuarioDTO obj = user.ValidarUsuario(usuario, contrasena);
        
        if (obj != null) {
            this.dispose();
            EmpleadoDTO empleadoDTO = new EmpleadoDTO(obj.getEmpleadoID());
//            NewJFrame2 ven2 = new NewJFrame2(empleadoDTO);
            //ven2.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Datos incorrectos");
        }


    }//GEN-LAST:event_btnaccederActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
         try {
            UIManager.setLookAndFeel(new FlatArcIJTheme());
            //FlatLightFlatIJTheme.setup();

        } catch (Exception ex) {

        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnacceder;
    private javax.swing.JPanel difuminado;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlFondo;
    private javax.swing.JLabel jlIconLock;
    private javax.swing.JLabel jlIconUser;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
