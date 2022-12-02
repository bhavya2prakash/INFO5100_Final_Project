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
        this.enterpriseType = enterpriseType;
        this.organizationList = new OrganizationCatalogue();
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
   
    
}
