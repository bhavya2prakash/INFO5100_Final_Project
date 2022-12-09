/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.CollectionCenterRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author BHAVYA PRAKASH
 */

public class CustomerServiceOrganization extends Organization{

    public CustomerServiceOrganization(String name) {
        super( name,Organization.Type.CustomerService.getValue());
    }

    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CollectionCenterRole());
        return roles;
    }
    
}
