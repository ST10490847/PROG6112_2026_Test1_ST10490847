/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsole;

/**
 *
 * @author emeris
 */
public class GamingConsole {

    public static void main(String[] args) {
        
      
        String[] cities = {"Cape Town","Port Elizabeth","Pretoria"};

        String[] months = {"PS5","XBOX", "SWITCH"};

        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200},
          
        };
        System.out.println("--------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------");

        System.out.printf("%-15s", "");

        for (int g = 0; g < months.length; g++) {
            System.out.printf("%-15s", months[g]);
        }

        System.out.println();

        for (int i = 0; i < cities.length; i++) {

            System.out.printf("%-15s", cities[i]);

            for (int g = 0; g < months.length; g++) {
                System.out.printf("%-15d", sales[i][g]);
            }

            System.out.println();
        }
        
       System.out.println("--------------------------------");
       System.out.println("CONSOLE SALES TOTAL REPORT");
       System.out.println("--------------------------------");
       
       System.out.println("CAPE TOWN:     " + (1000 + 2000 + 3000));
       System.out.println("PORT ELIZABETH " + (2000 + 3000 + 4000));
       System.out.println("PRETORIA       " + (1500 + 1100 + 1200));
        
       
       int highest = sales[0][0];
     
       for (int i = 0; i < sales.length; i++) {

        for (int g = 0; g < sales[i].length; g++) {

        if (sales[i][g] > highest) {
            highest = sales[i][g];
        }
        }
       }
       System.out.println("CITY WITH THE MOST SALES: Port Elizabeth" + highest);
        
    }
}
