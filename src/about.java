/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raju
 */
public class about extends javax.swing.JFrame {

    /**
     * Creates new form about
     */
    public about() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        about_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        file_menu = new javax.swing.JMenu();
        home_item = new javax.swing.JMenuItem();
        logout_item = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        about_panel.setBackground(new java.awt.Color(102, 102, 255));
        about_panel.setForeground(new java.awt.Color(102, 102, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("G:\\Java Programming Code\\DATABASE PROJECT\\Student Registration System\\Images\\panda.png")); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("This software design specification is made ");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" with the purpose of outlining the software architecture and ");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("design of the Student Registration System in detail.");

        jLabel5.setBackground(new java.awt.Color(255, 255, 51));
        jLabel5.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setText("Good Bye");

        javax.swing.GroupLayout about_panelLayout = new javax.swing.GroupLayout(about_panel);
        about_panel.setLayout(about_panelLayout);
        about_panelLayout.setHorizontalGroup(
            about_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(about_panelLayout.createSequentialGroup()
                .addGroup(about_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(about_panelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel4))
                    .addGroup(about_panelLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1))
                    .addGroup(about_panelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel2))
                    .addGroup(about_panelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3))
                    .addGroup(about_panelLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel5)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        about_panelLayout.setVerticalGroup(
            about_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(about_panelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(51, 153, 0));
        jMenuBar1.setForeground(new java.awt.Color(51, 153, 0));

        file_menu.setBackground(new java.awt.Color(51, 153, 0));
        file_menu.setText("File");

        home_item.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        home_item.setBackground(new java.awt.Color(51, 153, 0));
        home_item.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        home_item.setForeground(new java.awt.Color(0, 0, 102));
        home_item.setIcon(new javax.swing.ImageIcon("G:\\Java Programming Code\\DATABASE PROJECT\\Student Registration System\\Images\\icons8-exterior-30.png")); // NOI18N
        home_item.setText("Home");
        home_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_itemActionPerformed(evt);
            }
        });
        file_menu.add(home_item);

        logout_item.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        logout_item.setBackground(new java.awt.Color(51, 153, 0));
        logout_item.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        logout_item.setForeground(new java.awt.Color(0, 0, 102));
        logout_item.setIcon(new javax.swing.ImageIcon("G:\\Java Programming Code\\DATABASE PROJECT\\Student Registration System\\Images\\icons8-sign-out-30.png")); // NOI18N
        logout_item.setText("Logout");
        logout_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_itemActionPerformed(evt);
            }
        });
        file_menu.add(logout_item);

        jMenuBar1.add(file_menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(about_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(about_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(468, 480));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void home_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_itemActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        home obj = new home();
        obj.setVisible(true);
    }//GEN-LAST:event_home_itemActionPerformed

    private void logout_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_itemActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        login obj = new login();
        obj.setVisible(true);
    }//GEN-LAST:event_logout_itemActionPerformed

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
            java.util.logging.Logger.getLogger(about.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(about.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(about.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(about.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new about().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel about_panel;
    private javax.swing.JMenu file_menu;
    private javax.swing.JMenuItem home_item;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem logout_item;
    // End of variables declaration//GEN-END:variables
}
