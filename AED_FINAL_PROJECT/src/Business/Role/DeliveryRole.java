/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CollectionCenterOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.CollectionCenterRole.CollectionCenterWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author BHAVYA PRAKASH
 */

public class DeliveryRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CollectionCenterWorkAreaJPanel(userProcessContainer, account, (CollectionCenterOrganization)organization, enterprise);
    }
    @Override
   public String toString(){
       return Role.RoleType.Delivery.getValue();
   }
}
