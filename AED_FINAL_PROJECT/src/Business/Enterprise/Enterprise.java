/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author BHAVYA PRAKASH
 */
public abstract class Enterprise extends Organization{
    
    private OrganizationDirectory organizationDirectory;
    private EnterpriseType enterpriseType;
     private int enterpriseId;
    private static int count = 201;
    
    public enum EnterpriseType{
        Agriculture("Agriculture"),
        Transportation("Transportation"),
        ResearchCenter("Research Center"),
        SampleCollector("Sample Collector"),
        Market("Market");
        private String value;
        private EnterpriseType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
        @Override
        public String toString(){
            return this.value;
        }
        
    }

    public int getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(int enterpriseId) {
        this.enterpriseId = enterpriseId;
    }
    
    
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public Enterprise(String name, EnterpriseType enterpriseType) {
        super(name);
        this.enterpriseType = enterpriseType;
        organizationDirectory = new OrganizationDirectory();
         this.enterpriseId=count;
         count++;
    }
    
    
    
}
