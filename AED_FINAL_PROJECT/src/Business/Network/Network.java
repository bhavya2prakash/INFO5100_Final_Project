/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author BHAVYA PRAKASH
 */
public class Network {
     
    private String name;
    private int networkId;
    private static int count = 101;
    
    private EnterpriseDirectory enterpriseDirectory;
    
    public Network(){
        enterpriseDirectory = new EnterpriseDirectory();
        this.networkId=count;
        count++;
    }

    public int getNetworkId() {
        return networkId;
    }

    public void setNetworkId(int networkId) {
        this.networkId = networkId;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
}
