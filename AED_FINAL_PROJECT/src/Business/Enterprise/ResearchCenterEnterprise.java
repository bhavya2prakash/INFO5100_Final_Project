/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author BHAVYA PRAKASH
 */

public class ResearchCenterEnterprise extends Enterprise{

    public ResearchCenterEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.ResearchCenter);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
}