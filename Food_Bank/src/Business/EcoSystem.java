/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Network.Network;
import java.util.ArrayList;

/**
 *
 * @author BHAVYA PRAKASH
 */
public class EcoSystem {
     private ArrayList<Network> networkList;
     private static EcoSystem business;

    public EcoSystem() {
       networkList = new ArrayList<>();
    }
    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
      public Network addNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    public void removeNetwork(Network network){
        networkList.remove(network);
        //return network;
    }
     
}
