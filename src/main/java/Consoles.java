/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emeris
 */
public abstract class Consoles {
    
     public String deviceType;
    public String storeName;
    public int totalAmount;
    
    public Consoles(String deviceType, String storeName, int totalAmount){
        this.deviceType = deviceType;
        this.storeName = storeName;
        this.totalAmount = totalAmount;
        
    }
    
    public String getConsoleType(){
        return deviceType;
    }
    
     public String getStore(){
        return storeName;
    }
     
      public int getTotalSales(){
        return totalAmount;
    }
    
    
}
