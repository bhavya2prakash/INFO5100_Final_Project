/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Farmer.Farmer;
import Business.Farmer.FarmerDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author prash
 */
public class EcoSystem extends Organization{
    
    private ArrayList<Network> networkList;
//    private FarmerDirectory farmerList = new FarmerDirectory();
    private static EcoSystem business;

    private EcoSystem() {
        super(null,null);
        networkList = new ArrayList<Network>();
       
        
    }

//    public FarmerDirectory getFarmerList() {
//        return farmerList;
//    }
//
//    public void setFarmerList(FarmerDirectory farmerList) {
//        this.farmerList = farmerList;
//    }
    

   
    

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public static EcoSystem getInstance(){
        if(business == null){
            business = new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
    public boolean checkIfUserNameIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
        }
        return true;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    
    
    
    
    
    
}
