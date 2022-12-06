/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.SystemAdmin.SystemAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author BHAVYA PRAKASH
 */
public class SystemAdminRole extends Role{

    
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,EcoSystem system) {
        return new SystemAdminWorkArea();
    }
 
    
}