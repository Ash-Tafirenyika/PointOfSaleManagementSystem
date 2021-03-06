/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfaceServer;

import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ServerRun.DatabaseControl;

/**
 *
 * @author Dr~Newt
 */
public class AddStock extends javax.swing.JFrame {
    public String b;
    /**
     * Creates new form AddStock
     * @throws java.sql.SQLException
     */
    public AddStock() throws SQLException {
        initComponents();
        
        DatabaseControl db = new DatabaseControl();
        String myQuery = "Select * from categoryinfo";
        PreparedStatement pst = db.Conec().prepareStatement(myQuery);
        try (ResultSet rs = db.Conec().prepareStatement(myQuery).executeQuery()) {
            while(rs.next()){
                category.addItem(rs.getString(2));
            }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        itemBarcode = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        reoderLevel = new javax.swing.JTextField();
        purchasePrice = new javax.swing.JTextField();
        vat = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        unitPrice = new javax.swing.JTextField();
        category = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        itemName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel1.setText("Item Barcode : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel2.setText("Item Name : ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel3.setText("Quantity : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel4.setText("Reoder Level : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel5.setText("Purchase Price : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel6.setText("Vat % : ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("Close");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 106, 33));

        itemBarcode.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        itemBarcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                itemBarcodeKeyTyped(evt);
            }
        });
        jPanel1.add(itemBarcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 206, -1));

        quantity.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityKeyTyped(evt);
            }
        });
        jPanel1.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 206, -1));

        reoderLevel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reoderLevel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                reoderLevelKeyTyped(evt);
            }
        });
        jPanel1.add(reoderLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 206, -1));

        purchasePrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                purchasePriceKeyPressed(evt);
            }
        });
        jPanel1.add(purchasePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 206, -1));

        vat.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        vat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                vatKeyTyped(evt);
            }
        });
        jPanel1.add(vat, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 206, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/SAVE.png"))); // NOI18N
        jButton3.setText("Save");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 88, 33));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/chart-add-icon.png"))); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(32, 32, 32)
                .add(jLabel8)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(204, 204, 204)
                .add(jLabel8)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 510));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel7.setText("Unit Price : ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        unitPrice.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        unitPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                unitPriceKeyTyped(evt);
            }
        });
        jPanel1.add(unitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 206, -1));

        category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryActionPerformed(evt);
            }
        });
        jPanel1.add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 206, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel9.setText("Category :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        itemName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(itemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 206, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/PAINT6.jpg"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 510));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if(
            itemBarcode.getText().equals("")|
            itemName.getText().equals("")|
            purchasePrice.getText().equals("")|
            quantity.getText().equals("")|
            reoderLevel.getText().equals("")|
            unitPrice.getText().equals("")|
            vat.getText().equals("")){JOptionPane.showMessageDialog(null, "Complete all fields to continue");}
        else{
            try {
            String myQuery = "INSERT INTO `stocks` (`ItemBarcode`, `itemName`, `ItemQuantity`, `ItemReorderLevel`, `Category`, `PurchasePrice`, `ItemPrice`, `itemVat`) values(?,?,?,?,?,?,?,?)";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/maindb","root","");
            PreparedStatement pst = con.prepareStatement(myQuery);

            int b = Integer.parseInt(itemBarcode.getText());
            pst.setInt(1,b );
            pst.setString(2,itemName.getText());
            pst.setInt(3, Integer.parseInt(quantity.getText()));
            pst.setInt(4, Integer.parseInt(reoderLevel.getText()));
            pst.setString(5, category.getSelectedItem().toString());
            pst.setInt(6, Integer.parseInt(purchasePrice.getText()));
            pst.setInt(7, Integer.parseInt(unitPrice.getText()));
            pst.setInt(8, Integer.parseInt(vat.getText()));
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "New stock record saved succssfully");
            
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Barcode Already exists");
                itemBarcode.grabFocus();
                itemBarcode.setText("");
                return;
                //Logger.getLogger(AddStock.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddStock.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        StockView form = null;
        try {
            form = new StockView();
        } catch (SQLException ex) {
            Logger.getLogger(AddStock.class.getName()).log(Level.SEVERE, null, ex);
        }
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryActionPerformed

    private void itemBarcodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemBarcodeKeyTyped
        char c = evt.getKeyChar();
          if (!Character.isDigit(c) || c== KeyEvent.VK_BACKSPACE || c == KeyEvent.VK_DELETE){
              evt.consume();
          }
    }//GEN-LAST:event_itemBarcodeKeyTyped
    
    private void quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyTyped
        char c = evt.getKeyChar();
          if (!Character.isDigit(c) || c== KeyEvent.VK_BACKSPACE || c == KeyEvent.VK_DELETE){
              evt.consume();
          }
    }//GEN-LAST:event_quantityKeyTyped

    private void reoderLevelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reoderLevelKeyTyped
        char c = evt.getKeyChar();
          if (!Character.isDigit(c) || c== KeyEvent.VK_BACKSPACE || c == KeyEvent.VK_DELETE){
              evt.consume();
          }
    }//GEN-LAST:event_reoderLevelKeyTyped

    private void purchasePriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_purchasePriceKeyPressed
        char c = evt.getKeyChar();
          if (!Character.isDigit(c) || c== KeyEvent.VK_BACKSPACE || c == KeyEvent.VK_DELETE){
              evt.consume();
          }
    }//GEN-LAST:event_purchasePriceKeyPressed

    private void unitPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unitPriceKeyTyped
        char c = evt.getKeyChar();
          if (!Character.isDigit(c) || c== KeyEvent.VK_BACKSPACE || c == KeyEvent.VK_DELETE){
              evt.consume();
          }
    }//GEN-LAST:event_unitPriceKeyTyped

    private void vatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vatKeyTyped
       char c = evt.getKeyChar();
          if (!Character.isDigit(c) || c== KeyEvent.VK_BACKSPACE || c == KeyEvent.VK_DELETE){
              evt.consume();
          }
    }//GEN-LAST:event_vatKeyTyped

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
            java.util.logging.Logger.getLogger(AddStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new AddStock().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(AddStock.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JComboBox<String> category;
    javax.swing.JTextField itemBarcode;
    javax.swing.JTextField itemName;
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton3;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel11;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel6;
    javax.swing.JLabel jLabel7;
    javax.swing.JLabel jLabel8;
    javax.swing.JLabel jLabel9;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    javax.swing.JTextField purchasePrice;
    javax.swing.JTextField quantity;
    javax.swing.JTextField reoderLevel;
    javax.swing.JTextField unitPrice;
    javax.swing.JTextField vat;
    // End of variables declaration//GEN-END:variables
}
