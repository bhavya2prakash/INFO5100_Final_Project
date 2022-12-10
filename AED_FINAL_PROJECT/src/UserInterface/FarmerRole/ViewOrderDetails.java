/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FarmerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DeliveryOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MarketOrder;
import Business.WorkQueue.MarketWorkRequest;
import Business.WorkQueue.WorkRequest;
import UserInterface.SignUpJPanel;
import UserInterface.SystemAdminRole.ManageNetworkJPanel;
import java.awt.CardLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class ViewOrderDetails extends javax.swing.JPanel {

    /**
     * Creates new form ViewOrderDetails
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private MarketWorkRequest request;
    private EcoSystem business;
    private Image image2;
    ViewOrderDetails(JPanel userProcessContainer, UserAccount userAccount, MarketWorkRequest request,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business=business;
        this.userAccount = userAccount;
        this.request = request;
        backgroundImage("/resources/imgs/HP2.jpg");
        populateOrderTable();
    }
    
    private void backgroundImage(String str){
        try {
            BufferedImage image1 = ImageIO.read(ManageNetworkJPanel.class.getResource(str));
            image2 = image1.getScaledInstance(1200,800,Image.SCALE_SMOOTH);
        } catch (IOException ex) {
            Logger.getLogger(SignUpJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    
    public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Draw the background image.
    g.drawImage(image2, 0, 0, this);
  }
    
    public void populateOrderTable(){
        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        model.setRowCount(0);
        
        for(MarketOrder order : request.getMarketOrderDirectory().getMarketOrderList()){
            Object[] row = new Object[5];
            row[0] = order;
            row[1] = order.getOrderQuantity();
            Date date = order.getDateOrdered();
            String dateString = String.valueOf(new SimpleDateFormat("dd/MM/yyyy HH:mm").format(date));
            row[2] = dateString;
            row[3] = order.getBuyerContactInfo();
            row[4] = order.getStatus();
            model.addRow(row);
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
        orderTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        vendorNameTxtField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        vendorRemarksTextArea = new javax.swing.JTextArea();
        vendorAddL1TextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        vendorZipcodeJTextField = new javax.swing.JTextField();
        vendorAddLine2TextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        vendorContactJTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        dateRespondedJTextField = new javax.swing.JTextField();
        orderQuantityTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        viewOrderBtn = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        requestDeliveryBtn = new javax.swing.JButton();

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vendor", "Quantity Requested", "Date Requested", "Buyer's Contact", "Delivery Request"
            }
        ));
        jScrollPane1.setViewportView(orderTable);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Vendor's Name:");

        vendorNameTxtField.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Address Line1:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Vendor's Remarks");

        jScrollPane3.setEnabled(false);

        vendorRemarksTextArea.setColumns(20);
        vendorRemarksTextArea.setRows(5);
        vendorRemarksTextArea.setEnabled(false);
        jScrollPane3.setViewportView(vendorRemarksTextArea);

        vendorAddL1TextField.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Zip Code:");

        vendorZipcodeJTextField.setEnabled(false);

        vendorAddLine2TextField.setEnabled(false);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Address Line2:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Contact No:");

        vendorContactJTextField.setEnabled(false);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Vendor Details");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Response Date:");

        dateRespondedJTextField.setEnabled(false);

        orderQuantityTextField.setEnabled(false);
        orderQuantityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderQuantityTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Order Quantity");

        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        viewOrderBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewOrderBtn.setText("View Order Details");
        viewOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderBtnActionPerformed(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imgs/agronomyAdvancement.JPG"))); // NOI18N

        requestDeliveryBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        requestDeliveryBtn.setText("Request Delivery ");
        requestDeliveryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestDeliveryBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 1327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(orderQuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(vendorNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel12)
                                                    .addComponent(jLabel14)
                                                    .addComponent(jLabel15))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(vendorAddLine2TextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(vendorAddL1TextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(vendorContactJTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(29, 29, 29)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vendorZipcodeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateRespondedJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(backBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel17)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewOrderBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(requestDeliveryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(273, 273, 273))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewOrderBtn)
                        .addGap(48, 48, 48)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(requestDeliveryBtn))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(vendorNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendorAddL1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(vendorAddLine2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(vendorContactJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(vendorZipcodeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(dateRespondedJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderQuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addComponent(backBtn)
                .addContainerGap(83, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderQuantityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderQuantityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderQuantityTextFieldActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void viewOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        
        MarketOrder order = (MarketOrder)orderTable.getValueAt(selectedRow, 0);
        
        vendorNameTxtField.setText(String.valueOf(order.getBuyer()));
        vendorAddL1TextField.setText(order.getBuyerAddressLine1());
        vendorAddLine2TextField.setText(order.getBuyerAddressLine2());
        vendorZipcodeJTextField.setText(String.valueOf(order.getBuyerZipcode()));
        vendorContactJTextField.setText(String.valueOf(order.getBuyerContactInfo()));
        dateRespondedJTextField.setText(String.valueOf(order.getDateOrdered()));
        orderQuantityTextField.setText(String.valueOf(order.getOrderQuantity()));
        vendorRemarksTextArea.setText(order.getBuyerRemarks());
        
        
    }//GEN-LAST:event_viewOrderBtnActionPerformed

    private void requestDeliveryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestDeliveryBtnActionPerformed
        // TODO add your handling code here:
     
            //String farmerName  = farmerNamejTextField.getText();
           // String question = questionJTextArea.getText();
            
        int selectedRow = orderTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        
        
        
        MarketOrder order = (MarketOrder)orderTable.getValueAt(selectedRow, 0);
         if (order.getStatus()=="Raised"){
            JOptionPane.showMessageDialog(null, "Request already raised");
            return;
        }
        order.setStatus("Raised");
        String address = order.getBuyerAddressLine1()+","+order.getBuyerAddressLine2()+ ","+String.valueOf(order.getBuyerZipcode());
            WorkRequest workRequest = new WorkRequest();
            workRequest.setSender(userAccount);
            workRequest.setMessage(address);
            workRequest.setStatus("Requested");
            
            Organization org = null;

//            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
//            if (organization instanceof ResearchOrganization){
//                org = organization;
//                break;
//            }
//        }
            for (Network n : business.getNetworkList()){
                for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                    for(Organization o : e.getOrganizationDirectory().getOrganizationList()){
                        if (o instanceof DeliveryOrganization){
                            org = o;
                            break;
                            }
                        
                    }
                }
            
        }
            if (org!=null)
            {
                org.getWorkQueue().getWorkRequestList().add(workRequest);
                userAccount.getWorkQueue().getWorkRequestList().add(workRequest);
                JOptionPane.showMessageDialog(null, "Requested Successfully");
            }
            
        populateOrderTable();    
    }//GEN-LAST:event_requestDeliveryBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField dateRespondedJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField orderQuantityTextField;
    private javax.swing.JTable orderTable;
    private javax.swing.JButton requestDeliveryBtn;
    private javax.swing.JTextField vendorAddL1TextField;
    private javax.swing.JTextField vendorAddLine2TextField;
    private javax.swing.JTextField vendorContactJTextField;
    private javax.swing.JTextField vendorNameTxtField;
    private javax.swing.JTextArea vendorRemarksTextArea;
    private javax.swing.JTextField vendorZipcodeJTextField;
    private javax.swing.JButton viewOrderBtn;
    // End of variables declaration//GEN-END:variables
}
