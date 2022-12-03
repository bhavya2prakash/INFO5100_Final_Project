package Business;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseCatalogue;
import Business.Enterprise.SupplierEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BHAVYA PRAKASH
 */
public class ConfigureASystem {
     public static EcoSystem configure(){
        
       EcoSystem system = EcoSystem.getInstance();
        Network network = system.addNetwork();
        network.setName("New York");
        Network network2 = system.addNetwork();
        network2.setName("Massechuetes");
        EnterpriseCatalogue enterpriseList=network.getEnterpriseList();
        EnterpriseCatalogue enterpriseList2=network2.getEnterpriseList();
        Enterprise e11 = enterpriseList.addEnterprise("Food Supplier", Enterprise.EnterpriseType.SupplierUnit);
        Enterprise e12 = enterpriseList.addEnterprise("Food Management", Enterprise.EnterpriseType.ManagementUnit);
        Enterprise e13 = enterpriseList.addEnterprise("Fund Collector", Enterprise.EnterpriseType.FinancingUnit);
        Enterprise e14 = enterpriseList.addEnterprise("Food Distributor", Enterprise.EnterpriseType.DistributionUnit);
        Enterprise e21 = enterpriseList2.addEnterprise("Food2 Supplier", Enterprise.EnterpriseType.SupplierUnit);
        Enterprise e22 = enterpriseList2.addEnterprise("Food2 Management", Enterprise.EnterpriseType.ManagementUnit);
        Enterprise e23 = enterpriseList2.addEnterprise("Fund2 Collector", Enterprise.EnterpriseType.FinancingUnit);
        Enterprise e24 = enterpriseList2.addEnterprise("Food2 Distributor", Enterprise.EnterpriseType.DistributionUnit);
        e11.getOrganizationList().addOrganization("Sabarmati Restraunt", Organization.OrganizationType.Restaurant);
        e11.getOrganizationList().addOrganization("Whole Foods", Organization.OrganizationType.GroceryStores);
        e12.getOrganizationList().addOrganization("Health Food Inspect", Organization.OrganizationType.FoodInspectionDepartment);
        e12.getOrganizationList().addOrganization("Sabarmati NGO", Organization.OrganizationType.NGO);
        e13.getOrganizationList().addOrganization("Fund Org", Organization.OrganizationType.FundingOrganisation);
        e14.getOrganizationList().addOrganization("Great Motors", Organization.OrganizationType.Transportation);
        e14.getOrganizationList().addOrganization("Divis Warehouse", Organization.OrganizationType.Warehouse);
        UserAccount ua = system.getUserAccountList().createUserAccount("s", "s", new SystemAdminRole());
        return system;
    }
    public static void main (String []args){
  
        EcoSystem system = ConfigureASystem.configure();
        UserAccount ui =system.getUserAccountList().authenticateUser("s", "s");
         System.out.print(ui.getUsername());
        for(UserAccount u:system.getUserAccountList().getUserAccountList()){
            System.out.print(u.getUsername());
        }
        for(Network n:system.getNetworkList()){
        System.out.print(n.getName());
         for(Enterprise e: n.getEnterpriseList().getEnterpriseList()){
            System.out.print(e.getEnterpriseType()+""+e.getName()); 
            for(Organization o: e.getOrganizationList().getOrganizationList()){
            System.out.print(o.getName()+""+o.getOrganizationType()); 
            
         }
         }
         }
        System.out.print("\n");
        
        }  
}
     

