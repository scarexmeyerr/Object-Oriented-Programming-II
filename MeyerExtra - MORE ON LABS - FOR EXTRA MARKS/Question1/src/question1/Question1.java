/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        getRangeFrom1();
       getRangeFrom2();
     
    }
    static void getRangeFrom1(){ 
       // int answer
        int answer1 ;
      int from,to;
       Scanner scanner = new Scanner(System.in);
        System.out.println("Input range from");
        from = scanner.nextInt();
        
       System.out.println("Input range to");
      to = scanner.nextInt();
    
        for(int r = from ; r<=to ; r++){
            
             answer1= 3*r;
            

      
      
          System.out.println("multiplied by 3 is "+answer1);
    }
        System.out.println("\n");
        System.out.println(" multiples of 7");
    }
  static void getRangeFrom2(){
        int result =0;
          int from,to;
          Scanner input = new Scanner(System.in);
           System.out.println("Input range from");
             from = input.nextInt();
              System.out.println("Input range to");
      to = input.nextInt();
          
      for (int p = from;p<=to;p++ ){
          result= 7*p;
           System.out.println("multiplied by 7 is "+result);
      }

  }
}
