/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserIntefaceClient;

import ClientRun.ClientPOS;
import UserInterfaceServer.LogInForm;
import com.sun.glass.events.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dr~Newt
 */
public class SaleMenu extends javax.swing.JFrame {
    public String salesData;
    private  double amtD = 0.0;
    private int topay = 0;
    private String[] arrayCon = {}; 
    public String h = "false";
    private String currentTxt;
    public String paymentMethod;
    public String itemName,BD,til;
    public String Vat,Price ,Qty,total;
    protected String secretKey = "ad123";
    /**
     * Creates new form SaleMenu
     */
    public SaleMenu() {
        
        initComponents();
        LocalDate myObj = LocalDate.now();
        dTime.setText("" + myObj);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dTime = new javax.swing.JLabel();
        dDate = new javax.swing.JLabel();
        amtTend = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        salesTable = new javax.swing.JTable();
        jButton13 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        barcodetxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        removecrt = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tillID = new javax.swing.JLabel();
        tillID1 = new javax.swing.JLabel();
        discount = new javax.swing.JLabel();
        amtDue = new javax.swing.JLabel();
        change = new javax.swing.JLabel();
        vat = new javax.swing.JLabel();
        amtDueTot = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("SUB TOTAL : ");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("AMOUNT TEND: ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 590, -1, 20));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("CHANGE : ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, -1, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Time : ");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 60, -1, 22));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Date : ");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 28, 38, 26));

        dTime.setText("Time : ");
        jPanel3.add(dTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 105, 22));

        dDate.setText("Time : ");
        jPanel3.add(dDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 34, 132, 20));

        amtTend.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        amtTend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amtTendActionPerformed(evt);
            }
        });
        amtTend.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amtTendKeyTyped(evt);
            }
        });
        jPanel3.add(amtTend, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 580, 180, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        salesTable.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        salesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Barcode", "Item Name", "Price per Unit", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(salesTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 620, -1));

        jButton13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/PRINT.png"))); // NOI18N
        jButton13.setText("PRINT RECEIPT");
        jButton13.setToolTipText("PRINT RECEIPT");
        jButton13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, 290, 60));

        jButton15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton15.setText("CASH OUT");
        jButton15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 140, 60));

        barcodetxt.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                barcodetxtCaretUpdate(evt);
            }
        });
        barcodetxt.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                barcodetxtInputMethodTextChanged(evt);
            }
        });
        barcodetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barcodetxtActionPerformed(evt);
            }
        });
        barcodetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                barcodetxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                barcodetxtKeyTyped(evt);
            }
        });
        jPanel3.add(barcodetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, 170, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("BARCODE :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, -1, -1));

        qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtyKeyTyped(evt);
            }
        });
        jPanel3.add(qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, 170, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("INVOICE NUMBER :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("TILL NUMBER :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 37, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("QUANTITY :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, -1, -1));

        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton9.setText("LOCK ");
        jButton9.setToolTipText("LOCK");
        jButton9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 144, 60));

        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton10.setText("MANAGER");
        jButton10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 400, 144, 60));

        jButton12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton12.setText("LOG OUT ");
        jButton12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 320, 144, 60));

        jButton16.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton16.setText("ADD TO CART");
        jButton16.setToolTipText("ADD TO CART");
        jButton16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 220, 140, 40));

        removecrt.setBackground(new java.awt.Color(204, 204, 255));
        removecrt.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        removecrt.setText("REMOVE FROM CART");
        removecrt.setToolTipText("REMOVE FROM CART");
        removecrt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        removecrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removecrtActionPerformed(evt);
            }
        });
        jPanel3.add(removecrt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 140, 40));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("TOTAL : ");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, -1, 20));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("TOTAL DISCOUNT : ");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setText("TAX : ");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, -1, 20));

        tillID.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tillID.setForeground(new java.awt.Color(204, 0, 0));
        tillID.setText("TILL NUM10");
        jPanel3.add(tillID, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        tillID1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tillID1.setForeground(new java.awt.Color(204, 0, 0));
        tillID1.setText("IN#12");
        jPanel3.add(tillID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 82, -1, 30));

        discount.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        discount.setForeground(new java.awt.Color(153, 0, 0));
        discount.setText("0.00");
        jPanel3.add(discount, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, 170, -1));

        amtDue.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        amtDue.setForeground(new java.awt.Color(153, 0, 0));
        amtDue.setText("0.00");
        jPanel3.add(amtDue, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, 160, -1));

        change.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        change.setForeground(new java.awt.Color(153, 0, 0));
        change.setText("0.00");
        jPanel3.add(change, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 580, 170, -1));

        vat.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        vat.setForeground(new java.awt.Color(153, 0, 0));
        vat.setText("0.00");
        jPanel3.add(vat, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 150, -1));

        amtDueTot.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        amtDueTot.setForeground(new java.awt.Color(153, 0, 0));
        amtDueTot.setText("0.00");
        jPanel3.add(amtDueTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("PAYMENT METHOD : ");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Credit card", "Ecocash" }));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 164, 28));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/PAINT6.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    public void checkAmt(){
           
        if (Integer.parseInt(amtTend.getText()) < Integer.parseInt(amtDueTot.getText())){
            JOptionPane.showMessageDialog(null, "Amount tendered cannot be more than total cost");
            return;
        };
    }
    private void removecrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removecrtActionPerformed
        String skey = JOptionPane.showInputDialog("Enter Secret key to continue : ", itemName);
        if(skey.equals(secretKey)){
            salesTable.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Selet Record to delete in table");
        }
        else{JOptionPane.showMessageDialog(null, "Incorrect key ,contact manager for assistance");}
    }//GEN-LAST:event_removecrtActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        AddtoCart();
    }//GEN-LAST:event_jButton16ActionPerformed
    
    public void AddtoCart(){
          try {

            String[] ItemDetails;
            int p = 0;
            ClientPOS obj = new ClientPOS();

            Vector v = new Vector();
            obj.SendString("SBDR"+":"+barcodetxt.getText());
            String serverRes = obj.GetString();
            if(serverRes.equals("FATALeRROR")){
                JOptionPane.showMessageDialog(null, "Server not found!");
            }else{

                ItemDetails = serverRes.split(":",3);

                DefaultTableModel model = (DefaultTableModel) salesTable.getModel();
                v.add(barcodetxt.getText());
                v.add(ItemDetails[0]);
                v.add(ItemDetails[1]);
                v.add(qty.getText());
                int prc = Integer.parseInt(ItemDetails[1]);
                int ItemVat = Integer.parseInt(ItemDetails[2]);

                model.addRow(v);
                amtD += (prc*Integer.parseInt(qty.getText()));
                topay += (prc*(Integer.parseInt(qty.getText()) + ItemVat/100));
                amtDueTot.setText(String.valueOf(topay));

                int Cchange = Integer.parseInt(amtTend.getText()) - Integer.parseInt(amtDueTot.getText());
                change.setText(String.valueOf(Cchange));
                amtDue.setText(String.valueOf(amtD));
                amtDueTot.setText(String.valueOf(topay));
                vat.setText(String.valueOf(ItemVat));
            }
        } catch (IOException ex) {
            Logger.getLogger(SaleMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        int n = JOptionPane.showConfirmDialog(
            null,
            "Log out of System ?",
            "Question",
            JOptionPane.YES_NO_OPTION);
        System.out.println(n);

        if(n == 0){
            JOptionPane.showMessageDialog(null, "GOODBYE");
            dispose();
            new LogInFormC().setVisible(true);

        }
        else {
            //JOptionPane.showMessageDialog(null, "");
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        LogInFormC form = new LogInFormC();
        form.s="true";
        form.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void qtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || c== KeyEvent.VK_BACKSPACE || c == KeyEvent.VK_DELETE){
            evt.consume();
        }
    }//GEN-LAST:event_qtyKeyTyped

    private void barcodetxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barcodetxtKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || c== KeyEvent.VK_BACKSPACE || c == KeyEvent.VK_DELETE){
            evt.consume();
        }
    }//GEN-LAST:event_barcodetxtKeyTyped

    private void barcodetxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barcodetxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_barcodetxtKeyPressed

    private void barcodetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barcodetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barcodetxtActionPerformed

    private void barcodetxtInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_barcodetxtInputMethodTextChanged

    }//GEN-LAST:event_barcodetxtInputMethodTextChanged

    private void barcodetxtCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_barcodetxtCaretUpdate

    }//GEN-LAST:event_barcodetxtCaretUpdate

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        System.out.println("---------------------------\n"
            + "================== narrot POS ====================\n\n"
            + "\tTill number:  " + tillID.getText()+"\n"
            +"Barcode " +" Itemname "+" Unit Price "+" Quantity"+"\n\n");
        for(int i = 0;i<salesTable.getRowCount();i++){
            for(int j = 0;j<salesTable.getColumnCount();j++){
                this.BD=salesTable.getValueAt(i, j).toString();
                System.out.println(BD);}
        }
        System.out.println( "\n==================== narrot POS ==================\n\n"
        );
        FileWriter csvWriter = null;
        File file = new File("sales.txt");

        try {
            Vector pInfo = new Vector();
            csvWriter = new FileWriter("sales.csv");
            //salesData = (barcodetxt.getText()+ ":"+tillID.getText() + ":" + itemName + ":"+ ":" + qty.getText()+ ":" + amtDueTot.getText()+ ":" + dDate.getText());
            ClientPOS obj = new ClientPOS();
            
            for(int i = 0;i<salesTable.getRowCount();i++){
                for(int j = 0;j<salesTable.getColumnCount();j++){
                this.salesData = salesTable.getValueAt(i, j).toString()+":";
                }
            }
            System.out.println(salesData);
            obj.SendString("SALE"+":"+salesData);
            pInfo.add(salesData);
            if (!file.exists()){
                file.createNewFile();
            }
            PrintWriter pw = new PrintWriter(file);
            pw.write(salesData);
            csvWriter.append(salesData);
        } catch (IOException ex) {
            Logger.getLogger(SaleMenu.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                csvWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(SaleMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void amtTendKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amtTendKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || c== KeyEvent.VK_BACKSPACE || c == KeyEvent.VK_DELETE){
            evt.consume();
        }
    }//GEN-LAST:event_amtTendKeyTyped

    private void amtTendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amtTendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amtTendActionPerformed
        public void cashOut(){
        
    }
    public void AmtTDue(){
        
    }
    
    public void getBcode(){
       // return itemBarcode;
    }
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
            java.util.logging.Logger.getLogger(SaleMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaleMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaleMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaleMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SaleMenu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amtDue;
    private javax.swing.JLabel amtDueTot;
    private javax.swing.JTextField amtTend;
    private javax.swing.JTextField barcodetxt;
    private javax.swing.JLabel change;
    private javax.swing.JLabel dDate;
    private javax.swing.JLabel dTime;
    private javax.swing.JLabel discount;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField qty;
    private javax.swing.JButton removecrt;
    private javax.swing.JTable salesTable;
    private javax.swing.JLabel tillID;
    private javax.swing.JLabel tillID1;
    private javax.swing.JLabel vat;
    // End of variables declaration//GEN-END:variables
}
