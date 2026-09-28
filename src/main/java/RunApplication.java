/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author emeris
 */
public class RunApplication {
    
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.println("Select the console type");
         System.out.println("1) PS5");
         System.out.println("2) XBOX");
         System.out.println("3) SWITCH");
         String deviceType = input.nextLine();
         
         System.out.println("Enter the store: ");
         String storeName = input.nextLine();
         
         System.out.println("Enter the total sales og PS5 consoles for " + storeName);
         
         int totalAmount = input.nextInt();
         ConsoleSales console1 = new ConsoleSales(deviceType, storeName, totalAmount);
         
         console1.printReport();
     }
    
}
