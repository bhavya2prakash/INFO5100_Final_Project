/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author kkgarg
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type, String name){
        Organization organization = null;
        if (type.getValue().equals(Type.Farmer.getValue())){
            organization = new FarmerOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CollectionCenter.getValue())){
            organization = new CollectionCenterOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Research.getValue())){
            organization = new ResearchOrganization(name);
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.Marketing.getValue())){
            organization = new MarketingOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CustomerService.getValue())){
            organization = new CustomerServiceOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Delivery.getValue())){
            organization = new DeliveryOrganization(name);
            organizationList.add(organization);
        }
        
        return organization;
    }
}
