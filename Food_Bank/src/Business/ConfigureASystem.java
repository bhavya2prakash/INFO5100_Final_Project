package Business;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseCatalogue;
import Business.Enterprise.SupplierEnterprise;
import Business.Network.Network;

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
        network.setName("Boston");
        Network network2 = system.addNetwork();
        network2.setName("Chennai");
        EnterpriseCatalogue enterpriseList=network.getEnterpriseList();
         EnterpriseCatalogue enterpriseList2=network2.getEnterpriseList();
        Enterprise e=enterpriseList.addEnterprise("hghghg", Enterprise.EnterpriseType.SupplierUnit);
        enterpriseList.addEnterprise("oooo", Enterprise.EnterpriseType.ManagementUnit);
        enterpriseList2.addEnterprise("iii", Enterprise.EnterpriseType.FinancingUnit);
        
        return system;
    }
    public static void main (String []args){
  
        EcoSystem system = ConfigureASystem.configure();
        for(Network n:system.getNetworkList()){
        System.out.print(n.getName());
         for(Enterprise e: n.getEnterpriseList().getEnterpriseList()){
            System.out.print(e.getEnterpriseType()+""+e.getName()); 
            if(e instanceof SupplierEnterprise){
             System.out.print("hello");
         }
         }
        System.out.print("\n");
        
        }  
}
     
}
