/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserIntefaceClient;

import ClientRun.ClientPOS;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dr~Newt
 */
public class LogInFormC extends javax.swing.JFrame {
    public String s = "false";
    /**
     * Creates new form ClientLg
     */
    public LogInFormC() {
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

        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOG IN");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setForeground(new java.awt.Color(204, 51, 0));
        jPanel12.setLayout(null);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setText("Log In");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton1);
        jButton1.setBounds(40, 280, 120, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton2);
        jButton2.setBounds(190, 280, 120, 30);

        password.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel12.add(password);
        password.setBounds(130, 190, 193, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Password : ");
        jPanel12.add(jLabel2);
        jLabel2.setBounds(30, 190, 90, 10);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Username : ");
        jPanel12.add(jLabel1);
        jLabel1.setBounds(30, 130, 90, 10);

        username.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        username.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel12.add(username);
        username.setBounds(130, 130, 193, 20);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/User-male-icon.png"))); // NOI18N
        jPanel12.add(jLabel13);
        jLabel13.setBounds(150, 10, 90, 100);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/PAINT6.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel12.add(jLabel3);
        jLabel3.setBounds(0, 0, 350, 350);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText(" To : ");
        jPanel12.add(jLabel4);
        jLabel4.setBounds(410, 50, 70, 28);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Welcome");
        jPanel12.add(jLabel5);
        jLabel5.setBounds(380, 20, 120, 28);

        jLabel6.setFont(new java.awt.Font("Calisto MT", 0, 11)); // NOI18N
        jLabel6.setText(" Point of sale ");
        jPanel12.add(jLabel6);
        jLabel6.setBounds(440, 100, 80, 14);

        jLabel7.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("copyright c narrot tech");
        jPanel12.add(jLabel7);
        jLabel7.setBounds(360, 320, 160, 20);

        jLabel8.setFont(new java.awt.Font("Calisto MT", 0, 11)); // NOI18N
        jLabel8.setText("Enter username and password");
        jPanel12.add(jLabel8);
        jLabel8.setBounds(360, 160, 150, 14);

        jLabel9.setFont(new java.awt.Font("Calisto MT", 0, 11)); // NOI18N
        jLabel9.setText("to use the system ");
        jPanel12.add(jLabel9);
        jLabel9.setBounds(390, 180, 90, 20);

        jLabel10.setFont(new java.awt.Font("Calisto MT", 0, 11)); // NOI18N
        jLabel10.setText("Company Name");
        jPanel12.add(jLabel10);
        jLabel10.setBounds(360, 100, 80, 14);

        jLabel11.setFont(new java.awt.Font("Calisto MT", 0, 11)); // NOI18N
        jLabel11.setText("system.");
        jPanel12.add(jLabel11);
        jLabel11.setBounds(410, 120, 40, 14);

        jLabel12.setFont(new java.awt.Font("Calisto MT", 0, 11)); // NOI18N
        jLabel12.setText("Footer");
        jPanel12.add(jLabel12);
        jLabel12.setBounds(410, 290, 40, 14);

        jLabel14.setFont(new java.awt.Font("Calisto MT", 0, 11)); // NOI18N
        jLabel14.setText("Thank you");
        jPanel12.add(jLabel14);
        jLabel14.setBounds(400, 250, 70, 14);

        org.jdesktop.layout.GroupLayout jPanel10Layout = new org.jdesktop.layout.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel12, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel12, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(544, 384));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int n = JOptionPane.showConfirmDialog(
            null,
            "Shutdown System ?",
            "Question",
            JOptionPane.YES_NO_OPTION);
        System.out.println(n);

        if(n == 0){
            JOptionPane.showMessageDialog(null, "GOODBYE");
            System.exit(0);
           
        }
        else {
             //JOptionPane.showMessageDialog(null, "");
        }

        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           
        if(username.getText().trim().isEmpty() | password.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(LogInFormC.this, "Enter Password and Username to continue");
            username.grabFocus();
            
        }else{
            
            ClientPOS obj = new ClientPOS();
            String uDetails = "lg"+":"+username.getText() + ":" + password.getText();
            obj.SendString(uDetails);
            String f = "success";
            if (f.equals("success")){
                JOptionPane.showMessageDialog(LogInFormC.this, "Welcome  " + username.getText(),"Log in successful",JOptionPane.INFORMATION_MESSAGE);
                
                SaleMenu form1 = new SaleMenu();
                if (s.equals("true")){
                    form1.h = "true";
                }
                form1.setVisible(true);
                dispose();
            }else
            {JOptionPane.showMessageDialog(LogInFormC.this, "Wrong username or Password","Log in Failed",JOptionPane.WARNING_MESSAGE);}
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LogInFormC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInFormC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInFormC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInFormC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInFormC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
