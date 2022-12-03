/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Network;

import Business.Enterprise.EnterpriseCatalogue;

/**
 *
 * @author BHAVYA PRAKASH
 */
public class Network  {
    private String name;
    private int networkId;
    private static int count = 101;
    private EnterpriseCatalogue enterpriseList;

    public Network() {
        this.enterpriseList = new EnterpriseCatalogue();
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

    public EnterpriseCatalogue getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(EnterpriseCatalogue enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    @Override
    public String toString(){
        return name;
    }
    
    
}
