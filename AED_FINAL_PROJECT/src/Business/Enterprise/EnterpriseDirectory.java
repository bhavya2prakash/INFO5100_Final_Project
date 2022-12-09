/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author BHAVYA PRAKASH
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<Enterprise>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType enterpriseType){
        Enterprise enterprise = null;
        if(enterpriseType == Enterprise.EnterpriseType.CropResearchEnterprise){
            enterprise = new CropResearchEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(enterpriseType == Enterprise.EnterpriseType.FeedbackManagementEnterprise){
            enterprise = new FeedbackManagementEnterprise(name);
            enterpriseList.add(enterprise);
        }
      
        else if(enterpriseType == Enterprise.EnterpriseType.ProduceDeliverCenter){
            enterprise = new ProduceDeliveryEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if(enterpriseType == Enterprise.EnterpriseType.MarketEneterprise){
            enterprise = new MarketEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
