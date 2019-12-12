/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2oop;

import java.util.Scanner;

/**
 *
 * @author LUCY
 */
public class Lab2oop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        Sedan mace=new Sedan();
        System.out.println("> MACE");
        mace.accelerate();
        
        Sedan luck=new Sedan();
        System.out.println(" \n  > LUCK");
        luck.accelerate();
        
        Sedan dune=new Sedan();
        System.out.println(" \n  > DUNE");
        dune.accelerate();
        
        //Motorcycle motor=new Motorcycle();
        //System.out.println("> Motorcycle");
        //Motor.accelerate();
    }
    
}
