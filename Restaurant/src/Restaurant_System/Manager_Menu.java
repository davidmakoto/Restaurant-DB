/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant_System;

/**
 *
 * @author Xanakran
 */
public class Manager_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Manager_Menu
     */
    String username;
    String name;
    
    public Manager_Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Manager_Menu(String user, String n) {
        initComponents();
        this.setLocationRelativeTo(null);
        String[] mname = n.split(" ");
        Welcome.setText("Welcome " + mname[0] + "!");
        username = user;
        name = n;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Welcome = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JButton();
        Banner = new javax.swing.JLabel();
        BannerColor = new javax.swing.JLabel();
        AdjustMenuButton = new javax.swing.JButton();
        ViewOrderButton = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Welcome.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        Welcome.setForeground(new java.awt.Color(255, 255, 255));
        Welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome.setText("Welcome,");
        getContentPane().add(Welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 70, 320, 104));

        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 129, 54));

        Banner.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        Banner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Banner.png"))); // NOI18N
        Banner.setText("Johnny's Burgers");
        getContentPane().add(Banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 480, -1));

        BannerColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Color.png"))); // NOI18N
        BannerColor.setText("jLabel1");
        BannerColor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        BannerColor.setOpaque(true);
        getContentPane().add(BannerColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 70));

        AdjustMenuButton.setText("Adjust Menu");
        AdjustMenuButton.setBorder(new javax.swing.border.MatteBorder(null));
        AdjustMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdjustMenuButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AdjustMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 330, 70));

        ViewOrderButton.setText("View Customer Order History");
        ViewOrderButton.setBorder(new javax.swing.border.MatteBorder(null));
        ViewOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewOrderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ViewOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 330, 70));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Background1..png"))); // NOI18N
        Background.setText("jLabel1");
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        Restaurant_System rs = new Restaurant_System();
        rs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void ViewOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewOrderButtonActionPerformed
        Order_History h = new Order_History();
        h.setVisible(true);
    }//GEN-LAST:event_ViewOrderButtonActionPerformed

    private void AdjustMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdjustMenuButtonActionPerformed
        Adjust_Menu am = new Adjust_Menu(username, name);
        am.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AdjustMenuButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Manager_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdjustMenuButton;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Banner;
    private javax.swing.JLabel BannerColor;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton ViewOrderButton;
    private javax.swing.JLabel Welcome;
    // End of variables declaration//GEN-END:variables
}
