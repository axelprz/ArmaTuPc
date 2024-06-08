
package views.panels.login;

import controllers.login.LoginChangePasswordControllers;
import models.login.User;
import models.login.UserDao;

public class PanelLoginChangePassword extends javax.swing.JFrame {

    @SuppressWarnings("empty-statement")
    public PanelLoginChangePassword() {
        initComponents();
        setLocationRelativeTo(null);
        User us = new User();;
        UserDao usDao = new UserDao();
        LoginChangePasswordControllers controller = new LoginChangePasswordControllers(us, usDao, this);
        this.txtPassword.setVisible(false);
        this.btnNewPassword.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelTitulo1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnNewPassword = new javax.swing.JButton();
        btnEmailConfirm = new javax.swing.JButton();
        btnInstagram = new javax.swing.JButton();
        btnGithub = new javax.swing.JButton();
        btnTwitter = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo2 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(29, 19, 19));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo1.setText("Cambiar Contraseña");
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
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 360, 40));

        btnNewPassword.setBackground(new java.awt.Color(163, 184, 8));
        btnNewPassword.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnNewPassword.setForeground(new java.awt.Color(0, 0, 0));
        btnNewPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnNewPassword.setText("Nueva Contraseña");
        btnNewPassword.setBorderPainted(false);
        btnNewPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNewPassword.setFocusPainted(false);
        btnNewPassword.setFocusable(false);
        btnNewPassword.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNewPassword.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1-hover.png"))); // NOI18N
        jPanel2.add(btnNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 210, 60));

        btnEmailConfirm.setBackground(new java.awt.Color(163, 184, 8));
        btnEmailConfirm.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnEmailConfirm.setForeground(new java.awt.Color(0, 0, 0));
        btnEmailConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnEmailConfirm.setText("Confirmar Correo");
        btnEmailConfirm.setBorderPainted(false);
        btnEmailConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmailConfirm.setFocusPainted(false);
        btnEmailConfirm.setFocusable(false);
        btnEmailConfirm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmailConfirm.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1-hover.png"))); // NOI18N
        jPanel2.add(btnEmailConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 210, 60));

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
            java.util.logging.Logger.getLogger(PanelLoginChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelLoginChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelLoginChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelLoginChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelLoginChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEmailConfirm;
    public javax.swing.JButton btnGithub;
    public javax.swing.JButton btnInstagram;
    public javax.swing.JButton btnNewPassword;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnTwitter;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JLabel jLabelTitulo2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
