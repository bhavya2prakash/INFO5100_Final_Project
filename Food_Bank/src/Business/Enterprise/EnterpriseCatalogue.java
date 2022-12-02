/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author BHAVYA PRAKASH
 */
public class EnterpriseCatalogue {
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseCatalogue() {
        this.enterpriseList =new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public Enterprise addEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(null!=type)switch (type) {
            case SupplierUnit:
                enterprise=new SupplierEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            case ManagementUnit:
                enterprise = new ManagementEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            case DistributionUnit:
                enterprise = new DistributionEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            case FinancingUnit:
                enterprise = new FinancingEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            default:
                break;
        }
        return enterprise;
    
}
}
