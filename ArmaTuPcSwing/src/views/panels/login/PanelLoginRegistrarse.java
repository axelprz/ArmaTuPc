
package views.panels.login;

import controllers.login.LoginRegisterControllers;
import models.login.User;
import models.login.UserDao;

public class PanelLoginRegistrarse extends javax.swing.JFrame {

    
    public PanelLoginRegistrarse() {
        initComponents();
        setLocationRelativeTo(null);
        User us = new User();
        UserDao usDao = new UserDao();
        LoginRegisterControllers register = new LoginRegisterControllers(us, usDao, this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelTitulo1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnInstagram = new javax.swing.JButton();
        btnGithub = new javax.swing.JButton();
        btnTwitter = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo2 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(29, 19, 19));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo1.setText("Registrarse");
        jPanel2.add(jLabelTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 380, 90));

        txtEmail.setBackground(new java.awt.Color(29, 19, 19));
        txtEmail.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(153, 153, 153));
        txtEmail.setText("Correo Electrónico");
        txtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(163, 184, 8), 2, true));
        txtEmail.setSelectionColor(new java.awt.Color(163, 184, 8));
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 360, 40));

        txtPassword.setBackground(new java.awt.Color(29, 19, 19));
        txtPassword.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(153, 153, 153));
        txtPassword.setText("**********");
        txtPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(163, 184, 8), 2, true));
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 360, 40));

        btnLogin.setBackground(new java.awt.Color(163, 184, 8));
        btnLogin.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnLogin.setText("Iniciar Sesión");
        btnLogin.setBorderPainted(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setFocusPainted(false);
        btnLogin.setFocusable(false);
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1-hover.png"))); // NOI18N
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 210, 60));

        btnRegister.setBackground(new java.awt.Color(163, 184, 8));
        btnRegister.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(0, 0, 0));
        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnRegister.setText("Registrarse");
        btnRegister.setBorderPainted(false);
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.setFocusPainted(false);
        btnRegister.setFocusable(false);
        btnRegister.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegister.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1-hover.png"))); // NOI18N
        jPanel2.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 210, 60));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("o");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 210, 30));

        btnInstagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-instagram.png"))); // NOI18N
        btnInstagram.setBorderPainted(false);
        btnInstagram.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInstagram.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-instagram-hover.png"))); // NOI18N
        jPanel2.add(btnInstagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 50, 50));

        btnGithub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-github.png"))); // NOI18N
        btnGithub.setBorderPainted(false);
        btnGithub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGithub.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-github-hover.png"))); // NOI18N
        jPanel2.add(btnGithub, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 50, 50));

        btnTwitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-twitter.png"))); // NOI18N
        btnTwitter.setBorderPainted(false);
        btnTwitter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTwitter.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-twitter-hover.png"))); // NOI18N
        jPanel2.add(btnTwitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 500, 520));

        jPanel1.setBackground(new java.awt.Color(163, 184, 8));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo2.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulo2.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabelTitulo2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo2.setText("Crea tu PC");
        jPanel1.add(jLabelTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 400, 120));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-eliminar2.png"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-eliminar2-hover.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanelLoginRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelLoginRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelLoginRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelLoginRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelLoginRegistrarse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnGithub;
    public javax.swing.JButton btnInstagram;
    public javax.swing.JButton btnLogin;
    public javax.swing.JButton btnRegister;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnTwitter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JLabel jLabelTitulo2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
