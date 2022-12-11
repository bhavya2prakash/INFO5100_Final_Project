/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Farmer.Farmer;
import Business.Network.Network;
import Business.Organization.FarmerOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.FarmerRole;
import Business.UserAccount.UserAccount;
import UserInterface.SystemAdminRole.ManageEnterpriseAdminJPanel;
import UserInterface.SystemAdminRole.ManageNetworkJPanel;
import java.awt.CardLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



/**
 *
 * @author Lenovo
 */
public class SignUpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SignUpJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private BufferedImage image1;
    private Image image2;
    
     int s;
    String code;
    
    
    public SignUpJPanel(JPanel userProcessContainer, EcoSystem system){
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        //imageLabel.setSize(1200,800);
        
        populateNetworkComboBox();
       // backgroundImage("/images/Agronomy_Mainframe.png");
    }
    
//    private void backgroundImage(String str){
//        
//        try {
//            BufferedImage image1 = ImageIO.read(SignUpJPanel.class.getResource(str));
//            image2 = image1.getScaledInstance(1200,800,Image.SCALE_SMOOTH);
//        } catch (IOException ex) {
//            Logger.getLogger(SignUpJPanel.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }
    
    public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Draw the background image.
    g.drawImage(image2, 0, 0, this);
  }
    
    
    
    private void populateNetworkComboBox(){
        networkJComboBox.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            networkJComboBox.addItem(network);
        }
    }
    
    private void populateEnterpriseComboBox(Network network){
        enterpriseJComboBox.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            if((enterprise.getEnterpriseType().getValue().equals("Crop Research Enterprise")))
            {
                enterpriseJComboBox.addItem(enterprise);
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

        backBtn = new javax.swing.JButton();
        farmerNameTextField = new javax.swing.JTextField();
        userNameTextField = new javax.swing.JTextField();
        createAccountBtn = new javax.swing.JButton();
        passwordTextField = new javax.swing.JTextField();
        passwordValidationJLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        enterpriseJComboBox = new javax.swing.JComboBox();
        farmerNameTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 231, 219));
        setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        setLayout(null);

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(30, 590, 90, 31);
        add(farmerNameTextField);
        farmerNameTextField.setBounds(210, 230, 310, 30);
        add(userNameTextField);
        userNameTextField.setBounds(680, 230, 280, 30);

        createAccountBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        createAccountBtn.setText("Create Account");
        createAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountBtnActionPerformed(evt);
            }
        });
        add(createAccountBtn);
        createAccountBtn.setBounds(450, 550, 220, 31);
        add(passwordTextField);
        passwordTextField.setBounds(680, 300, 280, 30);
        add(passwordValidationJLabel);
        passwordValidationJLabel.setBounds(590, 440, 358, 28);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Enterprise:");
        add(jLabel6);
        jLabel6.setBounds(50, 440, 130, 22);

        networkJComboBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox);
        networkJComboBox.setBounds(210, 370, 170, 30);

        enterpriseJComboBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseJComboBoxActionPerformed(evt);
            }
        });
        add(enterpriseJComboBox);
        enterpriseJComboBox.setBounds(210, 440, 170, 30);
        add(farmerNameTextField1);
        farmerNameTextField1.setBounds(210, 300, 310, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Password:");
        add(jLabel7);
        jLabel7.setBounds(560, 300, 110, 22);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Email Address:");
        add(jLabel8);
        jLabel8.setBounds(50, 300, 130, 22);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Network:");
        add(jLabel10);
        jLabel10.setBounds(50, 370, 130, 22);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Name :");
        add(jLabel9);
        jLabel9.setBounds(50, 230, 80, 22);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("User Name:");
        add(jLabel11);
        jLabel11.setBounds(560, 230, 110, 22);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Backgroundimage.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1340, 150);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void enterpriseJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseJComboBoxActionPerformed

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        // TODO add your handling code here:
        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void createAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountBtnActionPerformed

        try {

            String username = userNameTextField.getText();
            String password = passwordTextField.getText();
            String name = farmerNameTextField.getText();

            if(userNameTextField.getText().length()==0 || passwordTextField.getText().length()==0 || farmerNameTextField.getText().length()==0){
                JOptionPane.showMessageDialog(null, "Please Enter all the Fields");
                return;
            }

            if(!(Pattern.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$", password))){
                JOptionPane.showMessageDialog(null, "Please enter a valid password");
                passwordValidationJLabel.setText("Password must be 8 charaters with 1 alphabet & 1 digit");
                return;

            }

            farmerNameTextField.setText("");
            userNameTextField.setText("");
            passwordTextField.setText("");
            sendEmail(username);

            JOptionPane.showMessageDialog(null, "Please verify your email before proceeding. Email verification code sent to "+farmerNameTextField1.getText());

            farmerNameTextField1.setText("");

            boolean condition=true;
            while(condition)
            {
                String verify=JOptionPane.showInputDialog(null, "Please enter verification code");
                if (verify.equals(code))
                {
                    condition=false;
                    JOptionPane.showMessageDialog(null, "You have successfully verified your email.");
                    break;

                }

            }

            Enterprise selecedEnterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();

            for(Organization organization : selecedEnterprise.getOrganizationDirectory().getOrganizationList())
            {
                if(organization instanceof FarmerOrganization){
                    Farmer farmer =  organization.getFarmerDirectory().createFarmer(name);
                    UserAccount account = organization.getUserAccountDirectory().createUserAccount(username, password, null,farmer, new FarmerRole());
                    //Farmer farmer =  organization.getFarmerDirectory().createFarmer(name);

                }
            }

            userProcessContainer.remove(this);
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.previous(userProcessContainer);

        } catch (MessagingException ex) {
            Logger.getLogger(SignUpJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_createAccountBtnActionPerformed

    private void sendEmail(String username) throws MessagingException
    {
        Random rand = new Random();
        s= rand.nextInt(10000);
        System.out.printf("%04d%n",s);
        
        code=String.valueOf(s);
        
            Properties properties= System.getProperties();
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.ssl.trust", "*");
            properties.put("mail.smtp.ssl.enable", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.port", "465");
            properties.setProperty("mail.user", "agronomyaed@gmail.com");
            properties.setProperty("mail.password", "laktnzwofmajetvb");
            properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
            properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            Session session= Session.getInstance(properties, new Authenticator()
            
            {
                @Override
                public PasswordAuthentication getPasswordAuthentication()
                {
                    return new PasswordAuthentication("agronomyaed@gmail.com","laktnzwofmajetvb");
                }
            });
                Message message = new MimeMessage(session);
                System.out.println(username);
        try
        {
                message.setFrom(new InternetAddress("agronomyaed@gmail.com"));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(farmerNameTextField1.getText()));
                message.setSubject("Welcome to Agronomy Center");
               
                message.setText("Hi " +username+ " \n\nWelcome to our application! \n \n Thank you for visiting us!  We look forward to serving you. Please use the following code to validate your account: "+s);
                

                
                message.setSentDate(new Date());

        }
        catch(Exception e)
        {
           System.out.println("done");

        }
                Transport t = session.getTransport("smtp");

                        t.send(message);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createAccountBtn;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTextField farmerNameTextField;
    private javax.swing.JTextField farmerNameTextField1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JLabel passwordValidationJLabel;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
