/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;


import Business.Organization.DistributionOrg.Transportation;
import Business.Organization.DistributionOrg.Warehouse;
import Business.Organization.FinancingOrg.FundingOrganisation;
import Business.Organization.ManagementOrg.FoodInspectionDepartment;
import Business.Organization.ManagementOrg.NGO;
import Business.Organization.Organization.OrganizationType;
import Business.Organization.SupplierOrg.GroceryStores;
import Business.Organization.SupplierOrg.Restaurant;
import java.util.ArrayList;

/**
 *
 * @author BHAVYA PRAKASH
 */
public class OrganizationCatalogue {
    private ArrayList<Organization> organizationList;

    public OrganizationCatalogue() {
        this.organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    public Organization addOrganization(String name,OrganizationType type){
        Organization organization = null;
        if (type.equals(OrganizationType.FoodInspectionDepartment)){
            organization = new FoodInspectionDepartment(name);
            organizationList.add(organization);
        }
        else if (type.equals(OrganizationType.FundingOrganisation)){
            organization = new FundingOrganisation(name);
            organizationList.add(organization);
        }
        else if (type.equals(OrganizationType.GroceryStores)){
            organization = new GroceryStores(name);
            organizationList.add(organization);
        }
        else if (type.equals(OrganizationType.NGO)){
            organization = new NGO(name);
            organizationList.add(organization);
        }
        else if (type.equals(OrganizationType.Restaurant)){
            organization = new Restaurant(name);
            organizationList.add(organization);
        }
         else if (type.equals(OrganizationType.Transportation)){
            organization = new Transportation(name);
            organizationList.add(organization);
        }
        else if (type.equals(OrganizationType.Warehouse)){
            organization = new Warehouse(name);
            organizationList.add(organization);
        }
        
        
        return organization;
    }
    
}
    
    

