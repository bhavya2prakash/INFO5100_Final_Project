/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LabRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ResearchOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CropTestResultQueue;
import UserInterface.SignUpJPanel;
import UserInterface.SystemAdminRole.ManageNetworkJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Supriya Tripathi
 */
public class RequestResearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestResearchJPanel
     */
    
    private JPanel userProcessContainer;
    private CropTestResultQueue request;
    private UserAccount userAccount;
    private Enterprise enterprise;
    
    public RequestResearchJPanel(JPanel userProcessContainer, CropTestResultQueue request, UserAccount userAccount, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        actualTextureTextField.setText("Please input");
        
        actualTextureTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                actualTextureTextField.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                //
            }
        });
    }
    
   
    private void clearTextFields(){
        actualTextureTextField.setText("");
        actualAluminiumSaturationTextField.setText("");
        actualBulkDensityTextField.setText("");
        actualCNRatioTextField.setText("");
        actualCalciumCarbonateContentTextField.setText("");
        actualElectricalCondvTextField.setText("");
        actualNitrateLevelTextField.setText("");
        actualOrganicCarbonTextField.setText("");
        actualPHTextField.setText("");
        actualWaterContentTextField.setText("");
        labResultTextField.setText("");
        errorJLabel.setText("");
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
        labResultTextField = new javax.swing.JTextField();
        backToLabWorkAreaBtn = new javax.swing.JButton();
        submitLabStudyBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        actualTextureTextField = new javax.swing.JTextField();
        actualBulkDensityTextField = new javax.swing.JTextField();
        actualPHTextField = new javax.swing.JTextField();
        actualWaterContentTextField = new javax.swing.JTextField();
        actualElectricalCondvTextField = new javax.swing.JTextField();
        actualNitrateLevelTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        actualOrganicCarbonTextField = new javax.swing.JTextField();
        actualAluminiumSaturationTextField = new javax.swing.JTextField();
        actualCalciumCarbonateContentTextField = new javax.swing.JTextField();
        actualCNRatioTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        errorJLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 231, 219));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Result:");

        labResultTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labResultTextFieldActionPerformed(evt);
            }
        });

        backToLabWorkAreaBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backToLabWorkAreaBtn.setText("<<Back");
        backToLabWorkAreaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToLabWorkAreaBtnActionPerformed(evt);
            }
        });

        submitLabStudyBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        submitLabStudyBtn.setText("Submit");
        submitLabStudyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitLabStudyBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Soil Texture:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Bulk Density(g/cc)");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("pH:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Nitrate Level(ppm):");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Soil Water Content:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Electrical Conductivity:");

        actualTextureTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualTextureTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Fill In The Observed Values Of The Soil Parameter");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Organic Carbon(%):");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("C/N Ratio:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Aluminium Saturation(ppm):");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("CalciumCarbonate Content:");

        errorJLabel.setBackground(new java.awt.Color(255, 0, 0));
        errorJLabel.setForeground(new java.awt.Color(255, 0, 51));
        errorJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imgs/LabWorkArea.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(errorJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(backToLabWorkAreaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labResultTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(actualPHTextField)
                                    .addComponent(actualBulkDensityTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(actualTextureTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(actualNitrateLevelTextField)
                                    .addComponent(actualWaterContentTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel11))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(actualOrganicCarbonTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(actualCNRatioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(actualAluminiumSaturationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(actualCalciumCarbonateContentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(actualElectricalCondvTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addComponent(submitLabStudyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 1347, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(actualBulkDensityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(actualPHTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(actualNitrateLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(actualWaterContentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(actualElectricalCondvTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(actualTextureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(actualOrganicCarbonTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(actualCNRatioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(actualAluminiumSaturationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(actualCalciumCarbonateContentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labResultTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addComponent(submitLabStudyBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(backToLabWorkAreaBtn)
                .addGap(43, 43, 43)
                .addComponent(errorJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backToLabWorkAreaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToLabWorkAreaBtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LabWorkAreaJPanel lwajp = (LabWorkAreaJPanel) component;
        lwajp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backToLabWorkAreaBtnActionPerformed

    private void submitLabStudyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitLabStudyBtnActionPerformed
        try{
        String message = labResultTextField.getText();
        request.setMessage(message);
        //request.setSender(userAccount);
        request.setStatus("Sent for Research");
        String soilTexture = actualTextureTextField.getText();
        request.setActualSoilTexture(soilTexture);
        float bulkDensity = Float.parseFloat(actualBulkDensityTextField.getText());
        request.setActualBulkDensity(bulkDensity);
        float pH = Float.parseFloat(actualPHTextField.getText());
        request.setActualSoilPH(pH);
        float nitrateLevel = Float.parseFloat(actualNitrateLevelTextField.getText());
        request.setActualNitrateLevel(nitrateLevel);
        float waterContent = Float.parseFloat(actualWaterContentTextField.getText());
        request.setActualWaterContent(waterContent);
        float electricalConductivity = Float.parseFloat(actualElectricalCondvTextField.getText());
        request.setActualElectricalConductivity(electricalConductivity);        
        float organicCarbon = Float.parseFloat(actualOrganicCarbonTextField.getText());
        request.setActualOrganicCarbon(organicCarbon);
        float CN = Float.parseFloat(actualCNRatioTextField.getText());
        request.setActualCarbonNitrogenRatio(CN);
        float alumunium = Float.parseFloat(actualAluminiumSaturationTextField.getText());
        request.setActualAluminiumSaturation(alumunium);
        float calciumCarbonate = Float.parseFloat(actualCalciumCarbonateContentTextField.getText());
        request.setActualCalciumCarbonateContent(calciumCarbonate);
        
        
        if(!(soilTexture.equalsIgnoreCase("Clayey")) && !(soilTexture.equalsIgnoreCase("Silty")) && !(soilTexture.equalsIgnoreCase("Sandy"))){
            JOptionPane.showMessageDialog(null, "Please input correct values");
            errorJLabel.setText("Soil Textures: Clayey, Silty, Sandy");
            actualTextureTextField.setText("");
            return;
        }
        
        //Bulk Density
        
        if(soilTexture.equals("Clayey")){
            if(bulkDensity>1.1f)
            {
                JOptionPane.showMessageDialog(null, "Please input correct values");
                errorJLabel.setText("Bulk Density should be < 1.10");
                actualBulkDensityTextField.setText("");
                return;
            }
        }
        else if(soilTexture.equals("Silty")){
            if(bulkDensity>1.4f)
            {
                JOptionPane.showMessageDialog(null, "Please input correct values");
                errorJLabel.setText("Bulk Density should be < 1.40");
                actualBulkDensityTextField.setText("");
                return;
            }
        }
        else if(soilTexture.equals("Sandy")){
            if(bulkDensity>1.6f)
            {
                JOptionPane.showMessageDialog(null, "Please input correct values");
                errorJLabel.setText("Bulk Density should be < 1.6");
                actualBulkDensityTextField.setText("");
                return;
            }
        }
        
        //Organic Carbon
        
        if(organicCarbon<1.9f || organicCarbon>2.2f){
            JOptionPane.showMessageDialog(null, "Please input correct values");
            errorJLabel.setText("Organic Carbon ranges between 1.9 to 2.2");
            actualOrganicCarbonTextField.setText("");
            return;
        }
        
        //C/N Ratio
        
        if(CN<20f || CN>30f){
            JOptionPane.showMessageDialog(null, "Please input correct values");
            errorJLabel.setText("C/N Ratio ranges between 20 to 30");
            actualCNRatioTextField.setText("");
            return;
        }
        
        //pH
        
        if(pH<5.5f || pH>7.0f){
            JOptionPane.showMessageDialog(null, "Please input correct values");
            errorJLabel.setText("PH ranges between 5.5 to 7.0");
            actualPHTextField.setText("");
            return;
        }
        
        //aluminium
        if(alumunium<0.0f || alumunium>10.0f){
            JOptionPane.showMessageDialog(null, "Please input correct values");
            errorJLabel.setText("Aluminion saturation ranges between 0.0 to 10.0");
            actualAluminiumSaturationTextField.setText("");
            return;
        }
        
        //Nitrate Level
        
        if(nitrateLevel<25f){
            JOptionPane.showMessageDialog(null, "Please input correct values");
            errorJLabel.setText("Nitrate level should be > 25.00");
            actualNitrateLevelTextField.setText("");
            return;
        }
        
        //Calcium Carbonate
        
        if(calciumCarbonate<50f || calciumCarbonate>90f){
            JOptionPane.showMessageDialog(null, "Please input correct values");
            errorJLabel.setText("Calcium Carbonate ranges between 50.00 to 90.00");
            actualCalciumCarbonateContentTextField.setText("");
            return;
        }
        if(waterContent<0.06f || waterContent>0.20f){
            JOptionPane.showMessageDialog(null, "Please input correct values");
            errorJLabel.setText("Water content ranges between 0.06 to 0.20");
            actualWaterContentTextField.setText("");
            return;
        }
        if(electricalConductivity<0f || electricalConductivity>5f){
            JOptionPane.showMessageDialog(null, "Please input correct values");
            errorJLabel.setText("Electrical Conductivity ranges between 0.00 to 5.00");
            actualElectricalCondvTextField.setText("");
            return;
        }
        
        if(labResultTextField.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Please input result");
            return;
        }
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof ResearchOrganization){
                org = organization;
                break;
            }
        }
            if (org!=null){
                org.getWorkQueue().getWorkRequestList().add(request);
                JOptionPane.showMessageDialog(null, "Submitted Successfully");
                clearTextFields();
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please input correct format");
        }
    }//GEN-LAST:event_submitLabStudyBtnActionPerformed

    private void labResultTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labResultTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labResultTextFieldActionPerformed

    private void actualTextureTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualTextureTextFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_actualTextureTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField actualAluminiumSaturationTextField;
    private javax.swing.JTextField actualBulkDensityTextField;
    private javax.swing.JTextField actualCNRatioTextField;
    private javax.swing.JTextField actualCalciumCarbonateContentTextField;
    private javax.swing.JTextField actualElectricalCondvTextField;
    private javax.swing.JTextField actualNitrateLevelTextField;
    private javax.swing.JTextField actualOrganicCarbonTextField;
    private javax.swing.JTextField actualPHTextField;
    private javax.swing.JTextField actualTextureTextField;
    private javax.swing.JTextField actualWaterContentTextField;
    private javax.swing.JButton backToLabWorkAreaBtn;
    private javax.swing.JLabel errorJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField labResultTextField;
    private javax.swing.JButton submitLabStudyBtn;
    // End of variables declaration//GEN-END:variables
}
