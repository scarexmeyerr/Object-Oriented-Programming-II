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
//        
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
//    static void setData(){
//       System.out.println("----------Start of Report----------\n");  
//     String building [] = new String[5];
//     String color [] = new String[5];
//     int rooms[] = new int[5];
//          int floors[] = new int[5];
//
//     
//     Scanner scanner = new Scanner(System.in);
//     
//      int i, j,k;
//     for( i=0; i<5 ; i++){
//          System.out.println("Input the name of buildings");
//     building[i] = scanner.next();
//     System.out.println("Input the color");
//      color[i]= scanner.next();
//      
//        System.out.println("Input the number of floors");
//      floors[i] = scanner.nextInt();
//      
//      System.out.println("Input the number of rooms per floor");
//      rooms[i] = scanner.nextInt();
//       double totalRooms =floors[i]*rooms[i];
//      
//        System.out.println(""+building[i]+" is a "+color[i]+" colored building and has "+floors[i]+" floors with "+ totalRooms+" rooms.\n");
//     System.out.println("----------End of Report----------");
//     }
//     
////     Scanner data = new Scanner(System.in);
////        System.out.println("Input the color of buildings");
////      for( j=0; j<5 ; j++){
////     color[j]= data.nextLine();}
////      
////    Scanner input = new Scanner(System.in);
////    System.out.println("Input the number of rooms");
////     for( k=0; k<5 ; k++){
////     rooms[k] = input.nextInt();}
////     
////     System.out.println(""+building[i]+" is a "+color[j]+" building and has "+ rooms[k]+" rooms.\n");
////     System.out.println("----------End of Report----------");
////       }
//    }
     }
        

