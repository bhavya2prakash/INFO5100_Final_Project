/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.DeliveryRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author BHAVYA PRAKASH
 */

public class DeliveryOrganization extends Organization{

    public DeliveryOrganization(String name) {
        super( name,Organization.Type.Delivery.getValue());
    }

    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DeliveryRole());
        return roles;
    }
    
}
