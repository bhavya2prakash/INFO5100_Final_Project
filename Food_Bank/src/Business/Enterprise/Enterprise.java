/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Organization.OrganizationCatalogue;

/**
 *
 * @author BHAVYA PRAKASH
 */
public class Enterprise {
   private String name;
    private int enterpriseId;
    private static int count = 1;
   private EnterpriseType enterpriseType;
    private OrganizationCatalogue organizationList;

    public enum EnterpriseType{
        
        
        SupplierUnit("Supplier Unit"),
        ManagementUnit("Management Unit"),
        DistributionUnit("Distribution Unit"),
        FinancingUnit("Financing Unit");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public Enterprise(String name, EnterpriseType enterpriseType) {
        this.name = name;
        this.enterpriseId=count;
        this.enterpriseType = enterpriseType;
        this.organizationList = new OrganizationCatalogue();
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public int getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(int enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public OrganizationCatalogue getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(OrganizationCatalogue organizationList) {
        this.organizationList = organizationList;
    }
    
   
    
}
