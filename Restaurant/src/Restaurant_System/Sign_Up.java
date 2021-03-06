/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant_System;

import Connector.mySQLConnector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Xanakran
 */
public class Sign_Up extends javax.swing.JFrame {

    /**
     * Creates new form Sign_Up
     */
    public Sign_Up() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        returnButton = new javax.swing.JButton();
        Manager_btn = new javax.swing.JRadioButton();
        Customer_btn = new javax.swing.JRadioButton();
        R_Zipcode_Text = new javax.swing.JTextField();
        R_Address1 = new javax.swing.JLabel();
        Register_Label = new javax.swing.JLabel();
        R_Username = new javax.swing.JLabel();
        R_Password = new javax.swing.JLabel();
        R_Username_Text = new javax.swing.JTextField();
        R_Password_Text = new javax.swing.JTextField();
        Register_Button = new javax.swing.JButton();
        R_Name = new javax.swing.JLabel();
        R_Email = new javax.swing.JLabel();
        R_Mobile = new javax.swing.JLabel();
        R_Name_Text = new javax.swing.JTextField();
        R_Email_Text = new javax.swing.JTextField();
        R_Mobile_Text = new javax.swing.JTextField();
        R_Address = new javax.swing.JLabel();
        R_Address_Text = new javax.swing.JTextField();
        BannerColor = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        returnButton.setText("Return");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });
        getContentPane().add(returnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 3, -1, -1));

        buttonGroup1.add(Manager_btn);
        Manager_btn.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Manager_btn.setForeground(new java.awt.Color(255, 255, 255));
        Manager_btn.setText("Register a Manager");
        Manager_btn.setOpaque(false);
        Manager_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Manager_btnActionPerformed(evt);
            }
        });
        getContentPane().add(Manager_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 160, -1));

        buttonGroup1.add(Customer_btn);
        Customer_btn.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Customer_btn.setForeground(new java.awt.Color(255, 255, 255));
        Customer_btn.setText("Register a Customer");
        Customer_btn.setOpaque(false);
        Customer_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Customer_btnActionPerformed(evt);
            }
        });
        getContentPane().add(Customer_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 170, -1));

        R_Zipcode_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_Zipcode_TextActionPerformed(evt);
            }
        });
        getContentPane().add(R_Zipcode_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 201, -1));

        R_Address1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        R_Address1.setForeground(new java.awt.Color(255, 255, 255));
        R_Address1.setText("Enter Zipcode:");
        getContentPane().add(R_Address1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 90, 40));

        Register_Label.setFont(new java.awt.Font("Tw Cen MT", 3, 36)); // NOI18N
        Register_Label.setText("REGISTER ACCOUNT");
        getContentPane().add(Register_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 25, -1, 42));

        R_Username.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        R_Username.setForeground(new java.awt.Color(255, 255, 255));
        R_Username.setText("Enter Username: ");
        getContentPane().add(R_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 118, 20));

        R_Password.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        R_Password.setForeground(new java.awt.Color(255, 255, 255));
        R_Password.setText("Enter Password: ");
        getContentPane().add(R_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 118, 20));

        R_Username_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_Username_TextActionPerformed(evt);
            }
        });
        getContentPane().add(R_Username_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 201, -1));

        R_Password_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_Password_TextActionPerformed(evt);
            }
        });
        getContentPane().add(R_Password_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 201, -1));

        Register_Button.setText("Register");
        Register_Button.setBorder(new javax.swing.border.MatteBorder(null));
        Register_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Register_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 390, 100));

        R_Name.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        R_Name.setForeground(new java.awt.Color(255, 255, 255));
        R_Name.setText("Enter Name: ");
        getContentPane().add(R_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 118, 20));

        R_Email.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        R_Email.setForeground(new java.awt.Color(255, 255, 255));
        R_Email.setText("Enter Email Address: ");
        getContentPane().add(R_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 20));

        R_Mobile.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        R_Mobile.setForeground(new java.awt.Color(255, 255, 255));
        R_Mobile.setText("Enter Mobile Phone #: ");
        getContentPane().add(R_Mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 20));

        R_Name_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_Name_TextActionPerformed(evt);
            }
        });
        getContentPane().add(R_Name_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 201, -1));

        R_Email_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_Email_TextActionPerformed(evt);
            }
        });
        getContentPane().add(R_Email_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 201, -1));

        R_Mobile_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_Mobile_TextActionPerformed(evt);
            }
        });
        getContentPane().add(R_Mobile_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 201, -1));

        R_Address.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        R_Address.setForeground(new java.awt.Color(255, 255, 255));
        R_Address.setText("Enter Address: ");
        getContentPane().add(R_Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, 20));

        R_Address_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_Address_TextActionPerformed(evt);
            }
        });
        getContentPane().add(R_Address_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 201, 30));

        BannerColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Color.png"))); // NOI18N
        BannerColor.setText("jLabel1");
        BannerColor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(BannerColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 70));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Background3.png"))); // NOI18N
        Background.setText("jLabel1");
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void R_Username_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_Username_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_Username_TextActionPerformed

    private void R_Password_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_Password_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_Password_TextActionPerformed

    private void Register_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Register_ButtonActionPerformed
        try
                {
                    String username = R_Username_Text.getText();
                    String password = R_Password_Text.getText();
                    String name = R_Name_Text.getText();
                    String email = R_Email_Text.getText();
                    String phone = R_Mobile_Text.getText();
                    String address = R_Address_Text.getText();
                    String zipcode = R_Zipcode_Text.getText();
                    int cID;
                    ResultSet rs;
                    PreparedStatement ps;
                    
                    if (!username.isEmpty() && !password.isEmpty() && !name.isEmpty() && !email.isEmpty() && !phone.isEmpty() && !address.isEmpty() && !zipcode.isEmpty()) //if all fields have entries
                    {
                        //manager sign up
                        if(Manager_btn.isSelected()) {
                            //input info into database
                            String query = "INSERT into Manager values(?,?,?,?)";
                            ps = mySQLConnector.setConnection().prepareStatement(query);
                            ps.setString(1, username);
                            ps.setString(2, password);
                            ps.setString(3, name);
                            ps.setString(4, phone);
                            if (ps.executeUpdate() > 0) { //insert successful
                                String mname = name;
                                Manager_Menu mm = new Manager_Menu(username, mname);
                                mm.setVisible(true);
                                this.dispose();
                            }
                        }
                        
                        //customer sign up
                        else if (Customer_btn.isSelected()) {
                            //input info into database
                            cID = mySQLConnector.genID("Customer");
                            String query = "INSERT into restaurant.Customer values (?,?,?,?,?,?,?,?,?)";
                            ps = mySQLConnector.setConnection().prepareStatement(query);
                            ps.setInt(1, cID);
                            ps.setString(2, username);
                            ps.setString(3, phone);
                            ps.setString(4, email);
                            ps.setString(5, address);
                            ps.setString(6, zipcode);
                            ps.setString(7, name);
                            ps.setString(8, password);
                            ps.setInt(9, 0);
                            if (ps.executeUpdate() > 0) { //insert successful
                                String cname = name;
                                int zip = Integer.parseInt(zipcode);
                                Customer_Menu mm = new Customer_Menu(username, cname, address, zip, 0);
                                mm.setVisible(true);
                                this.dispose();
                            }
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Please select whether you are a registering as a Manager or Customer.", "REGISTER ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                            
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Please fill both TextFields", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e)
                {
                    JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
    }//GEN-LAST:event_Register_ButtonActionPerformed

    private void R_Name_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_Name_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_Name_TextActionPerformed

    private void R_Email_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_Email_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_Email_TextActionPerformed

    private void R_Mobile_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_Mobile_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_Mobile_TextActionPerformed

    private void R_Address_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_Address_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_Address_TextActionPerformed

    private void R_Zipcode_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_Zipcode_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_Zipcode_TextActionPerformed

    private void Manager_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Manager_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Manager_btnActionPerformed

    private void Customer_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Customer_btnActionPerformed

    }//GEN-LAST:event_Customer_btnActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        Restaurant_System rs = new Restaurant_System();
        rs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_returnButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign_Up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel BannerColor;
    private javax.swing.JRadioButton Customer_btn;
    private javax.swing.JRadioButton Manager_btn;
    private javax.swing.JLabel R_Address;
    private javax.swing.JLabel R_Address1;
    private javax.swing.JTextField R_Address_Text;
    private javax.swing.JLabel R_Email;
    private javax.swing.JTextField R_Email_Text;
    private javax.swing.JLabel R_Mobile;
    private javax.swing.JTextField R_Mobile_Text;
    private javax.swing.JLabel R_Name;
    private javax.swing.JTextField R_Name_Text;
    private javax.swing.JLabel R_Password;
    private javax.swing.JTextField R_Password_Text;
    private javax.swing.JLabel R_Username;
    private javax.swing.JTextField R_Username_Text;
    private javax.swing.JTextField R_Zipcode_Text;
    private javax.swing.JButton Register_Button;
    private javax.swing.JLabel Register_Label;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton returnButton;
    // End of variables declaration//GEN-END:variables
}
