/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FarmerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FarmerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CropTestResultQueue;
import Business.WorkQueue.WorkRequest;
import UserInterface.SignUpJPanel;
import UserInterface.SystemAdminRole.ManageNetworkJPanel;
import java.awt.CardLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bhavya Prakash
 */
public class FarmerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FarmerWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private FarmerOrganization farmerOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    
    public FarmerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, FarmerOrganization farmerOrganization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.farmerOrganization = farmerOrganization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        populateRequestTable();
    }
    
    
   
    public void populateRequestTable(){
        try{
        DefaultTableModel model = (DefaultTableModel) farmerJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result = ((CropTestResultQueue) request).getTestResult();
            row[3] = result == null ? "Waiting" : result;
            
            model.addRow(row);
        }
        }
        
        catch (Exception e){
            
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
        farmerJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        requestSoilSampleButton = new javax.swing.JButton();
        viewResultJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 231, 219));

        farmerJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Requested Date", "Receiver", "Status", "Result"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(farmerJTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Request List");

        requestSoilSampleButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        requestSoilSampleButton.setText("Fill in Request Details");
        requestSoilSampleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestSoilSampleButtonActionPerformed(evt);
            }
        });

        viewResultJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewResultJButton.setText("View Results");
        viewResultJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewResultJButtonActionPerformed(evt);
            }
        });

        backJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Backgroundimage.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(viewResultJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(requestSoilSampleButton)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(514, 514, 514)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(backJButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(requestSoilSampleButton)
                .addGap(18, 18, 18)
                .addComponent(viewResultJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestSoilSampleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestSoilSampleButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestSampleCollectionJPanel(userProcessContainer, userAccount, enterprise));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestSoilSampleButtonActionPerformed

    private void viewResultJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewResultJButtonActionPerformed
        // TODO add your handling code here:
        try{
        
        int selectedRow = farmerJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        CropTestResultQueue request = (CropTestResultQueue)farmerJTable.getValueAt(selectedRow, 0);
        
        try{
        if(request.getTestResult().equals("Completed"))
        {
        
        ViewResultJPanel viewResultJPanel = new ViewResultJPanel(userProcessContainer,request);
        userProcessContainer.add("viewFarmerResultJPanel", viewResultJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
        }
        else{
            JOptionPane.showMessageDialog(null, "Request is still in progress. Please wait.");
        }
      }
      catch(Exception e){
          JOptionPane.showMessageDialog(null, "Request is still in progress. Please wait.");
      }  
        }
        
        catch (Exception e){
            
        }
        
        
        
    }//GEN-LAST:event_viewResultJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTable farmerJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton requestSoilSampleButton;
    private javax.swing.JButton viewResultJButton;
    // End of variables declaration//GEN-END:variables
}
