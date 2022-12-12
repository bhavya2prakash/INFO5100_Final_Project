/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FarmerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.CustomerServiceOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.QueryWorkRequest;
import UserInterface.SignUpJPanel;
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
 * @author Supriya Tripathi
 */
public class PostAQueryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PostAQueryJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private EcoSystem business;
    
    
    public PostAQueryJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, EcoSystem business) 
    {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.business = business;
        populateQueryTable();
        farmerNamejTextField.setText(userAccount.getFarmer().getFarmerName());
        
    }
   
    
    public void populateQueryTable(){
        DefaultTableModel model = (DefaultTableModel) questionJTable.getModel();
        
        model.setRowCount(0);
        for (QueryWorkRequest request : userAccount.getQueryWorkQueue().getQueryWorkRequestList()){
            Object[] row = new Object[3];
            row[0] = request;
            row[1] = request.getQuestion();
            row[2] = request.getStatus();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        questionJTable = new javax.swing.JTable();
        viewResponseJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        farmerNamejTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        questionJTextArea = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        postJButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        responseJTextArea = new javax.swing.JTextArea();
        backJButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        questionJTextArea1 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 231, 219));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Have Questions?? Please Write To Us");

        questionJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Requested Date", "Question", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(questionJTable);

        viewResponseJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewResponseJButton.setText("View Response");
        viewResponseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewResponseJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Farmer's Name:");

        farmerNamejTextField.setEditable(false);
        farmerNamejTextField.setEnabled(false);

        questionJTextArea.setColumns(20);
        questionJTextArea.setRows(5);
        jScrollPane2.setViewportView(questionJTextArea);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Please write your query:");

        postJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        postJButton.setText("Post Question");
        postJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postJButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Response:");

        responseJTextArea.setEditable(false);
        responseJTextArea.setBackground(new java.awt.Color(204, 204, 255));
        responseJTextArea.setColumns(20);
        responseJTextArea.setRows(5);
        responseJTextArea.setEnabled(false);
        jScrollPane3.setViewportView(responseJTextArea);

        backJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        questionJTextArea1.setEditable(false);
        questionJTextArea1.setBackground(new java.awt.Color(204, 204, 255));
        questionJTextArea1.setColumns(20);
        questionJTextArea1.setRows(5);
        questionJTextArea1.setEnabled(false);
        jScrollPane4.setViewportView(questionJTextArea1);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Question:");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Backgroundimage.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 1327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(farmerNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(68, 68, 68)
                                                .addComponent(postJButton)))
                                        .addGap(239, 239, 239)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel12)))
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(viewResponseJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(519, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewResponseJButton)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(farmerNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(postJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel12)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel9)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewResponseJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewResponseJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = questionJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a  Row");
            return;
        }

        QueryWorkRequest request = (QueryWorkRequest)questionJTable.getValueAt(selectedRow, 0);

        try{
            if(request.getStatus().equals("Completed"))
            {
                responseJTextArea.setText(request.getResponse());
                questionJTextArea1.setText(request.getQuestion());
            }
            else{
                JOptionPane.showMessageDialog(null, "Request is still in progress. Please wait.");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Request is still in progress. Please wait.");
        }

    }//GEN-LAST:event_viewResponseJButtonActionPerformed

    private void postJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postJButtonActionPerformed
        // TODO add your handling code here:
        try{
            //String farmerName  = farmerNamejTextField.getText();
            String question = questionJTextArea.getText();
            if (questionJTextArea.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Please enter all fields");
            return;
        }
            
            QueryWorkRequest queryWorkRequest = new QueryWorkRequest();
            queryWorkRequest.setSender(userAccount);
            queryWorkRequest.setQuestion(question);
            queryWorkRequest.setStatus("Requested");
            
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
                        if (o instanceof CustomerServiceOrganization){
                            org = o;
                            break;
                            }
                        
                    }
                }
            
        }
            if (org!=null)
            {
                org.getQueryWorkQueue().getQueryWorkRequestList().add(queryWorkRequest);
                userAccount.getQueryWorkQueue().getQueryWorkRequestList().add(queryWorkRequest);
                JOptionPane.showMessageDialog(null, "Requested Successfully");
            }
            
            populateQueryTable();
            questionJTextArea.setText("");
            
        }

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Please input valid entries");
        }

    }//GEN-LAST:event_postJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField farmerNamejTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton postJButton;
    private javax.swing.JTable questionJTable;
    private javax.swing.JTextArea questionJTextArea;
    private javax.swing.JTextArea questionJTextArea1;
    private javax.swing.JTextArea responseJTextArea;
    private javax.swing.JButton viewResponseJButton;
    // End of variables declaration//GEN-END:variables
}
