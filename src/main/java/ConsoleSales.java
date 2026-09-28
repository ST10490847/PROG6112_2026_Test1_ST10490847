/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emeris
 */
public class ConsoleSales extends Consoles{
    
    public ConsoleSales(String deviceType, String storeName, int totalAmount){
        super(deviceType, storeName, totalAmount);
    }
    
    public void printReport(){
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("****************************");
        System.out.println("CONSOLE TYPE: " + deviceType);
        System.out.println("STORE: " + storeName);
        System.out.println("TOTAL SALES: " + totalAmount);
    }
}
