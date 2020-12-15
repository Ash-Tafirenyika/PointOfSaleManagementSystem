/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfaceServer;

import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import ServerRun.DatabaseControl;

/**
 *
 * @author Dr~Newt
 */
public class UserAdditionForm extends javax.swing.JFrame {

    /**
     * Creates new form UserAdditionForm
     */
    public UserAdditionForm() {
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

        jPanel5 = new javax.swing.JPanel();
        uID2 = new javax.swing.JTextField();
        uPhoneNum2 = new javax.swing.JTextField();
        uFirstName2 = new javax.swing.JTextField();
        uLastName2 = new javax.swing.JTextField();
        uName2 = new javax.swing.JTextField();
        uCostPerHour2 = new javax.swing.JTextField();
        uType2 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        uPassword2 = new javax.swing.JPasswordField();
        confPass2 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        uID2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(uID2);
        uID2.setBounds(160, 110, 221, 20);

        uPhoneNum2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        uPhoneNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uPhoneNumActionPerformed(evt);
            }
        });
        jPanel5.add(uPhoneNum2);
        uPhoneNum2.setBounds(160, 140, 221, 20);

        uFirstName2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        uFirstName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uFirstNameActionPerformed(evt);
            }
        });
        jPanel5.add(uFirstName2);
        uFirstName2.setBounds(160, 170, 221, 20);

        uLastName2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(uLastName2);
        uLastName2.setBounds(160, 200, 221, 20);

        uName2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(uName2);
        uName2.setBounds(160, 230, 221, 20);

        uCostPerHour2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(uCostPerHour2);
        uCostPerHour2.setBounds(160, 260, 221, 20);

        uType2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrator", "User", "Other" }));
        uType2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uType2ActionPerformed(evt);
            }
        });
        jPanel5.add(uType2);
        uType2.setBounds(160, 350, 221, 20);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel20.setText("ID : ");
        jPanel5.add(jLabel20);
        jLabel20.setBounds(90, 110, 23, 14);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel21.setText("Phone : ");
        jPanel5.add(jLabel21);
        jLabel21.setBounds(70, 140, 43, 14);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel22.setText("Fist Name :");
        jPanel5.add(jLabel22);
        jLabel22.setBounds(50, 170, 61, 14);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel23.setText("Last Name : ");
        jPanel5.add(jLabel23);
        jLabel23.setBounds(50, 200, 66, 20);

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel24.setText("Username : ");
        jPanel5.add(jLabel24);
        jLabel24.setBounds(50, 230, 63, 14);

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel25.setText("Cost per hour :");
        jPanel5.add(jLabel25);
        jLabel25.setBounds(30, 260, 79, 14);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel26.setText("Password :");
        jPanel5.add(jLabel26);
        jLabel26.setBounds(60, 290, 55, 14);

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel27.setText("Confirm Password :");
        jPanel5.add(jLabel27);
        jLabel27.setBounds(10, 320, 103, 14);

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel28.setText("User Type : ");
        jPanel5.add(jLabel28);
        jLabel28.setBounds(50, 350, 63, 14);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton5.setText("Ok");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5);
        jButton5.setBounds(110, 390, 90, 32);

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton6.setText("Cancel");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6);
        jButton6.setBounds(240, 390, 86, 32);

        uPassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uPassword2ActionPerformed(evt);
            }
        });
        jPanel5.add(uPassword2);
        uPassword2.setBounds(160, 290, 221, 20);

        confPass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confPass2ActionPerformed(evt);
            }
        });
        confPass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                confPass2KeyTyped(evt);
            }
        });
        jPanel5.add(confPass2);
        confPass2.setBounds(160, 320, 221, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/User-male-icon.png"))); // NOI18N
        jPanel5.add(jLabel8);
        jLabel8.setBounds(160, 20, 64, 64);
        jPanel5.add(jSeparator1);
        jSeparator1.setBounds(10, 90, 380, 10);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/PAINT6.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel5.add(jLabel1);
        jLabel1.setBounds(0, -20, 420, 460);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 420, 440);

        setSize(new java.awt.Dimension(434, 478));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        UsersForm form = new UsersForm();
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(uID2.getText().equals("") | uPhoneNum2.getText().equals("") | uFirstName2.getText().equals("") | uLastName2.getText().equals("") | uName2.getText().equals("") |uCostPerHour2.getText().equals("") | uPassword2.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Please Enter all fields in form to continue");
            
        }else{
        if(confPass2.getText() == null ? uPassword2.getText() != null : !confPass2.getText().equals(uPassword2.getText())){
            JOptionPane.showMessageDialog(null, "Passwords do not match try again");
            uPassword2.setText("");
            confPass2.setText("");
            uPassword2.setFocusable(true);
        }
        else{

            try {
                DatabaseControl db = new DatabaseControl();
                String myQuery = "INSERT INTO `users` (`uID`, `uPhone`, `uFirstName`, `uLastName`, `uName`, `UcostPerHour`, `uPass`, `uPriveledge`) VALUES (?,?,?,?,?,?,?,?)";
                PreparedStatement pst = db.Conec().prepareStatement(myQuery);

                pst.setString(1, uID2.getText());
                pst.setString(2, uPhoneNum2.getText());
                pst.setString(3, uFirstName2.getText());
                pst.setString(4, uLastName2.getText());
                pst.setString(5, uName2.getText());
                pst.setString(6, uCostPerHour2.getText());
                pst.setString(7, uPassword2.getText());
                pst.setString(8, uType2.getSelectedItem().toString());

                pst.execute();
                JOptionPane.showMessageDialog(null, "Saved Successfully");
                dispose();
                LogInForm var = new LogInForm();
                if (var.s==1){var.setVisible(true);}
                else{
                new UsersForm().setVisible(true);}

            } catch (SQLException ex) {
                Logger.getLogger(UserAdditionForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void uFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uFirstNameActionPerformed

    private void uPhoneNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uPhoneNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uPhoneNumActionPerformed

    private void uPassword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uPassword2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uPassword2ActionPerformed

    private void confPass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confPass2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confPass2ActionPerformed

    private void uType2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uType2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uType2ActionPerformed

    private void confPass2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confPass2KeyTyped
        char c = evt.getKeyChar();
          if (!Character.isDigit(c) || c== KeyEvent.VK_BACKSPACE || c == KeyEvent.VK_DELETE){
              evt.consume();
          }
    }//GEN-LAST:event_confPass2KeyTyped

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        new ManagementForm().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(UserAdditionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserAdditionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserAdditionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserAdditionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserAdditionForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confPass2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField uCostPerHour2;
    private javax.swing.JTextField uFirstName2;
    private javax.swing.JTextField uID2;
    private javax.swing.JTextField uLastName2;
    private javax.swing.JTextField uName2;
    private javax.swing.JPasswordField uPassword2;
    private javax.swing.JTextField uPhoneNum2;
    private javax.swing.JComboBox<String> uType2;
    // End of variables declaration//GEN-END:variables

}
