/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author BHAVYA PRAKASH
 */

public class ProduceDeliveryWorkQueue {
    private ArrayList<ProduceDeliveryWorkRequest> produceDeliveryWorkRequestList;
    
    public ProduceDeliveryWorkQueue()
    {
        produceDeliveryWorkRequestList = new ArrayList<ProduceDeliveryWorkRequest>();
    }

    public ArrayList<ProduceDeliveryWorkRequest> getProduceDeliveryWorkRequestList() {
        return produceDeliveryWorkRequestList;
    }

    
}
