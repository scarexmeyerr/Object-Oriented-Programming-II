/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        // TODO code application logic here       
        String building[] ={"Hilton" , "Sarova" , "Serena" , "Blue Spring" ," Radisson Blue"};
        String color [] ={"Red" , "Blue" , "Violet" , "White" ,"Black"};
        int floor[] ={2,4,6,7,8};
        int rooms [] = {5,7,8,11,4,10};
        int i;
        System.out.println("----------Start of Report----------\n");
        for( i=0; i<5; i++){
        System.out.println(""+building[i]+" is a "+color[i]+" building and has "+floor[i]+" floors with "+ rooms[i]+" rooms.\n");
        }
         System.out.println("----------End of Report----------");
       // setData();
       
    }

     }
        

