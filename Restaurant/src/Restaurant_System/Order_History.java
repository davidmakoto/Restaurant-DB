/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant_System;

import Connector.mySQLConnector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Xanakran
 */
public class Order_History extends javax.swing.JFrame {

    /**
     * Creates new form Order_History
     */
    public Order_History() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        try {
        PreparedStatement ps;
        ResultSet rs;
        String query = "SELECT * FROM Customer";
        ps = mySQLConnector.setConnection().prepareStatement(query);
        rs = ps.executeQuery();
        while (rs.next()) {
            DefaultTableModel model = (DefaultTableModel) usernameTable.getModel();
            String a = rs.getString("customerUsername");
            model.addRow(new Object[]{a});   
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        usernameTable = new javax.swing.JTable();
        closeButton = new javax.swing.JButton();
        Enter_Username = new javax.swing.JLabel();
        Username_text = new javax.swing.JTextField();
        Register_Label = new javax.swing.JLabel();
        BannerColor = new javax.swing.JLabel();
        Search_Button = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        usernameTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(usernameTable);
        if (usernameTable.getColumnModel().getColumnCount() > 0) {
            usernameTable.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 310, 200));

        closeButton.setText("Close");
        closeButton.setBorder(null);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 100, 50));

        Enter_Username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Enter_Username.setForeground(new java.awt.Color(255, 255, 255));
        Enter_Username.setText("Enter Username: ");
        getContentPane().add(Enter_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 118, 20));

        Username_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Username_textActionPerformed(evt);
            }
        });
        getContentPane().add(Username_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 119, -1));

        Register_Label.setFont(new java.awt.Font("Tw Cen MT", 3, 36)); // NOI18N
        Register_Label.setText("ORDER HISTORY");
        getContentPane().add(Register_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 42));

        BannerColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Color.png"))); // NOI18N
        BannerColor.setText("jLabel1");
        BannerColor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(BannerColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 70));

        Search_Button.setText("Search");
        Search_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Search_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 390, 93));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Background3.png"))); // NOI18N
        Background.setText("jLabel1");
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Search_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_ButtonActionPerformed
        try
        {
            String username = Username_text.getText();
            ResultSet rs;
            PreparedStatement ps;
            String orderID = "";
            String orderInfo = "";
            String orderStatus = "";
            if (!username.isEmpty()) //if username field has an entry
            {
                String query = "SELECT * FROM Food_Order WHERE customerUsername = ?";
                ps = mySQLConnector.setConnection().prepareStatement(query);
                ps.setString(1, username);
                rs = ps.executeQuery();
                if (rs.next()) {   //customer has previous orders
                    orderID = "\t" + orderID + rs.getString("orderID") + "\n";
                    orderInfo =  " - " + orderInfo + rs.getString("orderList") + "\n";
                    orderStatus = orderStatus + rs.getString("orderStatus") + "\n";
                    while (rs.next()) {
                        orderID =  orderID + "\t" + rs.getString("orderID") + "\n";
                        orderInfo = orderInfo + " - " + rs.getString("orderList") + "\n";
                        orderStatus = orderStatus + rs.getString("orderStatus") + "\n";
                    }
                    History h = new History(orderID, orderInfo, orderStatus);
                    h.setVisible(true);
                }
                            
                //customer search failed
                else {
                    JOptionPane.showMessageDialog(null, "Specific Username does not have an order history", "Search Failed", JOptionPane.ERROR_MESSAGE);
                }
            }

            else
            {
                JOptionPane.showMessageDialog(this, "Please enter username", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Search_ButtonActionPerformed

    private void Username_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Username_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Username_textActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Order_History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order_History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order_History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order_History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order_History().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel BannerColor;
    private javax.swing.JLabel Enter_Username;
    private javax.swing.JLabel Register_Label;
    private javax.swing.JButton Search_Button;
    private javax.swing.JTextField Username_text;
    private javax.swing.JButton closeButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable usernameTable;
    // End of variables declaration//GEN-END:variables
}
