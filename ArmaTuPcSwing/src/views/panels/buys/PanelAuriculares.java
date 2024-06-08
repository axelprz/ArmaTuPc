
package views.panels.buys;

public class PanelAuriculares extends javax.swing.JFrame {

    public PanelAuriculares() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelTitulo2 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnMother = new javax.swing.JButton();
        btnMother1 = new javax.swing.JButton();
        jLabelTitulo3 = new javax.swing.JLabel();
        jLabelTitulo4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelTitulo5 = new javax.swing.JLabel();
        jLabelAuriculares = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(163, 184, 8));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo2.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulo2.setFont(new java.awt.Font("Roboto Black", 1, 48)); // NOI18N
        jLabelTitulo2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo2.setText("Auriculares");
        jPanel2.add(jLabelTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 860, 70));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-eliminar2.png"))); // NOI18N
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn-eliminar2-hover.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 30, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 140));

        jPanel1.setBackground(new java.awt.Color(29, 19, 19));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 150, 150));

        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 150, 150));

        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 150, 150));

        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 150, 150));

        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 150, 150));

        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 150, 150));

        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 150, 150));

        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 150, 150));

        jLabel9.setOpaque(true);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 150, 150));

        jLabel10.setOpaque(true);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 150, 150));

        btnMother.setBackground(new java.awt.Color(163, 184, 8));
        btnMother.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnMother.setForeground(new java.awt.Color(0, 0, 0));
        btnMother.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnMother.setText("Anterior");
        btnMother.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMother.setFocusPainted(false);
        btnMother.setFocusable(false);
        btnMother.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMother.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1-hover.png"))); // NOI18N
        jPanel1.add(btnMother, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 210, 60));

        btnMother1.setBackground(new java.awt.Color(163, 184, 8));
        btnMother1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnMother1.setForeground(new java.awt.Color(0, 0, 0));
        btnMother1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1.png"))); // NOI18N
        btnMother1.setText("Siguiente");
        btnMother1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMother1.setFocusPainted(false);
        btnMother1.setFocusable(false);
        btnMother1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMother1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn1-hover.png"))); // NOI18N
        jPanel1.add(btnMother1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 210, 60));

        jLabelTitulo3.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabelTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo3.setText("Páginas");
        jPanel1.add(jLabelTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 170, 30));

        jLabelTitulo4.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabelTitulo4.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo4.setText("1 - 1");
        jPanel1.add(jLabelTitulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 170, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 960, 470));

        jPanel3.setBackground(new java.awt.Color(163, 184, 8));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        jButton1.setText("Precio Alto");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2-hover.png"))); // NOI18N
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 220, 100, 40));

        jButton2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        jButton2.setText("Precio Bajo");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2-hover.png"))); // NOI18N
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 100, 40));

        jLabelTitulo5.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulo5.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabelTitulo5.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo5.setText("Filtros");
        jPanel3.add(jLabelTitulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 280, 70));

        jLabelAuriculares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/auriculares.png"))); // NOI18N
        jLabelAuriculares.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 19, 19)));
        jLabelAuriculares.setOpaque(true);
        jPanel3.add(jLabelAuriculares, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 100, 100));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 280, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
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
            java.util.logging.Logger.getLogger(PanelAuriculares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelAuriculares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelAuriculares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelAuriculares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelAuriculares().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnMother;
    public javax.swing.JButton btnMother1;
    public javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel jLabelAuriculares;
    private javax.swing.JLabel jLabelTitulo2;
    private javax.swing.JLabel jLabelTitulo3;
    private javax.swing.JLabel jLabelTitulo4;
    private javax.swing.JLabel jLabelTitulo5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
